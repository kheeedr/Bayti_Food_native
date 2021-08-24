package com.khedrandbasuoni.baytifood.ui.activities.welcome

import androidx.appcompat.app.AppCompatActivity
import com.khedrandbasuoni.baytifood.ui.adpter.WelcomeImagesAdapter
import androidx.recyclerview.widget.SnapHelper
import androidx.recyclerview.widget.LinearSnapHelper
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.khedrandbasuoni.baytifood.R
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import android.content.Intent
import android.view.View
import com.khedrandbasuoni.baytifood.databinding.ActivityWelcomeBinding
import com.khedrandbasuoni.baytifood.ui.activities.login.LoginActivity
import java.util.*

class WelcomeActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var b: ActivityWelcomeBinding
    var adapter: WelcomeImagesAdapter? = null
    private var helper: SnapHelper = LinearSnapHelper()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_welcome)
        b.btNextWelcome.setOnClickListener(this)
        b.tvSkipWelcome.setOnClickListener(this)
        adapter = WelcomeImagesAdapter()
        b.rvImagesWelcome.adapter = adapter
        helper.attachToRecyclerView(b.rvImagesWelcome)
        b.rvImagesWelcome.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    refreshUi()
                }
            }
        })
    }

    override fun onStart() {
        super.onStart()
        b.rvImagesWelcome.post { b.rvImagesWelcome.smoothScrollToPosition(0) }
    }

    override fun onClick(v: View) {
        if (v === b.btNextWelcome) {
            val position =
                (Objects.requireNonNull(b.rvImagesWelcome.layoutManager) as LinearLayoutManager).findFirstVisibleItemPosition()
            if (position < 2) {
                b.rvImagesWelcome.post { b.rvImagesWelcome.smoothScrollToPosition(position + 1) }
            } else {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        } else if (v === b.tvSkipWelcome) {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }

    fun refreshUi() {
        val position =
            (Objects.requireNonNull(b.rvImagesWelcome.layoutManager) as LinearLayoutManager).findFirstVisibleItemPosition()
        if (position < 2) {
            b.btNextWelcome.setText(R.string.next)
            b.tvSkipWelcome.visibility = View.VISIBLE
        } else {
            b.btNextWelcome.setText(R.string.get_started)
            b.tvSkipWelcome.visibility = View.INVISIBLE
        }
    }

    companion object {
        private const val TAG = "WelcomeActivity"
    }
}