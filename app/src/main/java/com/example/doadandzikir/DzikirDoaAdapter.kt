package com.example.doadandzikir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class DzikirDoaAdapter (private val ListDzikirDoa : ArrayList<DzikirDoa>) : RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {

    inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        // Inisialisasi View dari layout row_item_dzikir.xml
        val tvDesc : TextView = view.findViewById(R.id.tv_desc)
        val tvLafadz : TextView = view.findViewById(R.id.tv_lafadz)
        val tvTerjemahan : TextView = view.findViewById(R.id.tv_terjemahan)
    }

    // Menampilkan Data sesuai dengan posisi layout yang ditentukan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
    )

    // Mengatribusikan Data menjadi sebuah tampilan
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvDesc.text = ListDzikirDoa[position].desc
        holder.tvLafadz.text = ListDzikirDoa[position].lafadz
        holder.tvTerjemahan.text = ListDzikirDoa[position].terjemahan
    }

    // Menentukan Jumlah Data yang ditampilkan
    override fun getItemCount(): Int = ListDzikirDoa.size

}