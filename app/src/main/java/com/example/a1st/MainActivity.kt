package com.example.a1st

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var registerButton: Button
    private lateinit var nameEditText: EditText;
    private lateinit var emailEditText: EditText;
    private lateinit var passwordEditText: EditText;
    private lateinit var phoneEditText: EditText;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        registerButton = findViewById(R.id.register_button)
        nameEditText = findViewById(R.id.tvName);
        emailEditText = findViewById(R.id.tvEmail)
        passwordEditText = findViewById(R.id.tvPassword)
        phoneEditText = findViewById(R.id.tvPhone);
        registerButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = nameEditText.text.toString()
            val password = nameEditText.text.toString()
            val phone = nameEditText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", email)
            intent.putExtra("PASSWORD", password)
            intent.putExtra("PHONE", phone)
            startActivity(intent)
        }


    }
}