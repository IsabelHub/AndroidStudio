package com.example.songschristmas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.songschristmas.adapter.songsAdapter
import com.example.songschristmas.databinding.ActivityMain2Binding
import com.example.songschristmas.databinding.ActivityMain3Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        mostrarNombre()
        iniciarRecyclerView()
        val botonListado: Button = findViewById(R.id.botonRecicler)
        botonListado.setOnClickListener{ cambioVistas()}

    }
    fun mostrarNombre()
    {
        val bundle = intent.extras
        val nombre = bundle?.getString("Nombre")
        binding.nombreUsuario.text="Bienvenido, has llegado bien $nombre"

    }

    fun iniciarRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerPais)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = songsAdapter(songsProvider.villancicosList)
    }

    fun cambioVistas() {
        val cambioPantalla = Intent(this, MainActivity::class.java)
        startActivity(cambioPantalla)
    }


}