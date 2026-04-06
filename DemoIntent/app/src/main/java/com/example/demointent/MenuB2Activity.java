package com.example.demointent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuB2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_b2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Toolbar toolbar = findViewById(R.id.toolbarb2);
        setSupportActionBar(toolbar);

        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnColor = findViewById(R.id.btnColor);

        btnLogin.setOnClickListener(v -> {
            Toast.makeText(this, "Đăng nhập", Toast.LENGTH_SHORT).show();
        });
        btnColor.setOnClickListener(v -> {
            findViewById(R.id.main).setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_b2, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.menu_find) {
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_info) {
            Toast.makeText(this, "Info", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_addb2) {
            Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_update) {
            Toast.makeText(this, "Update", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_delete) {
            Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_feedback) {
            Toast.makeText(this, "Feedback", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.menu_help) {
            Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}