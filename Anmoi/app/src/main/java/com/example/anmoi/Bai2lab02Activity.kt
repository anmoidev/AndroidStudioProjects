package com.example.anmoi

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Bai2lab02Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai2lab02)

        val edtName = findViewById<EditText>(R.id.edtName)
        val btnNhap = findViewById<Button>(R.id.btnNhap)
        val tvInfo = findViewById<TextView>(R.id.tvInfo)
        val listView = findViewById<ListView>(R.id.listView)

        // Tạo ArrayList rỗng
        val arrayList = ArrayList<String>()

        // Tạo adapter
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            arrayList
        )

        listView.adapter = adapter

        // ======================
        // Nhấn nút Nhập
        btnNhap.setOnClickListener {
            val name = edtName.text.toString()

            if (name.isNotEmpty()) {
                arrayList.add(name)
                adapter.notifyDataSetChanged()
                edtName.setText("")
            }
        }

        // ======================
        // Click item ListView
        listView.setOnItemClickListener { _, _, position, _ ->

            val value = arrayList[position]

            tvInfo.text = "Position: $position, Value: $value"
        }
    }
}