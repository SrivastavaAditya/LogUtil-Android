package com.example.log_util;

import android.util.Log;

public class LogDebug {

    public static final String TAG = "LOG_DEBUG";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
