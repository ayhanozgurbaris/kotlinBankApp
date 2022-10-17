//girilen şifreyi signedIn activity'e taşır.

package com.example.onucsifiruc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignedIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signed_in)

        val message = intent.getStringExtra("EXTRA_MESSAGE")

        findViewById<TextView>(R.id.secondPagePasswordtextView).apply {
            text = message
        }
    }
}