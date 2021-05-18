package com.example.coinstampz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_signup.*

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btnRegister.setOnClickListener {

            if(editName.text.isNotEmpty() || editEmail.text.isNotEmpty() ){
                if (editCPassword.text != editPassword.text){
                    Toast.makeText(this,"Passwords doesn't match", Toast.LENGTH_SHORT).show()
                btnRegister.setOnClickListener{
                    val intent = Intent(this, Home::class.java);
                    startActivity(intent);
                    Toast.makeText(this,"Successfully Registered", Toast.LENGTH_LONG).show()
                }
            }}
            else{
                Toast.makeText(this,"Input Required", Toast.LENGTH_LONG).show()
            }
        }
        tvLogin.setOnClickListener{
            val intent = Intent(this, Login::class.java);
            startActivity(intent);
        }
    }
}