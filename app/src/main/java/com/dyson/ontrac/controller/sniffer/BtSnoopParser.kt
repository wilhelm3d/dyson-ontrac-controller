package com.dyson.ontrac.controller.sniffer

import java.io.ByteArrayOutputStream
import java.util.Locale

/** One decoded ATT PDU from the Bluetooth HCI snoop log. */
class AttEvent(
    val timeUs: Long,          // microseconds since the first packet of the capture
    val received: Boolean,     // true = headphones -> phone, false = phone -> headphones
    val conn: Int,             // HCI connection handle
    val opcode: Int,
    val handle: Int?,          // ATT attribute handle (null when the PDU has none)
    val value: ByteArray,
    val error: Int? = null,    // for ERROR_RSP: ATT error code
    val errorFor: Int? = null  // for ERROR_RSP: opcode of the failed request
) {
    val isWrite get() = opcode == 0x12 || opcode == 0x52 || opcode == 0xD2 || opcode == 0x16
    val isNotify get() = opcode == 0x1B || opcode == 0x1D
    val isError get() = opcode == 0x01
    val hex: String get() = value.joinToString(" ") { "%02X".format(it) }
}

class SnoopResult(
    val events: List<AttEvent>,
    /** value handle -> UUID, learned from service discovery inside the capture (if any happened). */
    val discoveredUuids: Map<Int, String>,
    val packets: Int,
    val truncatedPackets: Int
)

/**
 * Parser for the btsnoop format Android writes to /data/misc/bluetooth/logs/btsnoop_hci.log.
 * Extracts ATT traffic (L2CAP CID 4) incl. ACL fragment reassembly.
 */
object BtSnoopParser {

    private class Reasm(val need: Int) { val buf = ByteArrayOutputStream() }

    fun parse(bytes: ByteArray): SnoopResult {
        require(bytes.size >= 16 && String(bytes, 0, 7, Charsets.US_ASCII) == "btsnoop") {
            "Not a btsnoop file"
        }
        val datalink = be32(bytes, 12)
        val events = ArrayList<AttEvent>()
        val uuids = HashMap<Int, String>()
        val pendingRead = HashMap<Int, Int>()
        val reasm = HashMap<Pair<Int, Boolean>, Reasm>()
        var p = 16
        var t0 = -1L
        var count = 0
        var truncated = 0

        while (p + 24 <= bytes.size) {
            val origLen = be32(bytes, p)
            val inclLen = be32(bytes, p + 4)
            val flags = be32(bytes, p + 8)
            val ts = be64(bytes, p + 16)
            p += 24
            if (inclLen < 0 || p + inclLen > bytes.size) break
            val rec = bytes.copyOfRange(p, p + inclLen)
            p += inclLen
            count++
            if (inclLen < origLen) truncated++
            if (t0 < 0) t0 = ts
            val received = flags and 1 == 1

            val off = when (datalink) {
                1002 -> if (rec.isNotEmpty() && rec[0].toInt() == 0x02) 1 else continue  // H4: 0x02 = ACL
                1001 -> if (flags and 2 == 0) 0 else continue                           // unencapsulated
                else -> continue
            }
            if (rec.size < off + 4) continue
            val hf = le16(rec, off)
            val conn = hf and 0x0FFF
            val pb = (hf shr 12) and 0x3
            val aclLen = le16(rec, off + 2)
            val data = rec.copyOfRange(off + 4, minOf(rec.size, off + 4 + aclLen))
            val key = conn to received

            val l2: ByteArray = if (pb == 0x01) {                // continuation fragment
                val r = reasm[key] ?: continue
                r.buf.write(data)
                if (r.buf.size() < r.need) continue
                reasm.remove(key)
                r.buf.toByteArray()
            } else {
                if (data.size < 4) continue
                val need = le16(data, 0) + 4
                if (data.size < need) {
                    reasm[key] = Reasm(need).also { it.buf.write(data) }
                    continue
                }
                data
            }
            if (le16(l2, 2) != 0x0004) continue                   // ATT only
            val att = l2.copyOfRange(4, minOf(l2.size, le16(l2, 0) + 4))
            if (att.isEmpty()) continue
            decodeAtt(att, ts - t0, received, conn, events, uuids, pendingRead)
        }
        return SnoopResult(events, uuids, count, truncated)
    }

