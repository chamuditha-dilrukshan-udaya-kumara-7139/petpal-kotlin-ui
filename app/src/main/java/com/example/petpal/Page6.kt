package com.example.petpal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page6)

        val exploreButton: Button = findViewById(R.id.btnLogin)

        exploreButton.setOnClickListener {
            val intent = Intent(this@Page6, Page2::class.java)
            startActivity(intent)


        }
    }
}
