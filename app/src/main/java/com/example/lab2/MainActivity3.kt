package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.example.lab2.R.id.nxtbtn2
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val animation2 = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        val logo =findViewById(R.id.imageView3) as ImageView
        logo.startAnimation(animation2)

        val nextbutton1 = findViewById<Button>(R.id.nxtbtn2)
        nextbutton1.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        val nextbutton2 = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        nextbutton2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}