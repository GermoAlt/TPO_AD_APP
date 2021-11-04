package com.ad.grupo10.gestionbarrial.activities.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.activities.menu.MenuVecinoActivity
import com.ad.grupo10.gestionbarrial.model.Usuario

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vecino_login)

        val botonIngresar = findViewById<Button>(R.id.button_ingresar)
        val botonRegistrarse = findViewById<Button>(R.id.button_registrarse)
        val botonInspector = findViewById<Button>(R.id.button_inspector)
        val textoOlvideLogin = findViewById<TextView>(R.id.olvideLogin)

        val intentIngresar = Intent(this, MenuVecinoActivity::class.java)
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
        }

    }
}

fun login(): Usuario? {
    return Usuario()
}

