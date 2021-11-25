package com.ad.grupo10.gestionbarrial.activities.promos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.ad.grupo10.gestionbarrial.R

class MisPromoServActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mis_promo_serv)

        findViewById<ImageView>(R.id.boton_back11).setOnClickListener { this.finish() }
    }
}