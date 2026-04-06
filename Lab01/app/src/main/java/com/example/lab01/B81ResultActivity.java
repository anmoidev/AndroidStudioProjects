package com.example.lab01;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class B81ResultActivity extends AppCompatActivity {
    ListView lvDSNV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b81bs);

        lvDSNV = findViewById(R.id.lvDSNV);

        ArrayList<B81> ds = (ArrayList<B81>) getIntent().getSerializableExtra("ds");
        ArrayAdapter<B81> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ds);

        lvDSNV.setAdapter(adapter);
    }
}
