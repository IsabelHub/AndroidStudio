package com.example.songschristmas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        iniciarRecyclerView()
        val botonVillancicos: Button = findViewById(R.id.botonPais)
        botonVillancicos.setOnClickListener { cambioaBroma()}

    }
    fun iniciarRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerPaises)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PlantaAdapter(PlantaProvider.plantaList)
    }
    fun cambioaBroma() {
        val cambioPantalla = Intent(this, ActividadFinal2::class.java)
        startActivity(cambioPantalla)
    }






}