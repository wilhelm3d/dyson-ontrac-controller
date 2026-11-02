package com.dyson.ontrac.controller

import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCharacteristic
import android.bluetooth.BluetoothGattDescriptor
import android.os.Build
import java.util.UUID

object DysonProtocolEngine {

    // --- UUID Definitions ---
    val CCCD_UUID: UUID = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb")
    val AUDIO_SERVICE_UUID: UUID = UUID.fromString("2DD10020-1C37-452D-8979-D1B4A787D0A4")
    val COMMAND_CHAR_UUID: UUID = UUID.fromString("2DD10021-1C37-452D-8979-D1B4A787D0A4")
    val CUSTOM_EQ_CHAR_UUID: UUID = UUID.fromString("2DD12007-1C37-452D-8979-D1B4A787D0A4")

    // --- Command Header Framing Identifier ---
    private const val FRAME_MARKER: Byte = 0x40

    // --- Trait Command IDs (on.b) ---
    private const val CMD_ID_ANC: Byte = 10            // 0x0A
    private const val CMD_ID_PRESET_EQ: Byte = 11      // 0x0B
    private const val CMD_ID_ANC_INTENSITY: Byte = 0x22// ANC depth percentage command
    private const val CMD_ID_WEAR_DETECTION: Byte = 0x41// Sensor toggle / threshold
    private const val CMD_ID_GESTURE_REMAP: Byte = 0x35 // Double-tap/hold action map

    fun buildTraitPayload(commandId: Byte, value: Byte): ByteArray {
        return byteArrayOf(commandId, FRAME_MARKER, value)
    }

    fun buildAncPayload(modeByte: Byte): ByteArray = buildTraitPayload(CMD_ID_ANC, modeByte)

    fun buildPresetEqPayload(presetByte: Byte): ByteArray = buildTraitPayload(CMD_ID_PRESET_EQ, presetByte)

    /**
     * Builds payload for Fine-Grained ANC Intensity Slider (0% to 100%)
     */
    fun buildAncIntensityPayload(percent: Int): ByteArray {
        val clamped = percent.coerceIn(0, 100).toByte()
        return byteArrayOf(CMD_ID_ANC_INTENSITY, FRAME_MARKER, clamped)
    }

    fun buildCustomEqPayload(band1Db: Int, band2Db: Int, band3Db: Int, band4Db: Int, band5Db: Int): ByteArray {
        return byteArrayOf(
            band1Db.coerceIn(-10, 10).toByte(),
            band2Db.coerceIn(-10, 10).toByte(),
            band3Db.coerceIn(-10, 10).toByte(),
            band4Db.coerceIn(-10, 10).toByte(),
            band5Db.coerceIn(-10, 10).toByte()
        )
    }

    /**
     * Professional Audiophile Target Curve Profiles mapped to 5-band EQ (60Hz, 250Hz, 1kHz, 4kHz, 12kHz)
     */
    val targetCurveProfiles = mapOf(
        "Harman OE (Over-Ear)" to floatArrayOf(4.5f, 2.0f, -0.5f, 3.5f, 5.0f),
        "Harman AE (Acoustic/In-Ear)" to floatArrayOf(5.0f, 3.0f, 0.0f, 4.0f, 4.5f),
        "Oratory1990 Reference" to floatArrayOf(2.5f, 1.0f, 0.0f, 2.0f, 3.0f),
        "Flat Studio Reference" to floatArrayOf(0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
    )

    /**
     * Toggles or tunes wear-detection auto-pause sensor.
     * State values: 0x00 = Disabled, 0x01 = Low Sensitivity, 0x02 = High Sensitivity
     */
    fun buildWearDetectionPayload(state: Byte): ByteArray {
        return byteArrayOf(CMD_ID_WEAR_DETECTION, FRAME_MARKER, state)
    }

    /**
     * Remaps physical earcup gestures.
     * Gesture ID: 0x01 = Double-Tap, 0x02 = Touch-and-Hold
     * Action ID:  0x00 = Play/Pause, 0x01 = Voice Assistant, 0x02 = Cycle ANC/Transparency, 0x03 = Track Skip
     */
    fun buildGestureRemapPayload(gestureId: Byte, actionId: Byte): ByteArray {
        return byteArrayOf(CMD_ID_GESTURE_REMAP, FRAME_MARKER, gestureId, actionId)
    }

    @Suppress("DEPRECATION")
    fun writeGattPayload(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, payload: ByteArray): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            gatt.writeCharacteristic(characteristic, payload, BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT) == 0
        } else {
            characteristic.value = payload
            characteristic.writeType = BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT
            gatt.writeCharacteristic(characteristic)
        }
    }
}
