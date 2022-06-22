package com.example.yummy.onboarding

import androidx.annotation.DrawableRes
import com.example.yummy.R

data class Page(val title: String, val desc: String,
@DrawableRes val image: Int)

val onbordingpages = listOf(
    Page(
        "Know the Good Food",
        "Device a healthy lifestyle from the recipes of the Good Food",
        R.mipmap.goodfood
    ),
    Page("The best Recipes from all over the world",
    "The right ingredients to bring out the best in your meal",
        R.mipmap.goodfood
    ),
    Page("Discover foreighn recipes from key words ",
        "Creative cooking from chefs all over the world",
        R.mipmap.goodfood
    )
)
