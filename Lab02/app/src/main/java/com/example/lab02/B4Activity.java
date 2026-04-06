package com.example.lab02;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Calendar;

public class B4Activity extends AppCompatActivity {
    EditText edtCongViec, edtNoiDung;
    TextView txtDate, txtTime;
    Button btnDate, btnTime, btnThem;
    ListView listView;

    ArrayList<String> dsCV;
    ArrayAdapter<String> adapter;

    String ngay = "", gio = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_b4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edtCongViec = findViewById(R.id.edtCongViec);
        edtNoiDung = findViewById(R.id.edtNoiDung);
        txtDate = findViewById(R.id.txtNgayHT);
        txtTime = findViewById(R.id.txtGioHT);
        btnDate = findViewById(R.id.btnDate);
        btnTime = findViewById(R.id.btnTime);
        btnThem = findViewById(R.id.btnThemCV);

        dsCV = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsCV);
        listView.setAdapter(adapter);

        btnDate.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();

            DatePickerDialog dialog = new DatePickerDialog(
                    B4Activity.this,(view, year, month, dayOfMonth) -> {
                        ngay = dayOfMonth + "/" + (month + 1) + "/" +year;
                        txtDate.setText(ngay);
            },
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH)
            );
            dialog.show();
        });

        btnTime.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();

            TimePickerDialog dialog = new TimePickerDialog(
                    B4Activity.this, (view, hourOfDay, minute) -> {
                        gio = hourOfDay + ":" + minute;
                        txtTime.setText(gio);
            },
                    calendar.get(Calendar.HOUR_OF_DAY),
                    calendar.get(Calendar.MINUTE),
                    true
            );
            dialog.show();
        });
        btnThem.setOnClickListener(v -> {
            String cv =  edtCongViec.getText().toString();
            String nd = edtNoiDung.getText().toString();

            String item = cv + " - " + ngay + " - " + gio;
            dsCV.add(item);
            adapter.notifyDataSetChanged();

            edtCongViec.setText("");
            edtNoiDung.setText("");
            txtDate.setText("Chưa chọn ngày");
            txtTime.setText("Chưa chọn giờ");
            ngay = "";
            gio = "";
        });
    }
}