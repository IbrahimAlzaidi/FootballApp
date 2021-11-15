package com.example.footballapp.ui.search

import android.transition.TransitionInflater
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentSearchBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.util.OnClickListener

class SearchFragment: BaseFragment<FragmentSearchBinding, SearchViewModel>(R.layout.fragment_search), OnClickListener{
    override fun setup() {
        binding.viewModel = viewModel
        sharedElementEnterTransition = TransitionInflater.from(context)
            .inflateTransition(android.R.transition.move)
        val searchAdapter = SearchAdapter(mutableListOf(),this)
        binding.apply {
            recycleView.adapter = searchAdapter
            clearTextImage.setOnClickListener {
                editText.text.clear()
            }
        }
    }
    override fun getViewModel() = SearchViewModel::class.java

    override fun onClickItem(id: Int, teamId: Int?, leagueId: Int?) {
        navigate(SearchFragmentDirections.actionSearchFragmentToLeagueDetailsFragment(id))
    }

}
