package com.santimattius.kmp.skeleton

import android.content.Context
import androidx.startup.Initializer

class NotifierInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        AppInitializer.onApplicationStart()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}