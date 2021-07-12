package com.example.logger2

import android.util.Log

object CustomLogger {
    fun testLog(msg:String){
        Log.d("==>","$msg")
    }
}