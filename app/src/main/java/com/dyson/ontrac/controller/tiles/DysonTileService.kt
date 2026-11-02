package com.dyson.ontrac.controller.tiles

import android.os.Build
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService
import com.dyson.ontrac.controller.DysonBluetoothManager
import com.dyson.ontrac.controller.DysonProtocolEngine

class DysonTileService : TileService() {

    override fun onStartListening() {
        super.onStartListening()
        updateTileState()
    }

    override fun onClick() {
        super.onClick()
        val tile = qsTile ?: return
        if (tile.state == Tile.STATE_ACTIVE) {
            // Switch from Isolation to Transparency
            tile.state = Tile.STATE_INACTIVE
            tile.label = "Transparency"
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                tile.subtitle = "88% Battery"
            }
            val payload = DysonProtocolEngine.buildAncPayload(0x02)
            DysonBluetoothManager.sendGlobalCommand(this, payload)
        } else {
            // Switch back to Isolation
            tile.state = Tile.STATE_ACTIVE
            tile.label = "Isolation"
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                tile.subtitle = "88% Battery"
            }
            val payload = DysonProtocolEngine.buildAncPayload(0x00)
            DysonBluetoothManager.sendGlobalCommand(this, payload)
        }
        tile.updateTile()
    }

    private fun updateTileState() {
        qsTile?.apply {
            state = Tile.STATE_ACTIVE
            label = "Dyson OnTrac"
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                subtitle = "88% Battery"
            }
            updateTile()
        }
    }
}
