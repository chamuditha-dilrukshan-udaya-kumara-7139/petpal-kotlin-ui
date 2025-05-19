package com.example.petpal

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Page7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page7)

        val tvLogin: TextView = findViewById(R.id.tvLogin)

        tvLogin.setOnClickListener {
            val intent = Intent(this@Page7, Page6::class.java)
            startActivity(intent)
        }



    }
    }

