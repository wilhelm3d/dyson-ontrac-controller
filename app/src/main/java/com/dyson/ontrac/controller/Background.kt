package com.dyson.ontrac.controller

import android.Manifest
import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.bluetooth.BluetoothDevice
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService
import android.widget.RemoteViews
import androidx.core.content.ContextCompat

private val CYCLE = listOf(0, 2, 3) // Isolation -> Transparency -> Off

private fun Context.hasBtConnect(): Boolean =
    Build.VERSION.SDK_INT < Build.VERSION_CODES.S ||
        ContextCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH_CONNECT) ==
        PackageManager.PERMISSION_GRANTED

/** Quick-settings tile: tap to cycle Isolation -> Transparency -> Off. */
class AncTileService : TileService() {

    override fun onStartListening() {
        refresh(null)
    }

    override fun onClick() {
        val app = dysonApp
        if (!hasBtConnect()) {
            refresh(null); return
        }
        val current = app.ble.ancMode.value ?: app.store.lastAnc
        val next = CYCLE[(CYCLE.indexOf(current) + 1) % CYCLE.size]
        app.ble.runWhenReady { app.ble.setAnc(next.toByte()) }
        refresh(next)
    }

    private fun refresh(mode: Int?) {
        val tile = qsTile ?: return
        val app = dysonApp
        val shown = mode ?: app.ble.ancMode.value ?: app.store.lastAnc
        tile.label = "OnTrac ANC"
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) tile.subtitle = ancName(shown)
        tile.state = if (app.ble.isReady) Tile.STATE_ACTIVE else Tile.STATE_INACTIVE
        tile.updateTile()
    }
}

/** Home-screen widget with three buttons: Isolation / Transparency / Off. */
class AncWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(context: Context, manager: AppWidgetManager, ids: IntArray) {
        val views = RemoteViews(context.packageName, R.layout.widget_anc)
        views.setOnClickPendingIntent(R.id.btn_iso, pending(context, 0))
        views.setOnClickPendingIntent(R.id.btn_trans, pending(context, 2))
        views.setOnClickPendingIntent(R.id.btn_off, pending(context, 3))
        ids.forEach { manager.updateAppWidget(it, views) }
    }

    private fun pending(context: Context, mode: Int): PendingIntent {
        val intent = Intent(context, AncActionReceiver::class.java)
            .setAction(AncActionReceiver.ACTION_SET_ANC)
            .putExtra(AncActionReceiver.EXTRA_MODE, mode)
        return PendingIntent.getBroadcast(
            context, mode, intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
    }
}

/** Receives widget button presses, connects if needed, writes the ANC mode. */
class AncActionReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != ACTION_SET_ANC) return
        val mode = intent.getIntExtra(EXTRA_MODE, -1)
        if (mode < 0 || !context.hasBtConnect()) return
        val result = goAsync()
        val ble = context.dysonApp.ble
        ble.runWhenReady { ble.setAnc(mode.toByte()) }
        // keep the process alive long enough to connect and write
        Handler(Looper.getMainLooper()).postDelayed({ result.finish() }, 8000)
    }

    companion object {
        const val ACTION_SET_ANC = "com.dyson.ontrac.controller.SET_ANC"
        const val EXTRA_MODE = "mode"
    }
}

/** Fires when any Bluetooth device connects; if it is the OnTrac, open the GATT connection. */
class BluetoothAclReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != BluetoothDevice.ACTION_ACL_CONNECTED) return
        val app = context.dysonApp
        if (!app.store.autoReconnect || !context.hasBtConnect()) return
        val device: BluetoothDevice? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE, BluetoothDevice::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE)
        }
        @Suppress("MissingPermission")
        val name = try { device?.name } catch (e: SecurityException) { null }
        if (name != null && (name.contains("OnTrac", true) || name.contains("N571", true))) {
            app.ble.connect()
        }
    }
}
