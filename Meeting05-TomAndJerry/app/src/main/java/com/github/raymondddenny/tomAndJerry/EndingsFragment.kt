package com.github.raymondddenny.tomAndJerry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.github.raymondddenny.tomAndJerry.databinding.FragmentEndingsBinding
import androidx.navigation.findNavController
/**
 * A simple [Fragment] subclass.
 */
class EndingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentEndingsBinding>(inflater,
            R.layout.fragment_endings, container, false)

        // Ending Buttons Listeners...
        binding.badEndingOneButton.setOnClickListener {
            MyApplication.currentDisplayedEnding = MyApplication.scenes[6]
            it.findNavController().navigate(R.id.action_endingsFragment_to_endingDisplay)
        }
        binding.normalEndingButton.setOnClickListener {
            MyApplication.currentDisplayedEnding = MyApplication.scenes[7]
            it.findNavController().navigate(R.id.action_endingsFragment_to_endingDisplay)
        }
        binding.bestEndingButton.setOnClickListener {
            MyApplication.currentDisplayedEnding = MyApplication.scenes[8]
            it.findNavController().navigate(R.id.action_endingsFragment_to_endingDisplay)
        }

        // Enabling/disabling buttons
        if (MyApplication.badEnding) binding.badEndingOneButton.isEnabled = true
        if (MyApplication.normalEnding) binding.normalEndingButton.isEnabled = true
        if (MyApplication.bestEnding) binding.bestEndingButton.isEnabled = true

        return binding.root
    }
}
