package com.ad.grupo10.gestionbarrial.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.model.Vecino

class VecinosAdapter(val context: Context, val listaVecinos: List<Vecino>): RecyclerView.Adapter<VecinosAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nombre: TextView = itemView.findViewById(R.id.list_vecino_item_nombre)
        var dni: TextView = itemView.findViewById(R.id.list_vecinos_item_dni)
        var direccion: TextView = itemView.findViewById(R.id.list_vecinos_item_direccion)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context)
            .inflate(R.layout.list_vecinos_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nombre.text = listaVecinos[position].name
        holder.dni.text = listaVecinos[position].dni
        holder.direccion.text = listaVecinos[position].direccion
    }

    override fun getItemCount(): Int {
        return listaVecinos.size
    }
}