package com.khedr_and_basuoin.deliveryapp.ui.resetPassword;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.khedr_and_basuoin.deliveryapp.R;
import com.khedr_and_basuoin.deliveryapp.databinding.ActivityResetPasswordBinding;
import com.khedr_and_basuoin.deliveryapp.ui.verifyCode.VerifyCodeActivity;

public class ResetPasswordActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityResetPasswordBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b= DataBindingUtil.setContentView(this,R.layout.activity_reset_password);
        b.btSendCodeReset.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==b.btSendCodeReset){
            startActivity(new Intent(this, VerifyCodeActivity.class));
        }
    }
}