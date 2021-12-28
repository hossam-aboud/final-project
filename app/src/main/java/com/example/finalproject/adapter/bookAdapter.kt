package com.example.finalproject.adapter

import android.app.Activity
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.MainActivity2
import com.example.finalproject.R
import com.example.finalproject.databinding.BookItemBinding
import com.example.finalproject.databinding.FragmentBooksBinding
import com.example.finalproject.fragments.BookDetails
import com.example.finalproject.fragments.Books
import mybook

class bookAdapter(var activity: Activity, var data: ArrayList<mybook>) :RecyclerView.Adapter<bookAdapter.MyviewHolder>() {
    lateinit var binding: FragmentBooksBinding

    class MyviewHolder(var binding: BookItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val binding=BookItemBinding.inflate(activity.layoutInflater,parent, false)
        return MyviewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        holder.binding.imgbook.setImageResource(data[position].img)
        holder.binding.bookname.text=data[position].name
        holder.binding.authername.text=data[position].authername
holder.binding.imgbook.setOnClickListener{
    (activity as MainActivity2).swipe(BookDetails(data[position]))

}

        holder.binding.favic.setOnClickListener {
            holder.binding.favic.setImageResource(R.drawable.ic_baseline_favorite_24)
            
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }
}