    private fun decodeAtt(
        att: ByteArray, t: Long, rx: Boolean, conn: Int,
        out: MutableList<AttEvent>, uuids: MutableMap<Int, String>, pendingRead: MutableMap<Int, Int>
    ) {
        val op = att[0].toInt() and 0xFF
        fun rest(from: Int) = if (att.size > from) att.copyOfRange(from, att.size) else ByteArray(0)
        when (op) {
            0x12, 0x52, 0xD2, 0x1B, 0x1D ->                      // write req/cmd/signed, notify, indicate
                if (att.size >= 3) out += AttEvent(t, rx, conn, op, le16(att, 1), rest(3))
            0x16 ->                                               // prepare write: handle, offset, value
                if (att.size >= 5) out += AttEvent(t, rx, conn, op, le16(att, 1), rest(5))
            0x0A -> if (att.size >= 3) {                          // read req
                val h = le16(att, 1)
                pendingRead[conn] = h
                out += AttEvent(t, rx, conn, op, h, ByteArray(0))
            }
            0x0B -> out += AttEvent(t, rx, conn, op, pendingRead[conn], rest(1))   // read rsp
            0x13, 0x18, 0x1E -> out += AttEvent(t, rx, conn, op, null, ByteArray(0))
            0x01 -> if (att.size >= 5) out += AttEvent(              // error rsp
                t, rx, conn, op, le16(att, 2), ByteArray(0),
                error = att[4].toInt() and 0xFF, errorFor = att[1].toInt() and 0xFF
            )
            0x02, 0x03 -> if (att.size >= 3) out += AttEvent(t, rx, conn, op, null, rest(1)) // MTU
            0x09 -> if (att.size >= 2) {                          // read-by-type rsp: characteristic declarations
                val len = att[1].toInt() and 0xFF
                if (len == 7 || len == 21) {
                    var i = 2
                    while (i + len <= att.size) {
                        val valueHandle = le16(att, i + 3)
                        uuids[valueHandle] = uuidString(att.copyOfRange(i + 5, i + len))
                        i += len
                    }
                }
            }
        }
    }

    fun uuidString(le: ByteArray): String {
        val b = le.reversedArray()
        val h = b.joinToString("") { "%02X".format(it) }
        return if (b.size == 2) "0000$h-0000-1000-8000-00805F9B34FB"
        else "${h.substring(0, 8)}-${h.substring(8, 12)}-${h.substring(12, 16)}-${h.substring(16, 20)}-${h.substring(20)}"
    }

    fun opName(op: Int): String = when (op) {
        0x01 -> "ERROR"
        0x02 -> "MTU_REQ"; 0x03 -> "MTU_RSP"
        0x0A -> "READ"; 0x0B -> "READ_RSP"
        0x12 -> "WRITE"; 0x13 -> "WRITE_RSP"
        0x52 -> "WRITE_CMD"; 0xD2 -> "SIGNED_WRITE"
        0x16 -> "PREP_WRITE"; 0x18 -> "EXEC_WRITE"
        0x1B -> "NOTIFY"; 0x1D -> "INDICATE"; 0x1E -> "CONFIRM"
        else -> "OP_%02X".format(op)
    }

    fun errorName(code: Int): String = when (code) {
        0x01 -> "invalid handle"
        0x02 -> "read not permitted"
        0x03 -> "write not permitted"
        0x05 -> "insufficient authentication"
        0x06 -> "request not supported"
        0x07 -> "invalid offset"
        0x08 -> "insufficient authorization"
        0x0D -> "invalid value length"
        0x0E -> "unlikely error"
        0x0F -> "insufficient encryption"
        in 0x80..0x9F -> "application error 0x%02X".format(code)
        else -> "error 0x%02X".format(code)
    }

    /** Human-readable dump, one line per event. */
    fun format(events: List<AttEvent>, name: (Int?) -> String): String = buildString {
        events.forEach { e ->
            append(String.format(Locale.US, "%9.3fs  ", e.timeUs / 1_000_000.0))
            append(if (e.received) "HS→PH  " else "PH→HS  ")
            append(opName(e.opcode).padEnd(12))
            if (e.handle != null) append("h=0x%04X %-10s ".format(e.handle, name(e.handle)))
            if (e.isError) append("${opName(e.errorFor ?: 0)} failed: ${errorName(e.error ?: 0)}")
            else append(e.hex)
            append('\n')
        }
    }

    private fun le16(b: ByteArray, i: Int) = (b[i].toInt() and 0xFF) or ((b[i + 1].toInt() and 0xFF) shl 8)
    private fun be32(b: ByteArray, i: Int) =
        ((b[i].toInt() and 0xFF) shl 24) or ((b[i + 1].toInt() and 0xFF) shl 16) or
            ((b[i + 2].toInt() and 0xFF) shl 8) or (b[i + 3].toInt() and 0xFF)
    private fun be64(b: ByteArray, i: Int): Long {
        var v = 0L
        for (k in 0 until 8) v = (v shl 8) or (b[i + k].toLong() and 0xFF)
        return v
    }
}
