package com.example.lab01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class B7Activity extends AppCompatActivity {
    EditText edtA, edtB;
    Button btnGiai, btnXoa;
    TextView txtKetQua;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b7);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        btnGiai = findViewById(R.id.btnGiai);
        btnXoa = findViewById(R.id.btnXoa);
        txtKetQua = findViewById(R.id.txtKetQua);

        btnGiai.setOnClickListener(v -> {
            String a = edtA.getText().toString();
            String b = edtB.getText().toString();

            Intent intent = new Intent(B7Activity.this, B7ResultActivity.class);
            intent.putExtra("a", a);
            intent.putExtra("b", b);

            startActivityForResult(intent, 1);
        });

        btnXoa.setOnClickListener(v -> {
            edtA.setText("");
            edtB.setText("");
            txtKetQua.setText("Đã xóa dữ liệu");
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            String kq = data.getStringExtra("kq");
            txtKetQua.setText(kq);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
