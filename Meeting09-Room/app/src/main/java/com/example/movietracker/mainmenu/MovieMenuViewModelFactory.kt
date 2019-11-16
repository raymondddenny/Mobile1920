package com.example.movietracker.mainmenu

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.movietracker.database.movieDatabaseDao


class MovieMenuViewModelFactory(
    private val dataSource: movieDatabaseDao,
    private val application:Application) : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieMenuViewModel::class.java)){
            return MovieMenuViewModel(dataSource,application) as T
        }
        throw IllegalAccessException("ViewModel class not recognised")
    }
}