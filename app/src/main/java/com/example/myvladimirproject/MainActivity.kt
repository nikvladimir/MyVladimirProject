package com.example.myvladimirproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private fun moveToNextScreen() {
        val intent = Intent( this, SecondActivity::class.java)

        val sendString = "Some text"
        val sendInt = 5
        val sendBool = true

        intent.putExtra(SecondActivity.KEY_STRING, sendString)
        intent.putExtra(SecondActivity.KEY_INT, sendInt)
        intent.putExtra(SecondActivity.KEY_BOOL, sendBool)

        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

//        val valTextView: TextView = findViewById(R.id.first_activity_text_view)
//        valTextView.setOnClickListener { moveToNextScreen() }

    }
}