package com.dyson.ontrac.controller.sniffer

import java.io.ByteArrayOutputStream
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

/** Minimal `su -c` runner. Blocking: call from Dispatchers.IO. */
object RootShell {
    class Result(val code: Int, val out: ByteArray, val err: String) {
        val text: String get() = String(out).trim()
        val ok: Boolean get() = code == 0
    }

    fun run(cmd: String, timeoutSec: Long = 20): Result {
        return try {
            val p = ProcessBuilder("su", "-c", cmd).start()
            val out = ByteArrayOutputStream()
            val err = ByteArrayOutputStream()
            val t1 = thread { runCatching { p.inputStream.copyTo(out) } }
            val t2 = thread { runCatching { p.errorStream.copyTo(err) } }
            val finished = p.waitFor(timeoutSec, TimeUnit.SECONDS)
            if (!finished) p.destroy()
            t1.join(3000); t2.join(3000)
            Result(if (finished) p.exitValue() else -1, out.toByteArray(), err.toString().trim())
        } catch (e: Exception) {
            Result(-1, ByteArray(0), e.message ?: "su failed")
        }
    }

    fun isRooted(): Boolean = run("id", 10).let { it.ok && it.text.contains("uid=0") }
}
