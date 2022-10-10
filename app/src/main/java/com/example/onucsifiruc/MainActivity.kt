package com.example.onucsifiruc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val loginKey = findViewById<Button>(R.id.loginId);
        loginKey.setOnClickListener{

            callPasswordAtSecondPage()
        }



        val forgetPasswordKey = findViewById<Button>(R.id.forgetPasswordId);
        forgetPasswordKey.setOnClickListener{
            val Intent = Intent(this,EmptyActivity::class.java)
            startActivity(Intent)
        }



        val hesabinlaNelerYapabilirsinKey = findViewById<Button>(R.id.hesabınlaNelerYapabilirsin);
        hesabinlaNelerYapabilirsinKey.setOnClickListener{
            val Intent = Intent(this,EmptyActivity::class.java)
            startActivity(Intent)
        }



    }

    private fun callPasswordAtSecondPage(){
        val editText = findViewById<EditText>(R.id.passwordId);
        val message = editText.text.toString()

        val intent = Intent(this,GirisYapildi::class.java).also {
            it.putExtra("EXTRA_MESSAGE",message)
            startActivity(it)
        }
    }





}