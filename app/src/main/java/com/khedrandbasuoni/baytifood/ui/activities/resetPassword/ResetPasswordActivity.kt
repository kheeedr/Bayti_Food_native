package com.khedrandbasuoni.baytifood.ui.activities.resetPassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.khedrandbasuoni.baytifood.R
import android.content.Intent
import android.view.View
import com.khedrandbasuoni.baytifood.databinding.ActivityResetPasswordBinding
import com.khedrandbasuoni.baytifood.ui.activities.verifyCode.VerifyCodeActivity

class ResetPasswordActivity : AppCompatActivity(), View.OnClickListener {
    var b: ActivityResetPasswordBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_reset_password)
        b!!.btSendCodeReset.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v === b!!.btSendCodeReset) {
            startActivity(Intent(this, VerifyCodeActivity::class.java))
        }
    }
}