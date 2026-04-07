package com.example.demointent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnB1 = findViewById(R.id.btnB1);
        Button btnB2 = findViewById(R.id.btnB2);
        Button btnB3 = findViewById(R.id.btnB3);

        btnB1.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MenuB1Activity.class));
        });
        btnB2.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MenuB2Activity.class));
        });
        btnB3.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MenuB3Activity.class));
        });
    }
}