package com.example.anmoi

import android.app.AlertDialog
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Bai1lab02Activity : AppCompatActivity() {

    lateinit var edtInput: EditText
    lateinit var btnThem: Button
    lateinit var btnSua: Button
    lateinit var listView: ListView

    lateinit var arrayList: ArrayList<String>
    lateinit var adapter: ArrayAdapter<String>

    var selectedPosition = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai1lab02)

        edtInput = findViewById(R.id.edtInput)
        btnThem = findViewById(R.id.btnThem)
        btnSua = findViewById(R.id.btnSua)
        listView = findViewById(R.id.listView)

        arrayList = arrayListOf("Android", "PHP", "NodeJS", "JavaScript", "Java", "C#")

        adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            arrayList)

        listView.adapter = adapter


        btnThem.setOnClickListener {
            val text = edtInput.text.toString()
            if (text.isNotEmpty()) {
                arrayList.add(text)
                adapter.notifyDataSetChanged()
                edtInput.setText("")
            }
        }

        listView.setOnItemClickListener { _, _, position, _ ->
            selectedPosition = position
            edtInput.setText(arrayList[position])

            Toast.makeText(this,
                "Vị trí: $position",
                Toast.LENGTH_SHORT).show()
        }

        btnSua.setOnClickListener {
            val text = edtInput.text.toString()
            if (selectedPosition != -1 && text.isNotEmpty()) {
                arrayList[selectedPosition] = text
                adapter.notifyDataSetChanged()
                edtInput.setText("")
                selectedPosition = -1
            }
        }

        listView.setOnItemLongClickListener { _, _, position, _ ->

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Cảnh báo")
            builder.setMessage("Bạn thật sự muốn xóa?")

            builder.setPositiveButton("CÓ") { _, _ ->
                arrayList.removeAt(position)
                adapter.notifyDataSetChanged()
            }

            builder.setNegativeButton("KHÔNG", null)

            builder.show()

            true
        }
    }
}