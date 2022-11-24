package com.thurainx.shared.mvp.persenters

import com.thurainx.shared.mvp.views.MainView

interface MainPresenter : BasedPresenter {
    fun initView(mainView: MainView)
}