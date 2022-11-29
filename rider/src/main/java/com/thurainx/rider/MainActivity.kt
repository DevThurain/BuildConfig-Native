package com.thurainx.rider

import android.app.PendingIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.thurainx.rider.utils.NotificationUtils
import com.thurainx.shared.showSnackBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseMessaging.getInstance().token.addOnSuccessListener { token ->
            Log.d("token", token)
        }
    }

    override fun onResume() {
        showSnackBar("Rider App")

//        NotificationUtils.showNotification(
//            this,
//            "Noti Title",
//            "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters",
//            PendingIntent.getActivity(
//                this,
//                0,
//                RestaurantDetailActivity.getIntent(this),
//                PendingIntent.FLAG_IMMUTABLE
//            )
//        )
        super.onResume()
    }
}