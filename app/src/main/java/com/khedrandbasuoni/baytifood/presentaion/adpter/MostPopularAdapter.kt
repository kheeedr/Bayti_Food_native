package com.khedrandbasuoni.baytifood.presentaion.adpter

import android.annotation.SuppressLint
import android.content.Context
import com.khedrandbasuoni.baytifood.data.model.Meal
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.khedrandbasuoni.baytifood.databinding.ItemPopularMostBinding

class MostPopularAdapter(var context: Context) :
    RecyclerView.Adapter<MostPopularAdapter.MostPopularVH>() {
    lateinit var list: List<Meal>


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MostPopularVH {
        return MostPopularVH(
            ItemPopularMostBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MostPopularVH, position: Int) {
        holder.b.tvNamePopularMost.text = list[position].name
        holder.b.tvRatingsPopularMost.text = list[position].ratings.toString()
        holder.b.ivPopularMost.setImageResource(list[position].image)
    }

    override fun getItemCount() = list.size


    class MostPopularVH(var b: ItemPopularMostBinding) : RecyclerView.ViewHolder(b.root)


}