package com.khedr_and_basuoin.deliveryapp.ui.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.khedr_and_basuoin.deliveryapp.*;
import com.khedr_and_basuoin.deliveryapp.databinding.ItemSliderWelcomeBinding;
import com.khedr_and_basuoin.deliveryapp.databinding.ItemTypeshopBinding;
import com.khedr_and_basuoin.deliveryapp.pago.Meal;


import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ShopsAdapter extends RecyclerView.Adapter<ShopsAdapter.Popular> {
    Context context;
    List<Meal> list;
    Integer Item;
    static Integer Item2;


    public ShopsAdapter(Context context, Integer Item, List<Meal> list) {
        this.context = context;
        this.list = list;
        this.Item = Item;
        this.Item2 = this.Item;

    }


    @NonNull
    @NotNull
    @Override
    public Popular onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new ShopsAdapter.Popular(ItemTypeshopBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Popular holder, int position) {
        holder.b.NameItmes.setText(list.get(position).getName());
        holder.b.Product.setImageResource(list.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public static final class Popular extends RecyclerView.ViewHolder {
        ItemTypeshopBinding b;
        public Popular(@NonNull ItemTypeshopBinding b) {
            super(b.getRoot());
            this.b = b;

        }
    }
}
