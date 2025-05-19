package com.example.petpal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page3)

        val exploreButton: Button = findViewById(R.id.nextBtn)

        exploreButton.setOnClickListener {
            val intent = Intent(this@Page3, Page4::class.java)
            startActivity(intent)


        }
    }
}
