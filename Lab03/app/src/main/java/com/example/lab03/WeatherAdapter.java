package com.example.lab03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WeatherAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Weather> list;

    public WeatherAdapter(Context context, int layout, List<Weather> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(layout, null);

        ImageView imgWeather = view.findViewById(R.id.imgWeather);
        TextView city = view.findViewById(R.id.txtCity);
        TextView weather = view.findViewById(R.id.txtWeather);
        TextView temp = view.findViewById(R.id.txtTemp);

        Weather w = list.get(i);

        imgWeather.setImageResource(w.getImgWeather());
        city.setText(w.getCity());
        weather.setText(w.getWeather());
        temp.setText(w.getTemp());

        return view;
    }
}
