package com.example.anchala.myapplication;

import android.app.Application;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.webkit.WebView;

import com.facebook.stetho.Stetho;

public class MyApplication extends Application {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        WebView.setWebContentsDebuggingEnabled(true);
    }
}
