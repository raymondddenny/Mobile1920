package com.github.lifecycleandrolab2.raymondddenny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {

    val TAG="Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"in onCreate ")
        //assign the about us id to main activity
        val aboutUS = findViewById<Button>(R.id.about_us)
        aboutUS.setOnClickListener{
            // on click it will navigate from main to AboutUs using intent
            val i = Intent(this,AboutUs::class.java)
            startActivity(i)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"in onStart ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"in onStop ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"in onPause ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"in onDestroy ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"in onRestart ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"in onResume ")
    }

}