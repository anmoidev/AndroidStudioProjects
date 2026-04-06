package com.example.lab03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {
    Button btnPlayer, btnStyle, btnNation, btnShop, btnUniform, btnWeather;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnPlayer = findViewById(R.id.btnPlayer);
        btnStyle = findViewById(R.id.btnStyle);
        btnNation = findViewById(R.id.btnNation);
        btnShop = findViewById(R.id.btnShop);
        btnUniform = findViewById(R.id.btnUniform);
        btnWeather = findViewById(R.id.btnWeather);

        btnPlayer.setOnClickListener(v -> {
            startActivity(new Intent(MainMenu.this, Main.class));
        });
        btnStyle.setOnClickListener(v -> {
            startActivity(new Intent(MainMenu.this, MainStyle.class));
        });
        btnNation.setOnClickListener(v -> {
            startActivity(new Intent(MainMenu.this, MainNation.class));
        });
        btnShop.setOnClickListener(v -> {
            startActivity(new Intent(MainMenu.this, MainShop.class));
        });
        btnUniform.setOnClickListener(v -> {
            startActivity(new Intent(MainMenu.this, MainUniform.class));
        });
        btnWeather.setOnClickListener(v -> {
            startActivity(new Intent(MainMenu.this, MainWeather.class));
        });
    }
}
