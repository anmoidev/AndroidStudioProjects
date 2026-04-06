package com.example.lab01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btnBai1)
        val btn2 = findViewById<Button>(R.id.btnBai2)
        val btn5 = findViewById<Button>(R.id.btnBai5)
        val btn7 = findViewById<Button>(R.id.btnBai7)
        val btn7bs = findViewById<Button>(R.id.btnBai7bs)
        val btn8 = findViewById<Button>(R.id.btnBai8)
        val btn8bs = findViewById<Button>(R.id.btnBai8bs)
        val btn9 = findViewById<Button>(R.id.btnBai9)

        btn1.setOnClickListener {
            val intent = Intent(this, B1Activity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this, B2Activity::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(this, B5Activity::class.java)
            startActivity(intent)
        }
        btn7.setOnClickListener {
            val intent = Intent(this, B7Activity::class.java)
            startActivity(intent)
        }
        btn7bs.setOnClickListener {
            val intent = Intent(this, B7bsActivity::class.java)
            startActivity(intent)
        }
        btn8.setOnClickListener {
            val intent = Intent(this, B8Activity::class.java)
            startActivity(intent)
        }
        btn8bs.setOnClickListener {
            val intent = Intent(this, B81Activity::class.java)
            startActivity(intent)
        }
        btn9.setOnClickListener {
            val intent = Intent(this, B9Activity::class.java)
            startActivity(intent)
        }
    }
}