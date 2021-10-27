package com.example.footballapp.ui.home

import androidx.fragment.app.viewModels
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentHomeBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.HomeFragmentViewModel


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home){
    private val viewModel : HomeFragmentViewModel by viewModels()
    override fun setup() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        val adapter = TeamsAdapter(mutableListOf(),null)
        binding.recycleView.adapter = adapter
    }

}
