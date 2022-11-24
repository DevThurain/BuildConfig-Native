package com.thurainx.shared.mvp.persenters

import androidx.lifecycle.LifecycleOwner

interface BasedPresenter {
    fun onUiReady(owner: LifecycleOwner)
}