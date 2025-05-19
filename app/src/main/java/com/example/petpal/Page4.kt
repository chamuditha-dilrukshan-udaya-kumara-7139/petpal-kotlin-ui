package com.example.petpal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page4)

        val exploreButton: Button = findViewById(R.id.nextBtn)

        exploreButton.setOnClickListener {
            val intent = Intent(this@Page4, Page5::class.java)
            startActivity(intent)


        }
    }
}
