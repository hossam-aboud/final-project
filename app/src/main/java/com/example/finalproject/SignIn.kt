package com.example.finalproject

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.finalproject.databinding.ActivitySignInBinding
import com.example.finalproject.databinding.ActivitySignUpBinding

class SignIn : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    var isRemembered = false
    lateinit var binding: ActivitySignInBinding
    lateinit var emailEditText : EditText
    lateinit var  passwordEditText : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        binding = ActivitySignInBinding.inflate(layoutInflater)


        emailEditText = findViewById(R.id.txtEmail)
        passwordEditText = findViewById(R.id.PasswordSignIn)


        val dontHaveAccountText : TextView = findViewById(R.id.signUp1)
        dontHaveAccountText.setOnClickListener {
            val intent = Intent(this , SignUp::class.java)
            startActivity(intent)
        }

        sharedPreferences= getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        isRemembered= sharedPreferences.getBoolean("CHECKBOX", false)
        if (isRemembered){
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        val  btnSignIn : Button = findViewById(R.id.btnSignIn)
       btnSignIn.setOnClickListener {



            if (emailEditText.text.toString().isEmpty()){
                emailEditText.error = "Full Input"

            }else if (passwordEditText.text.toString().isEmpty()){
                passwordEditText.error = "Full Input"
            }else {

                var email : String? =  sharedPreferences.getString("email" , null)
                var password : String? =  sharedPreferences.getString("password" , null)

                if (email == emailEditText.text.toString() && passwordEditText.text.toString() == password) {

                    startActivity(Intent(this , MainActivity2::class.java))

                }else {
                    Toast.makeText(this, "Account not found", Toast.LENGTH_LONG).show()

                }



            }


        }





    }
}