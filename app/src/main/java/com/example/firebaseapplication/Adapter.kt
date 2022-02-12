package com.example.firebaseapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var equipo:List<EquipoData>): RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) :RecyclerView.ViewHolder(view){
        var title=view.title
        var equipoImg=view.equipo_id
        var lema=view.lemaEquipo
        var capacidad=view.capacidad

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)

        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
       holder.title.text=equipo[position].nombre
       holder.lema.text=equipo[position].overView
       holder.capacidad.text=equipo[position].capacidad.toString()
       holder.title.text=equipo[position].nombre

        
    }

    override fun getItemCount(): Int {
        return equipo.size
    }

}

