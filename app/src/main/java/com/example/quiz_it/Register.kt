package com.example.quiz_it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener

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
            var username = namesign.editText?.text.toString()
            cekUsername = username != ""
            if (cekEmail && cekPass && cekUsername){
                register.isClickable = true
                signupbutton.isEnabled = true
                signupbutton.alpha = 1f
            }else{
                signupbutton.isClickable = false
                signupbutton.isEnabled = false
                signupbutton.alpha = .5f
            }
        }
        emailsign.editText?.addTextChangedListener {
            var email = emailsign.editText?.text.toString()
            cekEmail = email != ""
            if (cekEmail && cekPass && cekUsername){
                signupbutton.isClickable = true
                signupbutton.isEnabled = true
                signupbutton.alpha = 1f
            }else{
                signupbutton.isClickable = false
                signupbutton.isEnabled = false
                signupbutton.alpha = .5f
            }
        }
        passsign.editText?.addTextChangedListener {
            var pass = passsign.editText?.text.toString()
            cekPass = pass != ""
            if (cekEmail && cekPass && cekUsername){
                signupbutton.isClickable = true
                signupbutton.isEnabled = true
                signupbutton.alpha = 1f
            }else{
                signupbutton.isClickable = false
                signupbutton.isEnabled = false
                signupbutton.alpha = .5f
            }
        }
    }
    private fun Login() {
        loginsign.setOnClickListener {
            val log = Intent(this@SignupActivity, HomeActivity::class.java)
            startActivity(log)
        }
        signupbutton.setOnClickListener {
            val logIn = Intent(this@SignupActivity, HomeActivity::class.java )
            startActivity(logIn)
        }

        signupbutton.setOnClickListener {
            val name = namesign.editText?.text.toString().trim()
            val email = emailsign.editText?.text.toString().trim()
            val password = passsign.editText?.text.toString().trim()
            UserStorage.create_acc(name, email, password)
            finish()
        }
    }

}

