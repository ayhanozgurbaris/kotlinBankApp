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
import kotlinx.android.synthetic.main.activity_forget_password.*

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
            callForgetPasswordActivity()
        }

        val bannerOneKey = findViewById<CardView>(R.id.bannerone);
        bannerOneKey.setOnClickListener{
            callSocialActivity()
        }

        val bannerTwoKey = findViewById<CardView>(R.id.bannertwo);
        bannerTwoKey.setOnClickListener{
            callGameEpinActivity()
        }

        val infoButtonKey = findViewById<ImageButton>(R.id.info_button);
        infoButtonKey.setOnClickListener{
            callInfoButtonActivity()
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

    private fun callForgetPasswordActivity(){
        val Intent = Intent(this,ForgetPasswordActivity::class.java)
        startActivity(Intent)
    }


    private fun callGameEpinActivity(){
        val Intent = Intent(this,GameEpinActivity::class.java)
        startActivity(Intent)
    }

    private fun callSocialActivity(){
        val Intent = Intent(this,SocialAccountActivity::class.java)
        startActivity(Intent)
    }


    private fun callInfoButtonActivity(){
        val Intent = Intent(this,InfoButtonActivity::class.java)
        startActivity(Intent)
    }


}