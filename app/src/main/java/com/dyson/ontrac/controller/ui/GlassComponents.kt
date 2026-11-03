package com.dyson.ontrac.controller.ui

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dyson.ontrac.controller.ui.theme.Glass
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt
import kotlin.math.sin

// ---------------------------------------------------------------------------
// Liquid glass surface: translucent fill, top sheen and a light-catching rim.
// No backdrop blur needed: the ambient background is already soft, so the
// glass reads as frosted on every API level (and costs almost nothing).
// ---------------------------------------------------------------------------
fun Modifier.glass(
    shape: Shape = RoundedCornerShape(28.dp),
    fill: Color = Glass.Fill,
    highlight: Float = 1f
): Modifier {
    val top = fill.copy(alpha = (fill.alpha * 1.7f).coerceIn(0f, 1f))
    fun rim(a: Float) = Color.White.copy(alpha = (a * highlight).coerceIn(0f, 1f))
    return this
        .clip(shape)
        .background(Brush.verticalGradient(listOf(top, fill)))
        .drawBehind {
            // specular sheen on the upper part of the glass
            drawRect(
                Brush.verticalGradient(
                    0f to rim(0.10f), 0.45f to Color.Transparent,
                    startY = 0f, endY = size.height
                )
            )
        }
        .border(1.dp, Brush.linearGradient(listOf(rim(0.38f), rim(0.05f), rim(0.16f))), shape)
}

/** Slowly drifting colour light behind the glass. Disabled = pure OLED black. */
@Composable
fun AmbientBackground(primary: Color, secondary: Color, enabled: Boolean) {
    if (enabled) {
        val p by animateColorAsState(primary, tween(1200), label = "auraP")
        val s by animateColorAsState(secondary, tween(1200), label = "auraS")
        val t = rememberInfiniteTransition(label = "aura")
        val phase by t.animateFloat(
            initialValue = 0f,
            targetValue = (2 * PI).toFloat(),
            animationSpec = infiniteRepeatable(tween(20000, easing = LinearEasing)),
            label = "phase"
        )
        Canvas(Modifier.fillMaxSize()) {
            val w = size.width
            val h = size.height
            fun blob(c: Color, x: Float, y: Float, r: Float, a: Float) {
                val center = Offset(x, y)
                drawCircle(
                    Brush.radialGradient(
                        listOf(c.copy(alpha = a), c.copy(alpha = a * 0.35f), Color.Transparent),
                        center = center, radius = r
                    ),
                    radius = r, center = center
                )
            }
            blob(p, w * (0.20f + 0.10f * cos(phase)), h * (0.10f + 0.05f * sin(phase)), w * 0.95f, 0.55f)
            blob(s, w * (0.90f + 0.08f * sin(phase * 2f)), h * (0.42f + 0.06f * cos(phase)), w * 0.80f, 0.40f)
            blob(p, w * (0.30f + 0.12f * sin(phase)), h * (0.88f + 0.04f * cos(phase * 2f)), w * 0.70f, 0.28f)
        }
    }
}

@Composable
fun GlassCard(
    modifier: Modifier = Modifier,
    title: String? = null,
    trailing: @Composable () -> Unit = {},
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier
            .fillMaxWidth()
            .glass()
            .padding(20.dp)
    ) {
        if (title != null) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    title.uppercase(),
                    color = Glass.TextSecondary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    letterSpacing = 1.4.sp
                )
                trailing()
            }
            Spacer(Modifier.height(16.dp))
        }
        content()
    }
}

