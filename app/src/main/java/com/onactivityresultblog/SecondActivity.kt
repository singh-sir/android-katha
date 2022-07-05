package com.onactivityresultblog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.btn_go_back).setOnClickListener {
            val intent = Intent()
            intent.putExtra("text", "Back from second screen")
            setResult(FirstActivity.resultCode1, intent)
            finish()
        }
    }
}