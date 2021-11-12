package com.example.footballapp.ui.base

import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.footballapp.util.FootballViewPager
import com.example.footballapp.util.ViewPagerTransitions
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

abstract class BaseViewPager<VDB : ViewDataBinding, VM : BaseViewModel>(layoutResId: Int):
    BaseFragment<VDB,VM>(layoutResId) {

    abstract val  fragmentTitles: List<String?>

    protected fun initViewPager(fragmentsList: List<Fragment>, viewPager: ViewPager2) {
        val standingPagerAdapterView = this.activity?.let { FootballViewPager(it, fragmentsList) }
        viewPager.adapter = standingPagerAdapterView
        viewPager.setPageTransformer(ViewPagerTransitions())
    }

    protected fun initTabLayout(
        viewPager: ViewPager2,
        tabLayout: TabLayout
    ) {
        TabLayoutMediator(tabLayout, viewPager) { tap, positions ->
            tap.text = fragmentTitles[positions]
        }.attach()
    }
}