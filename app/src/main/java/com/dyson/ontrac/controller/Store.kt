package com.dyson.ontrac.controller

import android.content.Context
import org.json.JSONArray
import org.json.JSONObject

/** Small SharedPreferences wrapper: last ANC/EQ, auto-reconnect flag, named EQ profiles. */
class Store(context: Context) {
    private val sp = context.getSharedPreferences("dyson_prefs", Context.MODE_PRIVATE)

    var autoReconnect: Boolean
        get() = sp.getBoolean("auto_reconnect", true)
        set(v) { sp.edit().putBoolean("auto_reconnect", v).apply() }

    var ambientGlow: Boolean
        get() = sp.getBoolean("ambient_glow", true)
        set(v) { sp.edit().putBoolean("ambient_glow", v).apply() }

    var lastAnc: Int
        get() = sp.getInt("last_anc", 0)
        set(v) { sp.edit().putInt("last_anc", v).apply() }

    var lastEq: List<Int>
        get() = sp.getString("last_eq", null)
            ?.split(",")
            ?.mapNotNull { it.trim().toIntOrNull() }
            ?.takeIf { it.size == 5 }
            ?: DEFAULT_EQ
        set(v) { sp.edit().putString("last_eq", v.joinToString(",")).apply() }

    fun profiles(): Map<String, List<Int>> {
        val out = LinkedHashMap<String, List<Int>>()
        val raw = sp.getString("profiles", null)
        if (raw == null) {
            out["Audiophile"] = DEFAULT_EQ
            return out
        }
        try {
            val obj = JSONObject(raw)
            val keys = obj.keys()
            while (keys.hasNext()) {
                val k = keys.next()
                val arr = obj.getJSONArray(k)
                if (arr.length() == 5) out[k] = List(5) { arr.getInt(it) }
            }
        } catch (e: Exception) {
        }
        return out
    }

    fun saveProfile(name: String, values: List<Int>) {
        val all = LinkedHashMap(profiles())
        all[name] = values
        persist(all)
    }

    fun deleteProfile(name: String) {
        val all = LinkedHashMap(profiles())
        all.remove(name)
        persist(all)
    }

    private fun persist(all: Map<String, List<Int>>) {
        val obj = JSONObject()
        all.forEach { (k, v) -> obj.put(k, JSONArray(v)) }
        sp.edit().putString("profiles", obj.toString()).apply()
    }

    companion object {
        val DEFAULT_EQ = listOf(3, -2, 1, -2, -2)
    }
}
