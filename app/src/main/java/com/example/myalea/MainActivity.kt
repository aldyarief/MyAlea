package com.example.myalea


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    //Dibawah ini merupakan perintah untuk mendefinikan View

    val Total: TextView? = null
    val Baik: TextView? = null
    val Gajie: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Inisialisasi dari View

        val Total = findViewById(R.id.txTotal) as TextView
        val Baik = findViewById(R.id.txBaik) as TextView
        val Gajie = findViewById(R.id.txTotalGajie) as TextView
        val TotalGaji = findViewById(R.id.txTotalGaji) as EditText
        val TotalHari = findViewById(R.id.txTotalHariLembur) as EditText
        val TotalJam = findViewById(R.id.txTotalJamLembur) as EditText
        val Lain = findViewById(R.id.txLain) as EditText


        var buttonProses = findViewById(R.id.buttonProses) as Button

        buttonProses.setOnClickListener{
            var Gaji : Int;var Hari : Int;var Jam : Int;var Laine : Int
            Gaji = TotalGaji.getText().toString().toInt()
            Hari = TotalHari.getText().toString().toInt()
            Jam = TotalJam.getText().toString().toInt()
            Laine = Lain.getText().toString().toInt()

            if (Gaji == 0) {
                Toast.makeText(this, "Gaji Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                return@setOnClickListener
            }else{
                val hasil = ((Gaji * 1 / 173) * 1.5 * Hari) + (Gaji / 1 / 173) * 2 * (Jam - Hari)
                val UangBaik = Gaji*5/100
                val GTGaji = Gaji + hasil + UangBaik + Laine

                Total.setText(hasil.toInt().toString())
                Baik.setText(UangBaik.toInt().toString())
                Gajie.setText(GTGaji.toInt().toString())
            }
        }
    }
}
