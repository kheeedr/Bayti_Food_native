package com.khedrandbasuoni.baytifood.presentation.adpter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khedrandbasuoni.baytifood.databinding.ItemPopularDishesBinding
import com.khedrandbasuoni.baytifood.data.model.PopularDishes

class PopularDishesAdapter(var context: Context) :
    RecyclerView.Adapter<PopularDishesAdapter.ShopsVH>() {

    lateinit var list: List<PopularDishes>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopsVH {
        return ShopsVH(
            ItemPopularDishesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ShopsVH, position: Int) {
        holder.b.NameItmes.text = list[position].name
        holder.b.Product.setImageResource(list[position].image)
    }

    override fun getItemCount() = list.size


    class ShopsVH(var b: ItemPopularDishesBinding) : RecyclerView.ViewHolder(b.root)


}