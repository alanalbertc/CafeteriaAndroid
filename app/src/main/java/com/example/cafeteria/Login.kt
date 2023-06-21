package com.example.cafeteria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button=findViewById(R.id.btnSignIn)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        button2=findViewById(R.id.btnCreateAccount2)
        button2.setOnClickListener {
            val intent = Intent(this, CrearCliente::class.java)
            startActivity(intent)
        }
    }
}