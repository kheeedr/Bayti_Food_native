package com.khedr_and_basuoin.deliveryapp.ui.verifyCode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fraggjkee.smsconfirmationview.SmsConfirmationView;
import com.khedr_and_basuoin.deliveryapp.R;
import com.khedr_and_basuoin.deliveryapp.databinding.ActivityVerfiyOtpBinding;
import com.khedr_and_basuoin.deliveryapp.ui.newPassword.NewPasswordActivity;

public class VerifyCodeActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityVerfiyOtpBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = DataBindingUtil.setContentView(this, R.layout.activity_verfiy_otp);
        b.btVerifyOtp.setOnClickListener(this);

        SmsConfirmationView smsConfirmationView = b.etVerifyCodeOtp;
        smsConfirmationView.setOnChangeListener((code, isComplete) -> {

        });
    }

    @Override
    public void onClick(View v) {
        if (v == b.btVerifyOtp) {
            startActivity(new Intent(this, NewPasswordActivity.class));
        }
    }
}