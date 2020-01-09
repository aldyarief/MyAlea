package com.example.myalea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById(R.id.btn_pindah) as Button
        button.setOnClickListener() {
            intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
