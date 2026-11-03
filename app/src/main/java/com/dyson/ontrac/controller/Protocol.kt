package com.dyson.ontrac.controller

import java.util.UUID

// Audio settings live as plain GATT characteristics in service 2DD12000
// (decompiled: on/a.java + on/c.java).
fun dysonUuid(suffix: String): UUID = UUID.fromString("2DD1${suffix}-1C37-452D-8979-D1B4A787D0A4")

val DYSON_AUDIO_SERVICE_UUID: UUID = dysonUuid("2000")
val DYSON_ANC_MODE_UUID: UUID = dysonUuid("2001")   // 1 byte, ANC_* below (inferred)
val DYSON_EQ_MODE_UUID: UUID = dysonUuid("2003")    // 1 byte, EQ preset (inferred)
val DYSON_CUSTOM_EQ_UUID: UUID = dysonUuid("2007")  // 5 signed bytes (lp/e.java)
val DYSON_BATTERY_UUID: UUID = dysonUuid("200C")    // 2 bytes, value / 10000 = 0..1 (qn/a.java)
val CCCD_UUID: UUID = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb")

// ANC mode values from yo/a.java
const val ANC_ISOLATION: Byte = 0
const val ANC_CONVERSATION: Byte = 1
const val ANC_TRANSPARENCY: Byte = 2
const val ANC_OFF: Byte = 3
const val ANC_MEDIUM_QUIET: Byte = 4
const val ANC_MEDIUM_LOUD: Byte = 5

// Guess: check the EQ_MODE read-back in the log against the official app.
const val EQ_MODE_CUSTOM: Byte = 3

// Byte order of the battery value is not visible in the dump. If the percentage looks
// wrong (compare with the official app), flip this.
const val BATTERY_LITTLE_ENDIAN = true

const val STATE_READY = "Ready to send commands"

fun ancName(mode: Int?): String = when (mode) {
    0 -> "Isolation"
    1 -> "Conversation"
    2 -> "Transparency"
    3 -> "Off"
    4 -> "Medium quiet"
    5 -> "Medium loud"
    else -> "Unknown"
}
