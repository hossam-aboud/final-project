package com.example.finalproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.finalproject.R
import com.example.finalproject.adapter.CategAdapter
import com.example.finalproject.databinding.ActivityMainBinding
import com.example.finalproject.databinding.Fragment1Binding
import com.example.finalproject.databinding.FragmentBooksBinding
import com.example.finalproject.db.DataBaseHelper
import com.example.finalproject.model.categ
import com.example.finalproject.model.favorite


class Fragment1 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val db = DataBaseHelper(requireContext())
//        var data = ArrayList<categ>()
//        data = db.getAllCateg()
//
//        db.insertCateg(R.drawable.book1, "Life")
//        db.insertCateg(R.drawable.book2, "Eat")
//        db.insertCateg(R.drawable.book3, "Play")
//        db.insertCateg(R.drawable.book4, "Work")
//        db.insertCateg(R.drawable.book5, "Study")
//        db.insertCateg(R.drawable.book6, "Drink")
//        db.insertCateg(R.drawable.book7, "Tea")
//        if (db.insertCateg(R.drawable.book1, "Life")){
//            Toast.makeText(activity,"Added Success ", Toast.LENGTH_LONG).show()
//        }else{
//            Toast.makeText(activity,"failed ", Toast.LENGTH_LONG).show()
//
//        }

    }
    lateinit var binding: ActivityMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = Fragment1Binding.inflate(inflater, container, false)


        var data = ArrayList<categ>()
        data.add(
            categ(
                1,
                "Arabic",
                R.drawable.book1,
            )
        )
        data.add(
            categ(
                2,
                "Life",
                R.drawable.book2,
            )
        )
        data.add(
            categ(
                3,
                "Eat",
                R.drawable.book3,
            )
        )
        data.add(
            categ(
                4,
                "Work",
                R.drawable.book4,
            )
        )
        data.add(
            categ(
                5,
                "Study",
                R.drawable.book5,
            )
        )
        data.add(
            categ(
                6,
                "English",
                R.drawable.book6,
            )
        )
        data.add(
            categ(
                7,
                "Drink",
                R.drawable.book7,
            )
        )
        data.add(
            categ(
               8,
                "arabic",
                R.drawable.book8,
            )
        )
        val bookAdapter = CategAdapter(requireActivity(), data)
        binding.rvBookCateg.layoutManager = GridLayoutManager(requireActivity(), 2)
        binding.rvBookCateg.adapter = bookAdapter

//        val db = DataBaseHelper(requireContext())
//        val data =db.getAllCateg()
//        db.insertCateg(R.drawable.book1, "Life")
//        db.insertCateg(R.drawable.book2, "Eat")
//        db.insertCateg(R.drawable.book3, "Play")
//        db.insertCateg(R.drawable.book4, "Work")
//        db.insertCateg(R.drawable.book5, "Study")
//        db.insertCateg(R.drawable.book6, "Drink")
//        db.insertCateg(R.drawable.book7, "Tea")
//        if (db.insertCateg(R.drawable.book1, "Life")) {
//            Toast.makeText(context, "Added Success ", Toast.LENGTH_LONG).show()
//        } else {
//            Toast.makeText(context, "failed ", Toast.LENGTH_LONG).show()
//        }
//}

            return binding.root


        }


    }