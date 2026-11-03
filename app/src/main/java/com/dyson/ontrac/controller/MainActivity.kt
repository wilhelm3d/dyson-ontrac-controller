package com.dyson.ontrac.controller

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.*
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.UUID
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.roundToInt

// --- UUIDs & Command Definitions extracted from Dyson APK ---
// The audio settings live as plain GATT characteristics in service 2DD12000
// (decompiled: on/a.java + on/c.java). 2DD10020/2DD10021 is a different
// (message-framed) channel and does NOT contain 2DD12007 -> old code returned silently.
fun dysonUuid(suffix: String): UUID = UUID.fromString("2DD1${suffix}-1C37-452D-8979-D1B4A787D0A4")

val DYSON_AUDIO_SERVICE_UUID: UUID = dysonUuid("2000")
val DYSON_ANC_MODE_UUID: UUID = dysonUuid("2001")   // 1 byte, see ANC_* below (inferred: int enum 0..5)
val DYSON_EQ_MODE_UUID: UUID = dysonUuid("2003")    // 1 byte, EQ preset (inferred)
val DYSON_CUSTOM_EQ_UUID: UUID = dysonUuid("2007")  // 5 signed bytes (lp/e.java)

// ANC mode values from yo/a.java
const val ANC_ISOLATION: Byte = 0
const val ANC_CONVERSATION: Byte = 1
const val ANC_TRANSPARENCY: Byte = 2
const val ANC_OFF: Byte = 3
// EQ mode value for "custom" is a guess; check the log output of the EQ_MODE read.
const val EQ_MODE_CUSTOM: Byte = 3

// --- Palette (dark, rounded cards, purple accent) ---
val AppBg = Color(0xFF0B0B0C)
val CardBg = Color(0xFF1C1C1E)
val TrackBg = Color(0xFF2C2C2E)
val TextPrimary = Color(0xFFFFFFFF)
val TextSecondary = Color(0xFF9A9AA0)
val Accent = Color(0xFF7C5CFF)
val StatusBlue = Color(0xFF3FA2F7)

class MainActivity : ComponentActivity() {

    private lateinit var bleManager: DysonBleManager

    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        val allGranted = permissions.entries.all { it.value }
        if (allGranted) {
            bleManager.startScan()
        } else {
            Log.e("BLE", "Permissions denied")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bleManager = DysonBleManager(this)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = AppBg
                ) {
                    DashboardScreen(bleManager) { requestBlePermissions() }
                }
            }
        }
    }

    private fun requestBlePermissions() {
        val requiredPermissions = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            arrayOf(Manifest.permission.BLUETOOTH_SCAN, Manifest.permission.BLUETOOTH_CONNECT)
        } else {
            arrayOf(Manifest.permission.ACCESS_FINE_LOCATION)
        }

        val missingPermissions = requiredPermissions.filter {
            ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED
        }

        if (missingPermissions.isEmpty()) {
            bleManager.startScan()
        } else {
            permissionLauncher.launch(missingPermissions.toTypedArray())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        bleManager.disconnect()
    }
}

