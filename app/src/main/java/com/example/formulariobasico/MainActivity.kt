package com.example.formulariobasico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private  lateinit var nameEditText: EditText
    private  lateinit var resultTextView: TextView
    private  lateinit var greetingButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    private  fun bind(){
        nameEditText =  findViewById( R.id.edit_text_view)
        resultTextView = findViewById(R.id.greeting_text_view)
        greetingButton = findViewById(R.id.action_greeet)
    }
}