@Composable
fun GlassButton(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    prominent: Boolean = false,
    onClick: () -> Unit
) {
    val fill = if (prominent && enabled) Color.White.copy(alpha = 0.92f) else Color.White.copy(alpha = 0.10f)
    Box(
        modifier
            .height(44.dp)
            .glass(RoundedCornerShape(50), fill, if (enabled) 1f else 0.4f)
            .clickable(enabled = enabled, onClick = onClick)
            .padding(horizontal = 20.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text,
            color = when {
                !enabled -> Glass.TextTertiary
                prominent -> Color.Black
                else -> Glass.TextPrimary
            },
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
fun GlassChip(text: String, active: Boolean, enabled: Boolean = true, onClick: () -> Unit) {
    Box(
        Modifier
            .height(34.dp)
            .glass(
                RoundedCornerShape(50),
                if (active) Color.White.copy(alpha = 0.18f) else Color.White.copy(alpha = 0.05f),
                if (active) 1.3f else 0.6f
            )
            .clickable(enabled = enabled, onClick = onClick)
            .padding(horizontal = 14.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text,
            color = if (active) Glass.TextPrimary else Glass.TextSecondary,
            fontSize = 13.sp,
            fontWeight = if (active) FontWeight.SemiBold else FontWeight.Normal,
            maxLines = 1
        )
    }
}

/** Segmented control with a glass "lens" that springs to the selected option. */
@Composable
fun GlassSegmented(
    options: List<String>,
    selected: Int,
    enabled: Boolean,
    onSelect: (Int) -> Unit,
    modifier: Modifier = Modifier,
    height: Dp = 48.dp,
    icon: (@Composable (Int, Color) -> Unit)? = null
) {
    BoxWithConstraints(
        modifier
            .fillMaxWidth()
            .height(height)
            .glass(RoundedCornerShape(50), Color.White.copy(alpha = 0.04f), 0.6f)
            .padding(4.dp)
    ) {
        val segW = maxWidth / options.size
        val idx = if (selected in options.indices) selected else -1
        val x by animateDpAsState(
            targetValue = segW * max(idx, 0),
            animationSpec = spring(dampingRatio = 0.72f, stiffness = 420f),
            label = "lens"
        )
        if (idx >= 0) {
            Box(
                Modifier
                    .offset(x = x)
                    .width(segW)
                    .fillMaxHeight()
                    .glass(RoundedCornerShape(50), Color.White.copy(alpha = 0.16f), 1.4f)
            )
        }
        Row(Modifier.fillMaxSize()) {
            options.forEachIndexed { i, label ->
                val active = i == idx
                val tint by animateColorAsState(
                    when {
                        !enabled -> Glass.TextTertiary
                        active -> Glass.TextPrimary
                        else -> Glass.TextSecondary
                    },
                    label = "segTint"
                )
                Column(
                    Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .clip(RoundedCornerShape(50))
                        .clickable(enabled = enabled) { onSelect(i) },
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if (icon != null) {
                        icon(i, tint)
                        Spacer(Modifier.height(4.dp))
                    }
                    Text(
                        label,
                        color = tint,
                        fontSize = 12.sp,
                        fontWeight = if (active) FontWeight.SemiBold else FontWeight.Normal,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

@Composable
fun BatteryRing(percent: Int?, modifier: Modifier = Modifier, diameter: Dp = 64.dp) {
    val frac by animateFloatAsState(((percent ?: 0) / 100f).coerceIn(0f, 1f), tween(800), label = "batt")
    val color = when {
        percent == null -> Glass.TextTertiary
        percent <= 15 -> Glass.Danger
        percent <= 30 -> Glass.Warn
        else -> Glass.Good
    }
    Box(
        modifier
            .size(diameter)
            .glass(RoundedCornerShape(50), Color.White.copy(alpha = 0.05f), 0.7f),
        contentAlignment = Alignment.Center
    ) {
        Canvas(Modifier.fillMaxSize().padding(6.dp)) {
            val sw = 4.dp.toPx()
            val tl = Offset(sw / 2, sw / 2)
            val arc = Size(size.width - sw, size.height - sw)
            drawArc(Color.White.copy(alpha = 0.10f), -90f, 360f, false, tl, arc, style = Stroke(sw))
            drawArc(color, -90f, 360f * frac, false, tl, arc, style = Stroke(sw, cap = StrokeCap.Round))
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(percent?.toString() ?: "--", color = Glass.TextPrimary, fontSize = 17.sp, fontWeight = FontWeight.SemiBold)
            Text("%", color = Glass.TextTertiary, fontSize = 9.sp)
        }
    }
}

/** Vertical EQ fader: glass capsule, luminous fill from the 0 dB line, glowing thumb. */
@Composable
fun GlassEqSlider(
    value: Int,
    label: String,
    accent: Color,
    enabled: Boolean,
    onValueChange: (Int) -> Unit,
    modifier: Modifier = Modifier,
    minDb: Int = -10,
    maxDb: Int = 10
) {
    val onChange by rememberUpdatedState(onValueChange)
    val anim by animateFloatAsState(value.toFloat(), spring(stiffness = 700f), label = "eq")
    Column(modifier.fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            if (value > 0) "+$value" else "$value",
            color = Glass.TextPrimary, fontSize = 13.sp, fontWeight = FontWeight.SemiBold
        )
        Spacer(Modifier.height(8.dp))
        Box(
            Modifier
                .weight(1f)
                .width(40.dp)
                .glass(RoundedCornerShape(50), Color.White.copy(alpha = 0.05f), 0.7f)
                .pointerInput(enabled, minDb, maxDb) {
                    if (!enabled) return@pointerInput
                    fun toDb(y: Float) =
                        (maxDb - (y / size.height).coerceIn(0f, 1f) * (maxDb - minDb)).roundToInt()
                    detectDragGestures(onDragStart = { onChange(toDb(it.y)) }) { change, _ ->
                        change.consume()
                        onChange(toDb(change.position.y))
                    }
                }
                .pointerInput(enabled, minDb, maxDb) {
                    if (!enabled) return@pointerInput
                    detectTapGestures { pos ->
                        onChange((maxDb - (pos.y / size.height).coerceIn(0f, 1f) * (maxDb - minDb)).roundToInt())
                    }
                }
        ) {
            Canvas(Modifier.fillMaxSize()) {
                val cx = size.width / 2f
                val r = size.width / 2f - 4.dp.toPx()
                val cy = size.height / 2f
                val frac = 1f - (anim - minDb) / (maxDb - minDb)
                val hy = (frac * size.height).coerceIn(r + 4.dp.toPx(), size.height - r - 4.dp.toPx())
                drawLine(
                    Color.White.copy(alpha = 0.18f),
                    Offset(size.width * 0.25f, cy), Offset(size.width * 0.75f, cy), 1.dp.toPx()
                )
                val top = min(hy, cy)
                val bottom = max(hy, cy)
                if (bottom - top > 1f) {
                    drawRoundRect(
                        Brush.verticalGradient(
                            listOf(accent.copy(alpha = 0.95f), accent.copy(alpha = 0.35f)),
                            startY = top, endY = bottom
                        ),
                        topLeft = Offset(cx - 3.dp.toPx(), top),
                        size = Size(6.dp.toPx(), bottom - top),
                        cornerRadius = CornerRadius(3.dp.toPx())
                    )
                }
                val thumb = Offset(cx, hy)
                drawCircle(
                    Brush.radialGradient(listOf(accent.copy(alpha = 0.45f), Color.Transparent), thumb, r * 2.2f),
                    radius = r * 2.2f, center = thumb
                )
                drawCircle(Color.White.copy(alpha = if (enabled) 0.95f else 0.4f), r * 0.72f, thumb)
            }
        }
        Spacer(Modifier.height(8.dp))
        Text(label, color = Glass.TextSecondary, fontSize = 11.sp, maxLines = 1)
    }
}

/** Smooth response curve through the band values (same x-positions as the sliders). */
@Composable
fun EqCurve(values: List<Int>, accent: Color, modifier: Modifier = Modifier, rangeDb: Int = 10) {
    Canvas(modifier) {
        if (values.isEmpty()) return@Canvas
        val n = values.size
        val pts = values.mapIndexed { i, v ->
            Offset(size.width * (i + 0.5f) / n, size.height / 2f - v.toFloat() / rangeDb * size.height * 0.45f)
        }
        val line = Path().apply {
            moveTo(0f, pts.first().y)
            lineTo(pts.first().x, pts.first().y)
            for (i in 1 until n) {
                val a = pts[i - 1]
                val b = pts[i]
                val mx = (a.x + b.x) / 2f
                cubicTo(mx, a.y, mx, b.y, b.x, b.y)
            }
            lineTo(size.width, pts.last().y)
        }
        val area = Path().apply {
            addPath(line)
            lineTo(size.width, size.height)
            lineTo(0f, size.height)
            close()
        }
        drawLine(
            Color.White.copy(alpha = 0.10f),
            Offset(0f, size.height / 2f), Offset(size.width, size.height / 2f), 1.dp.toPx()
        )
        drawPath(area, Brush.verticalGradient(listOf(accent.copy(alpha = 0.28f), Color.Transparent)))
        drawPath(line, accent, style = Stroke(2.dp.toPx(), cap = StrokeCap.Round))
    }
}

@Composable
fun GlassTextField(value: String, onValueChange: (String) -> Unit, placeholder: String, modifier: Modifier = Modifier) {
    Box(
        modifier
            .height(44.dp)
            .glass(RoundedCornerShape(50), Color.White.copy(alpha = 0.05f), 0.6f)
            .padding(horizontal = 16.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        if (value.isEmpty()) Text(placeholder, color = Glass.TextTertiary, fontSize = 14.sp)
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            singleLine = true,
            textStyle = TextStyle(color = Glass.TextPrimary, fontSize = 14.sp),
            cursorBrush = SolidColor(Glass.TextPrimary),
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun GlassSettingRow(title: String, subtitle: String, checked: Boolean, onChange: (Boolean) -> Unit) {
    Row(Modifier.fillMaxWidth().padding(vertical = 6.dp), verticalAlignment = Alignment.CenterVertically) {
        Column(Modifier.weight(1f).padding(end = 12.dp)) {
            Text(title, color = Glass.TextPrimary, fontSize = 15.sp, fontWeight = FontWeight.Medium)
            Spacer(Modifier.height(2.dp))
            Text(subtitle, color = Glass.TextTertiary, fontSize = 12.sp)
        }
        Switch(
            checked = checked,
            onCheckedChange = onChange,
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.Black,
                checkedTrackColor = Color.White.copy(alpha = 0.92f),
                checkedBorderColor = Color.Transparent,
                uncheckedThumbColor = Color.White.copy(alpha = 0.6f),
                uncheckedTrackColor = Color.White.copy(alpha = 0.08f),
                uncheckedBorderColor = Color.White.copy(alpha = 0.18f)
            )
        )
    }
}
