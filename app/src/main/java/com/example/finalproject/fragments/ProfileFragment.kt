package com.example.finalproject.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import com.example.finalproject.R


class ProfileFragment : Fragment() {


    lateinit var  fullName : EditText
    lateinit var email : EditText
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_profile, container, false)

     var name : String? =  sharedPreferences.getString("username" , null)
       var emailAdreess : String? =  sharedPreferences.getString("email" , null)

        fullName =   root.findViewById<EditText>(R.id.editTextTextPersonName5)
        email =   root.findViewById<EditText>(R.id.editTextTextEmailAddress)

        Toast.makeText(context,name, Toast.LENGTH_LONG).show()

        fullName.setText(name)
        email.setText(emailAdreess)

     return  root
    }


    }
