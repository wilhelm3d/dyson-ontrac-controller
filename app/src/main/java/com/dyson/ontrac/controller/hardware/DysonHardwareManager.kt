package com.dyson.ontrac.controller.hardware

import android.bluetooth.BluetoothGatt
import com.dyson.ontrac.controller.DysonProtocolEngine
import java.util.UUID

object DysonHardwareManager {

    private val CONFIG_CHAR_UUID: UUID = DysonProtocolEngine.COMMAND_CHAR_UUID

    // --- Feature 6: Adjustable ANC Intensity Slider (0x00 to 0x64 / 0-100%) ---
    fun setAncIntensity(gatt: BluetoothGatt, intensityPercent: Int): Boolean {
        val payload = byteArrayOf(0x22, 0x40, intensityPercent.coerceIn(0, 100).toByte())
        return writeCommand(gatt, payload)
    }

    // --- Feature 8: Custom Double-Tap Gesture Mapping ---
    // Actions: 0 = Play/Pause, 1 = Voice Assistant, 2 = Cycle ANC/Transparency
    fun setDoubleTapAction(gatt: BluetoothGatt, actionId: Byte): Boolean {
        val payload = byteArrayOf(0x35, 0x40, actionId)
        return writeCommand(gatt, payload)
    }

    // --- Feature 11: Dual Battery Health & Cycle Tracker Request ---
    fun requestBatteryTelemetry(gatt: BluetoothGatt): Boolean {
        val payload = byteArrayOf(0x50, 0x40, 0x01)
        return writeCommand(gatt, payload)
    }

    // --- Feature 30: Wear-Detection Auto-Pause Threshold Tuning ---
    fun setWearDetectionSensitivity(gatt: BluetoothGatt, threshold: Byte): Boolean {
        val payload = byteArrayOf(0x41, 0x40, threshold)
        return writeCommand(gatt, payload)
    }

    private fun writeCommand(gatt: BluetoothGatt, payload: ByteArray): Boolean {
        val service = gatt.getService(DysonProtocolEngine.AUDIO_SERVICE_UUID)
        val char = service?.getCharacteristic(CONFIG_CHAR_UUID) ?: return false
        return DysonProtocolEngine.writeGattPayload(gatt, char, payload)
    }
}
