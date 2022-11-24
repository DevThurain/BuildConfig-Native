package com.thurainx.shared.mvp.views

import com.thurainx.shared.data.vos.RestaurantVO

interface MainView : BasedView {
    fun showRestaurantList(restaurants: List<RestaurantVO>)
}