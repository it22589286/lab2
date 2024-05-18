package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val nextbutton1 = findViewById<ImageButton>(R.id.c_btnHome)
        nextbutton1.setOnClickListener {
            val intent = Intent(this, dash_board::class.java)
            startActivity(intent)
            finish()
        }
        val nextbutton2 = findViewById<ImageButton>(R.id.btnCart)
        nextbutton2.setOnClickListener {
            val intent = Intent(this, cart::class.java)
            startActivity(intent)
            finish()
        }

    }

}