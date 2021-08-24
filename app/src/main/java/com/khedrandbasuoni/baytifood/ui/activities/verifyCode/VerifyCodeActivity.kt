package com.khedrandbasuoni.baytifood.ui.activities.verifyCode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.khedrandbasuoni.baytifood.R
import android.content.Intent
import android.view.View
import com.khedrandbasuoni.baytifood.databinding.ActivityVerfiyOtpBinding
import com.khedrandbasuoni.baytifood.ui.activities.newPassword.NewPasswordActivity

//import com.fraggjkee.smsconfirmationview.SmsConfirmationView;
class VerifyCodeActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var b: ActivityVerfiyOtpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_verfiy_otp)
        b.btVerifyOtp.setOnClickListener(this)

//        SmsConfirmationView smsConfirmationView = b.etVerifyCodeOtp;
//        smsConfirmationView.setOnChangeListener((code, isComplete) -> {
//
//        });
    }

    override fun onClick(v: View) {
        if (v === b.btVerifyOtp) {
            startActivity(Intent(this, NewPasswordActivity::class.java))
        }
    }
}