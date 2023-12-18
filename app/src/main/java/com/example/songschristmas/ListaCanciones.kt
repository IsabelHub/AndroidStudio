package com.example.songschristmas

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class ListaCanciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_canciones)



    }

    fun openYouTubeVideo(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        val botonCancion1: Button = findViewById(R.id.botonCancion1)
        val botonCancion2: Button = findViewById(R.id.botonCancion2)
        val botonCancion3: Button = findViewById(R.id.botonCancion3)
        val botonCancion4: Button = findViewById(R.id.botonCancion4)
        val botonCancion5: Button = findViewById(R.id.botonCancion5)
        val botonCancion6: Button = findViewById(R.id.botonCancion6)
        val botonCancion7: Button = findViewById(R.id.botonCancion7)
        val botonCancion8: Button = findViewById(R.id.botonCancion8)

        when (view.id) {
            R.id.botonCancion1 -> intent.data = Uri.parse("https://www.youtube.com/watch?v=6fDFYHgbpAw")
            R.id.botonCancion2 -> intent.data = Uri.parse("https://www.youtube.com/watch?v=BB4wwTvhdQA")
            R.id.botonCancion3 -> intent.data = Uri.parse("https://www.youtube.com/watch?v=QXu6FbQbS3w")
            R.id.botonCancion4 -> intent.data = Uri.parse("https://youtu.be/MJrvNUHxir0?si=huAZqRGdhokOtzAF")
            R.id.botonCancion5 -> intent.data = Uri.parse("https://www.youtube.com/watch?v=abf6xcrAs2k")
            R.id.botonCancion6 -> intent.data = Uri.parse("https://www.youtube.com/watch?v=v41AFES7m1E")
            R.id.botonCancion7 -> intent.data = Uri.parse("https://www.youtube.com/watch?v=9p97sxREC00")
            R.id.botonCancion8 -> intent.data = Uri.parse("https://www.youtube.com/watch?v=xiLkTHcvrXw")

            else -> return
        }

        startActivity(intent)
    }


}