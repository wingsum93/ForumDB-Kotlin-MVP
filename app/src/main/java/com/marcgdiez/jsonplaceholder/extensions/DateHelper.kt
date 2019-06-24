package com.marcgdiez.jsonplaceholder.extensions

import java.text.SimpleDateFormat
import java.util.*

object DateHelper {

    fun firebaseSpecialFormat(): String = getFormatedDateString(Calendar.getInstance().time, xyz)
    private var xyz = SimpleDateFormat("yyyy-MM-dd@hh:mm:ss", Locale.US)

    fun getFormatedDateString(date: Date?, format: SimpleDateFormat?): String {
        return if (date == null || format == null) {
            ""
        } else format.format(date)
    }
}
