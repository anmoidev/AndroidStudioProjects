package com.example.lab03;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainWeather extends AppCompatActivity {
    ListView lvWeather;
    ArrayList<Weather> list;
    WeatherAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        list = new ArrayList<>();
        lvWeather = findViewById(R.id.lvWeather);

        list.add(new Weather("Berlin", "Showery", "0°C", R.drawable.tri_tuyt));
        list.add(new Weather("Bangalore", "ThunderStorm", "23°C", R.drawable.sm_chp));
        list.add(new Weather("London", "Rainy", "5°C", R.drawable.ma));
        list.add(new Weather("New York", "Cloudy", "18°C", R.drawable.cloudy));
        list.add(new Weather("Sydney", "Sunny", "32°C", R.drawable.sunny));

        adapter = new WeatherAdapter(this, R.layout.item_weather, list);
        lvWeather.setAdapter(adapter);
    }
}
