package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nextbutton= findViewById<Button>(R.id.nxtbtn1)
        nextbutton.setOnClickListener{
            val Intent= Intent(this,MainActivity3::class.java)
            startActivity(Intent)
            finish()

        }
    }
}