package com.example.quiz_it


import android.content.Intent
import android.content.pm.PackageManager
import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quiz_it.databinding.ActivityMenuBinding



class Menu : AppCompatActivity() {
    private lateinit var viewBind:ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBind = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(viewBind.root)
        supportActionBar?.hide()
    }

    private fun listener(){
        viewBind.Loginbutton.setOnClickListener {
            val myIntent = Intent(this, Login::class.java)
            startActivity(myIntent)
        }
    }
}