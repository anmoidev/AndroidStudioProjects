package com.example.lab03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlayerAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Player> list;

    public PlayerAdapter(Context context, int layout, List<Player> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        TextView txtFullName, txtAddress;
        ImageView imgAvatar, imgFlag;
        txtFullName = view.findViewById(R.id.txtfullname);
        txtAddress = view.findViewById(R.id.txtAddress);
        imgAvatar = view.findViewById(R.id.imgAvatar);
        imgFlag = view.findViewById(R.id.imgFlag);
        Player foot = list.get(i);
        txtFullName.setText(foot.getFullName());
        txtAddress.setText(foot.getAddress());
        imgAvatar.setImageResource(foot.getAvatar());
        imgFlag.setImageResource(foot.getFlag());
        return view;
    }

}
