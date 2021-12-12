package com.khedrandbasuoni.baytifood.presentaion.adpter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.khedrandbasuoni.baytifood.presentaion.adpter.ProductImagesAdapter.ImagesViewHolder
import android.view.ViewGroup
import android.view.LayoutInflater
import com.khedrandbasuoni.baytifood.databinding.ItemProductImagesBinding

class ProductImagesAdapter(var context: Context, private var imagesList: ArrayList<Int>) :
    RecyclerView.Adapter<ImagesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesViewHolder {
        return ImagesViewHolder(
            ItemProductImagesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {
        holder.b.ivItemImages.setImageResource(imagesList[position])
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }

    class ImagesViewHolder(var b: ItemProductImagesBinding) : RecyclerView.ViewHolder(b.root)


}