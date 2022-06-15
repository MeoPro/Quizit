package com.example.quiz_it

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz_it.databinding.ActivityResultMBinding

class ResultM : AppCompatActivity() {
    private lateinit var binding: ActivityResultMBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityResultMBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val totalQuestions = intent.getIntExtra(ConstanM.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(ConstanM.CORRECT_ANSWERS, 0)

        binding.tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"
    }
}