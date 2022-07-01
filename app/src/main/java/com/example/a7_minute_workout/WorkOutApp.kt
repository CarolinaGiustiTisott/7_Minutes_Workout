package com.example.a7_minute_workout

import android.app.Application

class WorkOutApp: Application() {
    val db by lazy{
        HistoryDatabase.getInstance(this)
    }
}