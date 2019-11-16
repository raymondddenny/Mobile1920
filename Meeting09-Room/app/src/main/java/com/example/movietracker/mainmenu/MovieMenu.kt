package com.example.movietracker.mainmenu

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.example.movietracker.R
import com.example.movietracker.databinding.MovieMenuFragmentBinding

class MovieMenu : Fragment() {


    private lateinit var viewModel: MovieMenuViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : MovieMenuFragmentBinding = DataBindingUtil.inflate(inflater,R.layout.movie_menu_fragment,container,false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MovieMenuViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
