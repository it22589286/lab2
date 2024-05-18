package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class air_jordan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_air_jordan)

        val nextbutton8 = findViewById<Button>(R.id.cartjordan)
        nextbutton8.setOnClickListener {
            val intent4 = Intent(this, cart::class.java)
            startActivity(intent4)
            finish()
        }

        val nextbutton3 = findViewById<FloatingActionButton>(R.id.actionjordan)
        nextbutton3.setOnClickListener {
            val intent1 = Intent(this, dash_board::class.java)
            startActivity(intent1)
            finish()
        }

        val nextbutton9 = findViewById<Button>(R.id.jordanbuy)
        nextbutton9.setOnClickListener {
            val intent4 = Intent(this, payment::class.java)
            startActivity(intent4)
            finish()
        }
    }
}