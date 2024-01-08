package com.santimattius.kmp.skeleton

import com.mmk.kmpnotifier.notification.NotifierManager
import com.mmk.kmpnotifier.notification.configuration.NotificationPlatformConfiguration
import platform.Foundation.NSLog

actual fun onApplicationStartPlatformSpecific() {
    NotifierManager.initialize(NotificationPlatformConfiguration.Ios)
}

actual fun logMessage(message: String) {
    NSLog(message)
}