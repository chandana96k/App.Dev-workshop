package com.chandana.workshop_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstScreen : AppCompatActivity() {

    lateinit var btnClickHere : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        btnClickHere = findViewById(R.id.btnClickHere)
        btnClickHere.setOnClickListener {
            val intent = Intent(this@FirstScreen, MainActivity::class.java)
            startActivity(intent)
        }
    }
}