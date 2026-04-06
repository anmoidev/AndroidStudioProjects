package com.example.lab03;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainUniform extends AppCompatActivity {
    GridView gridUni;
    ArrayList<Uniform> list;
    UniformAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uniform);

        gridUni = findViewById(R.id.gridUni);

        list = new ArrayList<>();

        list.add(new Uniform("Item Sets", "$45.00", "WA Dress", "★★★★★", R.drawable.ad));
        list.add(new Uniform("Item Dress", "$45.00", "WA Dress", "★★★★", R.drawable.pb));
        list.add(new Uniform("Item Shirt", "$50.00", "WA Dress", "★★★★★", R.drawable.pn));
        list.add(new Uniform("Item Style", "$40.00", "WA Dress", "★★★★★", R.drawable.dr));

        adapter = new UniformAdapter(this, R.layout.item_uniform, list);
        gridUni.setAdapter(adapter);
    }
}
