package com.khedrandbasuoni.baytifood.ui.activities.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.ActivityMainBinding
import com.khedrandbasuoni.baytifood.ui.fragments.HomeFragment
import com.khedrandbasuoni.baytifood.pojo.ProductsType
import com.khedrandbasuoni.baytifood.pojo.Meal
import com.khedrandbasuoni.baytifood.ui.fragments.MoreFragment
import com.khedrandbasuoni.baytifood.ui.fragments.MenuFragment
import com.khedrandbasuoni.baytifood.ui.fragments.ProfileFragment
import com.khedrandbasuoni.baytifood.ui.fragments.ShoppingFragment
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, HomeFragment())
            .commit()
        b.bottomNav.setItemSelected(R.id.Home, true)
        setData()
        setData2()
        buttonMenu()
    }

    private fun setData2() {
        Products.clear()
        Products.add(ProductsType("Food", 120, R.drawable.iv_food_menu))
        Products.add(ProductsType("Beverages", 354, R.drawable.iv_beverages_menu))
        Products.add(ProductsType("Promotions", 81, R.drawable.iv_promotions_menu))
        Products.add(ProductsType("Desserts", 95, R.drawable.iv_desserts_menu))
    }

    private fun setData() {
        list.clear()
        list.add(Meal("Offers", R.drawable.iv_test_1, 53.5, "details", 4.9))
        list.add(Meal("Sri Lankan", R.drawable.iv_test_2, 53.5, "details", 3.7))
        list.add(Meal("Italian", R.drawable.iv_test_3, 53.5, "details", 4.1))
        list.add(Meal("Offers", R.drawable.iv_test_1, 53.5, "details", 4.9))
        list.add(Meal("Sri Lankan", R.drawable.iv_test_2, 53.5, "details", 3.7))
        list2.clear()
        list2.add(Meal("Café De Bambaa", R.drawable.iv_test_4, 53.5, "details", 4.9))
        list2.add(Meal("Café De Bambaa", R.drawable.iv_test_6, 53.5, "details", 3.7))
        list2.add(Meal("Café De Bambaa", R.drawable.iv_test_5, 53.5, "details", 4.1))
        list2.add(Meal("Café De Bambaa", R.drawable.iv_test_4, 53.5, "details", 4.9))
        list2.add(Meal("Café De Bambaa", R.drawable.iv_test_6, 53.5, "details", 3.7))
    }

    private fun buttonMenu() {
        b.bottomNav.setOnItemSelectedListener(object : ChipNavigationBar.OnItemSelectedListener {
            override fun onItemSelected(id: Int) {
                when (id) {
                    R.id.Home -> supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, HomeFragment()).commit()
                    R.id.more -> supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, MoreFragment()).commit()
                    R.id.menu -> supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, MenuFragment()).commit()
                    R.id.profile -> supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, ProfileFragment()).commit()
                    R.id.shopping -> supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, ShoppingFragment()).commit()
                }
            }
        })
    }

    companion object {
        @JvmField
        var list: MutableList<Meal> = ArrayList()
        @JvmField
        var list2: MutableList<Meal> = ArrayList()
        @JvmField
        var Products: MutableList<ProductsType> = ArrayList()
    }
}