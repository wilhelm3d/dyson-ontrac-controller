package com.dyson.ontrac.controller

import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCallback
import android.bluetooth.BluetoothGattCharacteristic
import android.bluetooth.BluetoothGattDescriptor
import android.bluetooth.BluetoothManager
import android.bluetooth.BluetoothProfile
import android.bluetooth.BluetoothStatusCodes
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.content.Context
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.util.Log
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.UUID
import kotlin.math.roundToInt

@SuppressLint("MissingPermission")
class DysonBleManager(private val context: Context, private val store: Store) {

    private val bluetoothAdapter: BluetoothAdapter? =
        (context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager).adapter

    private var bluetoothGatt: BluetoothGatt? = null
    private var wantConnected = false
    private var retries = 0

    // --- Observable state ---
    private val _connectionState = MutableStateFlow("Disconnected")
    val connectionState: StateFlow<String> = _connectionState.asStateFlow()

    private val _ancMode = MutableStateFlow<Int?>(null)
    val ancMode: StateFlow<Int?> = _ancMode.asStateFlow()

    private val _eqMode = MutableStateFlow<Int?>(null)
    val eqMode: StateFlow<Int?> = _eqMode.asStateFlow()

    private val _customEq = MutableStateFlow<List<Int>?>(null)
    val customEq: StateFlow<List<Int>?> = _customEq.asStateFlow()

    private val _battery = MutableStateFlow<Int?>(null)
    val battery: StateFlow<Int?> = _battery.asStateFlow()

    /** Latest value (first data byte) of every trait we have heard about. */
    private val _traits = MutableStateFlow<Map<Int, Int>>(emptyMap())
    val traits: StateFlow<Map<Int, Int>> = _traits.asStateFlow()

    /** Raw 1 Hz values from 2DD1201D (offset 10 + 12, uint16 LE). Probably mic level dB x10, unconfirmed. */
    private val _noise = MutableStateFlow<Pair<Int, Int>?>(null)
    val noise: StateFlow<Pair<Int, Int>?> = _noise.asStateFlow()

    /** Phone/source the headphones report as connected (MAC, name), from `80 74`. */
    private val _source = MutableStateFlow<Pair<String, String>?>(null)
    val source: StateFlow<Pair<String, String>?> = _source.asStateFlow()

    /** Last rejected trait SET: trait id + status. */
    private val _traitError = MutableStateFlow<Pair<Int, Int>?>(null)
    val traitError: StateFlow<Pair<Int, Int>?> = _traitError.asStateFlow()

    /** ATT value handle -> characteristic UUID (Android's instanceId is the ATT handle). Used by the sniffer. */
    private val _handles = MutableStateFlow<Map<Int, UUID>>(emptyMap())
    val handles: StateFlow<Map<Int, UUID>> = _handles.asStateFlow()

    /** Result of the last write: UUID + GATT status (0 = OK, 3 = write not permitted, ...). */
    private val _lastWrite = MutableStateFlow<Pair<UUID, Int>?>(null)
    val lastWrite: StateFlow<Pair<UUID, Int>?> = _lastWrite.asStateFlow()

    private val _log = MutableStateFlow<List<String>>(emptyList())
    val log: StateFlow<List<String>> = _log.asStateFlow()

    val isReady: Boolean get() = _connectionState.value == STATE_READY

    private fun logLine(msg: String) {
        Log.d("DysonBLE", msg)
        _log.value = (_log.value + msg).takeLast(80)
    }

    private fun hex(b: ByteArray?) = b?.joinToString(" ") { "%02X".format(it) } ?: "null"
    private fun short(u: UUID) = u.toString().substring(4, 8).uppercase()

    // --- Everything touching the queue runs on the main thread ---
    private val mainHandler = Handler(Looper.getMainLooper())

    private fun onMain(block: () -> Unit) {
        if (Looper.myLooper() == Looper.getMainLooper()) block() else mainHandler.post(block)
    }

