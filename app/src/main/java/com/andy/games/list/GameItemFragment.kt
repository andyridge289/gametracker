package com.andy.games.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.andy.games.databinding.AddGameViewFragmentBinding
import com.andy.games.databinding.GameItemFragmentBinding
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GameItemFragment : Fragment() {

    private val vm: GameItemViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = GameItemFragmentBinding.inflate(layoutInflater, container, false)

        binding.vm = vm
        binding.lifecycleOwner = viewLifecycleOwner

        vm.currentImage.observe(viewLifecycleOwner) { image ->
            image?.let{
                Glide.with(this).load(it).into(binding.imageView)
            }
        }

        binding.finishedSwitch.setOnCheckedChangeListener { _, value ->
            vm.setFinished(value)
        }

        return binding.root
    }
}