package com.example.coinstampz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_contact.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_signup.*

class Contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        btnsub.setOnClickListener {

            if(edname.text.isNotEmpty() || edmsg.text.isNotEmpty()){
                    btnsub.setOnClickListener{
                        val intent = Intent(this, Profileex::class.java);
                        startActivity(intent);
                        Toast.makeText(this,"Your Query has been submitted", Toast.LENGTH_LONG).show()
                    }
                }else{
                Toast.makeText(this,"Input Required", Toast.LENGTH_LONG).show()
            }
        }
    }
}