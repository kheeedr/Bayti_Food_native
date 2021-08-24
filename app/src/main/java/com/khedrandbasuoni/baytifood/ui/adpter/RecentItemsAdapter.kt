package com.khedrandbasuoni.baytifood.ui.adpter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khedrandbasuoni.baytifood.databinding.ItemRecentItemsBinding
import com.khedrandbasuoni.baytifood.pojo.Meal

class RecentItemsAdapter(var context: Context, var Item: Int, var list: List<Meal>) :
    RecyclerView.Adapter<RecentItemsAdapter.Popular>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Popular {
        return Popular(
            ItemRecentItemsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: Popular, position: Int) {
        holder.b.tvNamePopularMost.text = list[position].name
        holder.b.tvRatingsPopularMost.text = list[position].ratings.toString() + ""
        holder.b.ivPopularMost.setImageResource(list[position].image)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class Popular(var b: ItemRecentItemsBinding) : RecyclerView.ViewHolder(
        b.root
    )

    companion object {
        var Item2: Int = 0
    }

    init {
        Item2 = Item
    }
}