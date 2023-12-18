package com.example.songschristmas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.songschristmas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val botonRegistro: Button = findViewById(R.id.btnLogin)
        botonRegistro.setOnClickListener { logearse()}
    }
    fun logearse() {
        val bienvenida = Intent(this, MainActivity2::class.java)
        val capturaNombre= binding.usuario.text.toString()
        if(capturaNombre.isEmpty())
        {
            Toast.makeText(this, "Se te olvido decirme como te llamas", Toast.LENGTH_SHORT).show()
        }else{

            //toast para recoger el nombre a la siguiente vista:
            bienvenida.putExtra("Nombre",capturaNombre)
            startActivity(bienvenida)
        }
    }
}