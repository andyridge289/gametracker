package com.andy.games.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.andy.games.databinding.AddGameViewFragmentBinding
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddGameViewFragment : Fragment() {

    private val vm: AddGameViewViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = AddGameViewFragmentBinding.inflate(layoutInflater, container, false)

        binding.vm = vm
        binding.lifecycleOwner = viewLifecycleOwner

        vm.currentImage.observe(viewLifecycleOwner) { image ->
            image?.let{
                Glide.with(this).load(it).into(binding.imageView)
            }
        }

        return binding.root
    }
}