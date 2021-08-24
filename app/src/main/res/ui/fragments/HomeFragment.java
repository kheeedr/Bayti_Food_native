package com.khedr_and_basuoin.deliveryapp.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.khedr_and_basuoin.deliveryapp.MainActivity;
import com.khedr_and_basuoin.deliveryapp.R;
import com.khedr_and_basuoin.deliveryapp.ui.adpter.RatingsPopularMostAdapter;
import com.khedr_and_basuoin.deliveryapp.ui.adpter.RecentItemsAdapter;
import com.khedr_and_basuoin.deliveryapp.ui.adpter.ShopsAdapter;


public class HomeFragment extends Fragment {
    RecyclerView recyclerView, recyclerView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.rv_typeShop_home);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ShopsAdapter shopsAdapter =new ShopsAdapter(view.getContext(), R.layout.item_typeshop, MainActivity.list);
        recyclerView.setAdapter(shopsAdapter);

        recyclerView = view.findViewById(R.id.rv_popularMost_home);
        layoutManager = new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        RatingsPopularMostAdapter ratingsPopularMostAdapter =new RatingsPopularMostAdapter(view.getContext(), R.layout.item_popular_most, MainActivity.list2);
        recyclerView.setAdapter(ratingsPopularMostAdapter);

        recyclerView = view.findViewById(R.id.rv_recentItems_home);
        layoutManager = new LinearLayoutManager(view.getContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        RecentItemsAdapter recentItemsAdapter =new RecentItemsAdapter(view.getContext(), R.layout.item_recent_items, MainActivity.list2);
        recyclerView.setAdapter(recentItemsAdapter);


        return view;
    }
}