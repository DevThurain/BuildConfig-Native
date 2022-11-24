package com.thurainx.shared.data.models

import com.thurainx.shared.network.TheRestaurantApi
import com.thurainx.shared.network.basedUrl
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

abstract class BasedModel {
     protected lateinit var mRestaurantApi : TheRestaurantApi

     fun initRetrofitBasedUrl(url: String) {
          val okHttpClient = OkHttpClient.Builder()
               .connectTimeout(15, TimeUnit.SECONDS)
               .readTimeout(15, TimeUnit.SECONDS)
               .writeTimeout(15, TimeUnit.SECONDS)
               .build()

          val retrofitClient = Retrofit.Builder()
               .baseUrl(url)
               .client(okHttpClient)
               .addConverterFactory(GsonConverterFactory.create())
               .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
               .build()

          mRestaurantApi = retrofitClient.create(TheRestaurantApi::class.java)
     }



}