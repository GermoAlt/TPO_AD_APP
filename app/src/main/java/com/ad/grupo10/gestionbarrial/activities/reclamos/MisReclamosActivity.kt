package com.ad.grupo10.gestionbarrial.activities.reclamos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.ad.grupo10.gestionbarrial.R

class MisReclamosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mis_reclamos)

        findViewById<ImageView>(R.id.boton_back4).setOnClickListener { this.finish() }
    }
}