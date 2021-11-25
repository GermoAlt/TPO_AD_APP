package com.ad.grupo10.gestionbarrial.activities.denuncias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.ad.grupo10.gestionbarrial.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class CrearNuevaDenunciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_nueva_denuncia)
        val botonCancelar = findViewById<Button>(R.id.boton_cancelar)
        botonCancelar.setOnClickListener{descartar()}
        val botonAtras = findViewById<ImageButton>(R.id.boton_back2)
        botonAtras.setOnClickListener{this.finish()}
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

    private fun enviar(){
        MaterialAlertDialogBuilder(this)
            .setTitle("DECLARACIÓN JURADA")
            .setMessage("Esta denuncia tiene caracter de declaración jurada, en caso de falsedad" +
                    " puede dar lugar a una acción judicial " +
                    "por parte del municipio y/o los denunciados.")
            .setNegativeButton(resources.getString(R.string.cancelar)) { dialog, which ->
            }
            .setPositiveButton(resources.getString(R.string.aceptar)) { dialog, which ->
            }
            .show()
    }
}