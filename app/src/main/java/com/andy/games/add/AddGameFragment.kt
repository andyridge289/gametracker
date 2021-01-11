package com.andy.games.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.andy.games.databinding.AddGameFragmentBinding
import com.andy.games.models.api.SearchResultGame
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddGameFragment : Fragment() {

    private val vm: AddGameViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = AddGameFragmentBinding.inflate(layoutInflater, container, false)

        binding.vm = vm
        binding.lifecycleOwner = viewLifecycleOwner

        binding.appCompatEditText.doOnTextChanged { text, _, _, _ ->
            text?.let {
                vm.text = it.toString()
            }
        }

        val click = { item: SearchResultGame ->
            val action = AddGameFragmentDirections.actionAddGameFragmentToAddGameViewFragment()
            findNavController().navigate(action)
            vm.currentGame.value = item
        }

        vm.results.observe(viewLifecycleOwner) {
            binding.recycler.adapter = GameAddItemAdapter(it, click)
        }

        return binding.root
    }
}