package com.example.lab01;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class B9ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b9bs);

        TextView tvHoTen = findViewById(R.id.tvHTTTS);
        TextView tvGioiTinh = findViewById(R.id.tvGTTTS);
        TextView tvVanBang = findViewById(R.id.tvVB);
        ImageView imgTTS = findViewById(R.id.imgTTS);



        B9 b = (B9) getIntent().getSerializableExtra("sinh_vien_data");

        if (b != null) {
            tvHoTen.setText("Họ tên: " + b.getHoTen());
            tvGioiTinh.setText("Giới tính: " + b.getGioiTinh());

            if (b.isCkvanBang()) {
                tvVanBang.setText("Văn bàng 2: Có");
            } else {
                tvVanBang.setText("Văn bằng 2: Không");
            }
            imgTTS.setImageResource(b.getImgId());
        }
    }
}
