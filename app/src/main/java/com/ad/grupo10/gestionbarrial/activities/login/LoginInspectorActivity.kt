package com.ad.grupo10.gestionbarrial.activities.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.activities.menu.MenuActivity
import com.ad.grupo10.gestionbarrial.enums.TIPO_USUARIO
import com.ad.grupo10.gestionbarrial.model.Usuario

class LoginInspectorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_inspector)

        val botonVecino = findViewById<Button>(R.id.boton_vecino)
        val botonIngresar = findViewById<Button>(R.id.boton_ingresar)

        val intentVecino = Intent(this, LoginActivity::class.java)
        val intentIngresar = Intent(this, MenuActivity::class.java)

        botonVecino.setOnClickListener{
            startActivity(intentVecino)
        }
        botonIngresar.setOnClickListener{
            val usuario = login()
            if (usuario != null)
                startActivity(intentIngresar)
        }
    }

    private fun login(): Usuario? {
        val usuario: String = findViewById<EditText>(R.id.editTextTextPersonName7).text.toString()
        val password: String = findViewById<EditText>(R.id.editTextTextPassword2).text.toString()

        getSharedPreferences(getString(R.string.file_prefs), Context.MODE_PRIVATE).edit()
            .putString(getString(R.string.tipo_usuario), TIPO_USUARIO.INSPECTOR.toString()).apply()

        return Usuario(usuario, password)
    }
}