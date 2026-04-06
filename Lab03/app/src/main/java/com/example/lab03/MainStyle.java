package com.example.lab03;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainStyle extends AppCompatActivity {
    GridView grdStyle;
    ArrayList<Style> list;
    StyleAdapter adapter;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_style);

        grdStyle = findViewById(R.id.grdStyle);
        list = new ArrayList<>();
        list.add(new Style("Vagabond", "120.00", R .drawable.tht_lng));
        list.add(new Style("Stella", "@58.00", R.drawable.k_nh));
        list.add(new Style("Whiteney", "$35.00", R.drawable.tht_lng));
        list.add(new Style("Varsity", "$20.00", R.drawable.tt));

        adapter = new StyleAdapter(this, list);
        grdStyle.setAdapter(adapter);
    }
}
