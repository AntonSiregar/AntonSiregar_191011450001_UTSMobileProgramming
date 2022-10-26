package com.example.antonsiregar_191011450001_utsmobileprogramming

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.viewmodel.viewModelFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<PulauIndonesia>()

        list.add(
            PulauIndonesia(
                "PULAU SUMATERA",
                "Pulau Sumatera terdiri dari 10 provinsi.",
                R.drawable.pulau_sumatera
            )
        )
        list.add(
            PulauIndonesia(
                "PULAU JAWA",
                "Pulau Jawa terdiri dari 6 provinsi.",
                R.drawable.pulau_jawa
            )
        )
        list.add(
            PulauIndonesia(
                "PULAU KALIMANTAN",
                "Pulau Kalimantan terdiri dari 5 provinsi.",
                R.drawable.pulau_kalimantan
            )
        )
        list.add(
            PulauIndonesia(
                "PULAU SULAWESI",
                "Pulau Sulawesi terdiri dari 6 provinsi.",
                R.drawable.pulau_sulawesi
            )
        )
        list.add(
            PulauIndonesia(
                "PULAU PAPUA",
                "Pulau Papua terdiri dari 5 provinsi.",
                R.drawable.pulau_papua
            )
        )

        listView.adapter = PulauAdapter(this, R.layout.listpulau, list)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            when (i) {
                0 -> Toast.makeText(this, "Anda Telah Memilih Pulau Sumatera", Toast.LENGTH_LONG)
                    .show()
                1 -> Toast.makeText(this, "Anda Telah Memilih Pulau Jawa", Toast.LENGTH_LONG).show()
                2 -> Toast.makeText(this, "Anda Telah Memilih Pulau Kalimantan", Toast.LENGTH_LONG)
                    .show()
                3 -> Toast.makeText(this, "Anda Telah Memilih Pulau Sulawesi", Toast.LENGTH_LONG)
                    .show()
                4 -> Toast.makeText(this, "Anda Telah Memilih Pulau Papua", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage("Apakah anda ingin keluar?")
            .setPositiveButton("Ya",
                DialogInterface.OnClickListener { dialog, which -> finish() })
            .setNegativeButton("Tidak",
                DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })
             .show()
    }
}