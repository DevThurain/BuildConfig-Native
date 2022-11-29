package com.thurainx.rider.utils

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.content.getSystemService
import com.thurainx.rider.BuildConfig
import com.thurainx.rider.R

object NotificationUtils {

    fun showNotification(context: Context,title: String, content: String, pendingIntent: PendingIntent){
        val notificationManger = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val notificationChannelId = BuildConfig.APPLICATION_ID.plus(".channel")

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel = NotificationChannel(
                notificationChannelId,
                title,
                NotificationManager.IMPORTANCE_DEFAULT
            )

            notificationManger.createNotificationChannel(channel)
        }

        val notification = buildNotification(context, notificationChannelId, title, content, pendingIntent)
        notificationManger.notify(getUniqueId(),notification)
    }

    fun buildNotification(
        context: Context,
        channelId: String,
        title: String,
        content: String,
        pendingIntent: PendingIntent
    ): Notification{

        val bigTextStyle = NotificationCompat.BigTextStyle()
        bigTextStyle.bigText(content)

        return NotificationCompat.Builder(context, channelId)
            .setSmallIcon(R.drawable.ic_baseline_notification)
            .setContentTitle(title)
            .setContentText(content)
            .setAutoCancel(true)
            .setStyle(bigTextStyle)
            .setContentIntent(pendingIntent)
            .build()
    }

    fun getUniqueId(): Int {
        return (System.currentTimeMillis() * 10000).toInt()
    }
}