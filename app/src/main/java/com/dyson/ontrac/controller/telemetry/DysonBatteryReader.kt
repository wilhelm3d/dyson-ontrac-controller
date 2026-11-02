package com.dyson.ontrac.controller.telemetry

import android.annotation.SuppressLint
import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCharacteristic
import com.dyson.ontrac.controller.logging.DysonLogger
import java.util.UUID

object DysonBatteryReader {
    val BATTERY_SERVICE_UUID: UUID = UUID.fromString("2dd12000-1c37-452D-8979-D1B4A787D0A4")
    val BATTERY_STATUS_CHAR_UUID: UUID = UUID.fromString("2dd1200c-1c37-452D-8979-D1B4A787D0A4")

    @SuppressLint("MissingPermission")
    fun requestBatteryRead(gatt: BluetoothGatt): Boolean {
        val service = gatt.getService(BATTERY_SERVICE_UUID)
        val characteristic = service?.getCharacteristic(BATTERY_STATUS_CHAR_UUID)
        
        if (characteristic == null) {
            DysonLogger.e("BATTERY", "ERROR: Battery status characteristic not found.")
            return false
        }

        val success = gatt.readCharacteristic(characteristic)
        DysonLogger.i("BATTERY", "Reading battery characteristic 2dd1200c... Initiated: $success")
        return success
    }

    /**
     * Parses the raw byte array returned in onCharacteristicRead or notification
     */
    fun parseBatteryPayload(value: ByteArray): String {
        if (value.isEmpty()) return "Unknown"
        val rawHex = value.joinToString("") { "%02x".format(it) }
        
        // Dyson OnTrac battery payload parser:
        // Byte 0: Percentage level / raw SOC value
        val batteryPct = value[0].toInt() and 0xFF
        val extraFlags = if (value.size > 1) value[1].toInt() and 0xFF else 0
        
        return "Battery: ${batteryPct.coerceAtMost(100)}% (Raw Hex: 0x$rawHex, Flags: 0x${"%02x".format(extraFlags)})"
    }
}
