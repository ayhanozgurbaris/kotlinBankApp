package com.example.onucsifiruc
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

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
        val editText = findViewById<TextInputEditText>(R.id.ddwff);
        val message = editText.text.toString();

        val intent = Intent(this,SignedIn::class.java).also {
            it.putExtra("EXTRA_MESSAGE",message)
            startActivity(it)
        }
    }






    private fun callEmptyActivity(){
        val Intent = Intent(this,EmptyActivity::class.java)
        startActivity(Intent)
    }


}