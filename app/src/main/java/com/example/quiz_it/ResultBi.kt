package com.example.quiz_it

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz_it.databinding.ActivityResultBiBinding

class ResultBi : AppCompatActivity() {
    private lateinit var binding: ActivityResultBiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityResultBiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val totalQuestions = intent.getIntExtra(ConstanB.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(ConstanB.CORRECT_ANSWERS, 0)

        binding.tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"
    }
}