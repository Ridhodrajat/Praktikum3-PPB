package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class TugasPraktikum2 : AppCompatActivity() {

    private lateinit var lampu: ImageView
    private lateinit var btnTurn: Button

    private lateinit var rbPutih: RadioButton
    private lateinit var rbKuning: RadioButton
    private lateinit var rbBiru: RadioButton

    private var lampuNyala = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_praktikum2)

        // Inisialisasi komponen
        lampu = findViewById(R.id.lampuoff)
        btnTurn = findViewById(R.id.bt_turnon)

        rbPutih = findViewById(R.id.rb_putih)
        rbKuning = findViewById(R.id.rb_kuning)
        rbBiru = findViewById(R.id.rb_biru)

        // Kondisi awal
        lampu.setImageResource(R.drawable.ic_lamp_light_off)

        // Tombol ON/OFF
        btnTurn.setOnClickListener {

            lampuNyala = !lampuNyala

            if (lampuNyala) {

                btnTurn.text = "TURN OFF"

                when {
                    rbPutih.isChecked -> {
                        lampu.setImageResource(
                            R.drawable.ic_lamp_light_on_white
                        )
                    }

                    rbKuning.isChecked -> {
                        lampu.setImageResource(
                            R.drawable.ic_lamp_light_on_yellow
                        )
                    }

                    rbBiru.isChecked -> {
                        lampu.setImageResource(
                            R.drawable.ic_lamp_light_on_blue
                        )
                    }

                    else -> {
                        lampu.setImageResource(
                            R.drawable.ic_lamp_light_on_white
                        )
                    }
                }

            } else {

                btnTurn.text = "TURN ON"

                lampu.setImageResource(
                    R.drawable.ic_lamp_light_off
                )
            }
        }

        // Radio Button Putih
        rbPutih.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked && lampuNyala) {
                lampu.setImageResource(
                    R.drawable.ic_lamp_light_on_white
                )
            }
        }

        // Radio Button Kuning
        rbKuning.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked && lampuNyala) {
                lampu.setImageResource(
                    R.drawable.ic_lamp_light_on_yellow
                )
            }
        }

        // Radio Button Biru
        rbBiru.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked && lampuNyala) {
                lampu.setImageResource(
                    R.drawable.ic_lamp_light_on_blue
                )
            }
        }
    }
}