package com.ad.grupo10.gestionbarrial.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ad.grupo10.gestionbarrial.R
import com.ad.grupo10.gestionbarrial.model.Denuncia

class CategoriasPromosAdapter (var context: Context, var categoriasPromos: List<String>, var categoriasPromosImagenes: Map<String, String>?) : RecyclerView.Adapter<CategoriasPromosAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titulo = itemView.findViewById<TextView>(R.id.nombreCategoriaPromo)
        val imagen = itemView.findViewById<ImageView>(R.id.imagenCategoriaPromo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.list_categorias_promos_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titulo.text = categoriasPromos[position]
//        holder.imagen.imageResource = categoriasPromosImagenes[categoriasPromos[position]]
    }

    override fun getItemCount(): Int {
        return categoriasPromos.size
    }
}