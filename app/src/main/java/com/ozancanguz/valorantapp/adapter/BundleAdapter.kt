package com.ozancanguz.valorantapp.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.valorantapp.R
import com.ozancanguz.valorantapp.data.model.bundle.Bundle
import com.ozancanguz.valorantapp.data.model.bundle.BundleResult
import com.ozancanguz.valorantapp.util.Util.Companion.loadImage
import kotlinx.android.synthetic.main.bundle_row_layout.view.*

class BundleAdapter:RecyclerView.Adapter<BundleAdapter.BundleViewHolder>() {

    var bundleList= emptyList<BundleResult>()

    fun setData(newData:Bundle){
        this.bundleList=newData.result
    }

    class BundleViewHolder(view: View):RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BundleViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.bundle_row_layout,parent ,false)
        return  BundleViewHolder(view)
    }

    override fun onBindViewHolder(holder: BundleViewHolder, position: Int) {
        var currentBundle=bundleList[position]
        holder.itemView.bundle_img.loadImage(currentBundle.displayIcon)
        holder.itemView.bundle_name.text=currentBundle.displayName
    }

    override fun getItemCount(): Int {
        return bundleList.size
    }


}