package com.example.a305_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextClock

class Main3Activity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val n3button = findViewById<Button>(R.id.N3)
        n3button.setOnClickListener()
        {
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }

        val txtClock = findViewById<TextClock>(R.id.txtClok)

    }
}
