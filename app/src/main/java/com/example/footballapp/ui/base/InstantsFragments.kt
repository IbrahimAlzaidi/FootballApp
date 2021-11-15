package com.example.footballapp.ui.base

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

open class InstantsFragments<T : Fragment>(private val cls: Class<T>) {

    fun newInstance(vararg args: Pair<String, Any?>): T {
        return cls.newInstance().apply {
            arguments = bundleOf(*args)
        }
    }
}
