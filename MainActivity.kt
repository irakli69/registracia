package com.example.registracia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var name: TextView
    private lateinit var lastName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (name.text.length < 3) {
            Toast.makeText(this, "use more than 3 characters in name", Toast.LENGTH_SHORT).show()
        }else Toast.makeText(this, "successful", Toast.LENGTH_SHORT).show()

        button = findViewById(R.id.button)

        button.setOnClickListener {
            Toast.makeText(this, "successful", Toast.LENGTH_SHORT).show()
        }
    }
}