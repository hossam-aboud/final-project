package com.example.finalproject.fragments

import android.app.Activity
import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.finalproject.R
import com.example.finalproject.databinding.FragmentBookDetailsAddBinding
import mybook
import java.util.*
import kotlin.collections.ArrayList


val arrays : ArrayList<mybook> = ArrayList<mybook>();
class BookDetailsAdd : Fragment() {
    lateinit var binding: FragmentBookDetailsAddBinding
     val REQ_GALLERY = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBookDetailsAddBinding.inflate(inflater, container, false)
        binding.btnAdd.setOnClickListener {

        }
        binding.btnAdd.setOnClickListener {
            if(binding.txtName.text.isNotEmpty() &&
                binding.txtAuthor.text.isNotEmpty()
                //&&
//                binding.txtYear.text.isNotEmpty()&&
//                binding.txtCategory.text.isNotEmpty()&&
//                binding.txtDescription.text.isNotEmpty()&&
//                binding.txtLanguage.text.isNotEmpty()&&
//                binding.txtNum.text.isNotEmpty()&&
//                binding.txtCopy.text.isNotEmpty()&&
//                binding.txtShelf.text.isNotEmpty()

            )

                {



                    arrays.add(  mybook(
                        Math.random().toInt(),
                        R.drawable.book8,
                        binding.txtName.text.toString(),
                        binding.txtAuthor.text.toString(),
                        R.drawable.ic_baseline_favorite_border_24,
                        R.drawable.ic_baseline_delete_24
                    ))

                    Toast.makeText(context , "Successfully Added" , Toast.LENGTH_LONG)
//            val dp = DataBaseHelper(requireActivity())
//            if (dp.insertBook( binding.txtName.text.toString(), binding.txtAuthor.text.toString(), binding.txtCategory.text.toString(),  binding.txtYear.text.toString().toInt(), binding.txtDescription.text.toString(), binding.txtLanguage.text.toString(), binding.txtNum.text.toString().toInt(), binding.txtCopy.text.toString().toInt(), binding.txtShelf.text.toString())) {
//                Toast.makeText(requireContext(), "Added successfuly", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(requireContext(), "Failed Add", Toast.LENGTH_SHORT).show()
//            }

            }

        }
        binding.imageView3.setOnClickListener {
            val i = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(i, 100)
        }
        fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?){
            super.onActivityResult(requestCode, resultCode, data)
            if (requestCode == REQ_GALLERY && resultCode == RESULT_OK  ) {
           //   binding.imageView3.setImageBitmap(data!!.data)

            }

        }




        return binding.root

    }}

