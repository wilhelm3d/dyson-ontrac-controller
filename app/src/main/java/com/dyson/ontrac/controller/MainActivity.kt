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
import androidx.lifecycle.lifecycleScope
import com.dyson.ontrac.controller.logging.DysonLogger
import com.dyson.ontrac.controller.settings.ThemePreferences
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.util.*
import java.util.concurrent.ConcurrentLinkedQueue
import kotlin.coroutines.resume

class MainActivity : ComponentActivity() {

    private lateinit var themePrefs: ThemePreferences
    private var bluetoothGatt: BluetoothGatt? = null
    private val descriptorQueue: Queue<BluetoothGattDescriptor> = ConcurrentLinkedQueue()
    private var pendingWriteContinuation: CancellableContinuation<Boolean>? = null

    private val gattMutex = Mutex()
    private val ancSliderFlow = MutableStateFlow(100f)

    @OptIn(FlowPreview::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        themePrefs = ThemePreferences(applicationContext)
        DysonLogger.initFileLogging(applicationContext)
        DysonLogger.i("MAIN", "Dyson OnTrac Controller Activity Launched")

        // Debounce rapid slider updates (waits 100ms after last drag event)
        lifecycleScope.launch {
            ancSliderFlow
                .debounce(100L)
                .distinctUntilChanged()
                .collectLatest { percent ->
                    sendDysonCommandSequential(
                        DysonProtocolEngine.COMMAND_CHAR_UUID,
                        DysonProtocolEngine.buildAncIntensityPayload(percent.toInt())
                    )
                }
        }

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
        val scope = rememberCoroutineScope()
        var statusText by remember { mutableStateOf("Disconnected") }
        val logText by DysonLogger.logFlow.collectAsState()

        // Custom 5-Band EQ States (-10 dB to +10 dB)
        var band1 by remember { mutableStateOf(0f) }
        var band2 by remember { mutableStateOf(0f) }
        var band3 by remember { mutableStateOf(0f) }
        var band4 by remember { mutableStateOf(0f) }
        var band5 by remember { mutableStateOf(0f) }

        val permissionLauncher = rememberLauncherForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { perms ->
            DysonLogger.i("PERM", "Permissions result: ${perms.values.all { it }}")
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
                        DysonLogger.i("GATT", "ACL/LE Connected ($address). Requesting MTU 251...")
                        gatt.requestMtu(251)
                    } else if (newState == BluetoothProfile.STATE_DISCONNECTED) {
                        DysonBluetoothManager.setGattInstance(null)
                        statusText = "Disconnected"
                        DysonLogger.i("GATT", "Disconnected from GATT server (status=$status)")
                    }
                }

                override fun onMtuChanged(gatt: BluetoothGatt, mtu: Int, status: Int) {
                    DysonLogger.i("GATT", "MTU negotiated: $mtu (status=$status). Discovering services...")
                    gatt.discoverServices()
                }

