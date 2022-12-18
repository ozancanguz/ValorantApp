package com.ozancanguz.valorantapp.ui.fragments.agentDetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ozancanguz.valorantapp.R
import com.ozancanguz.valorantapp.databinding.FragmentAgentDetailsBinding
import com.ozancanguz.valorantapp.util.Util.Companion.loadImage


class AgentDetailsFragment : Fragment() {
    private var _binding: FragmentAgentDetailsBinding? = null

    private val binding get() = _binding!!

    private val args: AgentDetailsFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAgentDetailsBinding.inflate(inflater, container, false)
        val view = binding.root

        observeLiveData()
        return view
    }

    private fun observeLiveData() {
        binding.detailsImage.loadImage(args.currentAgent.bustPortrait)
        binding.detailsRoleDescription.text=args.currentAgent.description
    }


}