package com.example.petpal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page1)

        // Find the button by ID
        val exploreButton: Button = findViewById(R.id.exploreBtn)

        // Set click listener to navigate to Page2
        exploreButton.setOnClickListener {
            val intent = Intent(this@Page1, Page7::class.java)
            startActivity(intent)
        }
    }
}
