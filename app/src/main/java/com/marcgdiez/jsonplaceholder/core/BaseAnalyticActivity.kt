package com.marcgdiez.jsonplaceholder.core

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics

abstract class BaseAnalyticActivity : AppCompatActivity() {

    lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firebaseAnalytics = FirebaseAnalytics.getInstance(this)

    }

    override fun onDestroy() {
        super.onDestroy()
    }

}