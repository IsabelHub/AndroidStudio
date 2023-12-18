package com.example.songschristmas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CartaReyes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carta_reyes)
        val botonEnviar: Button = findViewById(R.id.botonRecicler1)
        botonEnviar.setOnClickListener{ enviarLaponia()}
    }
    fun enviarLaponia() {
        val cambioPantalla = Intent(this, ListaCanciones::class.java)
        startActivity(cambioPantalla)
    }
}