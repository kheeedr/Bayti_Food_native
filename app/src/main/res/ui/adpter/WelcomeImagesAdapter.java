package com.khedr_and_basuoin.deliveryapp.ui.adpter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.khedr_and_basuoin.deliveryapp.R;
import com.khedr_and_basuoin.deliveryapp.databinding.ItemSliderWelcomeBinding;

import org.jetbrains.annotations.NotNull;


public class WelcomeImagesAdapter extends RecyclerView.Adapter<WelcomeImagesAdapter.WelcomeVH> {


    @NonNull
    @NotNull
    @Override
    public WelcomeVH onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new WelcomeVH(ItemSliderWelcomeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull WelcomeVH holder, int position) {
        if (position == 0) {
            holder.b.ivWelcomeItem.setImageResource(R.drawable.iv_find_food);
            holder.b.ivSliderWelcomeItem.setImageResource(R.drawable.ic_slider_indicators1);
            holder.b.tvMainWelcomeItem.setText(R.string.find_food_you_love);
            holder.b.tvDescriptionWelcomeItem.setText(R.string.description_find_food_you_love);
        } else if (position == 1) {
            holder.b.ivWelcomeItem.setImageResource(R.drawable.iv_delivery_moto);
            holder.b.ivSliderWelcomeItem.setImageResource(R.drawable.ic_slider_indicators2);
            holder.b.tvMainWelcomeItem.setText(R.string.fast_delivery);
            holder.b.tvDescriptionWelcomeItem.setText(R.string.description_fast_delivery);
        } else if (position == 2) {
            holder.b.ivWelcomeItem.setImageResource(R.drawable.iv_live_tracking);
            holder.b.ivSliderWelcomeItem.setImageResource(R.drawable.ic_slider_indicators3);
            holder.b.tvMainWelcomeItem.setText(R.string.live_tracking);
            holder.b.tvDescriptionWelcomeItem.setText(R.string.description_live_tracking);
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public static class WelcomeVH extends RecyclerView.ViewHolder {
        ItemSliderWelcomeBinding b;

        public WelcomeVH(@NonNull @NotNull ItemSliderWelcomeBinding b) {
            super(b.getRoot());
            this.b = b;
        }
    }
}
