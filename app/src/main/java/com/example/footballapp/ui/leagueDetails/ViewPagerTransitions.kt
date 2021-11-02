package com.example.footballapp.ui.leagueDetails

import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.example.footballapp.util.Constant.MIN_ALPHA_VIEW_PAGER
import com.example.footballapp.util.Constant.MIN_SCALE_VIEW_PAGER



class ViewPagerTransitions : ViewPager2.PageTransformer {

    override fun transformPage(view: View, position: Float) {
        view.apply {
            val pageWidth = width
            val pageHeight = height
            when {
                position < -1 -> { // [-Infinity,-1)
                    // This page is way off-screen to the left.
                    alpha = 0f
                }
                position <= 1 -> { // [-1,1]
                    // Modify the default slide transition to shrink the page as well
                    val scaleFactor = Math.max(MIN_SCALE_VIEW_PAGER, 1 - Math.abs(position))
                    val vertMargin = pageHeight * (1 - scaleFactor) / 2
                    val horzMargin = pageWidth * (1 - scaleFactor) / 2
                    translationX = if (position < 0) {
                        horzMargin - vertMargin / 2
                    } else {
                        horzMargin + vertMargin / 2
                    }

                    // Scale the page down (between MIN_SCALE and 1)
                    scaleX = scaleFactor
                    scaleY = scaleFactor

                    // Fade the page relative to its size.
                    alpha = (MIN_ALPHA_VIEW_PAGER +
                            (((scaleFactor - MIN_SCALE_VIEW_PAGER) / (1 - MIN_SCALE_VIEW_PAGER)) * (1 - MIN_ALPHA_VIEW_PAGER)))
                }
                else -> { // (1,+Infinity]
                    // This page is way off-screen to the right.
                    alpha = 0f
                }
            }
        }
    }
}
