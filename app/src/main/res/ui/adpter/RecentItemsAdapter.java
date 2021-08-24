package com.khedr_and_basuoin.deliveryapp.ui.adpter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.khedr_and_basuoin.deliveryapp.databinding.ItemPopularMostBinding;
import com.khedr_and_basuoin.deliveryapp.databinding.ItemRecentItemsBinding;
import com.khedr_and_basuoin.deliveryapp.pago.Meal;


import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecentItemsAdapter extends RecyclerView.Adapter<RecentItemsAdapter.Popular> {
    Context context;
    List<Meal> list;
    Integer Item;
    static Integer Item2;


    public RecentItemsAdapter(Context context, Integer Item, List<Meal> list) {
        this.context = context;
        this.list = list;
        this.Item = Item;
        this.Item2 = this.Item;

    }


    @NonNull
    @NotNull
    @Override
    public Popular onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new RecentItemsAdapter.Popular(ItemRecentItemsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Popular holder, int position) {
        holder.b.tvNamePopularMost.setText(list.get(position).getName());
        holder.b.tvRatingsPopularMost.setText(list.get(position).getRatings()+"");
        holder.b.ivPopularMost.setImageResource(list.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public static final class Popular extends RecyclerView.ViewHolder {
        ItemRecentItemsBinding b;
        public Popular(@NonNull ItemRecentItemsBinding b) {
            super(b.getRoot());
            this.b = b;

        }
    }
}