                override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) {
                    if (status != BluetoothGatt.GATT_SUCCESS) {
                        DysonLogger.e("GATT", "Service discovery failed with status: $status")
                        return
                    }
                    descriptorQueue.clear()

                    DysonLogger.i("GATT", "=== DISCOVERED GATT SERVICES ===")
                    for (service in gatt.services) {
                        DysonLogger.i("GATT", "SVC: ${service.uuid}")
                        for (ch in service.characteristics) {
                            val p = ch.properties
                            DysonLogger.i("GATT", "  CHR: ${ch.uuid} [Props: 0x${p.toString(16)}]")

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
                    DysonLogger.i("GATT", "CCCD Subscribed: ${descriptor.characteristic.uuid} (status=$status)")
                    processNextDescriptor(gatt)
                }

                override fun onCharacteristicChanged(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, value: ByteArray) {
                    DysonLogger.i("RX_NOTIF", "Characteristic ${characteristic.uuid} -> ${value.toHex()}")
                }

                override fun onCharacteristicWrite(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, status: Int) {
                    DysonLogger.i("TX_ACK", "Write Ack for ${characteristic.uuid} | status=$status")
                    pendingWriteContinuation?.let { cont ->
                        pendingWriteContinuation = null
                        if (cont.isActive) {
                            cont.resume(status == BluetoothGatt.GATT_SUCCESS || status == 3)
                        }
                    }
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
                            DysonLogger.i("BLE", "Connecting via TRANSPORT_LE to bonded: ${target.name} (${target.address})")
                            bluetoothGatt?.close()
                            bluetoothGatt = target.connectGatt(
                                this@MainActivity,
                                false,
                                gattCallback,
                                BluetoothDevice.TRANSPORT_LE
                            )
                        } else {
                            DysonLogger.i("BLE", "No bonded OnTrac found. Starting BLE scan...")
                            startBleScan(adapter, gattCallback)
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Connect OnTrac")
                }

                Button(
                    onClick = {
                        val bm = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
                        startBleScan(bm.adapter, gattCallback)
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Scan BLE")
                }
            }

            Button(
                onClick = {
                    autoReconnectSavedDevice(this@MainActivity, gattCallback)
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Auto-Reconnect Saved Device")
            }

            HorizontalDivider()
            Text("ANC Control Modes", style = MaterialTheme.typography.labelLarge)

            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                Button(
                    onClick = { sendDysonCommand(DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildAncPayload(0x00)) },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Isolation", fontSize = 11.sp)
                }
                Button(
                    onClick = { sendDysonCommand(DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildAncPayload(0x02)) },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Transparency", fontSize = 11.sp)
                }
                Button(
                    onClick = { sendDysonCommand(DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildAncPayload(0x03)) },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("ANC Off", fontSize = 11.sp)
                }
            }

            HorizontalDivider()
            Text("DSP Preset EQ", style = MaterialTheme.typography.labelLarge)

            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                Button(
                    onClick = { sendDysonCommand(DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildPresetEqPayload(0x02)) },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Neutral", fontSize = 11.sp)
                }
                Button(
                    onClick = { sendDysonCommand(DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildPresetEqPayload(0x00)) },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Enhanced", fontSize = 11.sp)
                }
                Button(
                    onClick = { sendDysonCommand(DysonProtocolEngine.COMMAND_CHAR_UUID, DysonProtocolEngine.buildPresetEqPayload(0x01)) },
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
                    scope.launch {
                        sendDysonCommandSequential(
                            DysonProtocolEngine.COMMAND_CHAR_UUID,
                            DysonProtocolEngine.buildPresetEqPayload(0x03)
                        )

                        val payload = DysonProtocolEngine.buildCustomEqPayload(
                            band1.toInt(), band2.toInt(), band3.toInt(), band4.toInt(), band5.toInt()
                        )
                        sendDysonCommandSequential(
                            DysonProtocolEngine.CUSTOM_EQ_CHAR_UUID,
                            payload
                        )
                        DysonLogger.i("EQ", "Successfully applied custom 5-band EQ profile!")
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Apply Custom EQ Profile")
            }

            HorizontalDivider()
            AudiophileAndAncControls(
                onApplyTargetCurve = { name, gains ->
                    band1 = gains[0]
                    band2 = gains[1]
                    band3 = gains[2]
                    band4 = gains[3]
                    band5 = gains[4]
                    scope.launch {
                        sendDysonCommandSequential(
                            DysonProtocolEngine.COMMAND_CHAR_UUID,
                            DysonProtocolEngine.buildPresetEqPayload(0x03)
                        )
                        val payload = DysonProtocolEngine.buildCustomEqPayload(
                            gains[0].toInt(), gains[1].toInt(), gains[2].toInt(), gains[3].toInt(), gains[4].toInt()
                        )
                        sendDysonCommandSequential(
                            DysonProtocolEngine.CUSTOM_EQ_CHAR_UUID,
                            payload
                        )
                        DysonLogger.i("AUDIOPHILE", "Successfully applied target curve: $name")
                    }
                },
                onAncSliderChanged = { newVal ->
                    ancSliderFlow.value = newVal
                }
            )

            HorizontalDivider()
            HardwareCustomizationPanel { payload ->
                sendDysonCommand(DysonProtocolEngine.COMMAND_CHAR_UUID, payload)
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
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Diagnostic Console Log", style = MaterialTheme.typography.labelLarge)
                Button(
                    onClick = { DysonLogger.clear() },
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp)
                ) {
                    Text("Clear Console", fontSize = 11.sp)
                }
            }

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
    fun AudiophileAndAncControls(
        onApplyTargetCurve: (String, FloatArray) -> Unit,
        onAncSliderChanged: (Float) -> Unit
    ) {
        var sliderValue by remember { mutableStateOf(100f) }

        Column(
            modifier = Modifier.fillMaxWidth().padding(4.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // --- Fine-Grained ANC Depth Slider ---
            Text("Fine-Grained ANC Depth: ${sliderValue.toInt()}%", style = MaterialTheme.typography.labelLarge)
            Slider(
                value = sliderValue,
                onValueChange = { newVal ->
                    sliderValue = newVal
                    // Instantly update UI, but flow's .debounce() queues the BLE writes safely
                    onAncSliderChanged(newVal)
                },
                valueRange = 0f..100f,
                steps = 99,
                modifier = Modifier.fillMaxWidth()
            )

            HorizontalDivider()

            // --- Target Curve Auto-Calibration ---
            Text("Target Curve Auto-Calibration", style = MaterialTheme.typography.labelLarge)
            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                DysonProtocolEngine.targetCurveProfiles.forEach { (profileName, gains) ->
                    Button(
                        onClick = { onApplyTargetCurve(profileName, gains) },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.secondaryContainer
                        )
                    ) {
                        Text("Apply Profile: $profileName", fontSize = 12.sp, color = MaterialTheme.colorScheme.onSecondaryContainer)
                    }
                }
            }
        }
    }

    @Composable
    fun HardwareCustomizationPanel(onSendCommand: (ByteArray) -> Unit) {
        var wearDetectionState by remember { mutableStateOf(2) } // 0: Off, 1: Low, 2: High
        var doubleTapAction by remember { mutableStateOf(2) }    // 0: Play/Pause, 1: Assistant, 2: Cycle Modes, 3: Skip

        Column(modifier = Modifier.fillMaxWidth().padding(4.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("Capacitive Wear-Detection Tuning", style = MaterialTheme.typography.labelLarge)
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                listOf("Disabled" to 0, "Low" to 1, "High" to 2).forEach { (label, value) ->
                    Button(
                        onClick = {
                            wearDetectionState = value
                            onSendCommand(DysonProtocolEngine.buildWearDetectionPayload(value.toByte()))
                        },
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (wearDetectionState == value) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondaryContainer
                        )
                    ) {
                        Text(label, fontSize = 11.sp)
                    }
                }
            }

            Spacer(modifier = Modifier.height(4.dp))
            Text("Custom Earcup Gesture Remapping (Double-Tap)", style = MaterialTheme.typography.labelLarge)
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                listOf("Play/Pause" to 0, "Assistant" to 1, "Cycle ANC" to 2, "Skip" to 3).forEach { (label, value) ->
                    Button(
                        onClick = {
                            doubleTapAction = value
                            // Gesture ID 0x01 = Double Tap, followed by action ID
                            onSendCommand(DysonProtocolEngine.buildGestureRemapPayload(0x01, value.toByte()))
                        },
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (doubleTapAction == value) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondaryContainer
                        )
                    ) {
                        Text(label, fontSize = 10.sp)
                    }
                }
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
    fun autoReconnectSavedDevice(context: Context, gattCallback: BluetoothGattCallback) {
        val prefs = context.getSharedPreferences("DysonPrefs", Context.MODE_PRIVATE)
        val savedMac = prefs.getString("SAVED_ONTRAC_MAC", null)

        if (savedMac.isNullOrEmpty()) {
            DysonLogger.e("BLE", "No saved MAC address found. Please pair or connect manually first.")
            return
        }

        val bluetoothManager = context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        val adapter = bluetoothManager.adapter

        if (adapter == null || !adapter.isEnabled) {
            DysonLogger.e("BLE", "Bluetooth adapter is disabled.")
            return
        }

        try {
            val device = adapter.getRemoteDevice(savedMac)
            DysonLogger.i("BLE", "Attempting direct connection to saved MAC: $savedMac")
            bluetoothGatt?.close()

            bluetoothGatt = device.connectGatt(
                context,
                false,
                gattCallback,
                BluetoothDevice.TRANSPORT_LE
            )
        } catch (e: IllegalArgumentException) {
            DysonLogger.e("BLE", "Invalid MAC address stored: $savedMac")
        }
    }

    @SuppressLint("MissingPermission")
    private fun startBleScan(
        adapter: BluetoothAdapter,
        gattCallback: BluetoothGattCallback
    ) {
        val scanner = adapter.bluetoothLeScanner ?: return
        val settings = ScanSettings.Builder()
            .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
            .build()
        DysonLogger.i("BLE_SCAN", "Starting low-latency BLE scan...")
        scanner.startScan(null, settings, object : ScanCallback() {
            override fun onScanResult(callbackType: Int, result: ScanResult) {
                val name = result.device.name ?: result.scanRecord?.deviceName ?: ""
                if (name.contains("OnTrac", true) || name.contains("Dyson", true) || name.contains("WP02", true)) {
                    scanner.stopScan(this)
                    DysonLogger.i("BLE_SCAN", "Found target: $name (${result.device.address}). Connecting...")
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
    private suspend fun sendDysonCommandSequential(
        charUuid: UUID,
        payload: ByteArray
    ): Boolean {
        return gattMutex.withLock {
            val gatt = bluetoothGatt
            if (gatt == null) {
                DysonLogger.e("CMD", "ERROR: Not connected to any device.")
                return@withLock false
            }

            var foundChar: BluetoothGattCharacteristic? = null
            for (service in gatt.services) {
                val ch = service.getCharacteristic(charUuid)
                if (ch != null) {
                    foundChar = ch
                    break
                }
            }

            if (foundChar == null) {
                DysonLogger.e("CMD", "ERROR: Characteristic $charUuid not found on any service.")
                return@withLock false
            }

            val writeResult = suspendCancellableCoroutine<Boolean> { continuation ->
                pendingWriteContinuation = continuation
                val success = DysonProtocolEngine.writeGattPayload(gatt, foundChar, payload)
                DysonLogger.i("CMD", "TX -> [${charUuid.toString().take(8)}] payload: ${payload.toHex()} | Initiated: $success")
                if (!success) {
                    pendingWriteContinuation = null
                    if (continuation.isActive) {
                        continuation.resume(false)
                    }
                }
            }
            delay(40)
            writeResult
        }
    }

    @SuppressLint("MissingPermission")
    private fun sendDysonCommand(
        charUuid: UUID,
        payload: ByteArray
    ) {
        val gatt = bluetoothGatt
        if (gatt == null) {
            DysonLogger.e("CMD", "ERROR: Not connected to any device.")
            return
        }

        // Search globally across all discovered services for the characteristic
        var foundChar: BluetoothGattCharacteristic? = null
        for (service in gatt.services) {
            val ch = service.getCharacteristic(charUuid)
            if (ch != null) {
                foundChar = ch
                break
            }
        }

        if (foundChar == null) {
            DysonLogger.e("CMD", "ERROR: Characteristic $charUuid not found on any service.")
            return
        }

        val success = DysonProtocolEngine.writeGattPayload(gatt, foundChar, payload)
        DysonLogger.i("CMD", "TX -> [${charUuid.toString().take(8)}] payload: ${payload.toHex()} | Success: $success")
    }

    private fun ByteArray.toHex(): String = joinToString("") { "%02x".format(it) }
}
