package com.thurainx.buildconfig.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thurainx.buildconfig.R
import com.thurainx.buildconfig.viewholders.RestaurantViewHolder
import com.thurainx.shared.data.vos.RestaurantVO

class RestaurantAdapter() : RecyclerView.Adapter<RestaurantViewHolder>() {
    var mRestaurantList = listOf<RestaurantVO>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_restaurant, parent,false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bind(mRestaurantList[position])
    }

    override fun getItemCount(): Int {
        return mRestaurantList.size
    }

    fun setNewData(restaurantList: List<RestaurantVO>){
        mRestaurantList = restaurantList
        notifyDataSetChanged()
    }
}