package com.ozancanguz.valorantapp.ui.fragments.maps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.valorantapp.R
import com.ozancanguz.valorantapp.databinding.FragmentMapsBinding


class MapsFragment : Fragment() {
    private var _binding: FragmentMapsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMapsBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }


}