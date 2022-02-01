package com.example.firebaseapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        auth=Firebase.auth

        registerButton.setOnClickListener {

            val email= registerEmail.text.toString()
            val password=registerPassword.text.toString()
            val repeatPassword=registerRepeatPassword.text.toString()

            if(password.equals(repeatPassword) && checkEmpty(email,password,repeatPassword)){
                register(email,password)
            }
        }

        registerGoLogin.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }



    }

    private fun register(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this) {task ->
                if(task.isSuccessful){
                    startActivity(Intent(this,MainActivity::class.java))
                    finish()
                }else{
                    Toast.makeText(applicationContext, "Register failed", Toast.LENGTH_SHORT).show()
                }
            }
    }

    private fun checkEmpty(email: String, password: String, repeatPassword: String): Boolean {
    return email.isNotEmpty() && password.isNotEmpty() && repeatPassword.isNotEmpty()
    }
}