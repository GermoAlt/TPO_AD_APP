package com.ad.grupo10.gestionbarrial.activities.denuncias.crearNuevaDenuncia

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
        val botonAtras = findViewById<ImageButton>(R.id.boton_back2)
        botonCancelar.setOnClickListener{this.finish()}
        botonAtras.setOnClickListener{this.finish()}
    }
}