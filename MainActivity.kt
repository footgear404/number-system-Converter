package com.example.company.myapplication

import android.os.Bundle
import android.text.Editable
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        convertButton.setOnClickListener{
            val inputNum = number.text.toString().toIntOrNull() ?:0
            val systemNum = systemOfCalculus.text.toString().toIntOrNull() ?:0
            convertResult.text = if (inputNum > 0 && systemNum in 2..36) inputNum.toString(systemNum)
            else "Error"
        }
    }
}


