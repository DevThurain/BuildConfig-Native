package com.thurainx.buildconfig.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.thurainx.buildconfig.R
import com.thurainx.buildconfig.adapters.RestaurantAdapter
import com.thurainx.shared.data.vos.RestaurantVO
import com.thurainx.shared.mvp.persenters.MainPresenter
import com.thurainx.shared.mvp.persenters.MainPresenterImpl
import com.thurainx.shared.mvp.views.MainView
import com.thurainx.shared.showSnackBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    lateinit var mRestaurantAdapter: RestaurantAdapter
    lateinit var mMainPresenter: MainPresenterImpl
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSnackBar("consumer app")
        setupPresenter()
        setupRecyclerView()
        mMainPresenter.onUiReady(this)
    }

    private fun setupPresenter(){
        mMainPresenter = ViewModelProvider(this)[MainPresenterImpl::class.java]
        mMainPresenter.initView(this)
    }

    private fun setupRecyclerView() {
        mRestaurantAdapter = RestaurantAdapter()
        rvRestaurants.adapter = mRestaurantAdapter
    }

    override fun showRestaurantList(restaurants: List<RestaurantVO>) {
        mRestaurantAdapter.setNewData(restaurants)
    }

    override fun showErrorMessage(message: String) {
        showSnackBar(message)
    }
}