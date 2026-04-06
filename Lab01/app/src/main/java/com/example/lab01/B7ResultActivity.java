package com.example.lab01;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class B7ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        double a = Double.parseDouble(intent.getStringExtra("a"));
        double b = Double.parseDouble(intent.getStringExtra("b"));

        String result;

        if (a == 0){
            if (b == 0){
                result = "Phương trình vô số nghiệm";
            } else  {
                result = "Phương trình vô nghiệm";
            }
        } else {
            double x = -b/a;
            result = "Phương trình có nghiệm x = " + x;
        }
        Intent back = new Intent();
        back.putExtra("kq", result);

        setResult(RESULT_OK, back);
        finish();
    }
}
