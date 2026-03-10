package com.example.helloandroid

import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "Hello Android!"
        textView.textSize = 24f
        textView.gravity = Gravity.CENTER

        setContentView(textView)
    }
}