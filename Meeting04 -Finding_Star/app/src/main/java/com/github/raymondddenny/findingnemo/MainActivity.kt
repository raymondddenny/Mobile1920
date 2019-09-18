package com.github.raymondddenny.findingnemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.github.raymondddenny.findingnemo.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private var binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
    private val starFound = android.R.drawable.btn_star_big_on
    private val wrongStar = android.R.drawable.presence_busy
    private lateinit var SelectViews: View
    private var iDSelect = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val boxed: List<Int> = listOf(
            binding.box1.id, binding.box2.id,
            binding.box3.id,binding.box4.id,
            binding.box5.id
        )
        iDSelect = boxed[Random.nextInt(0,5)]
        setListeners()
    }

    private fun winner(view: View){
        if (view.id == iDSelect){
            makeColored(view,starFound)
            SelectViews = view
            Toast.makeText(this,"YEYY You Find the Star, Press the star to restart",Toast.LENGTH_SHORT).show()
            SelectViews.setOnClickListener {
                resetAll()
            }
        }else makeColored(view,wrongStar)
    }

    private fun setListeners() {
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val box1 = findViewById<TextView>(R.id.box1)
        val box2 = findViewById<TextView>(R.id.box2)
        val box3 = findViewById<TextView>(R.id.box3)
        val box4 = findViewById<TextView>(R.id.box4)
        val box5 = findViewById<TextView>(R.id.box5)
        val clickAbleViews:List<View> =
            listOf(
                box1,box2,box3,box4,box5
            )
        for (i in clickAbleViews){
            i.setOnClickListener {
                winner(it)
            }
        }

    }

    private fun resetAll(){
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val boxed: List<Int> = listOf(
            binding.box1.id,binding.box2.id,
            binding.box3.id,binding.box4.id,
            binding.box5.id
        )
        iDSelect = boxed[Random.nextInt(0,5)]
        val box1 = findViewById<TextView>(R.id.box1)
        val box2 = findViewById<TextView>(R.id.box2)
        val box3 = findViewById<TextView>(R.id.box3)
        val box4 = findViewById<TextView>(R.id.box4)
        val box5 = findViewById<TextView>(R.id.box5)

        val clickAbleViews:List<View> =
            listOf(box1,box2,box3,box4,box5)

        for (i in clickAbleViews){
            i.setOnClickListener {
                winner(it)
            }
            i.setBackgroundColor(Color.WHITE)
        }
    }

    private fun makeColored(view: View,buttonIcon: Int){
        view.setBackgroundResource(buttonIcon)
    }
}
