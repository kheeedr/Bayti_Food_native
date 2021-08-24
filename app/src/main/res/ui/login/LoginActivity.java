package com.khedr_and_basuoin.deliveryapp.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.khedr_and_basuoin.deliveryapp.MainActivity;
import com.khedr_and_basuoin.deliveryapp.R;
import com.khedr_and_basuoin.deliveryapp.databinding.ActivityLoginBinding;
import com.khedr_and_basuoin.deliveryapp.ui.register.RegisterActivity;
import com.khedr_and_basuoin.deliveryapp.ui.resetPassword.ResetPasswordActivity;

import java.net.Inet4Address;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityLoginBinding b;
    boolean isInputAppeared = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = DataBindingUtil.setContentView(this, R.layout.activity_login);
        b.layoutLogoAndDescriptionLogin.setVisibility(View.VISIBLE);
        b.layoutLoginInputLogin.setVisibility(View.GONE);
        b.btToRegisterLogin.setOnClickListener(this);
        b.btToLoginLogin.setOnClickListener(this);
        b.tvForgetPasswordLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == b.btToRegisterLogin) {
            startActivity(new Intent(this, RegisterActivity.class));
        } else if (v == b.btToLoginLogin) {
            if (!isInputAppeared) {
                isInputAppeared = true;
                animCenterToUp(this, b.layoutLogoAndDescriptionLogin);
                animUpToCenter(this, b.layoutLoginInputLogin);
            } else {
                isInputAppeared = false;
                startActivity(new Intent(this, MainActivity.class));
                finish();

            }

        }
        else if (v==b.tvForgetPasswordLogin){
            startActivity(new Intent(this, ResetPasswordActivity.class));
        }

    }

    @Override
    public void finish() {
        if (isInputAppeared) {
            isInputAppeared = false;
            animCenterToUp(this, b.layoutLoginInputLogin);
            animUpToCenter(this, b.layoutLogoAndDescriptionLogin);
        } else {
            super.finish();
        }

    }


    public static void animCenterToUp(Context context, View view) {
        Animation moveToEnd = AnimationUtils.loadAnimation(context, R.anim.center_to_up);
        view.startAnimation(moveToEnd);
        new Handler().postDelayed(() -> view.setVisibility(View.GONE), 1000);
    }

    public static void animUpToCenter(Context context, View view) {
        new Handler().postDelayed(() -> {
            view.setVisibility(View.VISIBLE);
            Animation moveToEnd = AnimationUtils.loadAnimation(context, R.anim.up_to_center);
            view.startAnimation(moveToEnd);
        }, 1000);
    }
}