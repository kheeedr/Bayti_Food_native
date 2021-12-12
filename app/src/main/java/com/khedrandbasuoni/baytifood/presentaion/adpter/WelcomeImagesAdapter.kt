package com.khedrandbasuoni.baytifood.presentaion.adpter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.ItemSliderWelcomeBinding
import com.khedrandbasuoni.baytifood.presentaion.adpter.WelcomeImagesAdapter.WelcomeVH

class WelcomeImagesAdapter : RecyclerView.Adapter<WelcomeVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WelcomeVH {
        return WelcomeVH(
            ItemSliderWelcomeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: WelcomeVH, position: Int) {
        when (position) {
            0 -> {
                holder.b.ivWelcomeItem.setImageResource(R.drawable.iv_find_food)
                holder.b.ivSliderWelcomeItem.setImageResource(R.drawable.ic_slider_indicators1)
                holder.b.tvMainWelcomeItem.setText(R.string.find_food_you_love)
                holder.b.tvDescriptionWelcomeItem.setText(R.string.description_find_food_you_love)
            }
            1 -> {
                holder.b.ivWelcomeItem.setImageResource(R.drawable.iv_delivery_moto)
                holder.b.ivSliderWelcomeItem.setImageResource(R.drawable.ic_slider_indicators2)
                holder.b.tvMainWelcomeItem.setText(R.string.fast_delivery)
                holder.b.tvDescriptionWelcomeItem.setText(R.string.description_fast_delivery)
            }
            2 -> {
                holder.b.ivWelcomeItem.setImageResource(R.drawable.iv_live_tracking)
                holder.b.ivSliderWelcomeItem.setImageResource(R.drawable.ic_slider_indicators3)
                holder.b.tvMainWelcomeItem.setText(R.string.live_tracking)
                holder.b.tvDescriptionWelcomeItem.setText(R.string.description_live_tracking)
            }
        }
    }

    override fun getItemCount(): Int {
        return 3
    }

    class WelcomeVH(var b: ItemSliderWelcomeBinding) : RecyclerView.ViewHolder(b.root)
}