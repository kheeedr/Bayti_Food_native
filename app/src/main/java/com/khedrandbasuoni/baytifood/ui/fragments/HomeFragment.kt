package com.khedrandbasuoni.baytifood.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.FragmentHomeBinding
import com.khedrandbasuoni.baytifood.pojo.Meal
import com.khedrandbasuoni.baytifood.pojo.PopularDishes
import com.khedrandbasuoni.baytifood.ui.activities.product.ProductActivity
import com.khedrandbasuoni.baytifood.ui.activities.profile.ProfileActivity
import com.khedrandbasuoni.baytifood.ui.adpter.MostPopularAdapter
import com.khedrandbasuoni.baytifood.ui.adpter.RecentItemsAdapter
import com.khedrandbasuoni.baytifood.ui.adpter.PopularDishesAdapter
import java.util.ArrayList

class HomeFragment : Fragment(), View.OnClickListener {

    lateinit var b: FragmentHomeBinding
    private lateinit var mostPopularAdapter: MostPopularAdapter
    private lateinit var recentItemsAdapter: RecentItemsAdapter
    private lateinit var popularDishesAdapter: PopularDishesAdapter

    private var popularDishesList: ArrayList<PopularDishes> = ArrayList()
    private var mostPopularList: ArrayList<Meal> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        b = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        b.ivProfileHome.setOnClickListener(this)
        b.popularKushari.setOnClickListener(this)

        fillContentLists()

        popularDishesAdapter = PopularDishesAdapter(requireContext())
        popularDishesAdapter.list = popularDishesList
        b.rvShopsHome.adapter = popularDishesAdapter

        mostPopularAdapter = MostPopularAdapter(requireContext())
        mostPopularAdapter.list = mostPopularList
        mostPopularAdapter.notifyItemRangeInserted(0, mostPopularList.size)
        b.rvMostPopularHome.adapter = mostPopularAdapter

        recentItemsAdapter = RecentItemsAdapter(requireContext())
        b.rvRecentItemsHome.adapter = recentItemsAdapter
        recentItemsAdapter.list = mostPopularList
        recentItemsAdapter.notifyItemRangeInserted(0, mostPopularList.size)

        b.scrollHome.setOnScrollChangeListener { _, _, scrollY, _, _ ->
            run {
                if (scrollY == 0) {
                    b.layoutDeliveringTo.translationZ = 0f
                    b.layoutDeliveringTo.elevation = 0f
                } else if (scrollY > 0) {

                    b.layoutDeliveringTo.translationZ =
                        resources.getDimensionPixelSize(R.dimen._5sdp).toFloat()

                    b.layoutDeliveringTo.elevation =
                        resources.getDimensionPixelSize(R.dimen._3sdp).toFloat()
                }
            }
        }


        return b.root
    }

    private fun fillContentLists() {
        popularDishesList.apply {
            add(PopularDishes("Egyptian", R.drawable.img_egyptian_food))
            add(PopularDishes("Italian", R.drawable.img_italian_food))
            add(PopularDishes("Indian", R.drawable.img_indian_food))
            add(PopularDishes("Sri Lankan", R.drawable.img_srilankan_food))
            add(PopularDishes("American", R.drawable.img_american_burger))
        }

        mostPopularList.apply {
            add(Meal("Café De Bambaa", R.drawable.iv_test_4, 53.5, "details", 4.9))
            add(Meal("Café De Bambaa", R.drawable.iv_test_6, 53.5, "details", 3.7))
            add(Meal("Café De Bambaa", R.drawable.iv_test_5, 53.5, "details", 4.1))
            add(Meal("Café De Bambaa", R.drawable.iv_test_4, 53.5, "details", 4.9))
            add(Meal("Café De Bambaa", R.drawable.iv_test_6, 53.5, "details", 3.7))
        }
    }

    override fun onClick(v: View?) {
        when (v) {
            b.ivProfileHome -> {
                startActivity(Intent(requireContext(), ProfileActivity::class.java))
            }
            b.popularKushari -> {
                startActivity(Intent(requireContext(), ProductActivity::class.java))
            }
        }
    }
}