package com.example.lab01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class B9Activity extends AppCompatActivity {
    EditText edtNameTTS;
    RadioGroup rgGioiTinh;
    CheckBox ckVanBang2;
    ImageView imgTTS;
    Button btnXemTT, btnHuyy;

    int imageId = R.drawable.z7488443946332_57d1fc9d35ff1371f55a489cde86bb0d;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b9);

        edtNameTTS = findViewById(R.id.edtNameTTS);
        rgGioiTinh = findViewById(R.id.rgGioiTinh);
        ckVanBang2 = findViewById(R.id.cbVanBang);
        imgTTS = findViewById(R.id.imgTTS);
        btnXemTT = findViewById(R.id.btnXemTT);
        btnHuyy = findViewById(R.id.btnHuyy);

        imgTTS.setImageResource(imageId);

        btnXemTT.setOnClickListener(v -> {
            String name = edtNameTTS.getText().toString().trim();
            if (name.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập tên", Toast.LENGTH_SHORT).show();
                return;
            }
            int checkedId = rgGioiTinh.getCheckedRadioButtonId();
            if (checkedId == -1) {
                Toast.makeText(this, "Vui lòng chọn giới tính", Toast.LENGTH_SHORT).show();
                return;
            }
            RadioButton rb = findViewById(checkedId);
            String but = rb.getText().toString();

            boolean cBang = ckVanBang2.isChecked();

            int imgId = R.drawable.z7488443946332_57d1fc9d35ff1371f55a489cde86bb0d;

            B9 b = new B9(name, but, cBang, imgId);

            Intent intent = new Intent(B9Activity.this, B9ResultActivity.class);
            intent.putExtra("sinh_vien_data", b);

            intent.putExtra("image", imageId);
            startActivity(intent);
        });
        btnHuyy.setOnClickListener(v -> {
            edtNameTTS.setText("");
            rgGioiTinh.clearCheck();
            ckVanBang2.setChecked(false);
            imgTTS.setImageResource(R.drawable.z7488443946332_57d1fc9d35ff1371f55a489cde86bb0d);

            edtNameTTS.requestFocus();
            Toast.makeText(B9Activity.this, "Đã xóa toàn bộ thông tin", Toast.LENGTH_SHORT).show();
        });
    }
}
