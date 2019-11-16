package com.example.movietracker.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface movieDatabaseDao {

    @Insert
    fun insert(movie: movie)

    @Update
    fun update(movie: movie)

    @Query("SELECT * FROM movie_table_rating WHERE movieID = :key")
    fun get(key: Long):movie?

    @Query("SELECT movie_name FROM movie_table_rating WHERE movieID = :key")
    fun getMovieName(key: Long): String?

    @Query("SELECT ratings FROM movie_table_rating WHERE movieID = :key")
    fun getMovieRating(key: Long): Int?

    @Query("SELECT * FROM movie_table_rating ORDER BY movie_name")
    fun getAllMovies(): LiveData<List<movie>>


}