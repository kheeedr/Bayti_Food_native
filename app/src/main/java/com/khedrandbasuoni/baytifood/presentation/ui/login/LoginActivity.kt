package com.khedrandbasuoni.baytifood.presentation.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.ActivityLoginBinding
import com.khedrandbasuoni.baytifood.presentation.ui.main.MainActivity
import com.khedrandbasuoni.baytifood.presentation.ui.signUp.SignUp
import com.khedrandbasuoni.baytifood.presentation.ui.resetPassword.ResetPasswordActivity

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var b: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_login)

        b.btToRegisterLogin.setOnClickListener(this)
        b.btToLoginLogin.setOnClickListener(this)
        b.tvForgetPasswordLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v) {
            b.btToRegisterLogin -> {
                startActivity(Intent(this, SignUp::class.java))
            }
            b.btToLoginLogin -> {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
            b.tvForgetPasswordLogin -> {
                startActivity(Intent(this, ResetPasswordActivity::class.java))
            }
        }
    }


}