package com.khedr_and_basuoin.deliveryapp.ui.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.khedr_and_basuoin.deliveryapp.R;
import com.khedr_and_basuoin.deliveryapp.databinding.ActivityWelcomeBinding;
import com.khedr_and_basuoin.deliveryapp.ui.adpter.WelcomeImagesAdapter;
import com.khedr_and_basuoin.deliveryapp.ui.login.LoginActivity;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityWelcomeBinding b;
    WelcomeImagesAdapter adapter;
    SnapHelper helper = new LinearSnapHelper();
    private static final String TAG = "WelcomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = DataBindingUtil.setContentView(this, R.layout.activity_welcome);
        b.btNextWelcome.setOnClickListener(this);
        b.tvSkipWelcome.setOnClickListener(this);
        adapter = new WelcomeImagesAdapter();
        b.rvImagesWelcome.setAdapter(adapter);
        helper.attachToRecyclerView(b.rvImagesWelcome);


        b.rvImagesWelcome.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    refreshUi();
                }
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        b.rvImagesWelcome.post(() -> b.rvImagesWelcome.smoothScrollToPosition(0));

    }

    @Override
    public void onClick(View v) {
        if (v == b.btNextWelcome) {
            int position = ((LinearLayoutManager) Objects.requireNonNull(b.rvImagesWelcome.getLayoutManager())).findFirstVisibleItemPosition();
            if (position < 2) {
                b.rvImagesWelcome.post(() -> b.rvImagesWelcome.smoothScrollToPosition(position + 1));
            } else {
                startActivity(new Intent(this, LoginActivity.class));
                finish();
            }

        } else if (v == b.tvSkipWelcome) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        }

    }

    public void refreshUi() {
        int position = ((LinearLayoutManager) Objects.requireNonNull(b.rvImagesWelcome.getLayoutManager())).findFirstVisibleItemPosition();
        if (position < 2) {
            b.btNextWelcome.setText(R.string.next);
            b.tvSkipWelcome.setVisibility(View.VISIBLE);

        } else {
            b.btNextWelcome.setText(R.string.get_started);
            b.tvSkipWelcome.setVisibility(View.INVISIBLE);
        }
    }
}