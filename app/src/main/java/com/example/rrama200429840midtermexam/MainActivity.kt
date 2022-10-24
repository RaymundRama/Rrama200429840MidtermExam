package com.example.rrama200429840midtermexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saveButton = findViewById(R.id.saveButton) as Button

        val decrement1 = findViewById(R.id.decrement1) as Button
        val decrement2 = findViewById(R.id.decrement2) as Button
        val decrement3 = findViewById(R.id.decrement3) as Button
        val decrement4 = findViewById(R.id.decrement4) as Button
        val decrement5 = findViewById(R.id.decrement5) as Button

        val increment1 = findViewById(R.id.increment1) as Button
        val increment2 = findViewById(R.id.increment2) as Button
        val increment3 = findViewById(R.id.increment3) as Button
        val increment4 = findViewById(R.id.increment4) as Button
        val increment5 = findViewById(R.id.increment5) as Button

        val editTextNumber = findViewById(R.id.editTextNumber) as EditText
        val editTextNumber2 = findViewById(R.id.editTextNumber2) as EditText
        val editTextNumber3 = findViewById(R.id.editTextNumber3) as EditText
        val editTextNumber4 = findViewById(R.id.editTextNumber4) as EditText
        val editTextNumber5 = findViewById(R.id.editTextNumber5) as EditText


    }
}