package com.thurainx.shared.network

import com.thurainx.shared.network.response.ResponseRestaurants
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET


interface TheRestaurantApi {
    @GET(END_POINT_RESTAURANTS)
    fun getRestaurants() : Observable<ResponseRestaurants>
}