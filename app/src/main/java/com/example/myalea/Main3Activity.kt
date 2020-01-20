package com.example.myalea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var image = findViewById(R.id.image1) as ImageView

        image.setOnClickListener(){
            intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
            finish();
        }
    }
}
