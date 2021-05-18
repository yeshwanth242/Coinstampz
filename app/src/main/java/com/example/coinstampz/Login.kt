package com.example.coinstampz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_signup.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {

            if(edUsername.text.trim().isNotEmpty() || edPassword.text.trim().isNotEmpty()){
                btnLogin.setOnClickListener{
                    val intent = Intent(this, Home::class.java);
                    startActivity(intent);
                    Toast.makeText(this,"Login Successful", Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this,"Input required",Toast.LENGTH_LONG).show()

            }
        }
        tvRegister.setOnClickListener {
            val intent = Intent(this, Signup::class.java);
            startActivity(intent);
        }
    }
}