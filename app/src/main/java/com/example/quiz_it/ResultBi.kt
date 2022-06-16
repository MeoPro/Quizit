package com.example.quiz_it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        binding.button.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@ResultBi, Pilihan::class.java)
            startActivity(intent)
        }
        )
    }
}