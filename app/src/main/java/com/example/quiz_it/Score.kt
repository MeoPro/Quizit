package com.example.quiz_it

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_score)
    }
}