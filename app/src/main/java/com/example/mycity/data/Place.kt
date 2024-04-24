package com.example.mycity.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Place(
    @StringRes val title: Int,
    @StringRes val address: Int,
    @DrawableRes val image: Int,
    @StringRes val phone: Int
)

