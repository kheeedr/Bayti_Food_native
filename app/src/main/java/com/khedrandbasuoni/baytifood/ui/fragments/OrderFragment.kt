package com.khedrandbasuoni.baytifood.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.FragmentOrdersBinding


class OrderFragment : Fragment() {
    lateinit var b: FragmentOrdersBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        b = DataBindingUtil.inflate(inflater, R.layout.fragment_orders, container, false)


        return b.root
    }

}