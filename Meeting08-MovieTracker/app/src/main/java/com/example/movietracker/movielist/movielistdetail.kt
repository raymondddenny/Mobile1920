package com.example.movietracker.movielist

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.movietracker.R

class movielistdetail : Fragment() {

    companion object {
        fun newInstance() = movielistdetail()
    }

    private lateinit var viewModel: MovielistdetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.movielistdetail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MovielistdetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
