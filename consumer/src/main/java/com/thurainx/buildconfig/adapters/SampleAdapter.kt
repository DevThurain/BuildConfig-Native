package com.thurainx.buildconfig.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thurainx.buildconfig.R
import com.thurainx.buildconfig.viewholders.RestaurantViewHolder
import com.thurainx.shared.data.vos.RestaurantVO

class SampleAdapter() : RecyclerView.Adapter<RestaurantViewHolder>() {
    var mDataList = listOf<RestaurantVO>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_restaurant, parent,false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bind(mDataList[position])
    }

    override fun getItemCount(): Int {
        return mDataList.size
    }

    fun setNewData(dataList: List<RestaurantVO>){
        mDataList = dataList
        notifyDataSetChanged()
    }
}