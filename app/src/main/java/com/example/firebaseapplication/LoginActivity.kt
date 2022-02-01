package com.example.firebaseapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*


class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth=Firebase.auth

        idButtonLogin.setOnClickListener {

            val email=loginEmail.text.toString()
            val password=loginPassword.text.toString()

            if(checkEmpty(email,password)){

            }
        }

        idButtonRegister.setOnClickListener {

        }

    }

    private fun checkEmpty(email: String, password: String): Boolean {
        return email.isNotEmpty() && password.isNotEmpty()
    }
}