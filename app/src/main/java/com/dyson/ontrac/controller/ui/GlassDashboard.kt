package com.dyson.ontrac.controller.ui

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dyson.ontrac.controller.ANC_CONVERSATION
import com.dyson.ontrac.controller.ANC_ISOLATION
import com.dyson.ontrac.controller.ANC_MEDIUM_LOUD
import com.dyson.ontrac.controller.ANC_MEDIUM_QUIET
import com.dyson.ontrac.controller.ANC_OFF
import com.dyson.ontrac.controller.ANC_TRANSPARENCY
import com.dyson.ontrac.controller.AncIcon
import com.dyson.ontrac.controller.DysonBleManager
import com.dyson.ontrac.controller.EQ_MAX_DB
import com.dyson.ontrac.controller.EQ_MODE_CUSTOM
import com.dyson.ontrac.controller.Trait
import com.dyson.ontrac.controller.eqPresetName
import com.dyson.ontrac.controller.STATE_READY
import com.dyson.ontrac.controller.Store
import com.dyson.ontrac.controller.ancName
import com.dyson.ontrac.controller.ui.theme.Glass
import com.dyson.ontrac.controller.ui.theme.ancAura

private val MAIN_MODES = listOf(ANC_ISOLATION.toInt(), ANC_TRANSPARENCY.toInt(), ANC_OFF.toInt())
private val LEVEL_LABELS = listOf("Medium", "Full")   // trait 0x22 nibble values 1, 2
private val EQ_PRESETS = listOf(0, 1, 2, 3)             // enhanced, bass boost, neutral, custom
private val WEAR_LABELS = listOf("Auto", "Always worn", "Never worn")
private val EQ_LABELS = listOf("Bass", "Low", "Mid", "High", "Treble")

