package com.khedrandbasuoni.baytifood.ui.activities.signUp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.ActivitySignupBinding

class SignUp : AppCompatActivity() {
    var b: ActivitySignupBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_signup)
    }
}