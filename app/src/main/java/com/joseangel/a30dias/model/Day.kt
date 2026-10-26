package com.joseangel.a30dias.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day(
    @StringRes val stringDay: Int,
    @StringRes val stringDayRecipeName: Int,
    @StringRes val stringDayRecipe: Int,
    @DrawableRes val imageResourceId: Int
)
