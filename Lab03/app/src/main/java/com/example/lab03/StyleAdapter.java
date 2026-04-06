package com.example.lab03;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StyleAdapter extends BaseAdapter {
    Context context;
    List<Style> list;
    LayoutInflater inflater;
    public StyleAdapter(Context context, List<Style> list) {
        this.context  = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
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
        view = inflater.inflate(R.layout.item_style, null);
        ImageView img = view.findViewById(R.id.imgProduct);
        TextView name = view.findViewById(R.id.txtName);
        TextView price = view.findViewById(R.id.txtPrice);
        Style s = list.get(i);
        img.setImageResource(s.getImage());
        name.setText(s.getName());
        price.setText(s.getPrice());
        return view;
    }
}
