package com.ad.grupo10.gestionbarrial.activities.menu

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.activities.denuncias.CrearNuevaDenunciaActivity
import com.ad.grupo10.gestionbarrial.activities.denuncias.DenunciasRecibidasActivity
import com.ad.grupo10.gestionbarrial.activities.denuncias.MisDenunciasActivity
import com.ad.grupo10.gestionbarrial.activities.promos.MisPromoServActivity
import com.ad.grupo10.gestionbarrial.activities.promos.NuevaPromoServActivity
import com.ad.grupo10.gestionbarrial.activities.promos.PromocionesServiciosVecinosActivity
import com.ad.grupo10.gestionbarrial.activities.reclamos.MisReclamosActivity
import com.ad.grupo10.gestionbarrial.activities.reclamos.NuevoReclamoActivity
import com.ad.grupo10.gestionbarrial.activities.reclamos.ReclamosMunicipioActivity
import com.ad.grupo10.gestionbarrial.enums.TIPO_USUARIO

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_vecino)

        //RECLAMOS
        val botonReclamosMunicipio = findViewById<Button>(R.id.boton_reclamos_municipio)
        val botonMisReclamos = findViewById<Button>(R.id.boton_mis_reclamos)
        val botonCrearReclamo = findViewById<Button>(R.id.boton_crear_nuevo_reclamo)

        botonReclamosMunicipio.setOnClickListener {
            startActivity(Intent(this, ReclamosMunicipioActivity::class.java))
        }
        botonMisReclamos.setOnClickListener {
            startActivity(Intent(this, MisReclamosActivity::class.java))
        }
        botonCrearReclamo.setOnClickListener {
            startActivity(Intent(this, NuevoReclamoActivity::class.java))
        }

        //DENUNCIAS
        val botonMisDenuncias = findViewById<Button>(R.id.boton_mis_denuncias)
        val botonCrearDenuncia = findViewById<Button>(R.id.boton_crear_nueva_denuncia)
        val botonDenunciasRecibidas = findViewById<Button>(R.id.boton_denuncias_recibidas)

        botonMisDenuncias.setOnClickListener {
            startActivity(Intent(this, MisDenunciasActivity::class.java))
        }
        botonCrearDenuncia.setOnClickListener {
            startActivity(Intent(this, CrearNuevaDenunciaActivity::class.java))
        }
        botonDenunciasRecibidas.setOnClickListener {
            startActivity(Intent(this, DenunciasRecibidasActivity::class.java))
        }

        //PROMOCIONES Y SERVICIOS
        val botonPromoServVecinos = findViewById<Button>(R.id.boton_promo_serv_vecinos)
        val botonNuevaPromoServicio = findViewById<Button>(R.id.boton_nueva_promo_serv)
        val botonMisPromoServicio = findViewById<Button>(R.id.boton_mis_promos_serv)

        botonPromoServVecinos.setOnClickListener {
            startActivity(Intent(this, PromocionesServiciosVecinosActivity::class.java))
        }
        botonNuevaPromoServicio.setOnClickListener {
            startActivity(Intent(this, NuevaPromoServActivity::class.java))
        }
        botonMisPromoServicio.setOnClickListener {
            startActivity(Intent(this, MisPromoServActivity::class.java))
        }

        //VISIBILIDAD
        val prefs = getSharedPreferences(getString(R.string.file_prefs), Context.MODE_PRIVATE)
        val tipoUsuario = prefs.getString(getString(R.string.tipo_usuario), null)
        if (tipoUsuario.equals(TIPO_USUARIO.INSPECTOR.toString())) {
            val botonesSoloVecinos = listOf(
                botonCrearDenuncia, botonMisDenuncias,
                botonDenunciasRecibidas, botonNuevaPromoServicio, botonMisPromoServicio
            )
            botonesSoloVecinos.forEach { it.visibility = View.GONE }
            findViewById<View>(R.id.separator).visibility = View.GONE
        }
    }
}