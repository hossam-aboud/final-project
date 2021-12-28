package com.example.finalproject

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.finalproject.databinding.ActivitySignInBinding
import com.example.finalproject.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var binding: ActivitySignUpBinding
    lateinit var username : EditText
    lateinit var email : EditText
    lateinit var password : EditText
    lateinit var signUpBtn : Button
    @SuppressLint("CommitPrefEdits")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        username =  findViewById(R.id.txt_username)
        email =  findViewById(R.id.emailSignUp)
        password =  findViewById(R.id.passsignup)

        signUpBtn = findViewById(R.id.btnSignUp)

        signUpBtn.setOnClickListener {
            if (username.text.toString().isEmpty()){
                username.error = "Full Input"

            }else if (email.text.toString().isEmpty()){
                email.error = "Full Input"
            }else if (password.text.toString().isEmpty()) {
                password.error = "Full Input"

            }else {
                val password:String = password.text.toString()
                val username :String=    username.text.toString()
                val email  :String=    email.text.toString()
                val editor : SharedPreferences.Editor = sharedPreferences.edit()
                editor.putString("username" , username)
                editor.putString("email" , email)
                editor.putString("password" , password)
                val b = editor.commit()
                if (b) {
                    if (b){
                        startActivity(Intent(this , MainActivity2::class.java))
                        Toast.makeText(this, "Successfully Stored", Toast.LENGTH_LONG).show()

                    }                    }
                    else
                        Toast.makeText(this, "Failed Add", Toast.LENGTH_LONG).show()

            }


        }

        binding.txtsignin.setOnClickListener {
            val intent = Intent(this , SignIn::class.java)
            startActivity(intent)
        }
    }
}