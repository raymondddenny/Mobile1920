package com.example.movietracker.mainmenu

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movietracker.database.movie
import com.example.movietracker.database.movieDatabaseDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

class MovieMenuViewModel(
    dataSource: movieDatabaseDao,
    application: Application) : AndroidViewModel(application) {
    // TODO: Implement the ViewModel
    private var viewModelJob = Job()

    private var uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)
    private val _navigateToMovieList = MutableLiveData<movie>
    get() =_navigateToMovieList


}
