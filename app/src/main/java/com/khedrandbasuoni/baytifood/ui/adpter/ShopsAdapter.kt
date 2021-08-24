package com.khedrandbasuoni.baytifood.ui.adpter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khedrandbasuoni.baytifood.databinding.ItemTypeshopBinding
import com.khedrandbasuoni.baytifood.pojo.Meal

class ShopsAdapter(var context: Context, var Item: Int, var list: List<Meal>) :
    RecyclerView.Adapter<ShopsAdapter.Popular>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Popular {
        return Popular(
            ItemTypeshopBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: Popular, position: Int) {
        holder.b.NameItmes.text = list[position].name
        holder.b.Product.setImageResource(list[position].image)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class Popular(var b: ItemTypeshopBinding) : RecyclerView.ViewHolder(
        b.root
    )

    companion object {
        var Item2: Int = 0
    }

    init {
        Item2 = Item
    }
}