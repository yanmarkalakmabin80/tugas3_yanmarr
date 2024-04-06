package com.example.tugas3_yanmarr

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.NavigableMap

class MyAdapter (private  val namaList : ArrayList<datakuliner>) :RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder (datakuliner: View)  : RecyclerView.ViewHolder(datakuliner){
        val gambar : ImageView = datakuliner.findViewById(R.id.iv1)
        val Nama    :TextView =datakuliner.findViewById(R.id.tv1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val datakuliner =LayoutInflater.from(parent.context).inflate(R.layout.itemdata,parent,false)
        return MyViewHolder(datakuliner)
    }

    override fun getItemCount(): Int = namaList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
     val currenItem = namaList[position]
        holder.gambar.setImageResource(currenItem.gambar)
        holder.Nama.text = currenItem.Nama
    }

}