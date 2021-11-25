package com.ad.grupo10.gestionbarrial.activities.landing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.activities.login.LoginVecinoActivity

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        var botonComenzar = findViewById<Button>(R.id.button_comenzar)
        var intentComenzar = Intent(this, LoginVecinoActivity::class.java)
        botonComenzar.setOnClickListener{
            startActivity(intentComenzar)
        }
    }
}