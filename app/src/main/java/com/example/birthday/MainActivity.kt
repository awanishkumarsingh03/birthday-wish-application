package com.example.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener(){
            buttonClicked()
        }
    }
    fun buttonClicked(){
     val intent : Intent = Intent(this,CardGeneration::class.java)
        val text = findViewById<EditText>(R.id.name)
        val name = text.editableText.toString()
     intent.putExtra("message", name)
     startActivity(intent)
    }
}