/** Black-mode / liquid-glass dashboard. Same data + actions as the old DashboardScreen. */
@Composable
fun GlassDashboard(
    ble: DysonBleManager,
    store: Store,
    sniffer: com.dyson.ontrac.controller.sniffer.SnoopSession,
    onConnect: () -> Unit
) {
    val connectionState by ble.connectionState.collectAsState()
    val ancMode by ble.ancMode.collectAsState()
    val eqModeNow by ble.eqMode.collectAsState()
    val customEqNow by ble.customEq.collectAsState()
    val battery by ble.battery.collectAsState()
    val logLines by ble.log.collectAsState()
    val traits by ble.traits.collectAsState()
    val noise by ble.noise.collectAsState()
    val traitError by ble.traitError.collectAsState()
    val source by ble.source.collectAsState()
    val isReady = connectionState == STATE_READY
    val haptics = LocalHapticFeedback.current

    var eqValues by remember { mutableStateOf(store.lastEq) }
    var profiles by remember { mutableStateOf(store.profiles()) }
    var autoReconnect by remember { mutableStateOf(store.autoReconnect) }
    var ambient by remember { mutableStateOf(store.ambientGlow) }
    var showLog by remember { mutableStateOf(false) }
    var profileName by remember { mutableStateOf("") }

    val currentAnc = ancMode ?: store.lastAnc
    LaunchedEffect(customEqNow, eqModeNow) {
        val c = customEqNow
        if (c != null && eqModeNow == EQ_MODE_CUSTOM.toInt()) eqValues = c
    }

    val (auraA, auraB) = ancAura(if (isReady) currentAnc else null)
    val accent by animateColorAsState(lerp(auraB, Color.White, 0.35f), tween(700), label = "accent")
    val canConnect = connectionState.startsWith("Disconnected") ||
        connectionState.contains("Failed") || connectionState.contains("disabled")

    Box(Modifier.fillMaxSize().background(Glass.Black)) {
        AmbientBackground(auraA, auraB, enabled = ambient)

        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .systemBarsPadding()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Spacer(Modifier.height(12.dp))
            Header(connectionState, isReady, battery)

            if (canConnect) {
                GlassButton(
                    "Connect",
                    modifier = Modifier.fillMaxWidth().height(52.dp),
                    prominent = true,
                    onClick = onConnect
                )
            }

            // --- Noise control ---------------------------------------------------
            GlassCard(title = "Noise control") {
                GlassSegmented(
                    options = listOf("Isolation", "Transparency", "Off"),
                    selected = when (currentAnc) {
                        ANC_ISOLATION.toInt(), ANC_MEDIUM_QUIET.toInt() -> 0
                        ANC_TRANSPARENCY.toInt(), ANC_MEDIUM_LOUD.toInt(), ANC_CONVERSATION.toInt() -> 1
                        ANC_OFF.toInt() -> 2
                        else -> -1
                    },
                    enabled = isReady,
                    height = 84.dp,
                    onSelect = {
                        haptics.performHapticFeedback(HapticFeedbackType.LongPress)
                        ble.setAnc(MAIN_MODES[it].toByte())
                    },
                    icon = { i, tint -> AncIcon(kind = i, color = tint) }
                )
                Spacer(Modifier.height(10.dp))
                // Trait 0x22: low nibble = isolation level, high nibble = transparency level
                val levels = traits[Trait.ANC_LEVELS]
                LevelRow("Isolation", levels?.and(0x0F), isReady) {
                    haptics.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                    ble.setAncLevels(isolation = it)
                }
                Spacer(Modifier.height(8.dp))
                LevelRow("Transparency", levels?.shr(4)?.and(0x0F), isReady) {
                    haptics.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                    ble.setAncLevels(transparency = it)
                }
                Spacer(Modifier.height(12.dp))
                Text(
                    ancName(currentAnc) + (if (isReady) "" else "  ·  last known"),
                    color = Glass.TextSecondary,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(start = 6.dp)
                )
            }

            // --- Equaliser -------------------------------------------------------
            GlassCard(
                title = "Equaliser",
                trailing = {
                    GlassButton(
                        "Apply",
                        modifier = Modifier.height(36.dp),
                        enabled = isReady,
                        prominent = true
                    ) {
                        haptics.performHapticFeedback(HapticFeedbackType.LongPress)
                        ble.sendCustomEq(eqValues)
                        ble.setEqMode(EQ_MODE_CUSTOM)
                    }
                }
            ) {
                GlassSegmented(
                    options = EQ_PRESETS.map { eqPresetName(it) },
                    selected = EQ_PRESETS.indexOf(eqModeNow),
                    enabled = isReady,
                    height = 40.dp,
                    onSelect = {
                        haptics.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        ble.setEqMode(EQ_PRESETS[it].toByte())
                    }
                )
                Spacer(Modifier.height(12.dp))
                EqCurve(eqValues, accent, Modifier.fillMaxWidth().height(56.dp), rangeDb = EQ_MAX_DB)
                Spacer(Modifier.height(6.dp))
                Row(Modifier.fillMaxWidth().height(220.dp)) {
                    eqValues.forEachIndexed { index, v ->
                        GlassEqSlider(
                            value = v,
                            label = EQ_LABELS.getOrElse(index) { "" },
                            accent = accent,
                            enabled = true,
                            minDb = -EQ_MAX_DB,
                            maxDb = EQ_MAX_DB,
                            modifier = Modifier.weight(1f),
                            onValueChange = { nv ->
                                if (nv != eqValues[index]) {
                                    haptics.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                    eqValues = eqValues.toMutableList().also { it[index] = nv }
                                }
                            }
                        )
                    }
                }
                Spacer(Modifier.height(16.dp))
                Row(
                    Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    GlassChip("Flat", active = eqValues.all { it == 0 }) { eqValues = List(5) { 0 } }
                    profiles.forEach { (name, vals) ->
                        GlassChip(name, active = vals == eqValues) { eqValues = vals }
                    }
                }
            }

            // --- Headphones (traits) --------------------------------------------
            GlassCard(title = "Headphones") {
                Text("Wear detection", color = Glass.TextPrimary, fontSize = 15.sp, fontWeight = FontWeight.Medium)
                Spacer(Modifier.height(8.dp))
                GlassSegmented(
                    options = WEAR_LABELS,
                    selected = traits[Trait.WEAR_DETECTION] ?: -1,
                    enabled = isReady,
                    height = 40.dp,
                    onSelect = {
                        haptics.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        ble.setWearDetection(it)
                    }
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    "Auto = pause when taken off. Always worn = never pause.",
                    color = Glass.TextTertiary, fontSize = 11.sp
                )
                Spacer(Modifier.height(14.dp))
                InfoRow("Battery state", when (traits[Trait.BATTERY_STATE]) {
                    0 -> "Full"; 1 -> "Normal"; 2 -> "Low"; 3 -> "Insufficient"; 4 -> "Critical"; 5 -> "Shutdown"; else -> "–"
                })
                InfoRow("Ear cushions", when (traits[Trait.EAR_CUSHIONS]) {
                    0 -> "Both missing"; 1 -> "Left missing"; 2 -> "Right missing"; 3 -> "Fitted"; else -> "–"
                })
                InfoRow("Source device", source?.let { (mac, name) -> "$name  ·  …${mac.takeLast(5)}" } ?: "–")
                InfoRow("Audio", when (traits[Trait.AUDIO_STATE]) {
                    0 -> "Idle"; 1 -> "Playing"; 2 -> "Paused"; 3 -> "Call"; else -> "–"
                })
                InfoRow(
                    "Mic level L / R (raw ÷10, unconfirmed)",
                    noise?.let { (l, r) -> "%.1f / %.1f".format(l / 10f, r / 10f) } ?: "–"
                )
                traitError?.let { (t, st) ->
                    Spacer(Modifier.height(6.dp))
                    Text("Headphones rejected setting 0x%02X (status %d)".format(t, st), color = Glass.Danger, fontSize = 12.sp)
                }
            }

            // --- Profiles --------------------------------------------------------
            GlassCard(title = "Profiles") {
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    GlassTextField(profileName, { profileName = it }, "Save current EQ as…", Modifier.weight(1f))
                    GlassButton("Save", enabled = profileName.isNotBlank()) {
                        store.saveProfile(profileName.trim(), eqValues)
                        profiles = store.profiles()
                        profileName = ""
                    }
                }
                if (profiles.isNotEmpty()) Spacer(Modifier.height(8.dp))
                profiles.forEach { (pname, vals) ->
                    Row(
                        Modifier.fillMaxWidth().padding(vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(Modifier.weight(1f)) {
                            Text(pname, color = Glass.TextPrimary, fontSize = 15.sp, fontWeight = FontWeight.Medium)
                            Text(
                                vals.joinToString("  ") { if (it > 0) "+$it" else "$it" },
                                color = Glass.TextTertiary, fontSize = 11.sp, fontFamily = FontFamily.Monospace
                            )
                        }
                        Text(
                            "Load", color = Glass.TextPrimary, fontSize = 14.sp,
                            modifier = Modifier.clip(RoundedCornerShape(50)).clickable { eqValues = vals }.padding(8.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(
                            "Delete", color = Glass.Danger, fontSize = 14.sp,
                            modifier = Modifier.clip(RoundedCornerShape(50)).clickable {
                                store.deleteProfile(pname)
                                profiles = store.profiles()
                            }.padding(8.dp)
                        )
                    }
                }
            }

            // --- Settings --------------------------------------------------------
            GlassCard(title = "Settings") {
                GlassSettingRow(
                    "Auto-reconnect",
                    "Reconnect when the headphones switch on. Needed for tile + widget.",
                    autoReconnect
                ) { autoReconnect = it; store.autoReconnect = it }
                GlassSettingRow(
                    "Ambient glow",
                    "Coloured light behind the glass. Off = pure OLED black, saves battery.",
                    ambient
                ) { ambient = it; store.ambientGlow = it }
            }

            // --- Protocol sniffer (root) -----------------------------------------
            SnifferCard(sniffer, ble, isReady)

            // --- Log -------------------------------------------------------------
            GlassCard(
                title = "Connection log",
                trailing = {
                    Text(
                        if (showLog) "Hide" else "Show",
                        color = Glass.TextPrimary, fontSize = 13.sp,
                        modifier = Modifier.clip(RoundedCornerShape(50)).clickable { showLog = !showLog }.padding(6.dp)
                    )
                }
            ) {
                if (showLog) {
                    logLines.takeLast(24).forEach {
                        Text(it, color = Glass.TextSecondary, fontFamily = FontFamily.Monospace, fontSize = 10.sp)
                    }
                } else {
                    Text("${logLines.size} entries", color = Glass.TextTertiary, fontSize = 12.sp)
                }
            }
            Spacer(Modifier.height(32.dp))
        }
    }
}

@Composable
private fun Header(state: String, isReady: Boolean, battery: Int?) {
    Row(Modifier.fillMaxWidth().padding(horizontal = 4.dp), verticalAlignment = Alignment.CenterVertically) {
        Column(Modifier.weight(1f)) {
            Text(
                "OnTrac",
                color = Glass.TextPrimary, fontSize = 34.sp,
                fontWeight = FontWeight.Bold, letterSpacing = (-0.5).sp
            )
            Spacer(Modifier.height(8.dp))
            StatusPill(state, isReady)
        }
        Spacer(Modifier.width(12.dp))
        BatteryRing(battery, diameter = 68.dp)
    }
}

@Composable
private fun StatusPill(state: String, isReady: Boolean) {
    val busy = !isReady && listOf("Connecting", "Connected", "Scanning", "Found").any { state.startsWith(it) }
    val pulse = rememberInfiniteTransition(label = "pulse")
    val a by pulse.animateFloat(
        initialValue = 0.3f, targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(700), RepeatMode.Reverse),
        label = "pulseA"
    )
    val dot = when {
        isReady -> Glass.Good
        busy -> Glass.Accent
        else -> Glass.TextTertiary
    }
    Row(
        Modifier
            .glass(RoundedCornerShape(50), Color.White.copy(alpha = 0.07f), 0.7f)
            .padding(horizontal = 12.dp, vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(Modifier.size(7.dp).alpha(if (busy) a else 1f).clip(CircleShape).background(dot))
        Spacer(Modifier.width(8.dp))
        Text(
            if (isReady) "Connected" else state,
            color = Glass.TextSecondary, fontSize = 12.sp,
            maxLines = 1, overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
private fun LevelRow(label: String, value: Int?, enabled: Boolean, onSet: (Int) -> Unit) {
    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Text(label, color = Glass.TextSecondary, fontSize = 13.sp, modifier = Modifier.width(96.dp))
        GlassSegmented(
            options = LEVEL_LABELS,
            selected = if (value == null) -1 else value - 1,
            enabled = enabled,
            height = 38.dp,
            onSelect = { onSet(it + 1) },
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
private fun InfoRow(label: String, value: String) {
    Row(Modifier.fillMaxWidth().padding(vertical = 5.dp), verticalAlignment = Alignment.CenterVertically) {
        Text(label, color = Glass.TextSecondary, fontSize = 13.sp, modifier = Modifier.weight(1f))
        Text(value, color = Glass.TextPrimary, fontSize = 13.sp, fontWeight = FontWeight.Medium)
    }
}
