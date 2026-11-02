package com.dyson.ontrac.controller

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.*
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.bluetooth.le.ScanSettings
import android.content.Context
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dyson.ontrac.controller.settings.ThemePreferences
import kotlinx.coroutines.launch
import java.util.*
import java.util.concurrent.ConcurrentLinkedQueue

class MainActivity : ComponentActivity() {

    private lateinit var themePrefs: ThemePreferences
    private var bluetoothGatt: BluetoothGatt? = null
    private val descriptorQueue: Queue<BluetoothGattDescriptor> = ConcurrentLinkedQueue()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        themePrefs = ThemePreferences(applicationContext)

        setContent {
            val scope = rememberCoroutineScope()
            val dynamicColorEnabled by themePrefs.dynamicColorFlow.collectAsState(initial = true)
            val oledBlackEnabled by themePrefs.oledBlackFlow.collectAsState(initial = true)

            val context = LocalContext.current
            val darkTheme = isSystemInDarkTheme()

            val colorScheme = when {
                dynamicColorEnabled && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
                    if (darkTheme) {
                        if (oledBlackEnabled) {
                            dynamicDarkColorScheme(context).copy(
                                background = Color.Black,
                                surface = Color.Black,
                                surfaceVariant = Color(0xFF121212)
                            )
                        } else dynamicDarkColorScheme(context)
                    } else dynamicLightColorScheme(context)
                }
                darkTheme -> {
                    if (oledBlackEnabled) {
                        darkColorScheme().copy(
                            background = Color.Black,
                            surface = Color.Black,
                            surfaceVariant = Color(0xFF121212)
                        )
                    } else darkColorScheme()
                }
                else -> lightColorScheme()
            }

