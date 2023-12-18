package com.example.songschristmas.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.songschristmas.R
import com.example.songschristmas.SongsChristmas

class songsViewHolder(view: View):ViewHolder(view){

    val imagen: ImageView = view.findViewById(R.id.imagenPais)
    val nombre: TextView = view.findViewById(R.id.nombrePais)



}