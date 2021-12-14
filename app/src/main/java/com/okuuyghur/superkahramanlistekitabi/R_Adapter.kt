package com.okuuyghur.superkahramanlistekitabi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.okuuyghur.superkahramanlistekitabi.databinding.RowRecyclerviewBinding


class R_Adapter(val KahramanIsimleri:ArrayList<String>):RecyclerView.Adapter<SuperKahramanVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        val itemview = RowRecyclerviewBinding.inflate(LayoutInflater.from(parent.context))
        return SuperKahramanVH(itemview)
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        holder.row_binding.ibrahim.text = KahramanIsimleri.get(position)
        holder.row_binding.ibrahim.setOnClickListener {
            
            val bundle =Bundle()

        }
    }

    override fun getItemCount(): Int {
        return KahramanIsimleri.size
    }

}