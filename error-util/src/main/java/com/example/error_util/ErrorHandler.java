package com.example.error_util;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

public class ErrorHandler {

    public static final String TAG = "ERROR_HANDLER";
    private static ErrorHandler mErrorHandler = null;
    private Context mContext;

    private ErrorHandler(Context context){
        this.mContext = context;
    }

    public static ErrorHandler getInstance(Context context){
        if(mErrorHandler == null){
            mErrorHandler = new ErrorHandler(context);
        }
        return mErrorHandler;
    }

    public void toastError(String message){
        Toast.makeText(mContext, message, Toast.LENGTH_LONG).show();
    }

    public void editTextError(EditText editText, String message){
        editText.setError(message);
    }
}