    private sealed class Op(val uuid: UUID) {
        class Write(uuid: UUID, val data: ByteArray, val noResponse: Boolean = false) : Op(uuid)
        class Read(uuid: UUID) : Op(uuid)
        class Subscribe(uuid: UUID) : Op(uuid)
    }

    private val queue = ArrayDeque<Op>()
    private var busy = false
    private val pendingActions = mutableListOf<() -> Unit>()

    private fun enqueue(op: Op) = onMain { queue.addLast(op); pump() }

    private fun opDone() = onMain { busy = false; pump() }

    @Suppress("DEPRECATION")
    private fun pump() {
        if (busy) return
        val op = queue.removeFirstOrNull() ?: return
        val gatt = bluetoothGatt
        if (gatt == null) {
            logLine("No GATT"); queue.clear(); return
        }
        val ch = gatt.getService(DYSON_AUDIO_SERVICE_UUID)?.getCharacteristic(op.uuid)
            ?: gatt.services.firstNotNullOfOrNull { it.getCharacteristic(op.uuid) }
        if (ch == null) {
            logLine("Characteristic missing: ${short(op.uuid)}"); pump(); return
        }
        val props = ch.properties
        if (op is Op.Subscribe &&
            props and (BluetoothGattCharacteristic.PROPERTY_NOTIFY or BluetoothGattCharacteristic.PROPERTY_INDICATE) == 0
        ) {
            logLine("${short(op.uuid)} has no notify/indicate"); pump(); return
        }
        busy = true
        val started: Boolean = when (op) {
            is Op.Read -> gatt.readCharacteristic(ch)
            is Op.Write -> {
                val canNoRsp = props and BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE != 0
                val canRsp = props and BluetoothGattCharacteristic.PROPERTY_WRITE != 0
                // The official app uses Write Command (no response) for traits + custom EQ.
                val type = if ((op.noResponse && canNoRsp) || !canRsp)
                    BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE
                else BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT
                logLine("WRITE ${short(op.uuid)} <- ${hex(op.data)}")
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    gatt.writeCharacteristic(ch, op.data, type) == BluetoothStatusCodes.SUCCESS
                } else {
                    ch.value = op.data
                    ch.writeType = type
                    gatt.writeCharacteristic(ch)
                }
            }
            is Op.Subscribe -> {
                val cccd = ch.getDescriptor(CCCD_UUID)
                val value = if (props and BluetoothGattCharacteristic.PROPERTY_NOTIFY != 0)
                    BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
                else BluetoothGattDescriptor.ENABLE_INDICATION_VALUE
                if (cccd == null || !gatt.setCharacteristicNotification(ch, true)) {
                    false
                } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    gatt.writeDescriptor(cccd, value) == BluetoothStatusCodes.SUCCESS
                } else {
                    cccd.value = value
                    gatt.writeDescriptor(cccd)
                }
            }
        }
        if (!started) {
            logLine("Op on ${short(op.uuid)} failed to start")
            busy = false
            pump()
        }
    }

    // --- Incoming values (reads + notifications) ---
    private fun handleValue(uuid: UUID, v: ByteArray?) {
        if (v == null || v.isEmpty()) return
        logLine("  <= ${short(uuid)} ${hex(v)}")
        when (uuid) {
            DYSON_TRAIT_UUID -> handleTrait(v)
            DYSON_NOISE_UUID -> if (v.size >= 14) {
                fun u16(i: Int) = (v[i].toInt() and 0xFF) or ((v[i + 1].toInt() and 0xFF) shl 8)
                _noise.value = u16(10) to u16(12)
            }
            DYSON_CUSTOM_EQ_UUID -> if (v.size >= 5) _customEq.value = List(5) { v[it].toInt() }
            DYSON_BATTERY_UUID -> if (v.size >= 2) {
                val b0 = v[0].toInt() and 0xFF
                val b1 = v[1].toInt() and 0xFF
                val raw = if (BATTERY_LITTLE_ENDIAN) b0 or (b1 shl 8) else (b0 shl 8) or b1
                val frac = raw / 10000f
                if (frac in 0f..1f) _battery.value = (frac * 100).roundToInt()
            }
        }
    }

    private fun handleTrait(v: ByteArray) {
        Trait.parseSource(v)?.let { _source.value = it; return }
        val m = TraitCodec.parse(v) ?: return
        when (m.type) {
            TraitCodec.SET_ACK -> if ((m.status ?: 0) != 0) {
                logLine("Trait 0x%02X SET rejected, status %d".format(m.trait, m.status))
                _traitError.value = m.trait to (m.status ?: -1)
            }
            TraitCodec.GET_RSP, TraitCodec.NOTIFY -> {
                if (m.type == TraitCodec.GET_RSP && (m.status ?: 0) != 0) return
                val value = m.firstByte ?: return
                _traits.value = _traits.value + (m.trait to value)
                when (m.trait) {
                    Trait.ANC_MODE -> { _ancMode.value = value; store.lastAnc = value }
                    Trait.EQ_PRESET -> _eqMode.value = value
                }
            }
        }
    }

    private fun sendTrait(frame: ByteArray) =
        enqueue(Op.Write(DYSON_TRAIT_UUID, frame, noResponse = true))

    // --- Connection handling ---
    private fun isOnTrac(name: String?) =
        name != null && (name.contains("OnTrac", ignoreCase = true) || name.contains("N571", ignoreCase = true))

    private fun isActive(): Boolean {
        val s = _connectionState.value
        return s == STATE_READY || s.startsWith("Connecting") || s.startsWith("Connected") ||
            s.startsWith("Found") || s.startsWith("Scanning")
    }

    private val scanCallback = object : ScanCallback() {
        override fun onScanResult(callbackType: Int, result: ScanResult) {
            val device = result.device
            val deviceName = try { device.name } catch (e: SecurityException) { null }
            if (isOnTrac(deviceName)) {
                _connectionState.value = "Found $deviceName, Connecting..."
                stopScan()
                connectToDevice(device)
            }
        }
    }

    private val gattCallback = object : BluetoothGattCallback() {
        override fun onConnectionStateChange(gatt: BluetoothGatt, status: Int, newState: Int) {
            if (newState == BluetoothProfile.STATE_CONNECTED && status == BluetoothGatt.GATT_SUCCESS) {
                _connectionState.value = "Connected. Negotiating MTU..."
                bluetoothGatt = gatt
                // Official app requests MTU 251 before discovery
                if (!gatt.requestMtu(251)) gatt.discoverServices()
            } else if (newState == BluetoothProfile.STATE_DISCONNECTED) {
                onMain { queue.clear(); busy = false }
                // Keep the GATT object when autoConnect is on: Android reconnects by itself
                // as soon as the headphones are switched on again.
                val keep = wantConnected && store.autoReconnect && status != 133
                if (keep) {
                    _connectionState.value = "Disconnected (waiting for headphones)"
                } else {
                    _connectionState.value =
                        if (status == BluetoothGatt.GATT_SUCCESS) "Disconnected" else "Connection Failed (Status $status)"
                    gatt.close()
                    if (bluetoothGatt === gatt) bluetoothGatt = null
                    if (wantConnected && store.autoReconnect && retries++ < 5) {
                        mainHandler.postDelayed({ connectBonded() }, 3000)
                    }
                }
            } else if (status != BluetoothGatt.GATT_SUCCESS) {
                _connectionState.value = "Connection Failed (Status $status)"
                gatt.close()
                if (bluetoothGatt === gatt) bluetoothGatt = null
            }
        }

        override fun onMtuChanged(gatt: BluetoothGatt, mtu: Int, status: Int) {
            logLine("MTU=$mtu status=$status")
            _connectionState.value = "Connected. Discovering Services..."
            gatt.discoverServices()
        }

        override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) {
            if (status != BluetoothGatt.GATT_SUCCESS) {
                _connectionState.value = "Service discovery failed ($status)"
                return
            }
            gatt.services.forEach { s ->
                logLine("SVC ${s.uuid}")
                s.characteristics.forEach { c ->
                    logLine("  CH ${short(c.uuid)} p=0x${"%02X".format(c.properties)}")
                }
            }
            if (gatt.getService(DYSON_AUDIO_SERVICE_UUID) == null) {
                _connectionState.value = "Dyson Audio Service Not Found"
                return
            }
            _handles.value = gatt.services
                .flatMap { s -> s.characteristics }
                .associate { it.instanceId to it.uuid }
            retries = 0
            _connectionState.value = STATE_READY
            onMain {
                // Trait channel first (ANC, EQ preset, ...), then the plain characteristics.
                queue.addLast(Op.Subscribe(DYSON_TRAIT_UUID))
                listOf(DYSON_BATTERY_UUID, DYSON_NOISE_UUID, DYSON_CUSTOM_EQ_UUID)
                    .forEach { queue.addLast(Op.Subscribe(it)) }
                Trait.STARTUP.forEach { t ->
                    queue.addLast(Op.Write(DYSON_TRAIT_UUID, TraitCodec.subscribe(t), noResponse = true))
                    queue.addLast(Op.Write(DYSON_TRAIT_UUID, TraitCodec.get(t), noResponse = true))
                }
                queue.addLast(Op.Write(DYSON_TRAIT_UUID, Trait.REQUEST_SOURCE, noResponse = true))
                listOf(DYSON_BATTERY_UUID, DYSON_CUSTOM_EQ_UUID).forEach { queue.addLast(Op.Read(it)) }
                pump()
                val actions = pendingActions.toList()
                pendingActions.clear()
                actions.forEach { it() }
            }
        }

        // API 33+
        override fun onCharacteristicRead(
            gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, value: ByteArray, status: Int
        ) {
            if (status == BluetoothGatt.GATT_SUCCESS) handleValue(characteristic.uuid, value)
            else logLine("READ ${short(characteristic.uuid)} failed st=$status")
            opDone()
        }

        // API < 33
        @Suppress("DEPRECATION", "OVERRIDE_DEPRECATION")
        override fun onCharacteristicRead(
            gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, status: Int
        ) {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) {
                if (status == BluetoothGatt.GATT_SUCCESS) handleValue(characteristic.uuid, characteristic.value)
                else logLine("READ ${short(characteristic.uuid)} failed st=$status")
                opDone()
            }
        }

        // API 33+
        override fun onCharacteristicChanged(
            gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, value: ByteArray
        ) {
            handleValue(characteristic.uuid, value)
        }

        // API < 33
        @Suppress("DEPRECATION", "OVERRIDE_DEPRECATION")
        override fun onCharacteristicChanged(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic) {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) {
                handleValue(characteristic.uuid, characteristic.value)
            }
        }

        override fun onCharacteristicWrite(
            gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, status: Int
        ) {
            logLine("  -> write ${short(characteristic.uuid)} status=$status")
            _lastWrite.value = characteristic.uuid to status
            opDone()
        }

        override fun onDescriptorWrite(gatt: BluetoothGatt, descriptor: BluetoothGattDescriptor, status: Int) {
            logLine("  -> subscribe ${short(descriptor.characteristic.uuid)} status=$status")
            opDone()
        }
    }

    // --- Public API ---

    /** Connect to the paired OnTrac directly; fall back to scanning if none is paired. */
    fun connect() {
        if (isActive()) return
        if (!connectBonded()) startScan()
    }

    fun connectBonded(): Boolean {
        val adapter = bluetoothAdapter ?: return false
        if (!adapter.isEnabled) {
            _connectionState.value = "Bluetooth is disabled"
            return false
        }
        val device = adapter.bondedDevices?.firstOrNull { isOnTrac(it.name) } ?: return false
        connectToDevice(device)
        return true
    }

    fun startScan() {
        val adapter = bluetoothAdapter
        if (adapter == null || !adapter.isEnabled) {
            _connectionState.value = "Bluetooth is disabled"
            return
        }
        wantConnected = true
        _connectionState.value = "Scanning for OnTrac..."
        adapter.bluetoothLeScanner?.startScan(scanCallback)
        mainHandler.postDelayed({
            if (_connectionState.value.startsWith("Scanning")) {
                stopScan()
                _connectionState.value = "Disconnected - OnTrac not found"
            }
        }, 15000)
    }

    private fun stopScan() {
        bluetoothAdapter?.bluetoothLeScanner?.stopScan(scanCallback)
    }

    private fun connectToDevice(device: BluetoothDevice) {
        if (isActive()) return
        wantConnected = true
        bluetoothGatt?.close()
        _connectionState.value = "Connecting..."
        bluetoothGatt = device.connectGatt(context, store.autoReconnect, gattCallback, BluetoothDevice.TRANSPORT_LE)
    }

    /** Run [block] once connected; starts a connection first if needed (used by tile / widget). */
    fun runWhenReady(block: () -> Unit) = onMain {
        if (isReady) {
            block()
        } else {
            pendingActions.add(block)
            if (!isActive()) connect()
        }
    }

    fun setAnc(mode: Byte) {
        _ancMode.value = mode.toInt()
        store.lastAnc = mode.toInt()
        // headphones confirm with SET_ACK + NOTIFY, which updates ancMode again
        sendTrait(TraitCodec.set(Trait.ANC_MODE, mode.toInt()))
    }

    fun setEqMode(mode: Byte) {
        _eqMode.value = mode.toInt()
        sendTrait(TraitCodec.set(Trait.EQ_PRESET, mode.toInt()))
    }

    /**
     * Which variant Isolation / Transparency use.
     * isolation: 1 = medium quiet, 2 = full;  transparency: 1 = medium loud, 2 = full;  null = leave unchanged.
     */
    fun setAncLevels(isolation: Int? = null, transparency: Int? = null) {
        val v = ((transparency ?: 0) shl 4) or (isolation ?: 0)
        if (v != 0) sendTrait(TraitCodec.set(Trait.ANC_LEVELS, v))
    }

    /** 0 = auto (pause when taken off), 1 = always worn, 2 = always unworn. Untested write, read is confirmed. */
    fun setWearDetection(mode: Int) = sendTrait(TraitCodec.set(Trait.WEAR_DETECTION, mode))

    /** Generic trait write for experiments. */
    fun setTrait(trait: Int, vararg data: Int) = sendTrait(TraitCodec.set(trait, *data))

    // Custom 5-band EQ: five signed bytes on 2DD12007, Write Command like the official app.
    // The official app only produced -3..+3 in the capture; larger values are untested.
    fun sendCustomEq(dbValues: List<Int>) {
        store.lastEq = dbValues
        enqueue(Op.Write(DYSON_CUSTOM_EQ_UUID, ByteArray(5) { dbValues[it].toByte() }, noResponse = true))
        enqueue(Op.Read(DYSON_CUSTOM_EQ_UUID))   // read back: shows if the headphones clipped the values
    }

    /** Write raw bytes to any characteristic (used to replay sniffed commands). */
    fun writeRaw(uuid: UUID, data: ByteArray, noResponse: Boolean = true) {
        enqueue(Op.Write(uuid, data, noResponse))
    }

    fun disconnect() {
        wantConnected = false
        stopScan()
        bluetoothGatt?.let { it.disconnect(); it.close() }
        bluetoothGatt = null
        onMain { queue.clear(); busy = false }
        _connectionState.value = "Disconnected"
    }
}
