package com.ad.grupo10.gestionbarrial.activities.promos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.ad.grupo10.gestionbarrial.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class NuevaPromoServActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_promo_serv)

        findViewById<ImageView>(R.id.boton_back7).setOnClickListener { this.finish() }
        findViewById<Button>(R.id.boton_cancelar2).setOnClickListener { descartar() }

    }

    private fun descartar(){
        MaterialAlertDialogBuilder(this)
            .setTitle("Descartar cambios")
            .setMessage("Los cambios ingresados serán descartados. Desea salir?")
            .setNegativeButton(resources.getString(R.string.cancelar)) { dialog, which ->
            }
            .setPositiveButton(resources.getString(R.string.aceptar)) { dialog, which ->
                this.finish()
            }
            .show()
    }
}