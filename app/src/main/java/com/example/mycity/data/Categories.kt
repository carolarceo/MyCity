package com.example.mycity.data

import com.example.mycity.R

object Categories {
    val categories = listOf(
        Category(
            R.string.cafes,
            R.drawable.cafe_icon,
            cafes,
        ),
        Category(
            R.string.barrios,
            R.drawable.barrio_icon,
            barrios,
        ),
        Category(
            R.string.fuertes,
            R.drawable.fuertes_icon,
            fuertes,
        ),
        Category(
            R.string.restaurantes,
            R.drawable.restaurante_icon,
            restaurantes
        )
    )

    val currentCategory = categories[0]
    val currentPlace = currentCategory.places[0]
}