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
        var dummyImage:Int?=null

       holder.title.text=equipo[position].nombre
       holder.lema.text=equipo[position].overView
       holder.capacidad.text=equipo[position].capacidad.toString()
       holder.title.text=equipo[position].nombre

        when(equipo[position].nombre!!){

            "Real Madrid"->{
                dummyImage=R.drawable.madrid
            }
            "Sevilla"->{
                dummyImage= R.drawable.sevilla
            }
            "Betis"->{
                dummyImage=R.drawable.betis
            }
            "Atletico de Madrid"->{
                dummyImage= R.drawable.atletico
            }
            "Fc Barcelona"->{
                dummyImage=R.drawable.barca
            }
            "Valencia"->{
                dummyImage=R.drawable.valencia
            }
            "Villarreal"->{
                dummyImage=R.drawable.villarreal
            }
            "Real Sociedad"->{
                dummyImage=R.drawable.realsociedad
            }
            "Rayo Vallecano"->{
                dummyImage=R.drawable.rayo
            }
            "Osasuna"->{
                dummyImage=R.drawable.osasuna
            }
            "Athletic de Bilbao"->{
                dummyImage=R.drawable.bilbao
            }
            "Alavés"->{
                dummyImage=R.drawable.alaves
            }
            "Club Deportivo Leganés"->{
                dummyImage=R.drawable.leganes
            }
            "Cádiz"->{
                dummyImage=R.drawable.cadiz
            }
            "Elche"->{
                dummyImage=R.drawable.elche
            }
            "Espanyol"->{
                dummyImage=R.drawable.espanyol
            }
            "Getafe"->{
                dummyImage=R.drawable.getafe
            }
            "Granada"->{
                dummyImage=R.drawable.granada
            }
            "Celta de Vigo"->{
                dummyImage=R.drawable.celta
            }

            "Levante"->{
                dummyImage=R.drawable.levante
            }
            "Mallorca"->{
                dummyImage=R.drawable.mallorca
            }

        }
        holder.equipoImg.setImageResource(dummyImage!!)


    }

    override fun getItemCount(): Int {
        return equipo.size
    }

}

