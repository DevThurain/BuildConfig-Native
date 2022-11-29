package com.thurainx.rider.utils

import android.app.PendingIntent
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.thurainx.rider.RestaurantDetailActivity

class FCMService: FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        Log.d("new_token",token)
        super.onNewToken(token)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        NotificationUtils.showNotification(
            this,
            message.data["title"] ?: "-",
            message.data["body"] ?: "-",
            PendingIntent.getActivity(
                this,
                0,
                RestaurantDetailActivity.getIntent(this),
                PendingIntent.FLAG_IMMUTABLE
            )
        )
    }
}