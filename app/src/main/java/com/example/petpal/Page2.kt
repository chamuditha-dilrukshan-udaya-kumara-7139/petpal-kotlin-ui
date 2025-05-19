package com.example.petpal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page2)

        val exploreButton: Button = findViewById(R.id.nextButton)

        exploreButton.setOnClickListener {
            val intent = Intent(this@Page2, Page3::class.java)
            startActivity(intent)


        }
    }
}
