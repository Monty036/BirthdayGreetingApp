package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        //Getting the value of the entered text from the main activity
        val name=intent.getStringExtra(NAME_EXTRA)

        val textview = findViewById<TextView>(R.id.birthdayGreeting)
        textview.text="Happy Birthday \n$name!"
    }
}