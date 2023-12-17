package com.example.songschristmas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonRegistro: Button = findViewById(R.id.btnLogin)
        botonRegistro.setOnClickListener { cambioaBroma()}

    }


    fun cambioaBroma() {
        val cambioPantalla = Intent(this, MainActivity2::class.java)
        startActivity(cambioPantalla)
    }




}