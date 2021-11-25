package com.ad.grupo10.gestionbarrial.activities.promos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.adapters.CategoriasPromosAdapter

class PromocionesServiciosVecinosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promociones_servicios)

        findViewById<ImageView>(R.id.boton_back6).setOnClickListener { this.finish() }

        val listaCategorias = findViewById<RecyclerView>(R.id.listaCategoriasPromoServ)
        listaCategorias.layoutManager = GridLayoutManager(this, 3)
        listaCategorias.adapter = CategoriasPromosAdapter(
            this, resources.getStringArray(R.array.categorias_promos).asList(),
            null)
    }
}