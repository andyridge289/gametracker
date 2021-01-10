package com.andy.games.current

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.andy.games.R

class CurrentGameFragment : Fragment() {

    companion object {
        fun newInstance() = CurrentGameFragment()
    }

    private lateinit var viewModel: CurrentGameViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.current_game_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CurrentGameViewModel::class.java)
        // TODO: Use the ViewModel
    }

}