package com.ad.grupo10.gestionbarrial.activities.reclamos

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ad.grupo10.gestionbarrial.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities


class NuevoReclamoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevo_reclamo)

        findViewById<Button>(R.id.boton_cancelar).setOnClickListener { descartar() }
        findViewById<Button>(R.id.boton_enviar).setOnClickListener { enviar() }
        findViewById<Button>(R.id.boton_guardar).setOnClickListener { guardar() }
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
        if(!checkWifiOnAndConnected()){
            enviarConDatos()
        } else {
            realizarEnvio()
        }

    }

    private fun enviarConDatos(){
        MaterialAlertDialogBuilder(this)
            .setTitle("Oops!")
            .setMessage("No posees conexión wifi ¿desea enviar el mismo a través de la red de datos.?\n" +
                    "\n" +
                    "En caso de no desear utilizar la red de datos se guardará el reclamo localmente hasta disponer de la misma.")
            .setNegativeButton(resources.getString(R.string.guardar)) { dialog, which ->
                guardar()
            }
            .setPositiveButton("Continuar con red de datos") { dialog, which ->
                realizarEnvio()
            }
            .show()
    }

    private fun realizarEnvio(){
        MaterialAlertDialogBuilder(this)
            .setTitle("Reclamo enviado")
            .setMessage("El reclamo ha sido enviado y va ser derivado al área " +
                    "correspondiente para su resolución")
            .setPositiveButton(resources.getString(R.string.aceptar)) { dialog, which ->
            }
            .show()
    }

    private fun guardar(){
        MaterialAlertDialogBuilder(this)
            .setTitle("Reclamo guardado exitosamente")
            .setMessage("El Reclamo ha sido guardado. Usted podrá encontrarlo en la sección de Mis reclamos")
            .setPositiveButton("Aceptar") { dialog, which ->
            }
            .show()
    }

    private fun checkWifiOnAndConnected(): Boolean {
        val connMgr = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        connMgr?: return false
        val network: Network = connMgr.activeNetwork ?: return false
        val capabilities = connMgr.getNetworkCapabilities(network)
        return capabilities != null && capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
    }
}