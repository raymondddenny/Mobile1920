package com.github.raymondddenny.tomAndJerry


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.github.raymondddenny.tomAndJerry.databinding.FragmentGameBinding
import com.github.raymondddenny.tomAndJerry.MyApplication.Scene

class GameFragment : Fragment() {

    // Variables
    private val scenes = MyApplication.scenes
    lateinit var currentScene: Scene
    private var selectedActionId: Int = 0


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
            inflater, R.layout.fragment_game, container, false)

        // This is IMPORTANT! without this, "@{}" things in [fragment_game.sml] won't work.
        currentScene = scenes[0]

        // Bind this fragment class to the layout
        binding.scene = this

        // Listener for action button
        binding.actionButton.setOnClickListener {

            if(binding.actions.checkedRadioButtonId != -1) {

                when (binding.actions.checkedRadioButtonId) {
                    binding.actionOne.id -> selectedActionId = 0
                    binding.actionTwo.id -> selectedActionId = 1
//                    binding.actionThree.id -> selectedActionId = 2

                }

                when (currentScene) {
                    scenes[0] -> currentScene = scenes[1] //Intro
                    scenes[1] -> { // midnight Snack
                        when(selectedActionId) {
                            0 -> currentScene = scenes[6]
                            1 -> currentScene = scenes[2]
                        }
                    }
                    scenes[2] -> { // Berpura-pura tidak melihat
                        when(selectedActionId) {
                            0 -> currentScene = scenes[6]
                            1 -> currentScene = scenes[3]
                        }
                    }
                    scenes[3] -> { // Jerry Membawa Keju Kembali
                        when(selectedActionId) {
                            0 -> currentScene = scenes[4]
                            1 -> currentScene = scenes[6]
                        }
                    }
                    scenes[4] -> { // Tom menangkap Jerry
                        when(selectedActionId) {
                            0 -> currentScene = scenes[6]
                            1 -> currentScene = scenes[5]
                        }
                    }
                    scenes[5] -> { // Keusilan Tom
                        when(selectedActionId) {
                            0 -> currentScene = scenes[7]
                            1 -> currentScene = scenes[8]
                        }
                    }
                }

                // Disabling options if choice == "" and enabling them if not
                if (currentScene.actions[0] == "") binding.actionOne.isEnabled = false else binding.actionOne.isEnabled = true
                if (currentScene.actions[1] == "") binding.actionTwo.isEnabled = false else binding.actionTwo.isEnabled = true


                binding.actions.clearCheck()
                binding.scrollView.fullScroll(ScrollView.FOCUS_UP)
                binding.invalidateAll()
            } else {
                Toast.makeText(this.activity, "Select one of the actions to continue!", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    private fun ending() {

        when(selectedActionId) {
            0 -> this.activity!!.onBackPressed()
            1 -> currentScene = scenes[0]
        }
    }

}
