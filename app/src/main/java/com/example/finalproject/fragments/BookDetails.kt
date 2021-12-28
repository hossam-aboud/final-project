package com.example.finalproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import com.example.finalproject.R
import mybook


class BookDetails ( ds: mybook) : Fragment() {

    var book : mybook?= null
    init {
        book = ds
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val  root =  inflater.inflate(R.layout.fragment_book_details, container, false)

        val txtName : EditText = root.findViewById(R.id.txtName4)
        val txtAuthor : EditText = root.findViewById(R.id.txtAuthor32323)
        val imageView3 : ImageView = root.findViewById(R.id.imageView212123)

        txtName.setText(book?.name)
        txtAuthor.setText(book?.authername)
        book?.img?.let { imageView3.setImageResource(it) }
      return  root
    }


}