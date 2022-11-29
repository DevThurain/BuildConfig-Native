package com.thurainx.rider

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RestaurantDetailActivity : AppCompatActivity() {
    companion object{
        fun getIntent(context: Context): Intent{
            val intent = Intent(context, RestaurantDetailActivity::class.java)
            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_detail)
    }
}