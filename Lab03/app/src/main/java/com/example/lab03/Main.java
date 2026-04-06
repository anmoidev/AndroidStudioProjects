package com.example.lab03;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {
    ListView lvFootball;
    List<Player> list;
    PlayerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_football);
        initData();
    }
    private void initData() {
        lvFootball = findViewById(R.id.lvFootball);
        initFootball();
        adapter = new PlayerAdapter(this, R.layout.item_player,list);
        lvFootball.setAdapter(adapter);

    }
    private void initFootball() {
        list = new ArrayList<>();
        list.add(new Player("Pele", "Brazil", R.drawable.pele, R.drawable.brazil));
        list.add(new Player("Lionel Messi", "Argentina", R.drawable.messi, R.drawable.agentina));
        list.add(new Player("Ronaldo de Lima", "Brazil", R.drawable.ronaldo, R.drawable.brazil));
        list.add(new Player("Ronaldo", "Bồ Đào Nha", R.drawable.ronaldosu, R.drawable.bdn));
        list.add(new Player("Kylian Mbappe", "Pháp", R.drawable.mpe, R.drawable.ti_xung));
    }
}

