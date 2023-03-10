package com.ozancanguz.valorantapp.ui.fragments.agentslist

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
import com.ozancanguz.valorantapp.adapter.AgentsAdapter
import com.ozancanguz.valorantapp.databinding.FragmentAgentDetailsBinding
import com.ozancanguz.valorantapp.databinding.FragmentAgentListBinding
import com.ozancanguz.valorantapp.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AgentList : Fragment() {

    private var _binding: FragmentAgentListBinding? = null

    private val binding get() = _binding!!

    private val mainviewmodel:MainViewModel by viewModels()

    private val agentsAdapter=AgentsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAgentListBinding.inflate(inflater, container, false)
        val view = binding.root

        // observe live data and update
       observeLiveData()

        // set up rv
        setupRv()


        return view
    }

    private fun setupRv() {
        binding.recyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.recyclerView.adapter=agentsAdapter
    }

    private fun observeLiveData() {
        mainviewmodel.requestAgents()
        mainviewmodel.agentsList.observe(viewLifecycleOwner, Observer {
            agentsAdapter.setData(it)
        })
    }


}