package com.example.finalproject

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val email = preferences.getString("EMAIL", "")
        binding.emailTv.text= email
        val pass = preferences.getString("PASSWORD","")
        binding.passTV.text= ""+ pass
        binding.logout.setOnClickListener {
            val editor:SharedPreferences.Editor=preferences.edit()
            editor.clear()
            editor.commit()

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }}}