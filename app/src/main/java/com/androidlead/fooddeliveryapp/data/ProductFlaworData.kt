package com.androidlead.fooddeliveryapp.data

import androidx.annotation.DrawableRes
import com.androidlead.fooddeliveryapp.R

data class ProductFlavorState(
    val name: String,
    val price: String,
    @DrawableRes val imgRes: Int
)

val ProductFlavorsData = listOf(
    ProductFlavorState(
        imgRes = R.drawable.img_soysauce,
        name = "Soy Sauce",
        price = "Free"
    ),
    ProductFlavorState(
        imgRes = R.drawable.img_hotsauce,
        name = "Hot Sauce",
        price = "Free"
    ),
    ProductFlavorState(
        imgRes = R.drawable.img_greenonion,
        name = "Green Onion",
        price = "FREE"
    )
)