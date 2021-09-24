package com.khedrandbasuoni.baytifood.utils

import android.content.Context
import android.content.SharedPreferences
import android.content.res.Configuration
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.google.android.material.textfield.TextInputLayout
import com.khedrandbasuoni.baytifood.R

object UiUtils {
    private lateinit var toast: Toast
    fun shortToast(context: Context, message: String) {
        toast.cancel()
        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        toast.show()
    }
//  TODO() In

//    fun showLoginFragment(activity: AppCompatActivity, TAG: String?) {
//        val fragment = ToLoginBottomSheetFragment()
//        fragment.show(activity.getSupportFragmentManager(), TAG)
//        //        activity.getSupportFragmentManager().executePendingTransactions();
//    }
//
//    fun showLoginFragment(activity: FragmentActivity, TAG: String?) {
//        val fragment = ToLoginBottomSheetFragment()
//        fragment.show(activity.getSupportFragmentManager(), TAG)
//    }

//    fun getImageViaUrl(context: Context, url: String, imageView: ImageView, progressBar: View) {
//        progressBar.visibility = View.VISIBLE
//        Anim.animJumpAndFade(context, progressBar)
//        Glide.with(context).load(url).listener(object : RequestListener<Drawable> {
//            override fun onLoadFailed(
//                p0: GlideException?,
//                p1: Any?,
//                p2: Target<Drawable>?,
//                p3: Boolean
//            ): Boolean {
//
//                shortToast(context, "failed to load image")
//                progressBar.clearAnimation()
//                progressBar.visibility = View.INVISIBLE
//                return false
//            }
//
//            override fun onResourceReady(
//                resource: Drawable,
//                model: Any?,
//                target: Target<Drawable>?,
//                dataSource: DataSource?,
//                isFirstResource: Boolean
//            ): Boolean {
//                progressBar.clearAnimation()
//                progressBar.visibility = View.INVISIBLE
//                return false
//            }
//        }).timeout(30000).into(imageView)
//    }
//
//    fun getImageViaUrl(
//        context: Context,
//        url: String?,
//        imageView: ImageView?,
//        isUserImage: Boolean
//    ) {
//        val pref: SharedPreferences = context.getSharedPreferences("logined", 0)
//        Glide.with(context).load(url).listener(object : RequestListener<Drawable> {
//            override fun onLoadFailed(
//                e: GlideException?,
//                model: Any?,
//                target: Target<Drawable>?,
//                isFirstResource: Boolean
//            ): Boolean {
//                shortToast(context,"failed to load image")
//                return false
//            }
//
//            override fun onResourceReady(
//                resource: Drawable,
//                model: Any?,
//                target: Target<Drawable>?,
//                dataSource: DataSource?,
//                isFirstResource: Boolean
//            ): Boolean {
//                if (isUserImage) {
//                    val pen: SharedPreferences.Editor = pref.edit()
//                    pen.putBoolean(context.getString(R.string.pref_is_image_ready), true)
//                    pen.putString(
//                        context.getString(R.string.pref_user_image),
//                        Converters.fromBitmapToString((resource as BitmapDrawable).getBitmap())
//                    )
//                    pen.apply()
//                }
//                return false
//            }
//        }).timeout(30000).into(imageView)
//    }


//    fun setLocale(context: Context) {
//        val newLocale = getAppLang(context)
//        val locale = Locale(newLocale)
//        Locale.setDefault(locale)
//        val config = Configuration()
//        config.locale = locale
//        context.resources.updateConfiguration(config, context.resources.displayMetrics)
//    }

    //    fun getAppLang(context: Context): String {
//        val appLang: String = UserUtils.getPref(context)
//            .getString(context.getString(R.string.pref_app_language), "ar")
//        return if (appLang != "") {
//            appLang
//        } else {
//            val defaultLocale = Resources.getSystem().configuration.locale
//            if (defaultLocale.language == "ar") {
//                "ar"
//            } else {
//                "en"
//            }
//        }
//    }
    fun countWordsUsingSplit(input: String?): Int {
        if (input == null || input.isEmpty()) {
            return 0
        }
        val words = input.split("\\s+").toTypedArray()
        return words.size
    }

    fun makeTextError(editText: EditText, errorMessage: String?) {
        editText.error = errorMessage
        editText.requestFocus()
    }

    fun makeTextError(editText: TextInputLayout, errorMessage: String?) {
        editText.error = errorMessage
    }

    fun makeTvPlusOne(textView: TextView) {
        val oldQ: Int = textView.text.toString().toInt()
        val newQ = oldQ + 1
        textView.text = newQ.toString()
    }

    fun makeTvMinusOne(textView: TextView) {
        val oldQ: Int = textView.text.toString().toInt()
        if (oldQ > 1) {
            val newQ = oldQ - 1
            textView.text = newQ.toString()
        }
    }
}