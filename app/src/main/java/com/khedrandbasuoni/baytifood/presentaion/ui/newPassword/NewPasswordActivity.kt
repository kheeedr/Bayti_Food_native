package com.khedrandbasuoni.baytifood.presentaion.ui.newPassword

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.ActivityNewPasswordBinding

class NewPasswordActivity : AppCompatActivity() {
    var b: ActivityNewPasswordBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_new_password)
    }
}