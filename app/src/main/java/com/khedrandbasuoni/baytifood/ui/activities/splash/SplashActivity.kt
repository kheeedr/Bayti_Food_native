package com.khedrandbasuoni.baytifood.ui.activities.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import com.khedrandbasuoni.baytifood.R
import android.content.Intent
import android.os.Handler
import android.os.Looper
import com.khedrandbasuoni.baytifood.databinding.ActivitySplashBinding
import com.khedrandbasuoni.baytifood.ui.activities.welcome.WelcomeActivity

class SplashActivity : AppCompatActivity() {
    lateinit var b: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, WelcomeActivity::class.java))
            finish()
        }, 3500)
    }
}