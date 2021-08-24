package com.khedr_and_basuoin.deliveryapp.ui.newPassword;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.khedr_and_basuoin.deliveryapp.R;
import com.khedr_and_basuoin.deliveryapp.databinding.ActivityNewPasswordBinding;

public class NewPasswordActivity extends AppCompatActivity {
    ActivityNewPasswordBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b= DataBindingUtil.setContentView(this,R.layout.activity_new_password);

    }
}