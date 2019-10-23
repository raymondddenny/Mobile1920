package com.github.raymondddenny.tomAndJerry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.github.raymondddenny.tomAndJerry.databinding.FragmentMainMenuBinding
import androidx.navigation.findNavController

class MainMenu : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentMainMenuBinding>(inflater,
            R.layout.fragment_main_menu, container, false)

        // Listeners ...
        binding.startButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainMenu_to_gameFragment)
        }

        return binding.root
    }

}
