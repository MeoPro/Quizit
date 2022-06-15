package com.example.quiz_it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quiz_it.databinding.ActivityCategoryBinding

class Category : AppCompatActivity() {
    private lateinit var binding: ActivityCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kategoriQ.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Category, Pilihan::class.java)
            startActivity(intent)
        }
        )
        binding.matematikaa.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Category, Matematika::class.java)
            startActivity(intent)
        }
        )
        binding.matematika.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Category, Matematika::class.java)
            startActivity(intent)
        }
        )
        binding.pkn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Category, Pkn::class.java)
            startActivity(intent)
        }
        )
        binding.pknn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Category, Pkn::class.java)
            startActivity(intent)
        }
        )
        binding.ipa.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Category, Ipa::class.java)
            startActivity(intent)
        }
        )
        binding.ipaa.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Category, Ipa::class.java)
            startActivity(intent)
        }
        )
        binding.bindo.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Category, Bindo::class.java)
            startActivity(intent)
        }
        )
        binding.bindoo.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Category, Bindo::class.java)
            startActivity(intent)
        }
        )
    }
}