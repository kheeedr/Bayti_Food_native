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
import com.khedr_and_basuoin.deliveryapp.pago.ProductsType;
import com.khedr_and_basuoin.deliveryapp.ui.adpter.ItemTypeAdapter;
import com.khedr_and_basuoin.deliveryapp.ui.adpter.ShopsAdapter;

public class MenuFragment extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_, container, false);

        recyclerView = view.findViewById(R.id.rv_typeOrder_menu);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ItemTypeAdapter itemTypeAdapter =new ItemTypeAdapter(view.getContext(), R.layout.item_type, MainActivity.Products);
        recyclerView.setAdapter(itemTypeAdapter);
        return view;

    }
}