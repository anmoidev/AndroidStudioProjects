package com.example.demointent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuB1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_b1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_b1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_add) {
            Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_setting) {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_refresh) {
            Toast.makeText(this, "Refresh", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_ablum) {
            Toast.makeText(this, "Ablum", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.menu_phone) {
            Toast.makeText(this, "Phone", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_email) {
            Toast.makeText(this, "Email", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}