package com.khedrandbasuoni.baytifood.presentaion.ui.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.FragmentCartBinding

class CartFragment : Fragment() {
    lateinit var b: FragmentCartBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        b = DataBindingUtil.inflate(inflater, R.layout.fragment_cart, container, false)
        return b.root
    }


}