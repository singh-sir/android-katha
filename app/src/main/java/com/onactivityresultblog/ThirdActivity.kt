package com.onactivityresultblog

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        findViewById<Button>(R.id.btn_go_back).setOnClickListener {
            val intent = Intent()
            intent.putExtra("text", "Back from third screen")
            setResult(FirstActivity.resultCode2, intent)
            finish()
        }
    }
}