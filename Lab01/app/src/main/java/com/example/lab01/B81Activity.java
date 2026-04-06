package com.example.lab01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class B81Activity extends AppCompatActivity {
    EditText edtHoTen, edtQueQuan;
    RadioGroup rdgGioiTinh;
    Button btnThemMoi, btnInDS;

    ArrayList<B81> ds = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b81);

        edtHoTen = findViewById(R.id.edtTen);
        edtQueQuan = findViewById(R.id.edtQueQuan);
        rdgGioiTinh = findViewById(R.id.rgdGioiTinh);
        btnThemMoi = findViewById(R.id.btnThemMoi);
        btnInDS = findViewById(R.id.btnInDS);

        btnThemMoi.setOnClickListener(v -> {
            String hoTen = edtHoTen.getText().toString();
            String queQuan = edtQueQuan.getText().toString();

            int checkedId = rdgGioiTinh.getCheckedRadioButtonId();
            RadioButton rb = findViewById(checkedId);
            String gioiTinh = rb.getText().toString();

            B81 b = new B81(hoTen, gioiTinh, queQuan);
            ds.add(b);

            Toast.makeText(this, "Thêm thành công: " + hoTen, Toast.LENGTH_SHORT).show();
        });

        btnInDS.setOnClickListener(v -> {
            Intent intent = new Intent(B81Activity.this, B81ResultActivity.class);
            intent.putExtra("ds", ds);
            startActivity(intent);
        });
    }
}
