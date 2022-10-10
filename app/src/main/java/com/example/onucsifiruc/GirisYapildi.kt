package com.example.onucsifiruc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GirisYapildi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giris_yapildi)

        val message = intent.getStringExtra("EXTRA_MESSAGE")

        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}