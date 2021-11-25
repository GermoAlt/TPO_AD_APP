package com.ad.grupo10.gestionbarrial.activities.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.adapters.VecinosAdapter
import com.ad.grupo10.gestionbarrial.model.Vecino

class ListaVecinosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_vecinos)

        val lista = findViewById<RecyclerView>(R.id.listaVecinos)
        lista.adapter = VecinosAdapter(this, listOf(
            Vecino("Jose Perez", "35.448.958", "Uriburu 465"),
            Vecino("Alberto Dominguez", "40.835.025", "11 de Septiembre 986"),
            Vecino("Rosa Martínez", "18.364.225", "Perón 457"),
            Vecino("Cris Morena", "26.464.338", "Rivadavia 1465"),
        ))
    }
}