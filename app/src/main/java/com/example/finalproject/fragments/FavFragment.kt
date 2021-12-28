package com.example.finalproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finalproject.R
import com.example.finalproject.adapter.favoriteAdapter
import com.example.finalproject.databinding.FragmentFavBinding
import com.example.finalproject.model.favorite


class FavFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFavBinding.inflate(inflater, container, false)
        val data2 = ArrayList<favorite>()
        data2.add(
            favorite(
                R.drawable.book1,
                "arabic",
                "samar",
                R.drawable.favorite,
                R.drawable.ic_baseline_delete_24
            )
        )
        data2.add(
            favorite(
                R.drawable.book2,
                "arabic",
                "samar",
                R.drawable.favorite,
                R.drawable.ic_baseline_delete_24
            )
        )
        data2.add(
            favorite(
                R.drawable.book3,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        data2.add(
            favorite(
                R.drawable.book4,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        data2.add(
            favorite(
                R.drawable.book5,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        data2.add(
            favorite(
                R.drawable.book6,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        data2.add(
            favorite(
                R.drawable.book7,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        data2.add(
            favorite(
                R.drawable.book8,
                "arabic",
                "samar",
                R.drawable.ic_baseline_favorite_24,
                R.drawable.ic_baseline_delete_24
            )
        )
        val bookabapter = favoriteAdapter(requireActivity(), data2)
        binding.cvFav.layoutManager = LinearLayoutManager(requireActivity())
        binding.cvFav.adapter = bookabapter
        return binding.root
    }


}
