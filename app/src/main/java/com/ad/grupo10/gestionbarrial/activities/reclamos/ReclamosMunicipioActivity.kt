package com.ad.grupo10.gestionbarrial.activities.reclamos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.adapters.CategoriasReclamosMunicipioAdapter

class ReclamosMunicipioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reclamos_municipio)

        findViewById<ImageView>(R.id.boton_back10).setOnClickListener { this.finish() }

        val lista = resources.getStringArray(R.array.categorias_reclamos_municipio)
        val adapter = CategoriasReclamosMunicipioAdapter(this, lista)
        var listaView: RecyclerView = findViewById(R.id.lista_cateogria_reclamo_municipio)
        listaView.adapter = adapter
        listaView.layoutManager = GridLayoutManager(this, 2)
    }
}