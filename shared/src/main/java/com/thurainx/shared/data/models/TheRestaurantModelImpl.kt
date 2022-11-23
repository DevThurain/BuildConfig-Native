package com.thurainx.shared.data.models

import com.thurainx.shared.data.vos.RestaurantVO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class TheRestaurantModelImpl : BasedModel(), TheRestaurantModel {
    override fun getRestaurants(
        onSuccess: (List<RestaurantVO>) -> Unit,
        onError: (String) -> Unit
    ) {
        mRestaurantApi.getRestaurants()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ response ->
                onSuccess(response.data ?: listOf())
            }, {
                onError(it.localizedMessage ?: "unknown api error")
            })
    }
}