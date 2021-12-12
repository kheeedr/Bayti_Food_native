package com.khedrandbasuoni.baytifood.presentaion.adpter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.khedrandbasuoni.baytifood.databinding.ItemMealIngredientsBinding

class MealIngredientsAdapter(var context: Context, private var ingredientsList: ArrayList<String>) :
    RecyclerView.Adapter<MealIngredientsAdapter.IngredientsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientsViewHolder {
        return IngredientsViewHolder(
            ItemMealIngredientsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: IngredientsViewHolder, position: Int) {
        holder.b.tvIngredientName.text=ingredientsList[position]
    }

    override fun getItemCount(): Int {
        return ingredientsList.size
    }

    class IngredientsViewHolder(var b: ItemMealIngredientsBinding) : RecyclerView.ViewHolder(b.root)


}