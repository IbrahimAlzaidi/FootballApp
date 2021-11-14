package com.example.footballapp.util

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class ScrollChildSwipeRefreshLayout @JvmOverloads constructor(
    context: Context,
    attributes: AttributeSet?=null
) : SwipeRefreshLayout(context,attributes){
    var scroll : View? = null

    override fun canChildScrollUp() =
        scroll?.canScrollVertically(-1) ?: super.canChildScrollUp()
}
