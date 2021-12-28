package com.example.finalproject.adapter

import android.app.Activity
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.FragmentBookDetailsAddBinding
import com.example.finalproject.databinding.FragmentBookDetailsBinding
import com.example.finalproject.model.details

class detailsAdapter (var activity: Activity, var data2: ArrayList<details>) : RecyclerView.Adapter<detailsAdapter.MyviewHolder>(){
    lateinit var binding: FragmentBookDetailsBinding
    class MyviewHolder(var binding:  FragmentBookDetailsBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val binding= FragmentBookDetailsBinding.inflate(activity.layoutInflater,parent, false)
        return detailsAdapter.MyviewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
return data2.size
    }


}