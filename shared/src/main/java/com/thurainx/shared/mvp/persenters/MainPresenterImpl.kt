package com.thurainx.shared.mvp.persenters

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.thurainx.shared.data.models.TheRestaurantModelImpl
import com.thurainx.shared.mvp.views.MainView

class MainPresenterImpl : ViewModel(), MainPresenter {

    lateinit var mMainView: MainView

    private val mRestaurantModel = TheRestaurantModelImpl

    override fun initView(mainView: MainView) {
        mMainView = mainView
    }

    override fun onUiReady(owner: LifecycleOwner) {
        mRestaurantModel.getRestaurants(
            onSuccess = {
                mMainView.showRestaurantList(it)
            },
            onError = {
                mMainView.showErrorMessage(it)
            }
        )
    }
}