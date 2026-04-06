package com.example.lab01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class B7bsActivity extends AppCompatActivity {
    EditText edtA, edtB, edtC;
    Button btnGiai, btnXoa;
    TextView txtKetQua;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b7bs);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtC = findViewById(R.id.edtC);
        btnGiai = findViewById(R.id.btnGiai);
        btnXoa = findViewById(R.id.btnXoa);
        txtKetQua = findViewById(R.id.txtKetQua);

        btnGiai.setOnClickListener(v -> {
            String a = edtA.getText().toString();
            String b = edtB.getText().toString();
            String c = edtC.getText().toString();

            Intent intent = new Intent(B7bsActivity.this, B7bsResultActivity.class);
            intent.putExtra("a", a);
            intent.putExtra("b", b);
            intent.putExtra("c", c);

            startActivityForResult(intent, 1);
        });

        btnXoa.setOnClickListener(v -> {
            edtA.setText("");
            edtB.setText("");
            edtC.setText("");
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
