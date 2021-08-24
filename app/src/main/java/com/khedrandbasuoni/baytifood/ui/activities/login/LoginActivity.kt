package com.khedrandbasuoni.baytifood.ui.activities.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.ActivityLoginBinding
import com.khedrandbasuoni.baytifood.ui.activities.main.MainActivity
import com.khedrandbasuoni.baytifood.ui.activities.register.RegisterActivity
import com.khedrandbasuoni.baytifood.ui.activities.resetPassword.ResetPasswordActivity

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var b: ActivityLoginBinding
    private var isInputAppeared = false
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_login)
        b.layoutLogoAndDescriptionLogin.visibility = View.VISIBLE
        b.layoutLoginInputLogin.visibility = View.GONE
        b.btToRegisterLogin.setOnClickListener(this)
        b.btToLoginLogin.setOnClickListener(this)
        b.tvForgetPasswordLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v === b.btToRegisterLogin) {
            startActivity(Intent(this, RegisterActivity::class.java))
        } else if (v === b.btToLoginLogin) {
            if (!isInputAppeared) {
                isInputAppeared = true
                animCenterToUp(this, b.layoutLogoAndDescriptionLogin)
                animUpToCenter(this, b.layoutLoginInputLogin)
            } else {
                isInputAppeared = false
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        } else if (v === b.tvForgetPasswordLogin) {
            startActivity(Intent(this, ResetPasswordActivity::class.java))
        }
    }

    override fun finish() {
        if (isInputAppeared) {
            isInputAppeared = false
            animCenterToUp(this, b.layoutLoginInputLogin)
            animUpToCenter(this, b.layoutLogoAndDescriptionLogin)
        } else {
            super.finish()
        }
    }

    companion object {
        fun animCenterToUp(context: Context?, view: View) {
            val moveToEnd: Animation = AnimationUtils.loadAnimation(context, R.anim.center_to_up)
            view.startAnimation(moveToEnd)
            Handler().postDelayed({ view.visibility = View.GONE }, 1000)
        }

        fun animUpToCenter(context: Context?, view: View) {
            Handler().postDelayed({
                view.visibility = View.VISIBLE
                val moveToEnd: Animation =
                    AnimationUtils.loadAnimation(context, R.anim.up_to_center)
                view.startAnimation(moveToEnd)
            }, 1000)
        }
    }
}