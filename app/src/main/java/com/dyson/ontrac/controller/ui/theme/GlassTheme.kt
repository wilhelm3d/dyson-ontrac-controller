package com.dyson.ontrac.controller.ui.theme

import androidx.compose.ui.graphics.Color

/** Black-mode + liquid-glass palette. Glass surfaces are white at low alpha over pure black. */
object Glass {
    val Black = Color(0xFF000000)
    val Fill = Color.White.copy(alpha = 0.06f)
    val TextPrimary = Color(0xFFF5F5F7)
    val TextSecondary = Color(0xFFF5F5F7).copy(alpha = 0.58f)
    val TextTertiary = Color(0xFFF5F5F7).copy(alpha = 0.32f)
    val Accent = Color(0xFF8AB4FF)
    val Good = Color(0xFF5EE6A8)
    val Warn = Color(0xFFFFC145)
    val Danger = Color(0xFFFF6B6B)
}

/** Ambient glow colours behind the glass, chosen by ANC mode (null = not connected). */
fun ancAura(mode: Int?): Pair<Color, Color> = when (mode) {
    0, 4 -> Color(0xFF3B2BFF) to Color(0xFF8A3BFF)      // Isolation / medium quiet: indigo + violet
    1, 2, 5 -> Color(0xFF00BFB3) to Color(0xFF2B7BFF)   // Transparency / conversation / loud: aqua + blue
    3 -> Color(0xFF55555C) to Color(0xFF2E2E34)         // Off: graphite
    else -> Color(0xFF1E2A55) to Color(0xFF14304A)      // Disconnected: dim navy
}
