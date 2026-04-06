package com.example.lab01

import  android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class B5Activity: AppCompatActivity() {

    lateinit var edtTen : EditText
    lateinit var btnXinChao : Button
    lateinit var btnThoat : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_b5)

        edtTen = findViewById(R.id.edtTen)
        btnXinChao = findViewById(R.id.btnXinChao)
        btnThoat = findViewById(R.id.btnThoat)

        btnXinChao.setOnClickListener {
            val ten = edtTen.text.toString()
            Toast.makeText(this, "Xin chào bạn: $ten", Toast.LENGTH_LONG).show()
        }
        btnThoat.setOnClickListener {
            finish()
        }
    }

}