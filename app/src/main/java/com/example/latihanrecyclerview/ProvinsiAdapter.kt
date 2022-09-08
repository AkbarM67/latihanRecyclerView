package com.example.latihanrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProvinsiAdapter(val listProvinsi: ArrayList<ListProvinsi>): RecyclerView.Adapter<ProvinsiAdapter.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var namaProvinsi = view.findViewById<TextView>(R.id.txtNamaProvinsi)
        var namaKabupaten = view.findViewById<TextView>(R.id.txtNamakabupaten)
        var imgDaerah = view.findViewById<ImageView>(R.id.imgDaerah)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_provinsi, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaProvinsi.text = listProvinsi[position].Provinsi
        holder.namaKabupaten.text = listProvinsi[position].Kabupaten
        holder.imgDaerah.setImageResource(listProvinsi[position].Image)
    }

    override fun getItemCount(): Int {
        return listProvinsi.size
    }
}