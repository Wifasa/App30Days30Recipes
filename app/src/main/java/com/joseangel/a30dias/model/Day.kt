package com.joseangel.a30dias.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
