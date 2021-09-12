package com.example.home11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edSquare = findViewById<EditText>(R.id.edSquare)
        val edCircle = findViewById<EditText>(R.id.edCircle)
        val edTriangle = findViewById<EditText>(R.id.edTriangle)
        val dlina2 = findViewById<EditText>(R.id.dlina2)
        val ugol = findViewById<EditText>(R.id.ugol)
        val krug = findViewById<TextView>(R.id.krug)
        val treug = findViewById<TextView>(R.id.treug)
        val kvadrat = findViewById<TextView>(R.id.kvadrat)
        val batSave = findViewById<Button>(R.id.batSave)

        batSave.setOnClickListener {
            treug.text = Triangle().med(
                edTriangle.text.toString(),
                ugol.text.toString(),
                dlina2.text.toString())
            kvadrat.text = Square().med(edSquare.text.toString())
            krug.text = Circle().med(edCircle.text.toString())
        }
    }
}
