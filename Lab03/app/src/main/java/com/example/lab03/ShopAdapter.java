package com.example.lab03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ShopAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Shop> list;

    public ShopAdapter(Context context, int layout, List<Shop> list){
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

        ImageView img = view.findViewById(R.id.imgItemShop);
        TextView name = view.findViewById(R.id.txtnameshop);
        TextView rating = view.findViewById(R.id.txtRating);
        TextView stock = view.findViewById(R.id.txtStock);
        TextView price = view.findViewById(R.id.txtPrice);

        Shop p = list.get(i);

        img.setImageResource(p.getImg());
        name.setText(p.getName());
        rating.setText(p.getRating());
        stock.setText(p.getStock());
        price.setText(p.getPrice());
        return view;
    }
}
