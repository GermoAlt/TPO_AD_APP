package com.ad.grupo10.gestionbarrial.landing


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.onboarding.OnboardingActivity

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_landing)

        val botonComenzar = findViewById<Button>(R.id.button_comenzar)
        val intentComenzar = Intent(this, OnboardingActivity::class.java)
        botonComenzar.setOnClickListener{
            startActivity(intentComenzar)
        }
    }

    init {

    }
}