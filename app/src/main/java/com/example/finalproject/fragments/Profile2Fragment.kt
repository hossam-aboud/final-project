package com.example.finalproject.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.R
import com.example.finalproject.databinding.FragmentProfile2Binding


class Profile2Fragment : Fragment() {

    lateinit var binding:FragmentProfile2Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfile2Binding.inflate(inflater, container, false)
        binding.txtChange.setOnClickListener{
            val intent = Intent(context , Profile1Fragment::class.java)
            startActivity(intent)
        }
        binding.editIcon.setOnClickListener{
            val intent = Intent(context , ProfileFragment::class.java)
            startActivity(intent)
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile2, container, false)


    }


}
