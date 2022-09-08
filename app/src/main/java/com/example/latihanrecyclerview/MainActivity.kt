package com.example.latihanrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listProvinsi = arrayListOf(
            ListProvinsi("Nanggroe Aceh Darussalam", "Banda Aceh",R.drawable.bandaaceh),
            ListProvinsi("Sumatra Utara", "Medan",R.drawable.medan),
            ListProvinsi("Sumatra Selatan", "Palembang",R.drawable.palembang),
            ListProvinsi("Sumatra Barat", "Padang",R.drawable.padang),
            ListProvinsi("Bengkulu", "Bengkulu",R.drawable.bengkulu),
            ListProvinsi("Riau", "Pekanbaru",R.drawable.riau),
            ListProvinsi("Kepulauan Riau", "Tanjung Pinang",R.drawable.riau),
            ListProvinsi("Jambi", "Jambi",R.drawable.jambi),
            ListProvinsi("Lampung", " Bandar Lampung",R.drawable.lampung),
            ListProvinsi("Bangka Belitung", "Pangkal Pinang",R.drawable.palembang),
        )

        val adapterProvinsi = ProvinsiAdapter(listProvinsi)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val recyclerView = findViewById<RecyclerView>(R.id.rvStudent)
        recyclerView.layoutManager = lm
        recyclerView.adapter = adapterProvinsi
    }
}