// --- UI Dashboard ---
@Composable
fun DashboardScreen(bleManager: DysonBleManager, onScanClick: () -> Unit) {
    val connectionState by bleManager.connectionState.collectAsState()
    val logLines by bleManager.log.collectAsState()
    val isReady = connectionState == "Ready to send commands"

    // 5-band mapping of the 6-band profile
    var eqValues by remember { mutableStateOf(listOf(3, -2, 1, -2, -2)) }
    var ancSelected by remember { mutableStateOf(0) }
    var showLog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Spacer(Modifier.height(24.dp))
        Text(
            "OnTrac Control",
            color = TextPrimary,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        // Status chips
        Row(horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(CardBg),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    Modifier
                        .size(8.dp)
                        .clip(CircleShape)
                        .background(if (isReady) StatusBlue else TextSecondary)
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    if (isReady) "Connected" else connectionState,
                    color = TextPrimary, fontSize = 13.sp, maxLines = 1
                )
            }
            val canConnect = connectionState == "Disconnected" || connectionState.contains("Failed")
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(if (canConnect) Accent else CardBg)
                    .clickable(enabled = canConnect) { onScanClick() },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "Connect",
                    color = if (canConnect) TextPrimary else TextSecondary,
                    fontSize = 14.sp, fontWeight = FontWeight.Medium
                )
            }
        }

        // Noise cancellation
        DysonCard(title = "Noise cancellation") {
            val labels = listOf("Isolation", "Transparency", "Off")
            val modes = listOf(ANC_ISOLATION, ANC_TRANSPARENCY, ANC_OFF)
            PillSelector(
                count = 3,
                selected = ancSelected,
                enabled = isReady,
                onSelect = {
                    ancSelected = it
                    bleManager.setAnc(modes[it])
                }
            ) { index, tint -> AncIcon(kind = index, color = tint) }
            Spacer(Modifier.height(10.dp))
            Text(
                labels[ancSelected],
                color = TextSecondary, fontSize = 13.sp,
                modifier = Modifier.padding(start = 6.dp)
            )
        }

        // Equaliser
        DysonCard(
            title = "Equaliser",
            trailing = {
                Box(
                    modifier = Modifier
                        .height(34.dp)
                        .clip(RoundedCornerShape(17.dp))
                        .background(if (isReady) Accent else TrackBg)
                        .clickable(enabled = isReady) {
                            bleManager.sendCustomEq(eqValues)
                            bleManager.setEqMode(EQ_MODE_CUSTOM)
                        }
                        .padding(horizontal = 18.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Apply", color = TextPrimary, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                }
            }
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(210.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                val labels = listOf("Bass", "Low mid", "Mid", "High mid", "Treble")
                eqValues.forEachIndexed { index, value ->
                    EqSlider(
                        value = value,
                        label = labels[index],
                        onValueChange = { newVal ->
                            eqValues = eqValues.toMutableList().also { it[index] = newVal }
                        }
                    )
                }
            }
        }

        // Debug log (collapsible)
        DysonCard(
            title = "Connection log",
            trailing = {
                Text(
                    if (showLog) "Hide" else "Show",
                    color = Accent, fontSize = 13.sp,
                    modifier = Modifier.clickable { showLog = !showLog }
                )
            }
        ) {
            if (showLog) {
                logLines.takeLast(16).forEach {
                    Text(it, color = TextSecondary, fontFamily = FontFamily.Monospace, fontSize = 10.sp)
                }
            }
        }
        Spacer(Modifier.height(24.dp))
    }
}

@Composable
fun DysonCard(
    title: String,
    trailing: @Composable () -> Unit = {},
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(CardBg)
            .padding(20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(title, color = TextPrimary, fontSize = 17.sp, fontWeight = FontWeight.Medium)
            trailing()
        }
        Spacer(Modifier.height(16.dp))
        content()
    }
}

// Pill track with a white circle on the active option
@Composable
fun PillSelector(
    count: Int,
    selected: Int,
    enabled: Boolean,
    onSelect: (Int) -> Unit,
    icon: @Composable (Int, Color) -> Unit
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(TrackBg)
            .padding(4.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        repeat(count) { i ->
            val active = i == selected
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(if (active) TextPrimary else Color.Transparent)
                    .clickable(enabled = enabled) { onSelect(i) },
                contentAlignment = Alignment.Center
            ) {
                icon(i, if (active) Color.Black else if (enabled) TextPrimary else TextSecondary)
            }
        }
    }
}

// Simple line icons: 0 = isolation, 1 = transparency, 2 = off
@Composable
fun AncIcon(kind: Int, color: Color) {
    Canvas(modifier = Modifier.size(28.dp)) {
        val c = center
        val sw = 2.dp.toPx()
        val r = size.minDimension * 0.34f
        when (kind) {
            0 -> {
                drawCircle(color, r, c, style = Stroke(sw))
                drawCircle(color, r * 0.32f, Offset(c.x, c.y - r * 0.2f), style = Stroke(sw))
                drawArc(
                    color, 200f, 140f, false,
                    topLeft = Offset(c.x - r * 0.6f, c.y + r * 0.05f),
                    size = Size(r * 1.2f, r * 1.0f),
                    style = Stroke(sw)
                )
            }
            1 -> {
                drawCircle(color, r * 0.4f, c, style = Stroke(sw))
                for (i in 0 until 8) {
                    val a = i * (PI / 4).toFloat()
                    drawLine(
                        color,
                        Offset(c.x + cos(a) * r * 0.75f, c.y + sin(a) * r * 0.75f),
                        Offset(c.x + cos(a) * r * 1.1f, c.y + sin(a) * r * 1.1f),
                        sw
                    )
                }
            }
            else -> {
                drawCircle(color, r, c, style = Stroke(sw))
                drawLine(
                    color,
                    Offset(c.x - r * 1.2f, c.y + r * 1.2f),
                    Offset(c.x + r * 1.2f, c.y - r * 1.2f),
                    sw
                )
            }
        }
    }
}

