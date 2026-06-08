package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latihan6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btproses_lat6 = findViewById<Button>(R.id.btproses_lat6)
        val etnim_lat6 = findViewById<EditText>(R.id.etnim_lat6)
        val etnama_lat6 = findViewById<EditText>(R.id.etnama_lat6)
        val etkelas_lat6 = findViewById<EditText>(R.id.etkelas_lat6)
        val hasil_lat6 = findViewById<TextView>(R.id.hasil_lat6)

        btproses_lat6.setOnClickListener {
            val nim = etnim_lat6.text.toString()
            val nama = etnama_lat6.text.toString()
            val kelas = etkelas_lat6.text.toString()
            hasil_lat6.text = "Hai, Welcome $nim, $nama, di $kelas"
        }
    }
}