package com.dyson.ontrac.controller.logging

import android.content.Context
import android.util.Log
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object DysonLogger {

    private const val TAG = "DysonOnTrac"
    private const val MAX_LOG_CHARS = 25000

    private val dateFormat = SimpleDateFormat("HH:mm:ss.SSS", Locale.US)
    private val _logFlow = MutableStateFlow("--- Dyson OnTrac Controller Log Started ---\n")
    val logFlow: StateFlow<String> = _logFlow.asStateFlow()

    private var logFile: File? = null

    fun initFileLogging(context: Context) {
        try {
            logFile = File(context.filesDir, "dyson_ontrac_debug.log")
            if (logFile?.exists() == false) {
                logFile?.createNewFile()
            }
            i("SYSTEM", "Initialized file logging at: ${logFile?.absolutePath}")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to initialize log file", e)
        }
    }

    fun i(category: String, message: String) {
        val timestamp = dateFormat.format(Date())
        val formattedMsg = "[$timestamp] [$category] $message"
        Log.i(TAG, formattedMsg)
        appendLog(formattedMsg)
    }

    fun d(category: String, message: String) {
        val timestamp = dateFormat.format(Date())
        val formattedMsg = "[$timestamp] [$category] $message"
        Log.d(TAG, formattedMsg)
        appendLog(formattedMsg)
    }

    fun e(category: String, message: String, throwable: Throwable? = null) {
        val timestamp = dateFormat.format(Date())
        val formattedMsg = "[$timestamp] [ERROR/$category] $message ${throwable?.message ?: ""}"
        Log.e(TAG, formattedMsg, throwable)
        appendLog(formattedMsg)
    }

    private fun appendLog(line: String) {
        val current = _logFlow.value
        val updated = (current + line + "\n").takeLast(MAX_LOG_CHARS)
        _logFlow.value = updated

        logFile?.let { file ->
            try {
                file.appendText("$line\n")
            } catch (_: Exception) {}
        }
    }

    fun getLogFilePath(): String? = logFile?.absolutePath

    fun clear() {
        _logFlow.value = "--- Log Cleared ---\n"
        try {
            logFile?.writeText("")
        } catch (_: Exception) {}
    }
}
