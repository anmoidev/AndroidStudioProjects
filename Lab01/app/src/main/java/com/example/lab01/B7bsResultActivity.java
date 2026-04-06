package com.example.lab01;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class B7bsResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        double a = Double.parseDouble(intent.getStringExtra("a"));
        double b = Double.parseDouble(intent.getStringExtra("b"));
        double c = Double.parseDouble(intent.getStringExtra("c"));

        String kq;

        if (a == 0){
            if (b == 0){
                kq = (c == 0) ? "Vô số nghiệm" : "Vô nghiệm";
            } else {
                kq = "x = " + (-c / b);
            }
        } else {
            double delta = b*b - 4*a*c;

            if (delta < 0) {
                kq = "Vô nghiệm";
            } else if (delta == 0) {
                kq = "x = " + (-b / (2*a));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                kq = "x1 = " + x1 + ", x2 = " + x2;
            }
        }

        Intent resultIntent = new Intent();
        resultIntent.putExtra("kq", kq);
        setResult(RESULT_OK, resultIntent);

        finish();

    }
}
