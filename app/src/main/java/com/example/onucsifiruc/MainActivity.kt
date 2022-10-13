package com.example.onucsifiruc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val loginKey = findViewById<Button>(R.id.loginId);
        loginKey.setOnClickListener{
            callPasswordAtSecondPage()
        }



        val forgetPasswordKey = findViewById<TextView>(R.id.forgetPasswordId);
        forgetPasswordKey.setOnClickListener{
            callEmptyActivity()
        }

        val bannerOneKey = findViewById<CardView>(R.id.bannerone);
        bannerOneKey.setOnClickListener{
            callEmptyActivity()
        }

        val bannerTwoKey = findViewById<CardView>(R.id.bannertwo);
        bannerTwoKey.setOnClickListener{
            callEmptyActivity()
        }

        val infoButtonKey = findViewById<ImageButton>(R.id.info_button);
        infoButtonKey.setOnClickListener{
            callEmptyActivity()
        }


        val hesabinlaNelerYapabilirsinKey = findViewById<TextView>(R.id.hesabınlaNelerYapabilirsin);
        hesabinlaNelerYapabilirsinKey.setOnClickListener{
            callEmptyActivity()
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


    private fun callEmptyActivity(){
        val Intent = Intent(this,EmptyActivity::class.java)
        startActivity(Intent)
    }


}