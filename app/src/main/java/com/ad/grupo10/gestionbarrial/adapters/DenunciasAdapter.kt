package com.ad.grupo10.gestionbarrial.adapters

import android.content.Context
import android.provider.Settings.Global.getString
import com.ad.grupo10.gestionbarrial.model.Denuncia
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.ad.grupo10.gestionbarrial.R
import android.widget.ImageView
import android.widget.TextView
import java.time.format.DateTimeFormatter

class DenunciasAdapter(var context: Context,var denuncias: List<Denuncia>) : RecyclerView.Adapter<DenunciasAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titulo = itemView.findViewById<TextView>(R.id.titulo_denuncia_item)
        var tipo = itemView.findViewById<TextView>(R.id.tipo_denuncia_item)
        var fechaModificacion = itemView.findViewById<TextView>(R.id.date_modif_denuncia_item)
        var estado = itemView.findViewById<TextView>(R.id.estado_denuncia_item)
        var imagenDenuncia = itemView.findViewById<ImageView>(R.id.imagen_denuncia_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.list_denuncias_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titulo.text = String.format(
            context.getString(R.string.titulo_denuncia_card), denuncias[position].id)
        holder.tipo.text = denuncias[position].tipo
        holder.fechaModificacion.text = denuncias[position].fechaModificacion
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        holder.estado.text = denuncias[position].estado
//        holder.imagenDenuncia.setImageResource(denuncias[position].imgId)
    }

    override fun getItemCount(): Int {
        return denuncias.size
    }


}