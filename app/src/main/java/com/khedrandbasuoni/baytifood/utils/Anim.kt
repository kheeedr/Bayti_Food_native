/*
 * Copyright (c) 2021.
 * Created by Mohamed Khedr.
 */
package com.khedrandbasuoni.baytifood.utils

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.khedrandbasuoni.baytifood.R

object Anim {


    fun animZoomOut(context: Context?, view: View) {
        val zoomOut = AnimationUtils.loadAnimation(context, R.anim.zoomout)
        view.startAnimation(zoomOut)
        Handler(Looper.getMainLooper()).postDelayed({
            view.clearAnimation()
            view.visibility = View.GONE
        }, zoomOut.duration)
    }

    fun animZoomIn(context: Context?, view: View) {
        view.visibility = View.VISIBLE
        val zoomIn = AnimationUtils.loadAnimation(context, R.anim.zoomin)
        view.startAnimation(zoomIn)
        Handler(Looper.getMainLooper()).postDelayed({ view.clearAnimation() }, zoomIn.duration)
    }

    fun animFadeIn(context: Context?, view: View) {
        view.visibility = View.VISIBLE
        val fadeIn = AnimationUtils.loadAnimation(context, R.anim.fadein)
        view.startAnimation(fadeIn)
        Handler(Looper.getMainLooper()).postDelayed({ view.clearAnimation() }, fadeIn.duration)
    }

    fun animFadeIn(context: Context?, view: View, duration: Int) {
        view.visibility = View.VISIBLE
        val fadeIn = AnimationUtils.loadAnimation(context, R.anim.fadein)
        fadeIn.duration = duration.toLong()
        view.startAnimation(fadeIn)
        Handler(Looper.getMainLooper()).postDelayed({ view.clearAnimation() }, fadeIn.duration)
    }

    fun animFadeOut(context: Context?, view: View) {
        val fadeOut = AnimationUtils.loadAnimation(context, R.anim.fadeout)
        view.startAnimation(fadeOut)
        Handler(Looper.getMainLooper()).postDelayed({
            view.clearAnimation()
            view.visibility = View.GONE
        }, fadeOut.duration)
    }

    fun animCenterToEnd(context: Context?, view: View) {
        val moveToEnd = AnimationUtils.loadAnimation(context, R.anim.center_to_end)
        view.startAnimation(moveToEnd)
        view.visibility = View.GONE
    }


    fun animJumpAndFade(context: Context?, view: View) {
        val jump = AnimationUtils.loadAnimation(context, R.anim.jump_and_fade)
        view.startAnimation(jump)
    }

    fun motoJumpAndFade(context: Context?, motoLayout: View, ground: View) {
        motoLayout.visibility = View.VISIBLE
        animJumpAndFade(context, motoLayout)
        animEndToStart(context, ground)
    }


    fun animEndToStart(context: Context?, view: View) {
        val endToStart = AnimationUtils.loadAnimation(context, R.anim.end_to_start)
        view.startAnimation(endToStart)
    }

    fun animCenterToTop(context: Context?, view: View) {
        val moveToEnd: Animation = AnimationUtils.loadAnimation(context, R.anim.center_to_up)
        view.startAnimation(moveToEnd)
        Handler(Looper.getMainLooper()).postDelayed({ view.visibility = View.GONE }, 1000)
    }

    fun animBottomToCenter(context: Context?, view: View) {
        view.visibility = View.VISIBLE
        val moveToCenter: Animation =
            AnimationUtils.loadAnimation(context, R.anim.bottom_to_center)
        view.startAnimation(moveToCenter)
    }


    fun animUpToCenter(context: Context?, view: View) {
        Handler(Looper.getMainLooper()).postDelayed({
            view.visibility = View.VISIBLE
            val moveToEnd: Animation =
                AnimationUtils.loadAnimation(context, R.anim.up_to_center)
            view.startAnimation(moveToEnd)
        }, 600)
    }

}