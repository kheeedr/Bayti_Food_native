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
import com.khedrandbasuoni.baytifood.databinding.FragmentMenuBinding
import com.khedrandbasuoni.baytifood.ui.activities.main.MainActivity
import com.khedrandbasuoni.baytifood.ui.adpter.ItemTypeAdapter

class MenuFragment : Fragment() {
    lateinit var b: FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        b = DataBindingUtil.inflate(inflater, R.layout.fragment_menu, container, false)

        b.rvTypeOrderMenu.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        b.rvTypeOrderMenu.adapter =
            ItemTypeAdapter(requireContext(), R.layout.item_type, MainActivity.Products)
        return b.root
    }
}