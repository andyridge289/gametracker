package com.andy.games.current

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.andy.games.databinding.CurrentGameFragmentBinding
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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

        binding.listFab.setOnClickListener {
            val action = CurrentGameFragmentDirections.actionCurrentGameFragmentToGameListFragment()
            nav.navigate(action)
        }

        vm.currentImage.observe(viewLifecycleOwner) { image ->
            image?.let{
                Glide.with(this).load(it).into(binding.imageView)
            }
        }

        binding.next.setOnClickListener {
            vm.next()
        }

        return binding.root
    }


}