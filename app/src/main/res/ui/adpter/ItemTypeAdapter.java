package com.khedr_and_basuoin.deliveryapp.ui.adpter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.khedr_and_basuoin.deliveryapp.databinding.ItemTypeBinding;
import com.khedr_and_basuoin.deliveryapp.databinding.ItemTypeshopBinding;
import com.khedr_and_basuoin.deliveryapp.pago.Meal;
import com.khedr_and_basuoin.deliveryapp.pago.ProductsType;


import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ItemTypeAdapter extends RecyclerView.Adapter<ItemTypeAdapter.Popular> {
    Context context;
    List<ProductsType> list;
    Integer Item;
    static Integer Item2;


    public ItemTypeAdapter(Context context, Integer Item, List<ProductsType> list) {
        this.context = context;
        this.list = list;
        this.Item = Item;
        this.Item2 = this.Item;

    }


    @NonNull
    @NotNull
    @Override
    public Popular onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new ItemTypeAdapter.Popular(ItemTypeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Popular holder, int position) {

        holder.b.NameItmes.setText(list.get(position).getTitle());
        holder.b.CountItmes.setText(list.get(position).getCount()+" Items");
        holder.b.Product.setImageResource(list.get(position).getImages());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public static final class Popular extends RecyclerView.ViewHolder {
        ItemTypeBinding b;
        public Popular(@NonNull ItemTypeBinding b) {
            super(b.getRoot());
            this.b = b;

        }
    }
}
