package com.khedr_and_basuoin.deliveryapp.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.databinding.DataBindingUtil;

import com.khedr_and_basuoin.deliveryapp.R;
import com.khedr_and_basuoin.deliveryapp.databinding.ActivitySplashBinding;
import com.khedr_and_basuoin.deliveryapp.ui.welcome.WelcomeActivity;

public class SplashActivity extends AppCompatActivity {
    ActivitySplashBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);

        b= DataBindingUtil.setContentView(this, R.layout.activity_splash);
        new Handler().postDelayed(() -> {
            startActivity(new Intent(this, WelcomeActivity.class));
            finish();
        },3500);

    }
}