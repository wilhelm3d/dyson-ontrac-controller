package com.dyson.ontrac.controller

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.text.BasicTextField
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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.dyson.ontrac.controller.ui.GlassDashboard
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.roundToInt
import kotlin.math.sin

// --- Palette (dark, rounded cards, purple accent) ---
val AppBg = Color(0xFF0B0B0C)
val CardBg = Color(0xFF1C1C1E)
val TrackBg = Color(0xFF2C2C2E)
val TextPrimary = Color(0xFFFFFFFF)
val TextSecondary = Color(0xFF9A9AA0)
val Accent = Color(0xFF7C5CFF)
val StatusBlue = Color(0xFF3FA2F7)
val DangerRed = Color(0xFFFF6B6B)

class MainActivity : ComponentActivity() {

    private val app get() = application as DysonApp

    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        if (permissions.entries.all { it.value }) app.ble.connect()
        else Log.e("BLE", "Permissions denied")
    }

    private fun requiredPermissions(): Array<String> =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S)
            arrayOf(Manifest.permission.BLUETOOTH_SCAN, Manifest.permission.BLUETOOTH_CONNECT)
        else arrayOf(Manifest.permission.ACCESS_FINE_LOCATION)

    private fun missingPermissions() = requiredPermissions().filter {
        ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(android.graphics.Color.TRANSPARENT),
            navigationBarStyle = SystemBarStyle.dark(android.graphics.Color.TRANSPARENT)
        )
        setContent {
            MaterialTheme(colorScheme = darkColorScheme()) {
                GlassDashboard(app.ble, app.store, app.sniffer) { requestBlePermissions() }
            }
        }
        // Auto-connect on launch when permissions are already granted
        if (app.store.autoReconnect && missingPermissions().isEmpty()) app.ble.connect()
    }

    private fun requestBlePermissions() {
        val missing = missingPermissions()
        if (missing.isEmpty()) app.ble.connect() else permissionLauncher.launch(missing.toTypedArray())
    }

    override fun onDestroy() {
        super.onDestroy()
        // With auto-reconnect the connection stays alive for the tile / widget
        if (isFinishing && !app.store.autoReconnect) app.ble.disconnect()
    }
}

