package com.example.quiz_it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quiz_it.databinding.ActivityResultFlagBinding

class ResultFlag : AppCompatActivity() {
    private lateinit var binding: ActivityResultFlagBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityResultFlagBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        binding.tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"

        binding.button4.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@ResultFlag, Pilihan::class.java)
            startActivity(intent)
        }
        )
    }
}