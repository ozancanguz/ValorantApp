package com.ozancanguz.valorantapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.valorantapp.R
import com.ozancanguz.valorantapp.data.model.agents.Agents
import com.ozancanguz.valorantapp.data.model.agents.Data
import com.ozancanguz.valorantapp.util.Util.Companion.loadImage
import kotlinx.android.synthetic.main.agents_row_layout.view.*

class AgentsAdapter:RecyclerView.Adapter<AgentsAdapter.AgentsViewholder>() {

    var agentsList= emptyList<Data>()

    fun setData(newData: Agents){
        this.agentsList=newData.result
        notifyDataSetChanged()
    }


    class AgentsViewholder(view: View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgentsViewholder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.agents_row_layout,parent,false)
        return AgentsViewholder(view)
    }

    override fun onBindViewHolder(holder: AgentsViewholder, position: Int) {
    val currentAgent=agentsList[position]
        holder.itemView.agents_name.text=currentAgent.displayName


        // glide img
        holder.itemView.agents_fullPortrait.loadImage(currentAgent.fullPortrait)



    }

    override fun getItemCount(): Int {
        return agentsList.size
    }


}