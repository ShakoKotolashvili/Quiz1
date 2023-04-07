package com.example.a1st

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var resulttv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val name = intent.getStringExtra("NAME")
        val email = intent.getStringExtra("EMAIL")
        val password = intent.getStringExtra("PASSWORD")
        val phone = intent.getStringExtra("PHONE")
        resulttv = findViewById(R.id.tvResult)
        resulttv.text=name+"\n"+email+"\n"+password+"\n"+phone

    }
}