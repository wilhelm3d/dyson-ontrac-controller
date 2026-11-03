package com.dyson.ontrac.controller

import java.util.UUID

/*
 * Dyson "trait" protocol on characteristic 2DD10021 (service 2DD10020).
 * Decoded from an HCI snoop capture of the official app (03.11.2026).
 *
 * Every frame:  80 <type> <trait> 40 [payload]
 *   phone -> hs   90 GET        80 90 TT 40
 *   hs -> phone   91 GET_RSP    80 91 TT 40 <status> <lenLo> <lenHi> <data…>
 *   phone -> hs   93 SET        80 93 TT 40 <lenLo> <lenHi> <data…>
 *   hs -> phone   94 SET_ACK    80 94 TT 40 <status>
 *   phone -> hs   96 SUBSCRIBE  80 96 TT 40 00
 *   hs -> phone   97 NOTIFY     80 97 TT 40 <lenLo> <lenHi> <data…>
 *   hs -> phone   98 SUB_ACK    80 98 TT 40
 * Written with WRITE WITHOUT RESPONSE (ATT Write Command). A normal write
 * request is rejected with status 3 ("write not permitted") – that was the old bug.
 */
val DYSON_TRAIT_SERVICE_UUID: UUID = dysonUuid("0020")
val DYSON_TRAIT_UUID: UUID = dysonUuid("0021")
val DYSON_SESSION_UUID: UUID = dysonUuid("0011")    // authenticated handshake, not needed for traits (?)
val DYSON_NOISE_UUID: UUID = dysonUuid("201D")      // 1 Hz, two uint16 LE at offset 10/12
val DYSON_CHARGE_STATE_UUID: UUID = dysonUuid("2016")

/** Trait IDs (on/b.java) and their value enums from the decompiled app. */
object Trait {
    const val EAR_CUSHIONS = 0x06     // 0 both missing, 1 left missing, 2 right missing, 3 both fitted
    const val FIT_PROCESS = 0x08      // 0 completed, 1 pending
    const val UNKNOWN_09 = 0x09       // Integer
    const val ANC_MODE = 0x0A         // 0 isolation, 1 conversation, 2 transparency, 3 off, 4 medium quiet, 5 medium loud
    const val EQ_PRESET = 0x0B        // 0 enhanced, 1 bass boost, 2 neutral, 3 custom
    const val FEATURE_10 = 0x10       // 0 disabled, 1 enabled – read by the app on the wear-detection screen
    const val AUDIO_STATE = 0x11      // 0 no audio, 1 playing, 2 paused, 3 call
    const val FEATURE_12 = 0x12       // 0 disabled, 1 enabled
    const val SOURCES = 0x13          // list (16-byte blob)
    const val BATTERY_STATE = 0x1A    // 0 full, 1 normal, 2 low, 3 insufficient, 4 critical, 5 shutdown
    const val UNKNOWN_1B = 0x1B
    const val LEVEL_1C = 0x1C         // 0 normal, 1 low, 2 insufficient, 3 none
    const val CAPSENSE_CAL = 0x1E     // capsense calibration state 0..4
    const val SOURCE_LINK = 0x1F      // 0 not connected, 1 connected, 2 connecting
    const val ANC_LEVELS = 0x22       // high nibble: transparency (1 medium loud, 2 full); low nibble: isolation (1 medium quiet, 2 full); 0 = keep
    const val WEAR_DETECTION = 0x23   // 0 auto, 1 always worn, 2 always unworn – SET confirmed (capture 2)

    /** Traits subscribed + fetched on connect (same set the official app reads). */
    val STARTUP = listOf(ANC_MODE, EQ_PRESET, ANC_LEVELS, WEAR_DETECTION, FEATURE_10, BATTERY_STATE, EAR_CUSHIONS, AUDIO_STATE, SOURCE_LINK)

    /** `80 73 00 01` asks for source device #1; answer `80 74 01 01 <mac 6> 0C <nameLen> <name>`. */
    val REQUEST_SOURCE: ByteArray = byteArrayOf(0x80.toByte(), 0x73, 0x00, 0x01)

    /** Parses the `80 74` source-device frame into (MAC, name), or null. */
    fun parseSource(v: ByteArray): Pair<String, String>? {
        if (v.size < 12 || (v[0].toInt() and 0xFF) != 0x80 || (v[1].toInt() and 0xFF) != 0x74) return null
        val mac = (4..9).joinToString(":") { "%02X".format(v[it]) }   // ends D3:6C = phone MAC in dumpsys
        val len = v[11].toInt() and 0xFF
        val name = String(v, 12, minOf(len, v.size - 12), Charsets.UTF_8)
        return mac to name
    }
}

const val EQ_PRESET_ENHANCED = 0
const val EQ_PRESET_BASS_BOOST = 1
const val EQ_PRESET_NEUTRAL = 2
const val EQ_PRESET_CUSTOM = 3

/** Custom EQ range: the official app writes -6..+6 (FA..06), confirmed by read-back in capture 2. */
const val EQ_MAX_DB = 6

object TraitCodec {
    private const val PREFIX = 0x80
    private const val MARK = 0x40
    const val GET = 0x90
    const val GET_RSP = 0x91
    const val SET = 0x93
    const val SET_ACK = 0x94
    const val SUBSCRIBE = 0x96
    const val NOTIFY = 0x97
    const val SUB_ACK = 0x98

    fun get(trait: Int) = bytes(PREFIX, GET, trait, MARK)
    fun subscribe(trait: Int) = bytes(PREFIX, SUBSCRIBE, trait, MARK, 0)
    fun set(trait: Int, vararg data: Int): ByteArray =
        bytes(PREFIX, SET, trait, MARK, data.size and 0xFF, data.size shr 8) + bytes(*data)

    class Msg(val type: Int, val trait: Int, val status: Int?, val data: ByteArray) {
        val firstByte: Int? get() = data.firstOrNull()?.toInt()?.and(0xFF)
    }

    fun parse(v: ByteArray): Msg? {
        if (v.size < 4 || (v[0].toInt() and 0xFF) != PREFIX || (v[3].toInt() and 0xFF) != MARK) return null
        val type = v[1].toInt() and 0xFF
        val trait = v[2].toInt() and 0xFF
        fun u8(i: Int) = v.getOrNull(i)?.toInt()?.and(0xFF)
        return when (type) {
            GET_RSP -> Msg(type, trait, u8(4), body(v, 5))
            NOTIFY -> Msg(type, trait, null, body(v, 4))
            SET_ACK -> Msg(type, trait, u8(4) ?: 0, ByteArray(0))
            SUB_ACK -> Msg(type, trait, 0, ByteArray(0))
            else -> null
        }
    }

    private fun body(v: ByteArray, off: Int): ByteArray {
        if (v.size < off + 2) return ByteArray(0)
        val len = (v[off].toInt() and 0xFF) or ((v[off + 1].toInt() and 0xFF) shl 8)
        return v.copyOfRange(off + 2, minOf(v.size, off + 2 + len))
    }

    private fun bytes(vararg b: Int) = ByteArray(b.size) { b[it].toByte() }
}

fun eqPresetName(p: Int?) = when (p) {
    0 -> "Enhanced"; 1 -> "Bass boost"; 2 -> "Neutral"; 3 -> "Custom"; else -> "?"
}

fun wearDetectionName(v: Int?) = when (v) {
    0 -> "Auto"; 1 -> "Always worn"; 2 -> "Always unworn"; else -> "?"
}
