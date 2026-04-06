package com.example.anmoi

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Bai3lab01Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai3lab01)

        val cbNam = findViewById<CheckBox>(R.id.cbNam)
        val cbNu = findViewById<CheckBox>(R.id.cbNu)
        val cbKhac = findViewById<CheckBox>(R.id.cbKhac)
        val btnKiemTra = findViewById<Button>(R.id.btnKiemTra)

        cbNam.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                Toast.makeText(this, "Bạn đã check vào Nam", Toast.LENGTH_SHORT).show()
        }
        cbNu.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                Toast.makeText(this, "Bạn đã check vào Nữ", Toast.LENGTH_SHORT).show()
        }
        cbKhac.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                Toast.makeText(this, "Bạn đã check vào người khác", Toast.LENGTH_SHORT).show()
        }
        btnKiemTra.setOnClickListener {
            var result = "Bạn đã check: "
            if (cbNam.isChecked) result += "Nam "
            if (cbNu.isChecked) result += "Nữ "
            if (cbKhac.isChecked) result += "Khác "

            if (!cbNam.isChecked && !cbNu.isChecked && !cbKhac.isChecked) {
                result = "Bạn chưa chọn mục nào"
        }
            Toast.makeText(this, result, Toast.LENGTH_LONG).show()
    }
    }
}