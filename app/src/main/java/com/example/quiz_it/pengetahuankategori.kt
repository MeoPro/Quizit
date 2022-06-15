package com.example.quiz_it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quiz_it.databinding.ActivityPengetahuankategoriBinding

class pengetahuankategori : AppCompatActivity() {
    private lateinit var binding: ActivityPengetahuankategoriBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengetahuankategoriBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.bendera.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@pengetahuankategori, Bendera::class.java)
            startActivity(intent)
        }
        )
        binding.binatang.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@pengetahuankategori, Binatang::class.java)
            startActivity(intent)
        }
        )
    }
}