package com.thurainx.shared.data.models

import com.thurainx.shared.data.vos.RestaurantVO


interface TheRestaurantModel {
    fun getRestaurants(
        onSuccess: (List<RestaurantVO>) -> Unit,
        onError: (String) -> Unit
    )
}