package com.example.zia

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signUpButton: Button = findViewById(R.id.signUpButton)
        signUpButton.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }

//        val signInButton1: Button = findViewById(R.id.signInButton)
//        signInButton1.setOnClickListener {
//            startActivity(Intent(this, SignInActivity::class.java))
//        }
    }
}
