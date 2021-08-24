package com.khedrandbasuoni.baytifood.ui.adpter

import android.annotation.SuppressLint
import android.content.Context
import com.khedrandbasuoni.baytifood.pojo.Meal
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.khedrandbasuoni.baytifood.databinding.ItemPopularMostBinding

class RatingsPopularMostAdapter(var context: Context, var Item: Int, var list: List<Meal>) :
    RecyclerView.Adapter<RatingsPopularMostAdapter.Popular>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Popular {
        return Popular(
            ItemPopularMostBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: Popular, position: Int) {
        holder.b.tvNamePopularMost.text = list[position].name
        holder.b.tvRatingsPopularMost.text = list[position].ratings.toString() + ""
        holder.b.ivPopularMost.setImageResource(list[position].image)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class Popular(var b: ItemPopularMostBinding) : RecyclerView.ViewHolder(
        b.root
    )

    companion object {
        var Item2: Int = 0
    }

    init {
        Item2 = Item
    }
}