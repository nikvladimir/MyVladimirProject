package com.example.myvladimirproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val receivedString = intent.getStringExtra(KEY_STRING)
        val receivedInt = intent.getIntExtra(KEY_INT, 0)
        val receivedBool = intent.getBooleanExtra(KEY_BOOL, false)

        val secondTextView: TextView = findViewById(R.id.second_activity_text_view)
        secondTextView.text = "I got next data from second activity\n" +
                "a strind: $receivedString\n" +
                "an int: $receivedInt\n" +
                "a bool: $receivedBool"
    }

    companion object {
        const val KEY_STRING = "stringKey"
        const val KEY_INT = "intKey"
        const val KEY_BOOL = "boolKey"
    }
}