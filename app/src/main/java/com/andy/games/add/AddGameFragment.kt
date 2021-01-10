package com.andy.games.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.andy.games.databinding.AddGameFragmentBinding

class AddGameFragment : Fragment() {

    private val vm: AddGameViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = AddGameFragmentBinding.inflate(layoutInflater, container, false)


        return binding.root
    }
}