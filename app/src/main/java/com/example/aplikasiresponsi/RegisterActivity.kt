package com.example.aplikasiresponsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnkembali = findViewById<ImageButton>(R.id.btnkembali)
        btnkembali.setOnClickListener{
            val Intent = Intent ( this,LoginActivity::class.java)
            startActivity(Intent)
        }
    }
}