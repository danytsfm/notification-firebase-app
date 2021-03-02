package com.example.notificationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.iid.FirebaseInstanceId

class MainActivity : AppCompatActivity() {

    private lateinit var btnSender : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSender = findViewById(R.id.btn_sender)
        btnSender.setOnClickListener {
            this.showNotification("1010", "Note App", "Test for notes app")
        }

        Log.i("**newToken", FirebaseInstanceId.getInstance().token.toString())
    }
}