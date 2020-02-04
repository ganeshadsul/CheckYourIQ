package com.ganeshadsul.checkyouriq

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ganeshadsul.checkyouriq.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_game_won, container, false)
        val binding = DataBindingUtil.inflate<FragmentGameWonBinding>(inflater,R.layout.fragment_game_won,container,false)

        return binding.root
    }
}