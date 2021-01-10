package com.andy.games.current

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.andy.games.R
import com.andy.games.databinding.CurrentGameFragmentBinding

class CurrentGameFragment : Fragment() {

    private val vm: CurrentGameViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = CurrentGameFragmentBinding.inflate(layoutInflater, container, false)

        val nav = findNavController()

        binding.fab.setOnClickListener {
            val action = CurrentGameFragmentDirections.actionCurrentGameFragmentToAddGameFragment()
            nav.navigate(action)
        }

        return binding.root
    }


}