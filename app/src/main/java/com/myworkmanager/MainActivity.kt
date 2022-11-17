package com.myworkmanager

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MainActivity", "launched")

        findViewById<Button>(R.id.go_to_next_screen_button)?.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        findViewById<Button>(R.id.cancel_work_button)?.setOnClickListener {
            //cancel on going work anytime
            WorkHandler.cancelWork()
        }
    }
}