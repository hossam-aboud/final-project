package com.example.finalproject.adapter

import android.app.Activity
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.model.favorite

class favoriteAdapter(var activity: Activity, var data: ArrayList<favorite>) : RecyclerView.Adapter<bookAdapter.MyviewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bookAdapter.MyviewHolder {
        val binding= com.example.finalproject.databinding.BookItemBinding.inflate(activity.layoutInflater,parent, false)
        return bookAdapter.MyviewHolder(binding)
    }

    override fun onBindViewHolder(holder: bookAdapter.MyviewHolder, position: Int) {
        holder.binding.imgbook.setImageResource(data[position].img)
        holder.binding.bookname.text=data[position].name
        holder.binding.authername.text=data[position].authername
        holder.binding.deletic.setOnClickListener {
            data.removeAt(position)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}