package com.example.quiz_it

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz_it.databinding.ActivityResultPBinding

class ResultP : AppCompatActivity() {
    private lateinit var binding: ActivityResultPBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityResultPBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val totalQuestions = intent.getIntExtra(ConstanP.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(ConstanP.CORRECT_ANSWERS, 0)

        binding.tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"
    }
}