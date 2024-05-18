package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class dash_board : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)


        val nextbutton2 = findViewById<ImageButton>(R.id.btnCart)
        nextbutton2.setOnClickListener {
            val intent4 = Intent(this, cart::class.java)
            startActivity(intent4)
            finish()
        }
        val nextbutton4 = findViewById<ImageButton>(R.id.c_btnProfile)
        nextbutton4.setOnClickListener {
            val intent4 = Intent(this, settings::class.java)
            startActivity(intent4)
            finish()
        }

        val nextbutton5 = findViewById<ImageButton>(R.id.btnnike)
        nextbutton5.setOnClickListener {
            val intent4 = Intent(this, nike::class.java)
            startActivity(intent4)
            finish()
        }
        val nextbutton7 = findViewById<ImageButton>(R.id.btnaddidas)
        nextbutton7.setOnClickListener {
            val intent4 = Intent(this, addidas::class.java)
            startActivity(intent4)
            finish()
        }
        val nextbutton6 = findViewById<ImageButton>(R.id.btnjordan)
        nextbutton6.setOnClickListener {
            val intent4 = Intent(this, air_jordan::class.java)
            startActivity(intent4)
            finish()
        }

        val nextbutton8 = findViewById<ImageButton>(R.id.btnpuma)
        nextbutton8.setOnClickListener {
            val intent4 = Intent(this, puma::class.java)
            startActivity(intent4)
            finish()
        }




    }



}