// Vertical EQ slider: purple fill from the zero line, white handle
@Composable
fun EqSlider(value: Int, label: String, onValueChange: (Int) -> Unit) {
    val minDb = -10
    val maxDb = 10

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ) {
        Text(
            text = "${if (value > 0) "+" else ""}$value",
            color = TextPrimary, fontSize = 13.sp, fontWeight = FontWeight.Medium
        )
        Spacer(Modifier.height(8.dp))
        Box(
            modifier = Modifier
                .weight(1f)
                .width(44.dp)
                .pointerInput(Unit) {
                    detectDragGestures { change, _ ->
                        change.consume()
                        val frac = (change.position.y / size.height).coerceIn(0f, 1f)
                        onValueChange((maxDb - frac * (maxDb - minDb)).roundToInt())
                    }
                }
                .pointerInput(Unit) {
                    detectTapGestures { pos ->
                        val frac = (pos.y / size.height).coerceIn(0f, 1f)
                        onValueChange((maxDb - frac * (maxDb - minDb)).roundToInt())
                    }
                }
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val trackW = 6.dp.toPx()
                val x = (size.width - trackW) / 2f
                val centerY = size.height / 2f
                val handleR = 11.dp.toPx()
                val frac = 1f - (value - minDb).toFloat() / (maxDb - minDb)
                val handleY = (frac * size.height).coerceIn(handleR, size.height - handleR)

                drawRoundRect(
                    TrackBg, Offset(x, 0f), Size(trackW, size.height),
                    CornerRadius(trackW / 2, trackW / 2)
                )
                val top = minOf(handleY, centerY)
                val bottom = maxOf(handleY, centerY)
                drawRoundRect(
                    Accent, Offset(x, top), Size(trackW, bottom - top),
                    CornerRadius(trackW / 2, trackW / 2)
                )
                drawLine(
                    TextSecondary.copy(alpha = 0.5f),
                    Offset(x - 6.dp.toPx(), centerY), Offset(x + trackW + 6.dp.toPx(), centerY),
                    1.dp.toPx()
                )
                drawCircle(TextPrimary, handleR, Offset(size.width / 2f, handleY))
            }
        }
        Spacer(Modifier.height(8.dp))
        Text(label, color = TextSecondary, fontSize = 11.sp)
    }
}

// --- BLE Engine ---
@SuppressLint("MissingPermission")
class DysonBleManager(private val context: Context) {
    private val bluetoothAdapter: BluetoothAdapter? =
        (context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager).adapter

    private var bluetoothGatt: BluetoothGatt? = null

    private val _connectionState = MutableStateFlow("Disconnected")
    val connectionState: StateFlow<String> = _connectionState.asStateFlow()

    private val _log = MutableStateFlow<List<String>>(emptyList())
    val log: StateFlow<List<String>> = _log.asStateFlow()

    private fun logLine(msg: String) {
        Log.d("DysonBLE", msg)
        _log.value = (_log.value + msg).takeLast(60)
    }

    private fun hex(b: ByteArray?) =
        b?.joinToString(" ") { "%02X".format(it) } ?: "null"

    // --- Serialized GATT operation queue (Android allows ONE outstanding op) ---
    private sealed class Op {
        class Write(val uuid: UUID, val data: ByteArray) : Op()
        class Read(val uuid: UUID) : Op()
    }
    private val queue = ArrayDeque<Op>()
    private var busy = false
    private val mainHandler = android.os.Handler(android.os.Looper.getMainLooper())

    private fun enqueue(op: Op) {
        mainHandler.post { queue.addLast(op); pump() }
    }

