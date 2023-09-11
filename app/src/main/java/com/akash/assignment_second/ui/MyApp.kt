package com.akash.assignment_second.ui

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class MyApp : Application() {
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate() {
        instance = this
        sharedPreferences = applicationContext.getSharedPreferences("ApplicationStorage", Context.MODE_PRIVATE)
        super.onCreate()
    }
    companion object{
        lateinit var instance : Application
    }
}