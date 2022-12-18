package com.ozancanguz.valorantapp.ui.fragments.agentDetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.valorantapp.R
import com.ozancanguz.valorantapp.databinding.FragmentAgentDetailsBinding


class AgentDetailsFragment : Fragment() {
    private var _binding: FragmentAgentDetailsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAgentDetailsBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }


}