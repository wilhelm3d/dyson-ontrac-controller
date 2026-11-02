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
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
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
import kotlin.math.roundToInt

// --- UUIDs & Command Definitions extracted from Dyson APK ---
val DYSON_SERVICE_UUID: UUID = UUID.fromString("2DD10020-1C37-452D-8979-D1B4A787D0A4")
val DYSON_CMD_CHAR_UUID: UUID = UUID.fromString("2DD10021-1C37-452D-8979-D1B4A787D0A4")
val DYSON_CUSTOM_EQ_UUID: UUID = UUID.fromString("2DD12007-1C37-452D-8979-D1B4A787D0A4")

// Payload mappings (Header [Command ID, 64] + Mode Byte)
val CMD_ANC_ISOLATION = byteArrayOf(0x0A, 0x40, 0x00)
val CMD_ANC_TRANSPARENCY = byteArrayOf(0x0A, 0x40, 0x02)
val CMD_ANC_OFF = byteArrayOf(0x0A, 0x40, 0x03)

// EQ Presets
val CMD_EQ_MODE_CUSTOM = byteArrayOf(0x0B, 0x40, 0x03)

// Nothing Style Colors
val NothingBlack = Color(0xFF000000)
val NothingWhite = Color(0xFFFFFFFF)
val NothingRed = Color(0xFFEA3323)
val NothingGray = Color(0xFF333333)

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
                    color = NothingBlack
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
    
    // The mapped 5-band compromise of your 6-band profile
    // Original Band 1 (+2.5dB) -> Bass: +3
    // Original Band 2 (-2.0dB) -> MidBass: -2
    // Original Band 3 (+1.5dB) -> Mid: +1
    // Original Band 4 (-2.5dB) -> MidTreble: -2
    // Orig Band 5 (-5.5dB) & 6 (+4.0dB) -> Treble: -2 (Compromise to tame sibilance)
    var eqValues by remember { mutableStateOf(listOf(3, -2, 1, -2, -2)) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        
        Text(
            text = "ONTRAC CTRL",
            color = NothingWhite,
            fontFamily = FontFamily.Monospace,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 2.sp
        )

        // Status Indicator
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .background(if (connectionState.contains("Ready")) NothingRed else NothingGray)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = connectionState.uppercase(),
                color = NothingWhite,
                fontFamily = FontFamily.Monospace,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Button(
            onClick = onScanClick,
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = NothingWhite, contentColor = NothingBlack),
            enabled = connectionState == "Disconnected" || connectionState.contains("Failed")
        ) {
            Text("CONNECT", fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold)
        }

        // ANC Controls
        Column(modifier = Modifier.fillMaxWidth()) {
            Text("NOISE CONTROL", color = NothingWhite, fontFamily = FontFamily.Monospace, fontSize = 14.sp)
            Spacer(modifier = Modifier.height(8.dp))
            val isReady = connectionState == "Ready to send commands"

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OutlinedButton(
                    onClick = { bleManager.sendCommand(CMD_ANC_ISOLATION) },
                    enabled = isReady,
                    shape = RoundedCornerShape(0.dp),
                    modifier = Modifier.weight(1f)
                ) { Text("ANC", fontFamily = FontFamily.Monospace, color = NothingWhite) }

                OutlinedButton(
                    onClick = { bleManager.sendCommand(CMD_ANC_TRANSPARENCY) },
                    enabled = isReady,
                    shape = RoundedCornerShape(0.dp),
                    modifier = Modifier.weight(1f)
                ) { Text("TRANS", fontFamily = FontFamily.Monospace, color = NothingWhite) }

                OutlinedButton(
                    onClick = { bleManager.sendCommand(CMD_ANC_OFF) },
                    enabled = isReady,
                    shape = RoundedCornerShape(0.dp),
                    modifier = Modifier.weight(1f)
                ) { Text("OFF", fontFamily = FontFamily.Monospace, color = NothingWhite) }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Equalizer UI
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("EQUALIZER (CUSTOM)", color = NothingWhite, fontFamily = FontFamily.Monospace, fontSize = 14.sp)
                Button(
                    onClick = { 
                        // 1. Tell headset to use Custom EQ Profile
                        bleManager.sendCommand(CMD_EQ_MODE_CUSTOM)
                        // 2. Upload the 5-band payload
                        bleManager.sendCustomEq(eqValues) 
                    },
                    enabled = connectionState == "Ready to send commands",
                    shape = RoundedCornerShape(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = NothingRed, contentColor = NothingWhite),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
                    modifier = Modifier.height(32.dp)
                ) {
                    Text("APPLY", fontFamily = FontFamily.Monospace, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                }
            }
            
            Spacer(modifier = Modifier.height(24.dp))

            // 5 Band Slider Array
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                val labels = listOf("BASS", "M-BAS", "MID", "M-TRB", "TRB")
                eqValues.forEachIndexed { index, value ->
                    NothingVerticalSlider(
                        value = value,
                        label = labels[index],
                        onValueChange = { newVal ->
                            val mut = eqValues.toMutableList()
                            mut[index] = newVal
                            eqValues = mut
                        }
                    )
                }
            }
        }
    }
}

