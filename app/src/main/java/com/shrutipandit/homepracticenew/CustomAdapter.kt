package com.shrutipandit.homepracticenew


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter( private var arrayname: ArrayList<Number> ):RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val name: TextView =itemView.findViewById(R.id.name)
        val number: TextView =itemView.findViewById(R.id.number)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sample, parent, false)
        return ViewHolder(view)

}

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        val details = arrayname[position]
        holder.name.text= details.toString()
        holder.number.text= details.toString()



    }

    override fun getItemCount(): Int {
        return arrayname.size
    }

}