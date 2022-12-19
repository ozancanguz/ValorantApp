package com.ozancanguz.valorantapp.ui.fragments.bundle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.valorantapp.adapter.BundleAdapter
import com.ozancanguz.valorantapp.databinding.FragmentMapsBinding
import com.ozancanguz.valorantapp.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BundleFragment : Fragment() {
    private var _binding: FragmentMapsBinding? = null

    private val binding get() = _binding!!

    private val mainViewModel:MainViewModel by viewModels()

    private val bundleAdapter=BundleAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMapsBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.recyclerView2.layoutManager=LinearLayoutManager(requireContext())
        binding.recyclerView2.adapter=bundleAdapter

        observeLiveData()



        return view
    }

    private fun observeLiveData() {
        mainViewModel.requestBundleData()
        mainViewModel.bundleList.observe(viewLifecycleOwner, Observer {
            bundleAdapter.setData(it)
        })
    }


}