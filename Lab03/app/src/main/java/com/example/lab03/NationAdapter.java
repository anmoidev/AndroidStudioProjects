package com.example.lab03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NationAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Nation> list;

    public NationAdapter(Context context, int layout, List<Nation> list) {
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
        view = inflater.inflate(layout,null);

        ImageView imgNation = view.findViewById(R.id.imgNation);
        TextView txtName = view.findViewById(R.id.txtName);
        TextView txtPopulation = view.findViewById(R.id.txtPopulation);
        TextView txtArea = view.findViewById(R.id.txtArea);

        Nation n = list.get(i);

        imgNation.setImageResource(n.getNation());
        txtName.setText(n.getName());
        txtPopulation.setText("Population: " + n.getPopulation());
        txtArea.setText("Area: " + n.getArea());
        return view;
    }
}
