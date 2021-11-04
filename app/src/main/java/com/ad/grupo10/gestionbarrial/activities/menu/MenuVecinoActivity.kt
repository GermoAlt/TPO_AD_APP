package com.ad.grupo10.gestionbarrial.activities.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.activities.denuncias.crearNuevaDenuncia.CrearNuevaDenunciaActivity
import com.ad.grupo10.gestionbarrial.activities.denuncias.denunciasRecibidas.DenunciasRecibidasActivity
import com.ad.grupo10.gestionbarrial.activities.denuncias.misDenuncias.MisDenunciasActivity

class MenuVecinoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_vecino)

        val botonMisDenuncias = findViewById<Button>(R.id.boton_mis_denuncias)
        val botonCrearDenuncia = findViewById<Button>(R.id.boton_crear_nueva_denuncia)
        val botonDenunciasRecibidas = findViewById<Button>(R.id.boton_denuncias_recibidas)

        botonMisDenuncias.setOnClickListener{startActivity(Intent(this, MisDenunciasActivity::class.java))}
        botonCrearDenuncia.setOnClickListener{startActivity(Intent(this, CrearNuevaDenunciaActivity::class.java))}
        botonDenunciasRecibidas.setOnClickListener{startActivity(Intent(this, DenunciasRecibidasActivity::class.java))}
    }
}