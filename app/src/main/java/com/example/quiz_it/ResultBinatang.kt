package com.example.quiz_it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        binding.button6.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@ResultBinatang, Pilihan::class.java)
            startActivity(intent)
        }
        )
    }
}