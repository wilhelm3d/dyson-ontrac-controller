package com.dyson.ontrac.controller

import android.annotation.SuppressLint
import android.bluetooth.*
import android.content.Context
import com.dyson.ontrac.controller.logging.DysonLogger

object DysonBluetoothManager {

    private var activeGatt: BluetoothGatt? = null

    fun setGattInstance(gatt: BluetoothGatt?) {
        activeGatt = gatt
        if (gatt != null) {
            DysonLogger.i("BLE_MANAGER", "Active GATT instance registered (${gatt.device.address})")
        } else {
            DysonLogger.i("BLE_MANAGER", "Active GATT instance cleared")
        }
    }

    @SuppressLint("MissingPermission")
    fun sendGlobalCommand(context: Context, payload: ByteArray) {
        val hex = payload.joinToString("") { "%02x".format(it) }
        val gatt = activeGatt
        if (gatt != null) {
            val service = gatt.getService(DysonProtocolEngine.AUDIO_SERVICE_UUID)
            val characteristic = service?.getCharacteristic(DysonProtocolEngine.COMMAND_CHAR_UUID)
            if (characteristic != null) {
                val success = DysonProtocolEngine.writeGattPayload(gatt, characteristic, payload)
                DysonLogger.i("GLOBAL_CMD", "TX -> [$hex] via active GATT | Success: $success")
                return
            } else {
                DysonLogger.e("GLOBAL_CMD", "Command characteristic not found on active GATT")
            }
        } else {
            DysonLogger.i("GLOBAL_CMD", "No active GATT session. Attempting auto-reconnect...")
        }

        // If not actively connected, auto-connect using saved MAC address
        val prefs = context.getSharedPreferences("DysonPrefs", Context.MODE_PRIVATE)
        val savedMac = prefs.getString("SAVED_ONTRAC_MAC", null)
        if (savedMac.isNullOrEmpty()) {
            DysonLogger.e("GLOBAL_CMD", "No saved MAC address found for auto-reconnect")
            return
        }

        val bm = context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        val adapter = bm.adapter
        if (adapter == null || !adapter.isEnabled) {
            DysonLogger.e("GLOBAL_CMD", "Bluetooth adapter is disabled")
            return
        }

        try {
            val device = adapter.getRemoteDevice(savedMac)
            DysonLogger.i("AUTO_CONNECT", "Initiating background connection to: $savedMac")
            device.connectGatt(context, false, object : BluetoothGattCallback() {
                override fun onConnectionStateChange(gatt: BluetoothGatt, status: Int, newState: Int) {
                    if (newState == BluetoothProfile.STATE_CONNECTED) {
                        DysonLogger.i("AUTO_CONNECT", "Connected to $savedMac. Discovering services...")
                        activeGatt = gatt
                        gatt.discoverServices()
                    } else if (newState == BluetoothProfile.STATE_DISCONNECTED) {
                        DysonLogger.i("AUTO_CONNECT", "Disconnected from $savedMac (status=$status)")
                        gatt.close()
                        if (activeGatt == gatt) activeGatt = null
                    }
                }

                override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) {
                    if (status == BluetoothGatt.GATT_SUCCESS) {
                        DysonLogger.i("AUTO_CONNECT", "Services discovered. Dispatching command [$hex]...")
                        val service = gatt.getService(DysonProtocolEngine.AUDIO_SERVICE_UUID)
                        val characteristic = service?.getCharacteristic(DysonProtocolEngine.COMMAND_CHAR_UUID)
                        if (characteristic != null) {
                            val success = DysonProtocolEngine.writeGattPayload(gatt, characteristic, payload)
                            DysonLogger.i("AUTO_CONNECT", "TX -> [$hex] | Success: $success")
                        } else {
                            DysonLogger.e("AUTO_CONNECT", "Command characteristic not found")
                        }
                    } else {
                        DysonLogger.e("AUTO_CONNECT", "Service discovery failed with status: $status")
                    }
                }
            }, BluetoothDevice.TRANSPORT_LE)
        } catch (e: Exception) {
            DysonLogger.e("AUTO_CONNECT", "Failed to connect to saved MAC $savedMac", e)
        }
    }
}
