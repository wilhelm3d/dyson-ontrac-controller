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
    private const val CMD_ID_ANC: Byte = 10         // 0x0A
    private const val CMD_ID_PRESET_EQ: Byte = 11   // 0x0B

    fun buildTraitPayload(commandId: Byte, value: Byte): ByteArray {
        return byteArrayOf(commandId, FRAME_MARKER, value)
    }

    fun buildAncPayload(modeByte: Byte): ByteArray = buildTraitPayload(CMD_ID_ANC, modeByte)

    fun buildPresetEqPayload(presetByte: Byte): ByteArray = buildTraitPayload(CMD_ID_PRESET_EQ, presetByte)

    fun buildCustomEqPayload(band1Db: Int, band2Db: Int, band3Db: Int, band4Db: Int, band5Db: Int): ByteArray {
        return byteArrayOf(
            band1Db.coerceIn(-10, 10).toByte(),
            band2Db.coerceIn(-10, 10).toByte(),
            band3Db.coerceIn(-10, 10).toByte(),
            band4Db.coerceIn(-10, 10).toByte(),
            band5Db.coerceIn(-10, 10).toByte()
        )
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
