package com.example.quiz_it

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz_it.databinding.ActivityResultBinatangBinding

class ResultBinatang : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinatangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinatangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val totalQuestions = intent.getIntExtra(ConstanN.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(ConstanN.CORRECT_ANSWERS, 0)

        binding.tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"
    }
}