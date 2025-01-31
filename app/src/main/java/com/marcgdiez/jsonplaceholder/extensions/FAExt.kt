package com.marcgdiez.jsonplaceholder.extensions

import android.os.Bundle
import android.util.Log
import com.google.firebase.analytics.FirebaseAnalytics
import com.marcgdiez.jsonplaceholder.core.BaseAnalyticActivity

/* A file*/

private fun FirebaseAnalytics.logEvent(
    firebaseEventTag: String = FirebaseAnalytics.Event.SELECT_CONTENT,
    block: () -> Bundle
) {
    this.logEvent(firebaseEventTag, block())
}

private fun dataToBundle(data: List<Pair<String, String>>): Bundle {
    val b = Bundle()
    data.forEach {
        b.putString(it.first, it.second)
    }
    return b
}

fun BaseAnalyticActivity.logPageView_main() {
    val data = mutableListOf<Pair<String, String>>()
    data += Constant.EVENT_NAME to "main_page"
    data += Constant.CATEGORY to "view"
    data += Constant.ACTION to "finish"
    data += Constant.LABEL to "loading"
    firebaseAnalytics.logEvent {
        return@logEvent dataToBundle(data)
    }
    printWithName("main_page", data)
}

fun BaseAnalyticActivity.logPageView_detail() {
    val data = mutableListOf<Pair<String, String>>()
    data += Constant.EVENT_NAME to "detail_page"
    data += Constant.CATEGORY to "view"
    data += Constant.ACTION to "finish"
    data += Constant.LABEL to "loading"
    firebaseAnalytics.logEvent {
        return@logEvent dataToBundle(data)
    }
    printWithName("detail_page", data)
}

fun BaseAnalyticActivity.logPageView_post_comment() {
    val data = mutableListOf<Pair<String, String>>()
    data += Constant.EVENT_NAME to "post_comment"
    data += Constant.CATEGORY to "post"
    data += Constant.ACTION to "finish"
    data += Constant.LABEL to "loading"
    firebaseAnalytics.logEvent {
        return@logEvent dataToBundle(data)
    }
    printWithName("post_comment", data)
}


fun printWithName(tag: String, b: List<Pair<String, String>>) {
    b.forEach {
        Log.d(tag, "key: ${it.first} , value: ${it.second}")
    }
}