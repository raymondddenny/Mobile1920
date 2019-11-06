package com.example.movietracker.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [movie::class],version = 1,exportSchema = false)
abstract class movieDatabase: RoomDatabase(){

    abstract val movieDatabaseDao: movieDatabaseDao

    companion object {
        @Volatile
        private var INSTANCE: movieDatabase? = null

        fun getInstance(context: Context): movieDatabase{
            synchronized(this){
                var instance = INSTANCE
                if (instance == null){
                    instance =Room.databaseBuilder(context.applicationContext,
                        movieDatabase::class.java,"movie_database_rating").fallbackToDestructiveMigration().build()
                }
                return instance
            }
        }
    }
}