// --- UI Dashboard ---
@Composable
fun DashboardScreen(ble: DysonBleManager, store: Store, onConnect: () -> Unit) {
    val connectionState by ble.connectionState.collectAsState()
    val ancMode by ble.ancMode.collectAsState()
    val eqModeNow by ble.eqMode.collectAsState()
    val customEqNow by ble.customEq.collectAsState()
    val battery by ble.battery.collectAsState()
    val logLines by ble.log.collectAsState()
    val isReady = connectionState == STATE_READY

    var eqValues by remember { mutableStateOf(store.lastEq) }
    var profiles by remember { mutableStateOf(store.profiles()) }
    var autoReconnect by remember { mutableStateOf(store.autoReconnect) }
    var showLog by remember { mutableStateOf(false) }

    // Real state from the headphones wins; until it arrives show the remembered one
    val currentAnc = ancMode ?: store.lastAnc

    // If the headphones are on the custom EQ, mirror its real band values
    LaunchedEffect(customEqNow, eqModeNow) {
        val c = customEqNow
        if (c != null && eqModeNow == EQ_MODE_CUSTOM.toInt()) eqValues = c
    }

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
            color = TextPrimary, fontSize = 20.sp, fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth()
        )

        // Status + battery chips
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
                Text(if (isReady) "Connected" else connectionState, color = TextPrimary, fontSize = 13.sp, maxLines = 1)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(CardBg),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Battery  " + (battery?.let { "$it%" } ?: "--"),
                    color = TextPrimary, fontSize = 13.sp, maxLines = 1
                )
            }
        }

        val canConnect = connectionState.startsWith("Disconnected") || connectionState.contains("Failed")
        if (canConnect) {
            PillButton("Connect", enabled = true, modifier = Modifier.fillMaxWidth().height(48.dp), onClick = onConnect)
        }

        // Noise cancellation
        DysonCard(title = "Noise cancellation") {
            val mainModes = listOf(0, 2, 3)
            PillSelector(
                count = 3,
                selected = mainModes.indexOf(currentAnc),
                enabled = isReady,
                onSelect = { ble.setAnc(mainModes[it].toByte()) }
            ) { index, tint -> AncIcon(kind = index, color = tint) }

            Spacer(Modifier.height(12.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.fillMaxWidth()) {
                listOf("Quiet" to 4, "Conversation" to 1, "Loud" to 5).forEach { (label, mode) ->
                    ModeChip(
                        label = label,
                        active = currentAnc == mode,
                        enabled = isReady,
                        modifier = Modifier.weight(1f),
                        onClick = { ble.setAnc(mode.toByte()) }
                    )
                }
            }
            Spacer(Modifier.height(10.dp))
            Text(ancName(currentAnc), color = TextSecondary, fontSize = 13.sp, modifier = Modifier.padding(start = 6.dp))
        }

        // Equaliser
        DysonCard(
            title = "Equaliser",
            trailing = {
                PillButton("Apply", enabled = isReady, modifier = Modifier.height(34.dp)) {
                    ble.sendCustomEq(eqValues)
                    ble.setEqMode(EQ_MODE_CUSTOM)
                }
            }
        ) {
            Text(
                "Headphones EQ mode: ${eqModeNow ?: "?"}",
                color = TextSecondary, fontSize = 12.sp
            )
            Spacer(Modifier.height(8.dp))
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

        // Saved EQ profiles
        DysonCard(title = "EQ profiles") {
            var name by remember { mutableStateOf("") }
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(44.dp)
                        .clip(RoundedCornerShape(22.dp))
                        .background(TrackBg)
                        .padding(horizontal = 16.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    if (name.isEmpty()) Text("Profile name", color = TextSecondary, fontSize = 14.sp)
                    BasicTextField(
                        value = name,
                        onValueChange = { name = it },
                        singleLine = true,
                        textStyle = TextStyle(color = TextPrimary, fontSize = 14.sp),
                        cursorBrush = SolidColor(Accent),
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                PillButton("Save", enabled = name.isNotBlank(), modifier = Modifier.height(44.dp)) {
                    store.saveProfile(name.trim(), eqValues)
                    profiles = store.profiles()
                    name = ""
                }
            }
            Spacer(Modifier.height(8.dp))
            profiles.forEach { (pname, vals) ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(Modifier.weight(1f)) {
                        Text(pname, color = TextPrimary, fontSize = 15.sp)
                        Text(vals.joinToString("  ") { if (it > 0) "+$it" else "$it" }, color = TextSecondary, fontSize = 11.sp)
                    }
                    Text("Load", color = Accent, fontSize = 14.sp, modifier = Modifier.clickable { eqValues = vals })
                    Spacer(Modifier.width(18.dp))
                    Text("Delete", color = DangerRed, fontSize = 14.sp, modifier = Modifier.clickable {
                        store.deleteProfile(pname)
                        profiles = store.profiles()
                    })
                }
            }
        }

        // Connection settings
        DysonCard(
            title = "Auto-reconnect",
            trailing = {
                Switch(
                    checked = autoReconnect,
                    onCheckedChange = { autoReconnect = it; store.autoReconnect = it },
                    colors = SwitchDefaults.colors(checkedTrackColor = Accent)
                )
            }
        ) {
            Text(
                "Reconnect when the headphones switch on. Needed for the quick-settings tile and home-screen widget to work while the app is closed.",
                color = TextSecondary, fontSize = 12.sp
            )
        }

        // Debug log (collapsible)
        DysonCard(
            title = "Connection log",
            trailing = {
                Text(if (showLog) "Hide" else "Show", color = Accent, fontSize = 13.sp,
                    modifier = Modifier.clickable { showLog = !showLog })
            }
        ) {
            if (showLog) {
                logLines.takeLast(24).forEach {
                    Text(it, color = TextSecondary, fontFamily = FontFamily.Monospace, fontSize = 10.sp)
                }
            }
        }
        Spacer(Modifier.height(24.dp))
    }
}

@Composable
fun PillButton(text: String, enabled: Boolean, modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(50))
            .background(if (enabled) Accent else TrackBg)
            .clickable(enabled = enabled) { onClick() }
            .padding(horizontal = 18.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text, color = if (enabled) TextPrimary else TextSecondary, fontSize = 14.sp, fontWeight = FontWeight.Medium)
    }
}

@Composable
fun ModeChip(label: String, active: Boolean, enabled: Boolean, modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(
        modifier = modifier
            .height(38.dp)
            .clip(RoundedCornerShape(19.dp))
            .background(if (active) Accent else TrackBg)
            .clickable(enabled = enabled) { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            label,
            color = if (enabled) TextPrimary else TextSecondary,
            fontSize = 12.sp, maxLines = 1
        )
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

