package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val nextbutton2 = findViewById<ImageButton>(R.id.c_btnProfile)
        nextbutton2.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
            finish()
        }
        val nextbutton3 = findViewById<ImageButton>(R.id.c_btnHome)
        nextbutton3.setOnClickListener {
            val intent = Intent(this, dash_board::class.java)
            startActivity(intent)
            finish()
        }

        val nextbutton4 = findViewById<Button>(R.id.cartbuy)
        nextbutton4.setOnClickListener {
            val intent = Intent(this, payment::class.java)
            startActivity(intent)
            finish()
        }

    }
}