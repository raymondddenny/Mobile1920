package com.github.lifecycleandrolab2.raymondddenny

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AboutUs: AppCompatActivity() {
    val TAG = "About US"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Inside onCreate")
        Toast.makeText(this, "Kamu sedang berada didalam About Us", Toast.LENGTH_LONG).show()
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