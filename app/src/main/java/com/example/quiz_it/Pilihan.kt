package com.example.quiz_it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quiz_it.databinding.ActivityMenuBinding
import com.example.quiz_it.databinding.ActivityPilihanBinding

class Pilihan : AppCompatActivity() {
    private lateinit var binding: ActivityPilihanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPilihanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


//        binding.imageView2.setOnClickListener(View.OnClickListener {
//            val intent = Intent(this@Pilihan, Profile::class.java)
//            startActivity(intent)
//        }
//        )
//        binding.textView4.setOnClickListener(View.OnClickListener {
//            val intent = Intent(this@Pilihan, Profile::class.java)
//            startActivity(intent)
//        }
//        )
        binding.sekolah.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Pilihan, Category::class.java)
            startActivity(intent)
        }
        )
        binding.pengetahuan.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Pilihan, pengetahuankategori::class.java)
            startActivity(intent)
        }
        )
    }
}