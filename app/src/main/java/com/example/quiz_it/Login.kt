package com.example.quiz_it

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import androidx.core.widget.addTextChangedListener
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.example.quiz_it.databinding.ActivityLoginBinding
import com.example.quiz_it.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var actionBar: ActionBar
    private lateinit var progressDialog: ProgressDialog
    private lateinit var firebaseAuth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        firebaseAuth = FirebaseAuth.getInstance()

       binding.keregis.setOnClickListener{
           val intent = Intent(this, Register::class.java)
           startActivity(intent)
       }
        binding.buttonlogin.setOnClickListener{

            val emaill = binding.emailll.text.toString()
            val passwordl = binding.passwordll.text.toString()


            if (emaill.isNotEmpty()&& passwordl.isNotEmpty()){

                    firebaseAuth.signInWithEmailAndPassword(emaill, passwordl).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val intent = Intent(this, Pilihan::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }

            }else{
                Toast.makeText(this, "Isi form terlebih dahulu", Toast.LENGTH_SHORT).show()
            }
        }

    }


}