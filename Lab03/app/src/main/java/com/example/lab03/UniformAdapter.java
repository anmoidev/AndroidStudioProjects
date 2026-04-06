package com.example.lab03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UniformAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Uniform> list;

    public UniformAdapter(Context context, int layout, List<Uniform> list) {
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

        ImageView img = view.findViewById(R.id.imgUniform);
        TextView name = view.findViewById(R.id.txtNameUniform);
        TextView price = view.findViewById(R.id.txtPriceUni);
        TextView brand = view.findViewById(R.id.txtBrand);
        TextView rating = view.findViewById(R.id.txtRatingUni);

        Uniform u = list.get(i);

        img.setImageResource(u.getImageUni());
        name.setText(u.getNameUniform());
        price.setText(u.getPrice());
        brand.setText(u.getBrand());
        rating.setText(u.getRatingUni());
        return view;
    }
}
