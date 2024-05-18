package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val nextbutton2 = findViewById<FloatingActionButton>(R.id.cardback)
        nextbutton2.setOnClickListener {
            val intent1 = Intent(this, dash_board::class.java)
            startActivity(intent1)
            finish()
        }
    }
}