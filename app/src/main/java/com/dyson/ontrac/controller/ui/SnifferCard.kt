package com.dyson.ontrac.controller.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dyson.ontrac.controller.DysonBleManager
import com.dyson.ontrac.controller.sniffer.AttEvent
import com.dyson.ontrac.controller.sniffer.BtSnoopParser
import com.dyson.ontrac.controller.sniffer.SnoopSession
import com.dyson.ontrac.controller.ui.theme.Glass
import java.util.Locale

private enum class SnoopFilter(val label: String) { WRITES("Writes"), ERRORS("Errors"), NOTIFY("Notify"), ALL("All") }

@Composable
fun SnifferCard(sniffer: SnoopSession, ble: DysonBleManager, isReady: Boolean) {
    val st by sniffer.state.collectAsState()
    val lastWrite by ble.lastWrite.collectAsState()
    var filter by remember { mutableStateOf(SnoopFilter.WRITES) }
    var hideSpam by remember { mutableStateOf(true) }
    var noDysonApp by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) { if (st.rooted == null) sniffer.refresh() }

    GlassCard(
        title = "Protocol sniffer",
        trailing = {
            Text(
                when (st.rooted) { true -> "root ✓"; false -> "no root"; null -> "…" },
                color = if (st.rooted == true) Glass.Good else Glass.TextTertiary,
                fontSize = 12.sp
            )
        }
    ) {
        Text(
            "Records what the official Dyson app sends, so we can copy it. " +
                "Snoop log: ${st.snoopMode ?: "?"}",
            color = Glass.TextSecondary, fontSize = 12.sp
        )
        Spacer(Modifier.height(14.dp))

        val enabledFull = st.snoopMode == "full"
        Row(
            Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            GlassButton(
                if (enabledFull) "1 · Restart capture" else "1 · Start capture",
                enabled = !st.busy && st.rooted == true,
                prominent = !enabledFull
            ) { sniffer.enable() }
            GlassButton("2 · Open Dyson app", enabled = !st.busy) {
                noDysonApp = !sniffer.openDysonApp()
            }
            GlassButton("3 · Analyse", enabled = !st.busy && st.rooted == true, prominent = enabledFull) {
                sniffer.analyse()
            }
            GlassButton("Stop", enabled = !st.busy && enabledFull) { sniffer.disable() }
        }
        if (noDysonApp) {
            Spacer(Modifier.height(8.dp))
            Text("Dyson app (${SnoopSession.DYSON_PACKAGE}) not installed.", color = Glass.Danger, fontSize = 12.sp)
        }
        if (st.message.isNotBlank()) {
            Spacer(Modifier.height(10.dp))
            Text(st.message, color = if (st.busy) Glass.Accent else Glass.TextSecondary, fontSize = 12.sp)
        }
        st.savedTo?.let {
            Spacer(Modifier.height(4.dp))
            Text("Saved: $it (+ raw .log for Wireshark)", color = Glass.TextTertiary, fontSize = 11.sp)
        }
        lastWrite?.let { (uuid, status) ->
            Spacer(Modifier.height(4.dp))
            val short = uuid.toString().uppercase().substring(0, 8)
            Text(
                "Last write $short → " + if (status == 0) "OK" else "failed: ${BtSnoopParser.errorName(status)}",
                color = if (status == 0) Glass.Good else Glass.Danger, fontSize = 12.sp
            )
        }

        val result = st.result ?: return@GlassCard
        Spacer(Modifier.height(14.dp))
        Row(
            Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SnoopFilter.values().forEach { f -> GlassChip(f.label, active = filter == f) { filter = f } }
            GlassChip("Hide 201D", active = hideSpam) { hideSpam = !hideSpam }
        }
        Spacer(Modifier.height(10.dp))

        val shown = result.events.filter { e ->
            val passes = when (filter) {
                SnoopFilter.WRITES -> e.isWrite
                SnoopFilter.ERRORS -> e.isError
                SnoopFilter.NOTIFY -> e.isNotify
                SnoopFilter.ALL -> true
            }
            passes && !(hideSpam && sniffer.nameFor(e.handle, result) == "2DD1201D")
        }.takeLast(120)

        if (shown.isEmpty()) {
            Text("Nothing here. Did you change settings in the Dyson app while capturing?", color = Glass.TextTertiary, fontSize = 12.sp)
        }
        shown.forEach { e -> SnoopRow(e, sniffer, result, canReplay = isReady) }
    }
}

@Composable
private fun SnoopRow(
    e: AttEvent,
    sniffer: SnoopSession,
    result: com.dyson.ontrac.controller.sniffer.SnoopResult,
    canReplay: Boolean
) {
    Row(Modifier.fillMaxWidth().padding(vertical = 5.dp), verticalAlignment = Alignment.CenterVertically) {
        Column(Modifier.weight(1f)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    String.format(Locale.US, "%.2fs", e.timeUs / 1_000_000.0),
                    color = Glass.TextTertiary, fontSize = 10.sp, fontFamily = FontFamily.Monospace
                )
                Spacer(Modifier.width(6.dp))
                Text(if (e.received) "◀" else "▶", color = if (e.received) Glass.Accent else Glass.TextPrimary, fontSize = 10.sp)
                Spacer(Modifier.width(6.dp))
                Text(
                    BtSnoopParser.opName(e.opcode),
                    color = if (e.isError) Glass.Danger else Glass.TextPrimary,
                    fontSize = 11.sp, fontWeight = FontWeight.SemiBold, fontFamily = FontFamily.Monospace
                )
                Spacer(Modifier.width(6.dp))
                Text(
                    sniffer.nameFor(e.handle, result) + (e.handle?.let { " (0x%04X)".format(it) } ?: ""),
                    color = Glass.TextSecondary, fontSize = 11.sp, fontFamily = FontFamily.Monospace
                )
            }
            Text(
                if (e.isError) "${BtSnoopParser.opName(e.errorFor ?: 0)} → ${BtSnoopParser.errorName(e.error ?: 0)}"
                else e.hex.ifBlank { "—" },
                color = if (e.isError) Glass.Danger else Glass.TextSecondary,
                fontSize = 11.sp, fontFamily = FontFamily.Monospace,
                maxLines = 2, overflow = TextOverflow.Ellipsis
            )
        }
        if (e.isWrite && !e.received && e.opcode != 0x16) {
            val known = sniffer.uuidFor(e.handle, result) != null
            Text(
                "Send",
                color = if (canReplay && known) Glass.TextPrimary else Glass.TextTertiary,
                fontSize = 13.sp, fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .clickable(enabled = canReplay && known) { sniffer.replay(e) }
                    .padding(horizontal = 10.dp, vertical = 6.dp)
            )
        }
    }
}
