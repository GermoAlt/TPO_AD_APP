package com.ad.grupo10.gestionbarrial.activities.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ad.grupo10.gestionbarrial.R

class LoginInspectorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_inspector)

        val botonVecino = findViewById<Button>(R.id.boton_vecino)

        val intentVecino = Intent(this, LoginActivity::class.java)

        botonVecino.setOnClickListener{
            startActivity(intentVecino)
        }
    }
}