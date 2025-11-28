package com.androidlead.fooddeliveryapp.data

import androidx.annotation.DrawableRes
import com.androidlead.fooddeliveryapp.R

data class ProductHighlightState(
    val text: String,
    val type: ProductHighlightType
)

enum class ProductHighlightType {
    PRIMARY, SECONDARY
}

data class ProductPreviewState(
    val headline: String = "All about Dumplings",
    @DrawableRes val productImg: Int = R.drawable.img_dumpling,
    val highlights: List<ProductHighlightState> = listOf(
        ProductHighlightState(
            text = "Juicy",
            type = ProductHighlightType.SECONDARY
        ),
        ProductHighlightState(
            text = "Pork Flavor",
            type = ProductHighlightType.PRIMARY
        )
    )
)