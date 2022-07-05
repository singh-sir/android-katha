package com.onactivityresultblog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class FirstActivity : AppCompatActivity() {
    private lateinit var activityResultLauncher: ActivityResultLauncher<Intent>

    companion object {
        val resultCode1 by lazy { 1200 }
        val resultCode2 by lazy { 1300 }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityResultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                // There are no request codes
                if (result.resultCode == resultCode1 && result.data != null) {

                    findViewById<TextView>(R.id.tv_welcome_text).text =
                        result.data!!.getStringExtra("text")

                } else if (result.resultCode == resultCode2 && result.data != null) {
                    findViewById<TextView>(R.id.tv_welcome_text).text =
                        result.data!!.getStringExtra("text")
                }
            }

        findViewById<TextView>(R.id.btn_open_second_screen).setOnClickListener {
            openSecondActivityForResult()
        }

        findViewById<TextView>(R.id.btn_open_third_screen).setOnClickListener {
            openThirdActivityForResult()
        }
    }

    fun openSecondActivityForResult() {
        val intent = Intent(this, SecondActivity::class.java)
        activityResultLauncher.launch(intent)
    }

    fun openThirdActivityForResult() {
        val intent = Intent(this, ThirdActivity::class.java)
        activityResultLauncher.launch(intent)
    }
}