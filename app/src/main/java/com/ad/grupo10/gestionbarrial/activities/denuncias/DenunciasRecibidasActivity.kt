package com.ad.grupo10.gestionbarrial.activities.denuncias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.ad.grupo10.gestionbarrial.R

class DenunciasRecibidasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_denuncias_recibidas)


        val botonAtras = findViewById<ImageButton>(R.id.boton_back5)
        botonAtras.setOnClickListener{this.finish()}
    }
}