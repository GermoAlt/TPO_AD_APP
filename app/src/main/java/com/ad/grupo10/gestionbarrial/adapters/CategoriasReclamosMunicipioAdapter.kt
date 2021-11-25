package com.ad.grupo10.gestionbarrial.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ad.grupo10.gestionbarrial.R

class CategoriasReclamosMunicipioAdapter(val context: Context, val lista: Array<String>) : RecyclerView.Adapter<CategoriasReclamosMunicipioAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val text: TextView = itemView.findViewById(R.id.titulo_categoria_item_list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.categoria_reclamos_municipios_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.text = lista[position]
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}