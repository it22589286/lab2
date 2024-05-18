package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class nike : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nike)

        val nextbutton8 = findViewById<Button>(R.id.cartnike)
        nextbutton8.setOnClickListener {
            val intent4 = Intent(this, cart::class.java)
            startActivity(intent4)
            finish()
        }

        val nextbutton3 = findViewById<FloatingActionButton>(R.id.actionnike)
        nextbutton3.setOnClickListener {
            val intent1 = Intent(this, dash_board::class.java)
            startActivity(intent1)
            finish()
        }

        val nextbutton9 = findViewById<Button>(R.id.nikebuy)
        nextbutton9.setOnClickListener {
            val intent4 = Intent(this, payment::class.java)
            startActivity(intent4)
            finish()
        }
    }
}