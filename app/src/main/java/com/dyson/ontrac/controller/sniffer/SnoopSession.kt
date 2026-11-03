package com.dyson.ontrac.controller.sniffer

import android.content.Context
import android.content.Intent
import com.dyson.ontrac.controller.DysonBleManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.UUID

/**
 * Root-based protocol sniffer:
 *  1. switch Android's HCI snoop log to "full" and restart Bluetooth
 *  2. user operates the official Dyson app
 *  3. read the snoop log via su, decode ATT traffic, map handles to UUIDs, allow replay
 */
class SnoopSession(private val context: Context, private val ble: DysonBleManager) {

    data class State(
        val busy: Boolean = false,
        val rooted: Boolean? = null,
        val snoopMode: String? = null,
        val message: String = "",
        val result: SnoopResult? = null,
        val savedTo: String? = null
    )

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val _state = MutableStateFlow(State())
    val state: StateFlow<State> = _state.asStateFlow()

    private fun work(label: String, block: suspend () -> Unit) {
        if (_state.value.busy) return
        _state.update { it.copy(busy = true, message = label) }
        scope.launch {
            try {
                block()
            } catch (e: Exception) {
                _state.update { it.copy(message = "Error: ${e.message}") }
            } finally {
                _state.update { it.copy(busy = false) }
            }
        }
    }

    fun refresh() = work("Checking root…") {
        val rooted = RootShell.isRooted()
        val mode = if (rooted) RootShell.run("getprop persist.bluetooth.btsnooplogmode").text else null
        _state.update {
            it.copy(
                rooted = rooted,
                snoopMode = mode?.ifBlank { "disabled" },
                message = if (rooted) "" else "No root access (grant su to this app)"
            )
        }
    }

    fun enable() = work("Enabling full HCI snoop log, restarting Bluetooth…") {
        setMode("full")
        _state.update { it.copy(message = "Capture running. Now open the Dyson app and change ANC + EQ, then come back and tap Analyse.") }
    }

    fun disable() = work("Disabling snoop log…") {
        setMode("disabled")
        _state.update { it.copy(message = "Snoop log disabled.") }
    }

    private suspend fun setMode(mode: String) {
        check(RootShell.isRooted()) { "no root" }
        RootShell.run("setprop persist.bluetooth.btsnooplogmode $mode")
        // The stack only picks the mode up on restart.
        RootShell.run("cmd bluetooth_manager disable || svc bluetooth disable")
        delay(3000)
        RootShell.run("cmd bluetooth_manager enable || svc bluetooth enable")
        delay(2000)
        val now = RootShell.run("getprop persist.bluetooth.btsnooplogmode").text
        _state.update { it.copy(rooted = true, snoopMode = now.ifBlank { "disabled" }) }
        // headphones were dropped by the restart; reconnect our own link
        ble.connect()
    }

    fun openDysonApp(): Boolean {
        val i = context.packageManager.getLaunchIntentForPackage(DYSON_PACKAGE) ?: return false
        context.startActivity(i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        return true
    }

    fun analyse() = work("Reading snoop log…") {
        val path = LOG_PATHS.firstOrNull { RootShell.run("test -f $it").ok }
            ?: error("No btsnoop_hci.log found. Is the snoop log enabled?")
        val raw = RootShell.run("cat $path", 60)
        check(raw.ok && raw.out.isNotEmpty()) { "Could not read $path: ${raw.err}" }

        _state.update { it.copy(message = "Decoding ${raw.out.size / 1024} KB…") }
        val result = BtSnoopParser.parse(raw.out)

        // Save raw log (for Wireshark) + decoded text to /sdcard/Download
        val stamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
        val dir = File(context.getExternalFilesDir(null), "snoop").apply { mkdirs() }
        val rawFile = File(dir, "ontrac_btsnoop_$stamp.log").apply { writeBytes(raw.out) }
        val txtFile = File(dir, "ontrac_att_$stamp.txt").apply {
            writeText(BtSnoopParser.format(result.events) { h -> nameFor(h, result) })
        }
        val dl = "/sdcard/Download"
        val copied = RootShell.run("cp '${rawFile.absolutePath}' '${txtFile.absolutePath}' $dl/").ok

        val writes = result.events.count { it.isWrite }
        val errors = result.events.count { it.isError }
        _state.update {
            it.copy(
                result = result,
                savedTo = if (copied) "$dl/${txtFile.name}" else txtFile.absolutePath,
                message = "${result.packets} packets · ${result.events.size} ATT events · $writes writes · $errors errors" +
                    if (result.truncatedPackets > 0) " · ${result.truncatedPackets} truncated (mode not 'full'?)" else ""
            )
        }
    }

    /** UUID for an ATT handle: from discovery in the capture, else from our own GATT table. */
    fun uuidFor(handle: Int?, result: SnoopResult? = _state.value.result): UUID? {
        if (handle == null) return null
        result?.discoveredUuids?.get(handle)?.let { return runCatching { UUID.fromString(it) }.getOrNull() }
        return ble.handles.value[handle]
    }

    fun nameFor(handle: Int?, result: SnoopResult? = _state.value.result): String {
        val u = uuidFor(handle, result) ?: return "?"
        val s = u.toString().uppercase()
        return if (s.startsWith("2DD1")) s.substring(0, 8) else s.substring(4, 8)
    }

    /** Send exactly the bytes the official app sent. */
    fun replay(e: AttEvent): Boolean {
        val uuid = uuidFor(e.handle) ?: return false
        ble.writeRaw(uuid, e.value)
        return true
    }

    companion object {
        const val DYSON_PACKAGE = "com.dyson.mobile.android"
        private val LOG_PATHS = listOf(
            "/data/misc/bluetooth/logs/btsnoop_hci.log",
            "/data/log/bt/btsnoop_hci.log",
            "/sdcard/btsnoop_hci.log",
            "/data/misc/bluedroid/btsnoop_hci.log"
        )
    }
}
