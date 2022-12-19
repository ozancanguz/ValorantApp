package com.ozancanguz.valorantapp.ui.fragments.maps

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.valorantapp.R
import com.ozancanguz.valorantapp.adapter.WeaponsAdapter
import com.ozancanguz.valorantapp.databinding.FragmentMapsBinding
import com.ozancanguz.valorantapp.viewmodel.MainViewModel
import com.ozancanguz.valorantapp.viewmodel.MapsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeaponFragment : Fragment() {
    private var _binding: FragmentMapsBinding? = null

    private val binding get() = _binding!!

    private val mapsViewModel:MapsViewModel by viewModels()

    private val weaponsAdapter=WeaponsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMapsBinding.inflate(inflater, container, false)
        val view = binding.root


        observeLiveData()

        setupRv()
        return view
    }

    private fun setupRv() {
        binding.weaponRecyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.weaponRecyclerView.adapter=weaponsAdapter
    }

    private fun observeLiveData() {
        mapsViewModel.requestMaps()
        mapsViewModel.mapList.observe(viewLifecycleOwner, Observer {
            Log.d("mapsfragment"," "+it.result)
            weaponsAdapter.setWeaponData(it)


        })
    }


}