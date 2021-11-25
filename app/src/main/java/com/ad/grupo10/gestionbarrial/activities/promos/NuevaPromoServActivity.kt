package com.ad.grupo10.gestionbarrial.activities.promos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.ad.grupo10.gestionbarrial.R

class NuevaPromoServActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_promo_serv)

        findViewById<ImageView>(R.id.boton_back7).setOnClickListener { this.finish() }
    }
}