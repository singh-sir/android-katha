package com.myworkmanager

import android.os.Bundle
import android.util.Log
import android.widget.Button

class ThirdActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        Log.i("ThirdActivity", "launched")

        findViewById<Button>(R.id.cancel_work_button)?.setOnClickListener {
            //cancel on going work anytime
            WorkHandler.cancelWork()
        }
    }
}