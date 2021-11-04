package com.ad.grupo10.gestionbarrial.activities.denuncias.misDenuncias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.adapters.DenunciasAdapter

class MisDenunciasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mis_denuncias)

        val listaDenuncias = findViewById<RecyclerView>(R.id.recyclerView)

        val linearLayoutManager = LinearLayoutManager(baseContext)
        listaDenuncias.layoutManager = linearLayoutManager

        var adapter : DenunciasAdapter


    }
}