package com.example.coinstampz

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_profileex.*

class Profileex : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profileex)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "2 Messages !!", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        back.setOnClickListener{
            val intent = Intent(this, Home::class.java);
            startActivity(intent);
        }
        noti.setOnClickListener {
            Toast.makeText(this,"No Notifications",Toast.LENGTH_LONG).show()
        }

    }
}
