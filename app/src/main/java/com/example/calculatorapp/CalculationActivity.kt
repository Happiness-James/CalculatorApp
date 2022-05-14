package com.example.calculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculationActivity : AppCompatActivity() {
    lateinit var btnadd: Button
    lateinit var btnsubtract:Button
    lateinit var btnmultiply:Button
    lateinit var btnmodulus:Button
    lateinit var etInput1: EditText
    lateinit var etInput2: EditText
    lateinit var tvresult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculation)

        btnadd = findViewById(R.id.btnadd)
        btnsubtract = findViewById(R.id.btnsubtract)
        btnmultiply  = findViewById(R.id.btnmultiply)
        btnmodulus = findViewById(R.id.btnmodulus)
        etInput1 = findViewById(R.id.etInput1)
        etInput2 = findViewById(R.id.etInput2)
        tvresult = findViewById(R.id.tvresult)

        btnadd.setOnClickListener {
            var input1 = etInput1.text.toString().toDouble()
            var input2 = etInput2.text.toString().toDouble()
            addition(input1,input2)
        }
        btnsubtract.setOnClickListener {
            var input1 = etInput1.text.toString().toDouble()
            var input2 = etInput2.text.toString().toDouble()
            subtraction(input1,input2)
        }
        btnmultiply.setOnClickListener {
            var input1 = etInput1.text.toString().toDouble()
            var input2 = etInput2.text.toString().toDouble()
            multiplication(input1,input2)

        }
        btnmodulus.setOnClickListener {
            var input1 = etInput1.text.toString().toDouble()
            var input2 = etInput2.text.toString().toDouble()
            module(input1,input2)

        }
    }
    fun addition(input1:Double, input2: Double){
        var addition = input1 + input2
        tvresult.text = addition.toString()
    }
    fun subtraction(input1: Double, input2: Double){
        var sub = input1 - input2
        tvresult.text = sub.toString()
    }
    fun multiplication(input1: Double, input2: Double){
        var mult = input1 * input2
        tvresult.text = mult.toString()
    }
    fun module(input1: Double, input2: Double){
        var mode = input1 % input2
        tvresult.text = mode.toString()
    }

}