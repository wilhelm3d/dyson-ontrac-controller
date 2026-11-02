package com.dyson.ontrac.controller.settings

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore(name = "theme_settings")

class ThemePreferences(private val context: Context) {
    companion object {
        val DYNAMIC_COLOR_KEY = booleanPreferencesKey("use_dynamic_color")
        val OLED_BLACK_KEY = booleanPreferencesKey("use_oled_black")
    }

    val dynamicColorFlow = context.dataStore.data.map { prefs ->
        prefs[DYNAMIC_COLOR_KEY] ?: true // Default to true for Material You
    }

    val oledBlackFlow = context.dataStore.data.map { prefs ->
        prefs[OLED_BLACK_KEY] ?: true // Default to true for OLED black
    }

    suspend fun setDynamicColor(enabled: Boolean) {
        context.dataStore.edit { prefs -> prefs[DYNAMIC_COLOR_KEY] = enabled }
    }

    suspend fun setOledBlack(enabled: Boolean) {
        context.dataStore.edit { prefs -> prefs[OLED_BLACK_KEY] = enabled }
    }
}
