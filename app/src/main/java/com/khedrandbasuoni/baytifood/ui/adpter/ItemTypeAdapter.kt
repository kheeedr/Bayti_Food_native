package com.khedrandbasuoni.baytifood.ui.adpter

import android.annotation.SuppressLint
import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.khedrandbasuoni.baytifood.pojo.ProductsType
import com.khedrandbasuoni.baytifood.databinding.ItemTypeBinding

class ItemTypeAdapter(var context: Context, private var Item: Int, var list: List<ProductsType>) :
    RecyclerView.Adapter<ItemTypeAdapter.Popular>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Popular {
        return Popular(ItemTypeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: Popular, position: Int) {
        holder.b.NameItmes.text = list[position].title
        holder.b.CountItmes.text = list[position].count.toString() + " Items"
        holder.b.Product.setImageResource(list[position].images)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class Popular(var b: ItemTypeBinding) : RecyclerView.ViewHolder(
        b.root
    )

    companion object {
        var Item2: Int = 0
    }

    init {
        Item2 = Item
    }
}