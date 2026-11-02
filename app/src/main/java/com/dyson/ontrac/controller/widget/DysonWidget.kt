package com.dyson.ontrac.controller.widget

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.action.ActionParameters
import androidx.glance.action.actionParametersOf
import androidx.glance.action.clickable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.appwidget.action.ActionCallback
import androidx.glance.appwidget.action.actionRunCallback
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.*
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import com.dyson.ontrac.controller.DysonBluetoothManager
import com.dyson.ontrac.controller.DysonProtocolEngine

class DysonWidget : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            GlanceTheme {
                DysonWidgetContent()
            }
        }
    }

    @Composable
    fun DysonWidgetContent() {
        Column(
            modifier = GlanceModifier
                .fillMaxSize()
                .background(GlanceTheme.colors.background)
                .padding(12.dp),
            verticalAlignment = Alignment.Vertical.CenterVertically,
            horizontalAlignment = Alignment.Horizontal.CenterHorizontally
        ) {
            // Header Title & Status
            Row(
                modifier = GlanceModifier.fillMaxWidth(),
                verticalAlignment = Alignment.Vertical.CenterVertically
            ) {
                Text(
                    text = "Dyson OnTrac",
                    style = TextStyle(
                        color = GlanceTheme.colors.onBackground,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = GlanceModifier.defaultWeight())
                Text(
                    text = "ANC CTRL",
                    style = TextStyle(
                        color = GlanceTheme.colors.primary,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

            Spacer(modifier = GlanceModifier.height(12.dp))

            // ANC Toggle Buttons Row
            Row(
                modifier = GlanceModifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Horizontal.CenterHorizontally,
                verticalAlignment = Alignment.Vertical.CenterVertically
            ) {
                WidgetButton(label = "Isolation", mode = 0x00)
                Spacer(modifier = GlanceModifier.width(6.dp))
                WidgetButton(label = "Trans.", mode = 0x02)
                Spacer(modifier = GlanceModifier.width(6.dp))
                WidgetButton(label = "Off", mode = 0x03)
            }
        }
    }

    @Composable
    fun WidgetButton(label: String, mode: Byte) {
        Box(
            modifier = GlanceModifier
                .background(GlanceTheme.colors.surfaceVariant)
                .padding(horizontal = 10.dp, vertical = 6.dp)
                .clickable(
                    actionRunCallback<AncToggleAction>(
                        actionParametersOf(ancModeKey to mode)
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = label,
                style = TextStyle(
                    color = GlanceTheme.colors.onSurfaceVariant,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium
                )
            )
        }
    }
}

// Glance Action Callback to trigger BLE commands in the background
val ancModeKey = ActionParameters.Key<Byte>("ANC_MODE_KEY")

class AncToggleAction : ActionCallback {
    override suspend fun onAction(context: Context, glanceId: GlanceId, parameters: ActionParameters) {
        val mode = parameters[ancModeKey] ?: 0x00
        val payload = DysonProtocolEngine.buildAncPayload(mode)
        
        // Dispatch command via active BLE manager layer
        DysonBluetoothManager.sendGlobalCommand(context, payload)
    }
}

class DysonWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = DysonWidget()
}
