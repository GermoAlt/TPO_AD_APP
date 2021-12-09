package com.ad.grupo10.gestionbarrial.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ad.grupo10.gestionbarrial.R
import java.time.format.DateTimeFormatter

class CategoriasModalAdapter(var context: Context, val categorias : List<String>) : RecyclerView.Adapter<CategoriasModalAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        var texto = itemView.findViewById<TextView>(R.id.texto_categoria)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriasModalAdapter.ViewHolder {
        return CategoriasModalAdapter.ViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.list_denuncias_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CategoriasModalAdapter.ViewHolder, position: Int) {
        holder.texto.text = categorias[position]
    }

    override fun getItemCount(): Int {
        return categorias.size
    }
}