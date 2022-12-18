package com.ozancanguz.valorantapp.ui.fragments.agentslist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.valorantapp.R
import com.ozancanguz.valorantapp.databinding.FragmentAgentDetailsBinding
import com.ozancanguz.valorantapp.databinding.FragmentAgentListBinding


class AgentList : Fragment() {

    private var _binding: FragmentAgentListBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAgentListBinding.inflate(inflater, container, false)
        val view = binding.root



        return view
    }


}