package com.khedrandbasuoni.baytifood.presentaion.ui.account

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.FragmentAccountBinding
import com.khedrandbasuoni.baytifood.presentaion.ui.profile.ProfileActivity

class AccountFragment : Fragment(), View.OnClickListener {
    lateinit var b: FragmentAccountBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        b = DataBindingUtil.inflate(inflater, R.layout.fragment_account, container, false)

        b.layoutAccountToProfile.setOnClickListener(this)
        b.btAccountBack.setOnClickListener(this)
        return b.root
    }

    override fun onClick(v: View?) {
        when (v) {
            b.layoutAccountToProfile -> {
                startActivity(Intent(requireContext(), ProfileActivity::class.java))
            }
            b.btAccountBack -> {
                requireActivity().onBackPressed()
            }
        }
    }



}