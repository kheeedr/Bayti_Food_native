package com.khedrandbasuoni.baytifood.ui.activities.profile

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.ActivityProfileBinding
import com.khedrandbasuoni.baytifood.utils.Anim

class ProfileActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var b: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_profile)
        b.btBackProfile.setOnClickListener(this)
        b.btEditProfile.setOnClickListener(this)
        b.btCancelUpdateProfile.setOnClickListener(this)

        b.switchChangePassword.setOnCheckedChangeListener { _, isChecked ->
            run {
                when (isChecked) {
                    true -> Anim.animZoomIn(this, b.grpOfNewPassword)

                    false -> Anim.animZoomOut(this, b.grpOfNewPassword)
                }
            }
        }
    }

    override fun onClick(v: View?) {
        when (v) {
            b.btBackProfile -> {
                onBackPressed()
            }
            b.btEditProfile -> {
                enableEditProfile()
            }
            b.btCancelUpdateProfile -> {
                disableEditProfile()
            }
        }
    }

    private fun enableEditProfile() {

        Anim.animFadeOut(this, b.btEditProfile)
        Anim.animFadeOut(this, b.grpOfCardsAndAddress)

        b.etProfileName.isEnabled = true
        b.etProfilePhone.isEnabled = true
        b.etProfileEmail.isEnabled = true

        Handler(mainLooper).postDelayed({
            Anim.animFadeIn(this, b.grpOfEditProfile)
        }, 500)


    }

    private fun disableEditProfile() {

        Anim.animFadeOut(this, b.grpOfEditProfile)

        b.etProfileName.isEnabled = false
        b.etProfilePhone.isEnabled = false
        b.etProfileEmail.isEnabled = false

        Handler(mainLooper).postDelayed({
            Anim.animFadeIn(this, b.btEditProfile)
            Anim.animFadeIn(this, b.grpOfCardsAndAddress)

        }, 500)
    }

}