package com.dyson.ontrac.controller.tiles

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
            tile.state = Tile.STATE_INACTIVE
            tile.label = "ANC Off"
            // Trigger BLE command to turn off ANC (0x03 = Off)
            val payload = DysonProtocolEngine.buildAncPayload(0x03)
            DysonBluetoothManager.sendGlobalCommand(this, payload)
        } else {
            tile.state = Tile.STATE_ACTIVE
            tile.label = "Isolation"
            // Trigger BLE command for Max Isolation (0x00 = Isolation)
            val payload = DysonProtocolEngine.buildAncPayload(0x00)
            DysonBluetoothManager.sendGlobalCommand(this, payload)
        }
        tile.updateTile()
    }

    private fun updateTileState() {
        qsTile?.apply {
            state = Tile.STATE_ACTIVE
            label = "Dyson OnTrac"
            updateTile()
        }
    }
}
