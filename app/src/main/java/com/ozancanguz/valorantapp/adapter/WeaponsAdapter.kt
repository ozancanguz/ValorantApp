package com.ozancanguz.valorantapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.valorantapp.R
import com.ozancanguz.valorantapp.data.model.weapon.Data
import com.ozancanguz.valorantapp.data.model.weapon.Weapon
import com.ozancanguz.valorantapp.ui.fragments.maps.WeaponFragmentDirections
import com.ozancanguz.valorantapp.util.Util.Companion.loadImage
import kotlinx.android.synthetic.main.agents_row_layout.view.*

class WeaponsAdapter:RecyclerView.Adapter<WeaponsAdapter.GunViewHolder>() {

    var weaponList= emptyList<Data>()
    fun setWeaponData(newData:Weapon){
        this.weaponList=newData.result
    }
    class GunViewHolder(view: View):RecyclerView.ViewHolder(view) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GunViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.weapon_row_layout,parent,false)

        return GunViewHolder(view)
    }

    override fun onBindViewHolder(holder: GunViewHolder, position: Int) {
        val currentWeapon=weaponList[position]
        holder.itemView.weapon_img.loadImage(currentWeapon.displayIcon)
        holder.itemView.weapons_name.text=currentWeapon.displayName

        holder.itemView.setOnClickListener {
            val action=WeaponFragmentDirections.actionWeaponFragmentToMapsDetails(currentWeapon)
            holder.itemView.findNavController().navigate(action)

        }
    }



    override fun getItemCount(): Int {
        return weaponList.size
    }


}