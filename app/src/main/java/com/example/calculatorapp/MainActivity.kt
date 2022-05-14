package com.example.calculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnOpenCalculator: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOpenCalculator = findViewById(R.id.btncalculation)
        btnOpenCalculator.setOnClickListener {
            val intent = Intent(this, CalculationActivity::class.java)
            startActivity(intent)
        }
    }
}