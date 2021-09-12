package com.khedrandbasuoni.baytifood.ui.activities.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var b: ActivityProfileBinding
    var isEditProfile: ObservableField<Boolean> = ObservableField(false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_profile)


    }

    fun assignEditProfile(isEditProfile: Boolean) {
        this.isEditProfile.set(isEditProfile)
    }
}