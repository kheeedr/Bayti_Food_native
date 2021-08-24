package com.khedrandbasuoni.baytifood.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.FragmentHomeBinding
import com.khedrandbasuoni.baytifood.ui.activities.main.MainActivity
import com.khedrandbasuoni.baytifood.ui.adpter.RatingsPopularMostAdapter
import com.khedrandbasuoni.baytifood.ui.adpter.RecentItemsAdapter
import com.khedrandbasuoni.baytifood.ui.adpter.ShopsAdapter

class HomeFragment : Fragment() {
    lateinit var b: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        b = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        b.rvTypeShopHome.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)

        b.rvTypeShopHome.adapter =
            ShopsAdapter(requireContext(), R.layout.item_typeshop, MainActivity.list)
        b.rvPopularMostHome.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)

        val ratingsPopularMostAdapter = RatingsPopularMostAdapter(
            requireContext(),
            R.layout.item_popular_most,
            MainActivity.list2
        )

        b.rvTypeShopHome.adapter = ratingsPopularMostAdapter
        b.rvRecentItemsHome.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        b.rvRecentItemsHome.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        b.rvRecentItemsHome.adapter =
            RecentItemsAdapter(requireContext(), R.layout.item_recent_items, MainActivity.list2)
        return b.root
    }
}