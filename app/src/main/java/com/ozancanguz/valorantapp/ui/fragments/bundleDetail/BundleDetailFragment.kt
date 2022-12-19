package com.ozancanguz.valorantapp.ui.fragments.bundleDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ozancanguz.valorantapp.databinding.FragmentBundleDetailBinding
import com.ozancanguz.valorantapp.util.Util.Companion.loadImage


class BundleDetailFragment : Fragment() {
    private var _binding: FragmentBundleDetailBinding? = null
    private val args:BundleDetailFragmentArgs by navArgs()

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBundleDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.bundleDetailsImg.loadImage(args.currentBundle.verticalPromoImage)
        binding.bundleDetailsDescription.text=args.currentBundle.description



        return view
    }


}