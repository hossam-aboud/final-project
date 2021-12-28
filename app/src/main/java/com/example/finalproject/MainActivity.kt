package com.example.finalproject

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast
import com.example.finalproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
    val TIME_OUT  = 3000
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        val splash_screen_anim = AnimationUtils.loadAnimation( this  , R.anim.splash_screen_animation)

        val logo_app = findViewById<ImageView>(R.id.logo_app)
       var username : String? =  sharedPreferences.getString("username" , null)

        logo_app.startAnimation(splash_screen_anim)

        Handler().postDelayed({
            if (username == null ){
                val start = Intent(this , SignIn ::class.java)
                startActivity(start)
                finish()
            }else {
                val start = Intent(this , MainActivity2 ::class.java)
                startActivity(start)
                finish()
            }

        }, TIME_OUT.toLong())


//        binding.imageView.setOnClickListener {
//            val intent = Intent(this , SignIn::class.java)
//            startActivity(intent)
//        }
//        binding.splash.setOnClickListener {
//            val intent = Intent(this, SignIn::class.java)
//            startActivity(intent)
//        }

    }
}