package com.example.finalproject.adapter

import android.app.Activity
import android.content.Intent
import android.provider.MediaStore
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.FragmentBookDetailsAddBinding
import com.example.finalproject.db.DataBaseHelper
import com.example.finalproject.model.AddBook

class AddBookAdapter (var activity: Activity, var data1: ArrayList<AddBook>) : RecyclerView.Adapter<AddBookAdapter.MyviewHolder>() {

    val REQ_GALLERY = 200
    lateinit var binding: FragmentBookDetailsAddBinding

    class MyviewHolder(var binding: FragmentBookDetailsAddBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val binding = FragmentBookDetailsAddBinding.inflate(activity.layoutInflater, parent, false)
        return MyviewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
//        holder.binding.imageView3.setImageResource(data1[position].img)
        holder.binding.txtName.setText(data1[position].name)
        holder.binding.txtAuthor.setText(data1[position].outher)
        holder.binding.txtCategory.setText(data1[position].category)
        holder.binding.txtYear.setText(data1[position].year)
        holder.binding.txtDescription.setText(data1[position].description)
        holder.binding.txtLanguage.setText(data1[position].language)
        holder.binding.txtNum.setText(data1[position].num)
        holder.binding.txtCopy.setText(data1[position].copy)
        holder.binding.txtShelf.setText(data1[position].shelf)
        binding.btnAdd.setOnClickListener {
            if (binding.txtName.text.isNotEmpty() &&
                binding.txtAuthor.text.isNotEmpty() &&
                binding.txtYear.text.isNotEmpty() &&
                binding.txtCategory.text.isNotEmpty() &&
                binding.txtDescription.text.isNotEmpty() &&
                binding.txtLanguage.text.isNotEmpty() &&
                binding.txtNum.text.isNotEmpty() &&
                binding.txtCopy.text.isNotEmpty() &&
                binding.txtShelf.text.isNotEmpty()
            ) {

                val dp = DataBaseHelper(activity)
                if (dp.insertBook(
                        binding.txtName.text.toString(),
                        binding.txtAuthor.text.toString(),
                        binding.txtCategory.text.toString(),
                        binding.txtYear.text.toString().toInt(),
                        binding.txtDescription.text.toString(),
                        binding.txtLanguage.text.toString(),
                        binding.txtNum.text.toString().toInt(),
                        binding.txtCopy.text.toString().toInt(),
                        binding.txtShelf.text.toString()
                    )
                ) {
                    Toast.makeText(activity, "Added successfuly", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(activity, "Failed Add", Toast.LENGTH_SHORT).show()
                }


            }

        }




    }

    override fun getItemCount(): Int {
        return data1.size

    }


}





