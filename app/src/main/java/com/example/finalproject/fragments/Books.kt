package com.example.finalproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finalproject.R
import com.example.finalproject.adapter.bookAdapter
import com.example.finalproject.databinding.FragmentBooksBinding
import mybook

class Books : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return inflater.inflate(R.layout.fragment_books, container, false)
        val binding = FragmentBooksBinding.inflate(inflater, container, false)
        val data1 = ArrayList<mybook>()
        data1.add(
            mybook(
                1,
                R.drawable.book1,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_border_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        data1.add(
            mybook(
                2,
                R.drawable.book2,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_border_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        data1.add(
            mybook(
                3,
                R.drawable.book3,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_border_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        data1.add(
            mybook(
                4,
                R.drawable.book4,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_border_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        data1.add(
            mybook(
                5,
                R.drawable.book5,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_border_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        data1.add(
            mybook(
                6,
                R.drawable.book6,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_border_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        data1.add(
            mybook(
                7,
                R.drawable.book7,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_border_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        data1.add(
            mybook(
                8,
                R.drawable.book8,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_border_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        for (item in arrays){
            data1.add(item)

        }
        val bookabapter = bookAdapter(requireActivity(), data1)
        binding.cvbook.layoutManager = LinearLayoutManager(requireActivity())
        binding.cvbook.adapter = bookabapter
        return binding.root
    }

}