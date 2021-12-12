package com.khedrandbasuoni.baytifood.presentation.adpter

import android.annotation.SuppressLint
import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.khedrandbasuoni.baytifood.databinding.ItemMenuSectionBinding
import com.khedrandbasuoni.baytifood.data.model.MenuSection

class MenuSectionsAdapter(var context: Context) :
    RecyclerView.Adapter<MenuSectionsAdapter.Popular>() {
    lateinit var list: ArrayList<MenuSection>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Popular {
        return Popular(
            ItemMenuSectionBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: Popular, position: Int) {
        holder.b.NameItmes.text = list[position].title
        holder.b.CountItmes.text = list[position].numOfDishes.toString() + " Items"
        holder.b.ivMenuSection.setImageResource(list[position].image)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class Popular(var b: ItemMenuSectionBinding) : RecyclerView.ViewHolder(b.root)

}