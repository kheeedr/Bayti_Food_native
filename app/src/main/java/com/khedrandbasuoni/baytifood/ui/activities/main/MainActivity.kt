package com.khedrandbasuoni.baytifood.ui.activities.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.ActivityMainBinding
import com.khedrandbasuoni.baytifood.ui.fragments.*

class MainActivity : AppCompatActivity() {
    lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, HomeFragment())
            .commit()
        b.bottomNav.setItemSelected(R.id.home, true)
        buttonMenu()
    }

    private fun buttonMenu() {
        b.bottomNav.setOnItemSelectedListener(object : ChipNavigationBar.OnItemSelectedListener {
            override fun onItemSelected(id: Int) {
                when (id) {
                    R.id.home -> supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, HomeFragment()).commit()
                    R.id.cart -> supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, CartFragment()).commit()
                    R.id.menu -> supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, MenuFragment()).commit()
                    R.id.profile -> supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, AccountFragment()).commit()
                    R.id.shopping -> supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, OrderFragment()).commit()
                }
            }
        })
    }

    override fun onBackPressed() {
        if (b.bottomNav.getSelectedItemId() != R.id.home) {
            b.bottomNav.setItemSelected(R.id.home, true)
        } else {
            super.onBackPressed()
        }
    }
}