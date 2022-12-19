package com.ozancanguz.valorantapp.ui.fragments.mapsDetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.ozancanguz.valorantapp.R
import com.ozancanguz.valorantapp.databinding.FragmentMapsDetailsBinding
import com.ozancanguz.valorantapp.util.Util.Companion.loadImage
import com.ozancanguz.valorantapp.viewmodel.MapsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapsDetails : Fragment() {
    private var _binding: FragmentMapsDetailsBinding? = null

    private val binding get() = _binding!!

    private val mapsViewModel:MapsViewModel by viewModels()
    private val args:MapsDetailsArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMapsDetailsBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.mapDetailsImg.loadImage(args.mapDetails.displayIcon)

        return view
    }


}