package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val nextbutton1 = findViewById<Button>(R.id.mbtnsignUp)
        nextbutton1.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
            finish()
        }
        val nextbutton2 = findViewById<Button>(R.id.lbtnSignin)
        nextbutton2.setOnClickListener {
            val intent1 = Intent(this, dash_board::class.java)
            startActivity(intent1)
            finish()
        }
        val nextbutton3 = findViewById<FloatingActionButton>(R.id.floatingActionButton3)
        nextbutton3.setOnClickListener {
            val intent1 = Intent(this, signup::class.java)
            startActivity(intent1)
            finish()
        }
    }
}