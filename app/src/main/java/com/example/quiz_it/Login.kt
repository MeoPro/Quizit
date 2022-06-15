package com.example.quiz_it

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_login.*
import android.widget.Toast
import com.example.quiz_it.objects.UserStorage
import com.example.quiz_it.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.keregis.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Login, Register::class.java)
            startActivity(intent)
        }
        )
    login()
    signUp()
    profile()

    binding.button.setOnClickListener {
        val email = emaill.editText?.text.toString().trim()
        val password = passwordl.editText?.text.toString().trim()

        var user = UserStorage.check_acc(email, password)
        if (user != null) {
            val log = Intent(this@Login, Pilihan::class.java).apply {
                putExtra("User", user)
            }
            startActivity(log)
            finish()
        } else {
            Toast.makeText(this@Login, "You Don't Have an Account", Toast.LENGTH_SHORT)
                .show()
        }


    }
}


private fun login(){
    var cekEmail = false
    var cekPass = false
    emaill.editText?.addTextChangedListener {
        var email = emaill.editText?.text.toString()
        cekEmail = email != ""
        if (cekEmail && cekPass){
            button.isClickable = true
            button.isEnabled = true
            button.alpha = 1f
        }else{
            button.isClickable = false
            button.isEnabled = false
            button.alpha = .5f
        }
    }
    passwordl.editText?.addTextChangedListener {
        var pass = passwordl.editText?.text.toString()
        cekPass = pass != ""
        if (cekEmail && cekPass){
            button.isClickable = true
            button.isEnabled = true
            button.alpha = 1f
        }else{
            button.isClickable = false
            button.isEnabled = false
            button.alpha = .5f
        }
    }
}



private fun signUp(){
    keregis.setOnClickListener {
        val sign = Intent(this@Login, Register::class.java )
        startActivity(sign)
    }
}

private fun profile() {
    button.setOnClickListener {
        val profile = Intent(this@Login, Pilihan::class.java)
        startActivity(profile)
    }
}
}
}