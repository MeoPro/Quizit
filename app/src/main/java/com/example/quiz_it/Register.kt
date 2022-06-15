package com.example.quiz_it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_register.*
import java.util.ArrayList

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        signsign()
        Login()
    }
    private fun signsign(){
        var cekUsername = false
        var cekEmail = false
        var cekPass = false

       usernamer.editText?.addTextChangedListener {
            var username = usernamer.editText?.text.toString()
            cekUsername = username != ""
            if (cekEmail && cekPass && cekUsername){
                register.isClickable = true
                register.isEnabled = true
                register.alpha = 1f
            }else{
                register.isClickable = false
                register.isEnabled = false
                register.alpha = .5f
            }
        }
        emailr.editText?.addTextChangedListener {
            var email = emailr.editText?.text.toString()
            cekEmail = email != ""
            if (cekEmail && cekPass && cekUsername){
                register.isClickable = true
                register.isEnabled = true
                register.alpha = 1f
            }else{
                register.isClickable = false
                register.isEnabled = false
                register.alpha = .5f
            }
        }
        passwordr.editText?.addTextChangedListener {
            var pass = passwordr.editText?.text.toString()
            cekPass = pass != ""
            if (cekEmail && cekPass && cekUsername){
                register.isClickable = true
                register.isEnabled = true
                register.alpha = 1f
            }else{
                register.isClickable = false
                register.isEnabled = false
                register.alpha = .5f
            }
        }
    }
    private fun Login() {
        kelogin.setOnClickListener {
            val log = Intent(this@Register, Login::class.java)
            startActivity(log)
        }
        register.setOnClickListener {
            val logIn = Intent(this@Register, Login::class.java )
            startActivity(logIn)
        }

        register.setOnClickListener {
            val name = usernamer.editText?.text.toString().trim()
            val email = emailr.editText?.text.toString().trim()
            val password = passwordr.editText?.text.toString().trim()
            UserStorage.create_acc(name, email, password)
            finish()
        }
    }

}

