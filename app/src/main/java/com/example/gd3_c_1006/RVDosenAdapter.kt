package com.example.gd3_c_1006

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_c_1006.entity.Dosen

class RVDosenAdapter(private val data: Array<Dosen>) : RecyclerView.Adapter<RVDosenAdapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : viewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_dosen, parent, false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int){
        val currentItem = data[position]
        holder.tvNamaDosen.text = currentItem.name
        holder.tvDetailsDosen.text = currentItem.pengajar
    }

    override fun getItemCount(): Int{
        return data.size
    }

    class viewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val tvNamaDosen : TextView = itemView.findViewById(R.id.tv_nama_dosen)
        val tvDetailsDosen : TextView = itemView.findViewById(R.id.tv_details_dosen)
    }
}