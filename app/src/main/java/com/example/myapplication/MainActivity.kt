package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val wrds = findViewById<TextView>(R.id.words)
        var clicked = 0

        btn.setOnClickListener(){
            clicked = clicked + 1

            wrds.text = clicked.toString()


            Toast.makeText(this, "ALHAMDULILLAH", Toast.LENGTH_SHORT).show()
        }
    }
}