            MaterialTheme(colorScheme = colorScheme) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DysonControllerScreen(
                        dynamicColorEnabled = dynamicColorEnabled,
                        oledBlackEnabled = oledBlackEnabled,
                        onDynamicColorChanged = { enabled ->
                            scope.launch { themePrefs.setDynamicColor(enabled) }
                        },
                        onOledBlackChanged = { enabled ->
                            scope.launch { themePrefs.setOledBlack(enabled) }
                        }
                    )
                }
            }
        }
    }

    @SuppressLint("MissingPermission")
    @Composable
    fun DysonControllerScreen(
        dynamicColorEnabled: Boolean,
        oledBlackEnabled: Boolean,
        onDynamicColorChanged: (Boolean) -> Unit,
        onOledBlackChanged: (Boolean) -> Unit
    ) {
        var statusText by remember { mutableStateOf("Disconnected") }
        var logText by remember { mutableStateOf("Ready. Connect to your Dyson OnTrac.\n") }

        // Custom 5-Band EQ States (-10 dB to +10 dB)
        var band1 by remember { mutableStateOf(0f) }
        var band2 by remember { mutableStateOf(0f) }
        var band3 by remember { mutableStateOf(0f) }
        var band4 by remember { mutableStateOf(0f) }
        var band5 by remember { mutableStateOf(0f) }

        fun appendLog(msg: String) {
            logText = (logText + msg + "\n").takeLast(12000)
        }

        val permissionLauncher = rememberLauncherForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { perms ->
            appendLog("Permissions granted: ${perms.values.all { it }}")
        }

        LaunchedEffect(Unit) {
            val perms = mutableListOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                perms.add(Manifest.permission.BLUETOOTH_SCAN)
                perms.add(Manifest.permission.BLUETOOTH_CONNECT)
            }
            permissionLauncher.launch(perms.toTypedArray())
        }

        val gattCallback = remember {
            object : BluetoothGattCallback() {
                override fun onConnectionStateChange(gatt: BluetoothGatt, status: Int, newState: Int) {
                    if (newState == BluetoothProfile.STATE_CONNECTED) {
                        val address = gatt.device.address
                        DysonBluetoothManager.setGattInstance(gatt)

                        val prefs = getSharedPreferences("DysonPrefs", Context.MODE_PRIVATE)
                        prefs.edit().putString("SAVED_ONTRAC_MAC", address).apply()

                        statusText = "Connected ($address)"
                        appendLog("ACL/LE Connected ($address). Requesting MTU 251...")
                        gatt.requestMtu(251)
                    } else if (newState == BluetoothProfile.STATE_DISCONNECTED) {
                        DysonBluetoothManager.setGattInstance(null)
                        statusText = "Disconnected"
                        appendLog("Disconnected from GATT server (status=$status)")
                    }
                }

                override fun onMtuChanged(gatt: BluetoothGatt, mtu: Int, status: Int) {
                    appendLog("MTU negotiated: $mtu (status=$status). Discovering services...")
                    gatt.discoverServices()
                }

                override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) {
                    if (status != BluetoothGatt.GATT_SUCCESS) {
                        appendLog("Service discovery failed: $status")
                        return
                    }
                    descriptorQueue.clear()

                    appendLog("=== DISCOVERED GATT SERVICES ===")
                    for (service in gatt.services) {
                        appendLog("SVC: ${service.uuid}")
                        for (ch in service.characteristics) {
                            val p = ch.properties
                            appendLog("  CHR: ${ch.uuid} [Props: 0x${p.toString(16)}]")

                            if ((p and (BluetoothGattCharacteristic.PROPERTY_NOTIFY or BluetoothGattCharacteristic.PROPERTY_INDICATE)) != 0) {
                                gatt.setCharacteristicNotification(ch, true)
                                ch.getDescriptor(DysonProtocolEngine.CCCD_UUID)?.let { desc ->
                                    descriptorQueue.add(desc)
                                }
                            }
                        }
                    }
                    statusText = "Ready | Connected to OnTrac"
                    processNextDescriptor(gatt)
                }

                override fun onDescriptorWrite(gatt: BluetoothGatt, descriptor: BluetoothGattDescriptor, status: Int) {
                    appendLog("CCCD Subscribed: ${descriptor.characteristic.uuid} (status=$status)")
                    processNextDescriptor(gatt)
                }

                override fun onCharacteristicChanged(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, value: ByteArray) {
                    appendLog("RX Notification: ${value.toHex()}")
                }

                override fun onCharacteristicWrite(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, status: Int) {
                    appendLog("TX Write Ack: status=$status")
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text("Dyson OnTrac Controller", style = MaterialTheme.typography.titleMedium)
            Text("Status: $statusText", color = Color(0xFF80CBC4))

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(
                    onClick = {
                        val bm = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
                        val adapter = bm.adapter
                        val target = adapter.bondedDevices.firstOrNull {
                            val n = it.name?.lowercase() ?: ""
                            n.contains("ontrac") || n.contains("dyson") || n.contains("wp02")
                        }
                        if (target != null) {
                            appendLog("Connecting via TRANSPORT_LE to: ${target.name} (${target.address})")
                            bluetoothGatt?.close()
                            bluetoothGatt = target.connectGatt(
                                this@MainActivity,
                                false,
                                gattCallback,
                                BluetoothDevice.TRANSPORT_LE
                            )
                        } else {
                            appendLog("No bonded OnTrac found. Scanning BLE...")
                            startBleScan(adapter, gattCallback, ::appendLog)
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Connect OnTrac")
                }

                Button(
                    onClick = {
                        val bm = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
                        startBleScan(bm.adapter, gattCallback, ::appendLog)
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Scan BLE")
                }
            }

            Button(
                onClick = {
                    autoReconnectSavedDevice(this@MainActivity, gattCallback) { msg ->
                        appendLog(msg)
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Auto-Reconnect Saved Device")
            }

            HorizontalDivider()
            Text("ANC Control Modes", style = MaterialTheme.typography.labelLarge)

            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                Button(
                    onClick = { sendDysonCommand(DysonProtocolEngine.AUDIO_SERVICE_UUID, DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildAncPayload(0x00), ::appendLog) },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Isolation", fontSize = 11.sp)
                }
                Button(
                    onClick = { sendDysonCommand(DysonProtocolEngine.AUDIO_SERVICE_UUID, DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildAncPayload(0x02), ::appendLog) },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Transparency", fontSize = 11.sp)
                }
                Button(
                    onClick = { sendDysonCommand(DysonProtocolEngine.AUDIO_SERVICE_UUID, DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildAncPayload(0x03), ::appendLog) },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("ANC Off", fontSize = 11.sp)
                }
            }

            HorizontalDivider()
            Text("DSP Preset EQ", style = MaterialTheme.typography.labelLarge)

            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                Button(
                    onClick = { sendDysonCommand(DysonProtocolEngine.AUDIO_SERVICE_UUID, DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildPresetEqPayload(0x02), ::appendLog) },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Neutral", fontSize = 11.sp)
                }
                Button(
                    onClick = { sendDysonCommand(DysonProtocolEngine.AUDIO_SERVICE_UUID, DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildPresetEqPayload(0x00), ::appendLog) },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Enhanced", fontSize = 11.sp)
                }
                Button(
                    onClick = { sendDysonCommand(DysonProtocolEngine.AUDIO_SERVICE_UUID, DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildPresetEqPayload(0x01), ::appendLog) },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Bass Boost", fontSize = 11.sp)
                }
            }

            HorizontalDivider()
            Text("Custom 5-Band Equalizer (-10dB to +10dB)", style = MaterialTheme.typography.labelLarge)

            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                EqSliderRow("60Hz", band1) { band1 = it }
                EqSliderRow("250Hz", band2) { band2 = it }
                EqSliderRow("1kHz", band3) { band3 = it }
                EqSliderRow("4kHz", band4) { band4 = it }
                EqSliderRow("12kHz", band5) { band5 = it }
            }

            Button(
                onClick = {
                    val payload = DysonProtocolEngine.buildCustomEqPayload(
                        band1.toInt(), band2.toInt(), band3.toInt(), band4.toInt(), band5.toInt()
                    )
                    sendDysonCommand(DysonProtocolEngine.AUDIO_SERVICE_UUID, DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildPresetEqPayload(0x03), ::appendLog)
                    sendDysonCommand(DysonProtocolEngine.AUDIO_SERVICE_UUID, DysonProtocolEngine.CUSTOM_EQ_CHAR_UUID, payload, ::appendLog)
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Apply Custom EQ Profile")
            }

            HorizontalDivider()
            Text("Appearance Settings", style = MaterialTheme.typography.labelLarge)

            // Toggle 1: Material You Dynamic Theming
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Material You Dynamic Color", style = MaterialTheme.typography.bodyMedium)
                    Text("Adapt UI colors to system wallpaper", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.outline)
                }
                Switch(
                    checked = dynamicColorEnabled,
                    onCheckedChange = onDynamicColorChanged
                )
            }

            // Toggle 2: True OLED Black Theme
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("OLED Black Mode", style = MaterialTheme.typography.bodyMedium)
                    Text("Use pure #000000 backgrounds in dark mode", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.outline)
                }
                Switch(
                    checked = oledBlackEnabled,
                    onCheckedChange = onOledBlackChanged
                )
            }

            HorizontalDivider()
            Text("Diagnostic Console:", style = MaterialTheme.typography.labelLarge)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .background(Color(0xFF121212))
                    .padding(8.dp)
            ) {
                Text(
                    text = logText,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 11.sp,
                    color = Color(0xFF00E676)
                )
            }
        }
    }

    @Composable
    fun EqSliderRow(label: String, value: Float, onValueChanged: (Float) -> Unit) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(label, modifier = Modifier.width(55.dp), fontSize = 12.sp)
            Slider(
                value = value,
                onValueChange = onValueChanged,
                valueRange = -10f..10f,
                steps = 19,
                modifier = Modifier.weight(1f)
            )
            Text("${value.toInt()} dB", modifier = Modifier.width(45.dp), fontSize = 11.sp)
        }
    }

    @SuppressLint("MissingPermission")
    fun autoReconnectSavedDevice(context: Context, gattCallback: BluetoothGattCallback, appendLog: (String) -> Unit) {
        val prefs = context.getSharedPreferences("DysonPrefs", Context.MODE_PRIVATE)
        val savedMac = prefs.getString("SAVED_ONTRAC_MAC", null)

        if (savedMac.isNullOrEmpty()) {
            appendLog("No saved MAC address found. Please pair or connect manually first.")
            return
        }

        val bluetoothManager = context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        val adapter = bluetoothManager.adapter

        if (adapter == null || !adapter.isEnabled) {
            appendLog("Bluetooth adapter is disabled.")
            return
        }

        try {
            val device = adapter.getRemoteDevice(savedMac)
            appendLog("Attempting direct connection to saved MAC: $savedMac")
            bluetoothGatt?.close()

            bluetoothGatt = device.connectGatt(
                context,
                false,
                gattCallback,
                BluetoothDevice.TRANSPORT_LE
            )
        } catch (e: IllegalArgumentException) {
            appendLog("Invalid MAC address stored: $savedMac")
        }
    }

    @SuppressLint("MissingPermission")
    private fun startBleScan(
        adapter: BluetoothAdapter,
        gattCallback: BluetoothGattCallback,
        appendLog: (String) -> Unit
    ) {
        val scanner = adapter.bluetoothLeScanner ?: return
        val settings = ScanSettings.Builder()
            .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
            .build()
        scanner.startScan(null, settings, object : ScanCallback() {
            override fun onScanResult(callbackType: Int, result: ScanResult) {
                val name = result.device.name ?: result.scanRecord?.deviceName ?: ""
                if (name.contains("OnTrac", true) || name.contains("Dyson", true) || name.contains("WP02", true)) {
                    scanner.stopScan(this)
                    appendLog("Found target: $name (${result.device.address}). Connecting...")
                    bluetoothGatt?.close()
                    bluetoothGatt = result.device.connectGatt(
                        this@MainActivity,
                        false,
                        gattCallback,
                        BluetoothDevice.TRANSPORT_LE
                    )
                }
            }
        })
    }

    @SuppressLint("MissingPermission")
    private fun processNextDescriptor(gatt: BluetoothGatt) {
        val desc = descriptorQueue.poll() ?: return
        val ch = desc.characteristic
        val valBytes = if ((ch.properties and BluetoothGattCharacteristic.PROPERTY_INDICATE) != 0) {
            BluetoothGattDescriptor.ENABLE_INDICATION_VALUE
        } else {
            BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            gatt.writeDescriptor(desc, valBytes)
        } else {
            @Suppress("DEPRECATION")
            desc.value = valBytes
            @Suppress("DEPRECATION")
            gatt.writeDescriptor(desc)
        }
    }

    @SuppressLint("MissingPermission")
    private fun sendDysonCommand(
        serviceUuid: UUID,
        charUuid: UUID,
        payload: ByteArray,
        appendLog: (String) -> Unit
    ) {
        val gatt = bluetoothGatt
        if (gatt == null) {
            appendLog("ERROR: Not connected to any device.")
            return
        }
        val service = gatt.getService(serviceUuid)
        if (service == null) {
            appendLog("ERROR: Audio service $serviceUuid not found on peripheral.")
            return
        }
        val characteristic = service.getCharacteristic(charUuid)
        if (characteristic == null) {
            appendLog("ERROR: Command characteristic $charUuid not found.")
            return
        }

        val success = DysonProtocolEngine.writeGattPayload(gatt, characteristic, payload)
        appendLog("TX -> [${charUuid.toString().take(8)}] payload: ${payload.toHex()} | Success: $success")
    }

    private fun ByteArray.toHex(): String = joinToString("") { "%02x".format(it) }
}
