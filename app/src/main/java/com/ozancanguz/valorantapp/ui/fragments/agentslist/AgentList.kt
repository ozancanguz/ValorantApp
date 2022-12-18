package com.ozancanguz.valorantapp.ui.fragments.agentslist

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.ozancanguz.valorantapp.R
import com.ozancanguz.valorantapp.databinding.FragmentAgentDetailsBinding
import com.ozancanguz.valorantapp.databinding.FragmentAgentListBinding
import com.ozancanguz.valorantapp.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AgentList : Fragment() {

    private var _binding: FragmentAgentListBinding? = null

    private val binding get() = _binding!!

    private val mainviewmodel:MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAgentListBinding.inflate(inflater, container, false)
        val view = binding.root

       observeLiveData()



        return view
    }

    private fun observeLiveData() {
        mainviewmodel.requestAgents()
        mainviewmodel.agentsList.observe(viewLifecycleOwner, Observer {
            Log.d("agentlist", "" +it)
        })
    }


}