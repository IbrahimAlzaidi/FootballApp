package com.example.footballapp.ui.search

import android.transition.TransitionInflater
import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentStandingBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.util.OnClickListener

class SearchFragment: BaseFragment<FragmentStandingBinding, SearchViewModel>(R.layout.fragment_search), OnClickListener{
    override fun setup() {
        sharedElementEnterTransition = TransitionInflater.from(context)
            .inflateTransition(android.R.transition.move)
    }

    override fun getViewModel() = SearchViewModel::class.java

    override val arg: Int?
        get() = null

    override fun onClickItem(id: Int) {
        val action= SearchFragmentDirections.actionSearchFragmentToLeagueDetailsFragment(id)
        this.findNavController().navigate(action)
    }

}