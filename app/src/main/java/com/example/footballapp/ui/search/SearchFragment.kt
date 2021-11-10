package com.example.footballapp.ui.search

import android.transition.TransitionInflater
import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentSearchBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.OnClickListener

class SearchFragment: BaseFragment<FragmentSearchBinding, SearchViewModel>(R.layout.fragment_search){
    override fun setup() {
        binding.viewModel = viewModel
        sharedElementEnterTransition = TransitionInflater.from(context)
            .inflateTransition(android.R.transition.move)
        val searchAdapter = SearchAdapter(mutableListOf(),viewModel)
        binding.apply {
            recycleView.adapter = searchAdapter
            clearTextImage.setOnClickListener {
                editText.text.clear()
            }
        }
    }
    override fun getViewModel() = SearchViewModel::class.java
    override val arg: Int?
        get() = null
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

}
