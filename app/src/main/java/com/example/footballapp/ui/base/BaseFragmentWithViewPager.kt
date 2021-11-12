package com.example.footballapp.ui.base

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.footballapp.util.FootballViewPager
import com.example.footballapp.util.ViewPagerTransitions
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

abstract class BaseFragmentWithViewPager<VDB : ViewDataBinding, VM : BaseViewModel>(
    @LayoutRes private val layoutResId: Int,
) :
    BaseFragment<VDB, VM>(layoutResId) {
    protected fun initViewPager(fragmentsList: List<Fragment>, viewPager: ViewPager2) {
        val standingPagerAdapterView = FootballViewPager(this, fragmentsList)
        viewPager.adapter = standingPagerAdapterView
        viewPager.setPageTransformer(ViewPagerTransitions())
    }

    protected fun initTabLayout(
        viewPager: ViewPager2,
        tabLayout: TabLayout,
        fragmentTitles: List<String>,
    ) {
        TabLayoutMediator(tabLayout, viewPager) { tap, positions ->
            tap.text = fragmentTitles[positions]
        }.attach()
    }
}