package com.mubarak.locateu.permission

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.Settings

object LaunchSettings {
    fun launchSettings(context: Context){
        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
            data = Uri.parse("package:${context.packageName}")
        }
        context.startActivity(intent)
    }
}