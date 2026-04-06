package com.example.lab01;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class B8ResultActivity extends AppCompatActivity {
    TextView txtDS;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b8bs);

        txtDS = findViewById(R.id.txtDS);
        ArrayList<String> danhSach = getIntent().getStringArrayListExtra("ds");
        String result = "";
        if (danhSach != null) {
            for (String nv : danhSach) {
                result += nv + "\n";
            }
        }
        txtDS.setText(result);
    }
}
