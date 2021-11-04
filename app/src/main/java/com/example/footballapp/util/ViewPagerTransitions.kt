package com.example.footballapp.util

import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.example.footballapp.util.Constant.MIN_ALPHA_VIEW_PAGER
import com.example.footballapp.util.Constant.MIN_SCALE_VIEW_PAGER
import kotlin.math.abs
import kotlin.math.max

class ViewPagerTransitions : ViewPager2.PageTransformer {

    override fun transformPage(view: View, position: Float) {
        view.apply {
            val pageWidth = width
            val pageHeight = height
            when {
                position < -1 -> alpha = 0f
                position <= 1 -> {
                    val scaleFactor = max(MIN_SCALE_VIEW_PAGER, 1 - abs(position))
                    val vertMargin = pageHeight * (1 - scaleFactor) / 2
                    val horizontalMargin = pageWidth * (1 - scaleFactor) / 2
                    translationX = if (position < 0) {
                        horizontalMargin - vertMargin / 2
                    } else {
                        horizontalMargin + vertMargin / 2
                    }
                    scaleX = scaleFactor
                    scaleY = scaleFactor
                    alpha = (MIN_ALPHA_VIEW_PAGER +
                            (((scaleFactor - MIN_SCALE_VIEW_PAGER) / (1 - MIN_SCALE_VIEW_PAGER)) * (1 - MIN_ALPHA_VIEW_PAGER)))
                }
                else -> alpha = 0f
            }
        }
    }
}
