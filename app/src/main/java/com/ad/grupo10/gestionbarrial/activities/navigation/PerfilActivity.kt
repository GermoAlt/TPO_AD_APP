package com.ad.grupo10.gestionbarrial.activities.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.activities.login.LoginVecinoActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class PerfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        findViewById<Button>(R.id.boton_back8).setOnClickListener { this.finish() }
        findViewById<Button>(R.id.button_cerrar_sesion).setOnClickListener {
            startActivity(
                Intent(this, LoginVecinoActivity::class.java)
            )
        }
        findViewById<Button>(R.id.button_editar_perfil).setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle("Perfil editado")
                .setMessage("Tu perfil se editó correctamente")
                .setPositiveButton(resources.getString(R.string.aceptar)) { dialog, which ->
                }
                .show()
        }
    }
}