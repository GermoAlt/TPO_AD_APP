package com.ad.grupo10.gestionbarrial.activities.denuncias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.adapters.DenunciasAdapter
import com.ad.grupo10.gestionbarrial.model.Denuncia
import java.time.LocalDateTime

class MisDenunciasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mis_denuncias)

        val botonAtras = findViewById<ImageButton>(R.id.boton_back3)
        botonAtras.setOnClickListener{this.finish()}

        val listaDenuncias = findViewById<RecyclerView>(R.id.recyclerView)

        val linearLayoutManager = LinearLayoutManager(baseContext)
        listaDenuncias.layoutManager = linearLayoutManager

        val adapter = DenunciasAdapter(this, listOf(
            Denuncia(1,"descripcion", "sample.jpg", "Titulo", LocalDateTime.now(), "ACTIVA", "Vecino"),
            Denuncia(2, "descripcion", "sample.jpg", "Titulo", LocalDateTime.now(), "ACTIVA", "Vecino"),
            Denuncia(3, "descripcion", "sample.jpg", "Titulo", LocalDateTime.now(), "ACTIVA", "Vecino")
        ))
        listaDenuncias.adapter = adapter

    }
}