    private fun pump() {
        if (busy) return
        val op = queue.removeFirstOrNull() ?: return
        val gatt = bluetoothGatt ?: run { logLine("No GATT"); queue.clear(); return }
        val ch = gatt.getService(DYSON_AUDIO_SERVICE_UUID)?.getCharacteristic(
            when (op) { is Op.Write -> op.uuid; is Op.Read -> op.uuid }
        )
        if (ch == null) {
            logLine("Characteristic missing: " + (if (op is Op.Write) op.uuid else (op as Op.Read).uuid))
            pump(); return
        }
        busy = true
        val started: Boolean = when (op) {
            is Op.Read -> gatt.readCharacteristic(ch)
            is Op.Write -> {
                val type = if (ch.properties and BluetoothGattCharacteristic.PROPERTY_WRITE != 0)
                    BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT
                else BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE
                logLine("WRITE ${ch.uuid.toString().substring(4, 8)} <- ${hex(op.data)}")
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    gatt.writeCharacteristic(ch, op.data, type) == BluetoothStatusCodes.SUCCESS
                } else {
                    @Suppress("DEPRECATION")
                    ch.value = op.data
                    ch.writeType = type
                    @Suppress("DEPRECATION")
                    gatt.writeCharacteristic(ch)
                }
            }
        }
        if (!started) {
            logLine("Op failed to start")
            busy = false
            pump()
        } else if (op is Op.Write &&
            ch.properties and BluetoothGattCharacteristic.PROPERTY_WRITE == 0) {
            // no-response writes give no callback on some stacks; release shortly
            mainHandler.postDelayed({ busy = false; pump() }, 80)
        }
    }

    private fun opDone() { busy = false; pump() }

    private val scanCallback = object : ScanCallback() {
        override fun onScanResult(callbackType: Int, result: ScanResult) {
            val device = result.device
            val deviceName = try { device.name } catch (e: SecurityException) { null } ?: ""
            if (deviceName.contains("OnTrac", ignoreCase = true) || deviceName.contains("N571", ignoreCase = true)) {
                _connectionState.value = "Found ${deviceName}, Connecting..."
                stopScan()
                connectToDevice(device)
            }
        }
    }

    private val gattCallback = object : BluetoothGattCallback() {
        override fun onConnectionStateChange(gatt: BluetoothGatt, status: Int, newState: Int) {
            if (status == BluetoothGatt.GATT_SUCCESS) {
                if (newState == BluetoothProfile.STATE_CONNECTED) {
                    _connectionState.value = "Connected. Negotiating MTU..."
                    bluetoothGatt = gatt
                    // Official app requests MTU 251 before discovery
                    if (!gatt.requestMtu(251)) gatt.discoverServices()
                } else if (newState == BluetoothProfile.STATE_DISCONNECTED) {
                    _connectionState.value = "Disconnected"
                    queue.clear(); busy = false
                    gatt.close()
                    bluetoothGatt = null
                }
            } else {
                _connectionState.value = "Connection Failed (Status $status)"
                queue.clear(); busy = false
                gatt.close()
                bluetoothGatt = null
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
                    logLine("  CH ${c.uuid.toString().substring(0, 8)} p=0x${"%02X".format(c.properties)}")
                }
            }
            if (gatt.getService(DYSON_AUDIO_SERVICE_UUID) != null) {
                _connectionState.value = "Ready to send commands"
                // Read current state so you can see real values in the log
                enqueue(Op.Read(DYSON_ANC_MODE_UUID))
                enqueue(Op.Read(DYSON_EQ_MODE_UUID))
                enqueue(Op.Read(DYSON_CUSTOM_EQ_UUID))
            } else {
                _connectionState.value = "Dyson Audio Service Not Found"
            }
        }

        // API 33+
        override fun onCharacteristicRead(
            gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic,
            value: ByteArray, status: Int
        ) {
            logLine("READ ${characteristic.uuid.toString().substring(4, 8)} = ${hex(value)} (st=$status)")
            opDone()
        }

        // API < 33
        @Deprecated("Deprecated in Java")
        override fun onCharacteristicRead(
            gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, status: Int
        ) {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) {
                @Suppress("DEPRECATION")
                logLine("READ ${characteristic.uuid.toString().substring(4, 8)} = ${hex(characteristic.value)} (st=$status)")
                opDone()
            }
        }

        override fun onCharacteristicWrite(
            gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, status: Int
        ) {
            logLine("  -> write ${characteristic.uuid.toString().substring(4, 8)} status=$status")
            opDone()
        }
    }

    fun startScan() {
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled) {
            _connectionState.value = "Bluetooth is disabled"
            return
        }
        _connectionState.value = "Scanning for OnTrac..."
        bluetoothAdapter.bluetoothLeScanner?.startScan(scanCallback)
    }

    private fun stopScan() {
        bluetoothAdapter?.bluetoothLeScanner?.stopScan(scanCallback)
    }

    private fun connectToDevice(device: BluetoothDevice) {
        device.connectGatt(context, false, gattCallback, BluetoothDevice.TRANSPORT_LE)
    }

    fun setAnc(mode: Byte) = enqueue(Op.Write(DYSON_ANC_MODE_UUID, byteArrayOf(mode)))

    fun setEqMode(mode: Byte) = enqueue(Op.Write(DYSON_EQ_MODE_UUID, byteArrayOf(mode)))

    // Custom 5-band EQ: five signed bytes (lp/e.java)
    fun sendCustomEq(dbValues: List<Int>) {
        enqueue(Op.Write(DYSON_CUSTOM_EQ_UUID, ByteArray(5) { dbValues[it].toByte() }))
    }

    fun disconnect() {
        stopScan()
        bluetoothGatt?.disconnect()
    }
}
