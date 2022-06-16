package com.example.quiz_it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quiz_it.databinding.ActivityResultIBinding

class ResultI : AppCompatActivity() {
    private lateinit var binding: ActivityResultIBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityResultIBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val totalQuestions = intent.getIntExtra(ConstansI.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(ConstansI.CORRECT_ANSWERS, 0)

        binding.tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"
        binding.button5.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@ResultI, Pilihan::class.java)
            startActivity(intent)
        }
        )
    }
}