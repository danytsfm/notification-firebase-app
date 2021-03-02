package com.example.notificationapp

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.RemoteViews
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FireBaseMessagingService : FirebaseMessagingService() {

    private  val tag = "FBMessagingService"

    override fun onMessageReceived(remoteMessage : RemoteMessage){

        Log.i(tag, remoteMessage.from.toString())

        if (remoteMessage.notification != null){
            this.showNotification("1010",
            remoteMessage.notification?.title.toString(),
            remoteMessage.notification?.body.toString())

        }

    }

}