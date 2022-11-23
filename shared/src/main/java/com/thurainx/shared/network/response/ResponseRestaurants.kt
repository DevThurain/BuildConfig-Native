package com.thurainx.shared.network.response

import com.google.gson.annotations.SerializedName
import com.thurainx.shared.data.vos.RestaurantVO

data class ResponseRestaurants(
    @SerializedName("code")
    val code: Int?,

    @SerializedName("message")
    val message: String?,

    @SerializedName("data")
    val data: List<RestaurantVO>?,
)
