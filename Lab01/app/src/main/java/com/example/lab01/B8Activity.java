package com.example.lab01;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class B8Activity extends AppCompatActivity {

    EditText edTen, edtQue;
    RadioButton rdNam, rdNu;
    Button btnThem, btnInDs;

    ArrayList<String> danhSach = new ArrayList<>();

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b8);

        edTen = findViewById(R.id.edtTen);
        edtQue = findViewById(R.id.edtQue);
        rdNam = findViewById(R.id.rdNam);
        rdNu = findViewById(R.id.rdNu);
        btnThem = findViewById(R.id.btnThem);
        btnInDs = findViewById(R.id.btnInds);

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edTen.getText().toString();
                String que = edtQue.getText().toString();
                String gioiTinh = "";

                if (rdNam.isChecked()) {
                    gioiTinh = "Nam";
                } else if (rdNu.isChecked()) {
                    gioiTinh = "Nữ";
                }
                String nv = ten + " - " +gioiTinh + " - " + que;
                danhSach.add(nv);
                Toast.makeText(B8Activity.this, "Thêm mới thành công: "+ ten, Toast.LENGTH_SHORT).show();
                edTen.setText("");
                edtQue.setText("");
            }
        });
        btnInDs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B8Activity.this, B8ResultActivity.class);
                intent.putStringArrayListExtra("ds", danhSach);
                startActivity(intent);
            }
        });
    }

}
