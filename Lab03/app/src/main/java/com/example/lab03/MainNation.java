package com.example.lab03;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainNation extends AppCompatActivity {
    ListView lvNation;
    List<Nation> list;
    NationAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nation);

        lvNation = findViewById(R.id.lvNation);

        list = new ArrayList<>();

        list.add(new Nation("Pakistan", "203,392,086", "796,095 km", R.drawable.pakis));
        list.add(new Nation("Indian", "25,500,100", "652, 090 km", R.drawable.indi));
        list.add(new Nation("Iran", "77,128,000", "1,648,200 km", R.drawable.iran));
        list.add(new Nation("United States", "317,76,000", "9,629,000 km", R.drawable.uns));
        list.add(new Nation("China", "318,90,987", "5,987,000 km", R.drawable.china));

        adapter = new NationAdapter(this, R.layout.item_nation,list);
        lvNation.setAdapter(adapter);
    }
}
