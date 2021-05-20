package com.example.coinstampz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Search.setOnClickListener{
            val intent = Intent(this, Webview::class.java);
            startActivity(intent);
        }
        coinspage.setOnClickListener{
            val intent = Intent(this, Coinspage::class.java);
            startActivity(intent);
        }
        profile.setOnClickListener{
            val intent = Intent(this, Profileex::class.java);
            startActivity(intent);
        }
        contact.setOnClickListener{
            val intent = Intent(this, Contact::class.java);
            startActivity(intent);
        }
    }
}