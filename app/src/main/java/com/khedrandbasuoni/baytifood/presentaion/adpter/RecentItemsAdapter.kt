package com.khedrandbasuoni.baytifood.presentaion.adpter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khedrandbasuoni.baytifood.databinding.ItemRecentItemsBinding
import com.khedrandbasuoni.baytifood.data.model.Meal

class RecentItemsAdapter(var context: Context) :
    RecyclerView.Adapter<RecentItemsAdapter.Popular>() {
     var list: ArrayList<Meal> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Popular {
        return Popular(
            ItemRecentItemsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: Popular, position: Int) {
        holder.b.tvNamePopularMost.text = list[position].name
        holder.b.tvRatingsPopularMost.text = list[position].ratings.toString()
        holder.b.ivPopularMost.setImageResource(list[position].image)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class Popular(var b: ItemRecentItemsBinding) : RecyclerView.ViewHolder(
        b.root
    )




}