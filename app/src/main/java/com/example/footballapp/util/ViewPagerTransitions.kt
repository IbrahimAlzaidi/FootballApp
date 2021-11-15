package com.example.footballapp.util

import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.example.footballapp.util.Constant.MIN_ALPHA_VIEW_PAGER
import com.example.footballapp.util.Constant.MIN_SCALE_VIEW_PAGER
import com.example.footballapp.util.Constant.ONE
import com.example.footballapp.util.Constant.TWO
import com.example.footballapp.util.Constant.ZERO
import kotlin.math.abs
import kotlin.math.max

class ViewPagerTransitions : ViewPager2.PageTransformer {

    override fun transformPage(view: View, position: Float) {
        view.apply {
            val pageWidth = width
            val pageHeight = height
            when {
                position < -ONE -> alpha = ZERO
                position <= ONE -> {
                    val scaleFactor = max(MIN_SCALE_VIEW_PAGER, ONE - abs(position))
                    val vertMargin = pageHeight * (ONE - scaleFactor) / TWO
                    val horizontalMargin = pageWidth * (ONE - scaleFactor) / TWO
                    translationX = if (position < 0) {
                        horizontalMargin - vertMargin / TWO
                    } else {
                        horizontalMargin + vertMargin / TWO
                    }
                    scaleX = scaleFactor
                    scaleY = scaleFactor
                    alpha = (MIN_ALPHA_VIEW_PAGER +
                            (((scaleFactor - MIN_SCALE_VIEW_PAGER) / (ONE - MIN_SCALE_VIEW_PAGER)) * (ONE - MIN_ALPHA_VIEW_PAGER)))
                }
                else -> alpha = ZERO
            }
        }
    }
}
