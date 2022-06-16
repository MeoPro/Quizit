package com.example.quiz_it

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firebaseAuth=FirebaseAuth.getInstance()
        val user = firebaseAuth.currentUser
        setContentView(R.layout.activity_profile)
        supportActionBar?.hide()

        if (user != null){
         emailview.setText(user.email)
        }
    }
}