package com.example.finalproject

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.finalproject.databinding.ActivityMain2Binding
import com.example.finalproject.fragments.BookDetailsAdd
import com.example.finalproject.fragments.FavFragment
import com.example.finalproject.fragments.Fragment1
import com.example.finalproject.fragments.Profile2Fragment

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.mainContainer,Fragment1())
            .commit()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.logout){

            (startActivity(Intent(this, SignIn::class.java)))

        }
        when (item.itemId) {
            R.id.home -> {
                supportFragmentManager.beginTransaction().replace(R.id.mainContainer,Fragment1()).commit()


            }
            R.id.fav -> supportFragmentManager.beginTransaction().replace(R.id.mainContainer,FavFragment()).commit()
            R.id.addbook -> supportFragmentManager.beginTransaction().replace(R.id.mainContainer, BookDetailsAdd()).commit()
            R.id.profile -> supportFragmentManager.beginTransaction()
                .replace(R.id.mainContainer, Profile2Fragment()).commit()


        }


        return super.onOptionsItemSelected(item)
    }
    fun swipe(frag: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.mainContainer,frag).commit()
    }

}
