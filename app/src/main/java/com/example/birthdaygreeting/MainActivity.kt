package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun createbirthdayCard(view: View) {
        //Here we are converting to text then to string else it would give a garbage value
        val name=findViewById<EditText>(R.id.edittext).text.toString()
        //Intent is used to send the data to another activity
        val intent = Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)

    }
}