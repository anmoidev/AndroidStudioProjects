package com.example.lab01

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class B2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_b2)

        val cbNam = findViewById<CheckBox>(R.id.cbNam)
        val cbNu = findViewById<CheckBox>(R.id.cbNu)
        val cbKhac = findViewById<CheckBox>(R.id.cbKhac)
        val btnKiemTra = findViewById<Button>(R.id.btnKiemTra)

        val listCheckBox = listOf(cbNam to "Nam", cbNu to "Nữ", cbKhac to "cbKhác")

        for ((checkBox, label) in listCheckBox) {
            checkBox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    Toast.makeText(this, "Bạn đã check vào $label", Toast.LENGTH_SHORT).show()
                }
                btnKiemTra.setOnClickListener {
                    var result = ""

                    if (cbNam.isChecked) result += "Đã check Nam"
                    if (cbNu.isChecked) result += "Đã check Nữ"
                    if (cbKhac.isChecked) result += "Đã check Khác"

                    if (result.isEmpty()) {
                        Toast.makeText(this, "Chưa có ô nào được chọn", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, result.trim(), Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

    }
}