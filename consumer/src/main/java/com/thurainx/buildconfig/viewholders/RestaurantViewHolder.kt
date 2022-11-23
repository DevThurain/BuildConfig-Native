package com.thurainx.buildconfig.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.thurainx.shared.data.vos.RestaurantVO
import kotlinx.android.synthetic.main.view_holder_restaurant.view.*

class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(restaurantVO: RestaurantVO){
        Glide.with(itemView.context)
            .load(restaurantVO.imageUrl)
            .into(itemView.ivRestaurantCover)

        itemView.tvRestaurantName.text = restaurantVO.name
        itemView.tvCategory.text = restaurantVO.category
        itemView.rbRestaurantRating.progress = restaurantVO.rating?.toInt() ?: 0
    }
}