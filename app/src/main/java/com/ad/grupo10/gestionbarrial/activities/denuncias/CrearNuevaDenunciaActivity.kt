package com.ad.grupo10.gestionbarrial.activities.denuncias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.ad.grupo10.gestionbarrial.R

class CrearNuevaDenunciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_nueva_denuncia)
        val botonCancelar = findViewById<Button>(R.id.boton_cancelar)
        botonCancelar.setOnClickListener{this.finish()}
        val botonAtras = findViewById<ImageButton>(R.id.boton_back2)
        botonAtras.setOnClickListener{this.finish()}
    }
}