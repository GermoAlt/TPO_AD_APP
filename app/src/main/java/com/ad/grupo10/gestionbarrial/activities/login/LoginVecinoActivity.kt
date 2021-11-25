package com.ad.grupo10.gestionbarrial.activities.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.activities.menu.MenuActivity
import com.ad.grupo10.gestionbarrial.enums.TIPO_USUARIO
import com.ad.grupo10.gestionbarrial.model.Usuario
import com.ad.grupo10.gestionbarrial.rest.RestAPI
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginVecinoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vecino_login)

        val botonIngresar = findViewById<Button>(R.id.button_ingresar)
        val botonRegistrarse = findViewById<Button>(R.id.button_registrarse)
        val botonInspector = findViewById<Button>(R.id.button_inspector)
        val textoOlvideLogin = findViewById<TextView>(R.id.olvideLogin)

        val intentIngresar = Intent(this, MenuActivity::class.java)
        val intentRegistrarse = Intent(this, RegisterActivity::class.java)
        val intentInspector = Intent(this, LoginInspectorActivity::class.java)

        botonIngresar.setOnClickListener{
            val usuario = login()
            if (usuario != null)
            startActivity(intentIngresar)
        }
        botonRegistrarse.setOnClickListener{
            startActivity(intentRegistrarse)
        }
        botonInspector.setOnClickListener{
            startActivity(intentInspector)
        }

        textoOlvideLogin.setOnClickListener{
            resetPassword()
        }

    }

    private fun login(): Usuario? {
        val usuario: String = findViewById<EditText>(R.id.editTextTextPersonName).text.toString()
        val password: String = findViewById<EditText>(R.id.editTextTextPassword).text.toString()

        val resultado = RestAPI.api.loginVecino(Usuario(usuario, password))
        resultado.enqueue(object : Callback<Usuario?> {
            override fun onResponse(call: Call<Usuario?>, response: Response<Usuario?>) {
                if(response.isSuccessful){
                    loginSuccess(response)
//                } else {
//                    loginFailure(response)
                }
            }

            override fun onFailure(call: Call<Usuario?>, t: Throwable) {
                t.printStackTrace()
            }
        })
        getSharedPreferences(getString(R.string.file_prefs), Context.MODE_PRIVATE).edit()
            .putString(getString(R.string.tipo_usuario), TIPO_USUARIO.VECINO.toString()).apply()
        return Usuario(usuario, password)
    }

    private fun loginSuccess(response: Response<Usuario?>): Usuario {
        val usuario: Usuario = response.body()!!
        getSharedPreferences(getString(R.string.file_prefs), Context.MODE_PRIVATE).edit()
            .putString(getString(R.string.tipo_usuario), TIPO_USUARIO.VECINO.toString())
            .putString("usuario", usuario.usuario)
            .putString("password", usuario.password)
            .apply()
        return usuario
    }

    private fun loginFailure(response: Response<Usuario?>){
        MaterialAlertDialogBuilder(this)
            .setTitle("Oops!")
            .setMessage("Las credenciales ingresadas son incorrectas")
            .setPositiveButton(resources.getString(R.string.aceptar)) { dialog, which ->
                // Respond to positive button press
            }
            .show()
        return
    }

    private fun resetPassword(){
        MaterialAlertDialogBuilder(this)
                .setTitle("Recupero de contraseña")
            .setMessage("Te llegará un mail con instrucciones para recuperar tu cuenta")
            .setNegativeButton(resources.getString(R.string.cancelar)) { dialog, which ->
                // Respond to negative button press
            }
            .setPositiveButton(resources.getString(R.string.aceptar)) { dialog, which ->
                // Respond to positive button press
            }
            .show()
    }
}


