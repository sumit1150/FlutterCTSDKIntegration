package com.example.first_flutter_project;

import com.clevertap.android.sdk.ActivityLifecycleCallback;
import com.clevertap.android.sdk.Application;
import com.clevertap.android.sdk.CleverTapAPI;

import io.flutter.app.FlutterApplication;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
       // System.out.println("CleverTapID: "+CleverTapAPI.getDefaultInstance(this).getCleverTapID());
        //CleverTapAPI.setDebugLevel(CleverTapAPI.LogLevel.DEBUG);
        ActivityLifecycleCallback.register(this); //<--- Must call this before super.onCreate()
        super.onCreate();
    }
}
