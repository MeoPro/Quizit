package com.example.quiz_it


import android.content.Intent
import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quiz_it.databinding.ActivityMenuBinding



class Menu : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.Registerbutton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Menu, Register::class.java)
            startActivity(intent)
        }
        )
        binding.Loginbutton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Menu, Login::class.java)
            startActivity(intent)
        }
        )

    }

}