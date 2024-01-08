package com.santimattius.kmp.skeleton

import App
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mmk.kmpnotifier.permission.AndroidPermissionUtil
import com.mmk.kmpnotifier.permission.permissionUtil

class MainActivity : ComponentActivity() {

    val permissionUtil: AndroidPermissionUtil by permissionUtil()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }

    override fun onStart() {
        super.onStart()
        permissionUtil.askNotificationPermission { isSuccess ->
            if (isSuccess) return@askNotificationPermission
            Toast.makeText(this, "Permissions is required", Toast.LENGTH_SHORT).show()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}