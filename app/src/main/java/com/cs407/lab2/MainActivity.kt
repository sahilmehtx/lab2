package com.cs407.lab2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val text269 = findViewById<EditText>(R.id.text269)
        val button269 = findViewById<Button>(R.id.button269)
        button269.setOnClickListener {
            // Log.i("INFO", "Button Clicker");
            val userInput = text269.text.toString()
            // Toast.makeText(this, userInput, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CalculatorActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", userInput)
            startActivity(intent)

        }

    }
}