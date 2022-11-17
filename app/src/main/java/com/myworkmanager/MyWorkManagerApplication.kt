package com.myworkmanager

import android.app.Application

class MyWorkManagerApplication : Application() {

    init {
        appInstance = this
    }

    companion object {
        lateinit var appInstance: MyWorkManagerApplication
    }

    override fun onCreate() {
        super.onCreate()

        //start work on application start
        //or you can start work as per your need
        //e.g., from MainActivity, SplashActivity, via user action, etc.
        WorkHandler.createWork(WORK_DELAY_IN_MIN)
    }
}