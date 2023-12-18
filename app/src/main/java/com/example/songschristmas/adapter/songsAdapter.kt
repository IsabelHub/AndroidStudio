package com.example.songschristmas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.songschristmas.R
import com.example.songschristmas.SongsChristmas


class songsAdapter(private val songsList: List<SongsChristmas>) :
    RecyclerView.Adapter<songsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): songsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return songsViewHolder(layoutInflater.inflate(R.layout.activity_main2, parent, false))
    }

    override fun getItemCount(): Int {
        return songsList.size
    }
    override fun onBindViewHolder(holder: songsViewHolder, position: Int) {
        val item = songsList[position]

        holder.imagen.setImageResource(item.imageResourceId)
        holder.nombre.setText(item.stringResourceId1)
        //holder.botonEnlace.setText(item/.stringResourceId2)

    }
}