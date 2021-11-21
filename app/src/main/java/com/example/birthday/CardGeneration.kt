package com.example.birthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CardGeneration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_generation)
        cardGeneration()
    }

    fun cardGeneration(){
       val name =  intent.getStringExtra("message")
        val text = findViewById<TextView>(R.id.message)
    text.text = "Happy Birthday " + name.toString()
    }
}