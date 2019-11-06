package com.example.movietracker.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "movie_table_rating")
data class movie(
    @PrimaryKey(autoGenerate =true)
    var movieID:Long =0L,

    @ColumnInfo(name = "movie_name")
    var movieName: String="",

    @ColumnInfo(name = "ratings")
    var movieRatings: Int=-1

)