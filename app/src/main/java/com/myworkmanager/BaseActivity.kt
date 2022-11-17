package com.myworkmanager

import androidx.appcompat.app.AppCompatActivity
import java.lang.ref.WeakReference

open class BaseActivity : AppCompatActivity() {
    companion object {
        var currentActivityInstance: WeakReference<AppCompatActivity?> =
            WeakReference<AppCompatActivity?>(null)
    }

    override fun onResume() {
        super.onResume()

        //keep current activity instance and use to perform any UI related task on work completion
        currentActivityInstance = WeakReference(this)
    }
}