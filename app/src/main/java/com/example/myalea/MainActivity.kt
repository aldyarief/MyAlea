package com.example.myalea

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    var username: EditText? = null
    var password:EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById(R.id.btn_pindah) as Button
        var username = findViewById(R.id.username) as EditText
        var password = findViewById(R.id.password) as EditText
        var buttonexit = findViewById(R.id.btn_tutup) as Button

        button.setOnClickListener() {
            val usernameKey = username.text.toString()
            val passwordKey = password.text.toString()
            if (usernameKey.equals("admin") && passwordKey.equals("123")){
                //jika login berhasil
                Toast.makeText(getApplicationContext(), "Selamat Datang $usernameKey", Toast.LENGTH_SHORT).show()
                intent = Intent(this, Main3Activity::class.java)
                startActivity(intent)
                finish()
            }else {
                //jika login gagal
                Toast.makeText(this, "Username $usernameKey salah atau Password salah silahkan cek kembali", Toast.LENGTH_SHORT).show();
                return@setOnClickListener
            }
        }

        buttonexit.setOnClickListener(){
            finish()
        }
    }
}
