package com.example.finalproject.adapter

import android.app.Activity
import android.content.Intent
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.MainActivity2
import com.example.finalproject.R
import com.example.finalproject.databinding.ActivityMain2Binding
import com.example.finalproject.databinding.CategItemBinding
import com.example.finalproject.databinding.FragmentBooksBinding
import com.example.finalproject.db.DataBaseHelper
import com.example.finalproject.fragments.FavFragment
import com.example.finalproject.model.categ
import com.example.finalproject.fragments.Books as FragmentsBooks

class CategAdapter(var activity: Activity, var data: ArrayList<categ>)   :  RecyclerView.Adapter<CategAdapter.MyViewHolder>() {

    class MyViewHolder(var binding: CategItemBinding) : RecyclerView.ViewHolder(binding.root){
        val tvName = binding.tvName
        val tvImage=binding.tvImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = CategItemBinding.inflate(activity.layoutInflater, parent, false)
        return MyViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.tvName.text = data[position].nameCat
        holder.binding.tvImage.setImageResource(data[position].imageCat)
        holder.binding.tvImage.setOnClickListener {

            (activity as MainActivity2).swipe(FragmentsBooks())

        }
//        val db = DataBaseHelper(activity)
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

    override fun getItemCount(): Int {
        return data.size
    }
}