// Minimalist Vertical Slider mimicking the "Nothing" brand aesthetics
@Composable
fun NothingVerticalSlider(
    value: Int,
    label: String,
    onValueChange: (Int) -> Unit
) {
    // Range is typically -10 to +10 dB for firmware DSPs.
    val minDb = -10
    val maxDb = 10
    
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ) {
        Text(
            text = "${if (value > 0) "+" else ""}$value",
            color = NothingWhite,
            fontFamily = FontFamily.Monospace,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )
        
        Spacer(modifier = Modifier.height(8.dp))
        
        Box(
            modifier = Modifier
                .weight(1f)
                .width(40.dp)
                .pointerInput(Unit) {
                    detectDragGestures { change, dragAmount ->
                        change.consume()
                        // rough calculation for drag 
                        val step = size.height / (maxDb - minDb)
                        val delta = (dragAmount.y / step).roundToInt()
                        val newVal = (value - delta).coerceIn(minDb, maxDb)
                        onValueChange(newVal)
                    }
                }
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val trackWidth = 4.dp.toPx()
                val sliderHeight = 12.dp.toPx()
                val centerY = size.height / 2f
                
                // Draw Track
                drawRoundRect(
                    color = NothingGray,
                    topLeft = Offset((size.width - trackWidth) / 2f, 0f),
                    size = Size(trackWidth, size.height),
                    cornerRadius = CornerRadius(trackWidth/2, trackWidth/2)
                )
                
                // Draw Zero Line
                drawLine(
                    color = NothingWhite.copy(alpha = 0.5f),
                    start = Offset(0f, centerY),
                    end = Offset(size.width, centerY),
                    strokeWidth = 2.dp.toPx()
                )
                
                // Calculate Handle Position
                val range = maxDb - minDb
                val percentage = 1f - ((value - minDb).toFloat() / range.toFloat())
                val handleY = (percentage * size.height).coerceIn(sliderHeight/2, size.height - sliderHeight/2)
                
                // Draw Handle
                drawRoundRect(
                    color = NothingRed,
                    topLeft = Offset(4.dp.toPx(), handleY - sliderHeight / 2f),
                    size = Size(size.width - 8.dp.toPx(), sliderHeight),
                    cornerRadius = CornerRadius(2.dp.toPx(), 2.dp.toPx())
                )
            }
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = label,
            color = NothingWhite.copy(alpha = 0.6f),
            fontFamily = FontFamily.Monospace,
            fontSize = 10.sp
        )
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
                    _connectionState.value = "Connected. Discovering Services..."
                    bluetoothGatt = gatt
                    gatt.discoverServices()
                } else if (newState == BluetoothProfile.STATE_DISCONNECTED) {
                    _connectionState.value = "Disconnected"
                    gatt.close()
                }
            } else {
                _connectionState.value = "Connection Failed (Status $status)"
                gatt.close()
            }
        }

        override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) {
            if (status == BluetoothGatt.GATT_SUCCESS) {
                val service = gatt.getService(DYSON_SERVICE_UUID)
                if (service != null) {
                    _connectionState.value = "Ready to send commands"
                } else {
                    _connectionState.value = "Dyson Service Not Found"
                }
            }
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
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            device.connectGatt(context, false, gattCallback, BluetoothDevice.TRANSPORT_LE)
        } else {
            device.connectGatt(context, false, gattCallback)
        }
    }

    // Used for ANC and EQ Presets
    fun sendCommand(payload: ByteArray) {
        val gatt = bluetoothGatt ?: return
        val service = gatt.getService(DYSON_SERVICE_UUID) ?: return
        val characteristic = service.getCharacteristic(DYSON_CMD_CHAR_UUID) ?: return

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            gatt.writeCharacteristic(characteristic, payload, BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT)
        } else {
            @Suppress("DEPRECATION")
            characteristic.value = payload
            @Suppress("DEPRECATION")
            characteristic.writeType = BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT
            @Suppress("DEPRECATION")
            gatt.writeCharacteristic(characteristic)
        }
    }
    
    // Custom 5-Band EQ Upload
    fun sendCustomEq(dbValues: List<Int>) {
        val gatt = bluetoothGatt ?: return
        val service = gatt.getService(DYSON_SERVICE_UUID) ?: return
        val eqChar = service.getCharacteristic(DYSON_CUSTOM_EQ_UUID) ?: return
        
        // Convert Integer dB values to Byte array. Dyson firmware expects exactly 5 bytes.
        val payload = ByteArray(5)
        for (i in 0 until 5) {
            payload[i] = dbValues[i].toByte()
        }
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            gatt.writeCharacteristic(eqChar, payload, BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT)
        } else {
            @Suppress("DEPRECATION")
            eqChar.value = payload
            @Suppress("DEPRECATION")
            eqChar.writeType = BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT
            @Suppress("DEPRECATION")
            gatt.writeCharacteristic(eqChar)
        }
    }

    fun disconnect() {
        stopScan()
        bluetoothGatt?.disconnect()
    }
}