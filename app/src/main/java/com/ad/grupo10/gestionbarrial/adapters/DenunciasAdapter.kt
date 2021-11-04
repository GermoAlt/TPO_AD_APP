package com.ad.grupo10.gestionbarrial.adapters

import com.ad.grupo10.gestionbarrial.model.Denuncia
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.ad.grupo10.gestionbarrial.R
import android.widget.Toast
import android.widget.ImageView
import android.widget.TextView
import android.widget.RelativeLayout

class DenunciasAdapter     // RecyclerView recyclerView;
    (private val listdata: Array<Denuncia>) : RecyclerView.Adapter<DenunciasAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val myListData = listdata[position]
        holder.textView.text = listdata[position].description
        holder.imageView.setImageResource(listdata[position].imgId)
        holder.relativeLayout.setOnClickListener { view ->
            Toast.makeText(
                view.context,
                "click on item: " + myListData.description,
                Toast.LENGTH_LONG
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return listdata.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var textView: TextView
        var relativeLayout: RelativeLayout

        init {
            imageView = itemView.findViewById<View>(R.id.imageView) as ImageView
            textView = itemView.findViewById<View>(R.id.textView) as TextView
            relativeLayout = itemView.findViewById<View>(R.id.denuncia_card) as RelativeLayout
        }
    }
}