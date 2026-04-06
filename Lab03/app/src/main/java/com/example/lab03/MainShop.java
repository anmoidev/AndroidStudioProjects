package com.example.lab03;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainShop extends AppCompatActivity {
    ListView lvShop;
    List<Shop> list;
    ShopAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        lvShop = findViewById(R.id.lvShop);
        list = new ArrayList<>();

        list.add(new Shop("Oster Designed for Life 7-Speed Blender", "★★★★☆ (204)", "In Stock in Cook & Dine", "$59.88", R.drawable.mxcf));
        list.add(new Shop("Ninja Professional", "★★★★★ (11)", "In Stock in Cook & Dine", "$89.00", R.drawable.mxst));
        list.add(new Shop("Rival 6-Speed Blender", "★★★☆☆ (30)", "In Stock in Cook & Dine", "$13.47", R.drawable.mxt));

        adapter = new ShopAdapter(this, R.layout.item_shop, list);
        lvShop.setAdapter(adapter);
    }
}
