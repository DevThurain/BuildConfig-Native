package com.thurainx.buildconfig

import android.app.Application
import com.thurainx.shared.data.models.TheRestaurantModel
import com.thurainx.shared.data.models.TheRestaurantModelImpl

class TheConsumerApp : Application() {
    override fun onCreate() {
        super.onCreate()
        TheRestaurantModelImpl.initRetrofitBasedUrl(BuildConfig.ENDPOINT_FIELD)
    }
}