package com.example.onucsifiruc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val loginKey = findViewById<Button>(R.id.loginId);
        loginKey.setOnClickListener{

            val Intent = Intent(this,GirisYapildi::class.java)
            startActivity(Intent)
        }




        val forgetPasswordKey = findViewById<Button>(R.id.forgetPasswordId);
        forgetPasswordKey.setOnClickListener{

            val Intent = Intent(this,EmptyActivity::class.java)
            startActivity(Intent)
        }



    }
}