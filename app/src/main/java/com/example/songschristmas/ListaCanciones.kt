package com.example.songschristmas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ListaCanciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_canciones)
        val botonCancion1: Button = findViewById(R.id.cancion1)

        val botonCancion2: Button = findViewById(R.id.cancion2)

        val botonCancion3: Button = findViewById(R.id.cancion3)

        val botonCancion4: Button = findViewById(R.id.cancion4)
        val botonCancion5: Button = findViewById(R.id.cancion5)
        val botonCancion6: Button = findViewById(R.id.cancion6)
        val botonCancion7: Button = findViewById(R.id.cancion7)
        val botonCancion8: Button = findViewById(R.id.cancion8)

        //botonCancion1.setOnClickListener { logearse()}
    }

    /*
    fun logearse() {
        val bienvenida = Intent(this, MainActivity2::class.java)
        val capturaNombre= binding.usuario.text.toString()

        }
     */

    }




}