package com.ad.grupo10.gestionbarrial.activities.login

import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.databinding.ActivityRegisterBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        findViewById<Button>(R.id.button_register).setOnClickListener { register() }

    }

    private fun register(){
        MaterialAlertDialogBuilder(this)
            .setTitle("Tu solicitud ha sido enviada exitosamente")
            .setMessage("La solicitud ha sido enviada y una vez validado por el " +
                    "municipio será notificado por mail con una clave de acceso.")
            .setPositiveButton(resources.getString(R.string.aceptar)) { dialog, which ->
                // Respond to positive button press

            }
            .show()
    }

}