package com.khedrandbasuoni.baytifood.ui.activities.product

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.ActivityProductBinding
import com.khedrandbasuoni.baytifood.ui.adpter.ProductImagesAdapter


import androidx.recyclerview.widget.PagerSnapHelper
import com.khedrandbasuoni.baytifood.ui.adpter.MealIngredientsAdapter
import com.khedrandbasuoni.baytifood.utils.Anim
import com.khedrandbasuoni.baytifood.utils.UiUtils


class ProductActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var b: ActivityProductBinding
    private var imagesList: ArrayList<Int> = ArrayList()
    private var ingredientsList: ArrayList<String> = ArrayList()
    private var isChooseIngredientsOpen = false

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_product)
        imagesList.apply {
            add(R.drawable.img_koshary5)
            add(R.drawable.img_egyptian_food)
            add(R.drawable.img_koshary4)
            add(R.drawable.img_koshary2)
            add(R.drawable.img_koshary3)
        }
        ingredientsList.apply {
            add("rice")
            add("spaghetti")
            add("macaroni")
            add("lentil")
            add("chickpeas")
            add("crispy fried onion")
            add("tomato sauce")
            add("garlic sauce")
        }
        b.layoutSelectIngredientsProductDetails.setOnClickListener(this)
        b.ivPlusProductDetails.setOnClickListener(this)
        b.ivMinusProductDetails.setOnClickListener(this)

        b.rvImagesProduct.adapter = ProductImagesAdapter(this, imagesList)
        b.rvIngredients.adapter = MealIngredientsAdapter(this, ingredientsList)

        val pagerSnapHelper = PagerSnapHelper()
        pagerSnapHelper.attachToRecyclerView(b.rvImagesProduct)
        b.indicator.attachToRecyclerView(b.rvImagesProduct, pagerSnapHelper)

    }

    override fun onClick(v: View?) {
        when (v) {
            b.layoutSelectIngredientsProductDetails -> {
                isChooseIngredientsOpen = if (isChooseIngredientsOpen) {
                    Anim.animFadeOut(this, b.rvIngredients)
                    b.ivIngredientsCollapse.rotation = 0f
                    false
                } else {
                    Anim.animFadeIn(this, b.rvIngredients)
                    b.ivIngredientsCollapse.rotation = 180f
                    true
                }
            }
            b.ivPlusProductDetails -> {
                UiUtils.makeTvPlusOne(b.tvEditableQuantityProductDetails)
            }
            b.ivMinusProductDetails -> {
                UiUtils.makeTvMinusOne(b.tvEditableQuantityProductDetails)
            }
        }
    }

}