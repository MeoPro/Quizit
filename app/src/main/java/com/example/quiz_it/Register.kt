package com.example.quiz_it

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_register.*
import com.example.quiz_it.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.ArrayList

class Register : AppCompatActivity() {
    private lateinit var binding : ActivityRegisterBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var database : FirebaseDatabase
    private lateinit var reference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        database = FirebaseDatabase.getInstance()
        reference = database.getReference("email")
        firebaseAuth = FirebaseAuth.getInstance()
        binding.kelogin.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        binding.register.setOnClickListener{
            val username = binding.username.text.toString().trim()
            val email = binding.emailrr.text.toString().trim()
            val password = binding.paswordrr.text.toString().trim()
            val cpassword = binding.paswordrrr.text.toString().trim()

            if (email.isNotEmpty()&& username.isNotEmpty() && password.isNotEmpty() && cpassword.isNotEmpty()){

                if (password == cpassword){
                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener{
                        if (it.isSuccessful){
                            val intent = Intent(this, Login::class.java)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this, "Email sudah digunakan", Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    Toast.makeText(this, "Confirm password anda salah", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Isi data terlebih dahulu", Toast.LENGTH_SHORT).show()
            }

        }
        senddata()
    }
    private fun senddata(){



    }

}

