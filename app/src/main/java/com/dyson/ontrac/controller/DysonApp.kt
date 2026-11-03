package com.dyson.ontrac.controller

import android.app.Application
import android.content.Context

/** Holds the single BLE manager so the activity, tile, widget and receivers share one connection. */
class DysonApp : Application() {
    val store by lazy { Store(this) }
    val ble by lazy { DysonBleManager(this, store) }
    val sniffer by lazy { com.dyson.ontrac.controller.sniffer.SnoopSession(this, ble) }
}

val Context.dysonApp: DysonApp get() = applicationContext as DysonApp
