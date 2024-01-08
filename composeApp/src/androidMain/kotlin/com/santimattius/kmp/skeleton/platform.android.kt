package com.santimattius.kmp.skeleton

import android.util.Log
import com.mmk.kmpnotifier.notification.NotifierManager
import com.mmk.kmpnotifier.notification.configuration.NotificationPlatformConfiguration
import com.santimattius.kmp.compose.skeleton.R

actual fun onApplicationStartPlatformSpecific() {
    NotifierManager.initialize(
        configuration = NotificationPlatformConfiguration.Android(
            notificationIconResId = R.drawable.ic_launcher_foreground,
        )
    )
}

actual fun logMessage(message: String) {
    Log.d("Notifications", message)
}