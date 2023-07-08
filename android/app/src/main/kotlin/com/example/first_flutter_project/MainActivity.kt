package com.example.first_flutter_project

import android.content.Intent
import android.os.Build
import android.os.Bundle
import com.clevertap.android.sdk.CleverTapAPI
import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {

    var cleverTapDefaultInstance: CleverTapAPI? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //    CleverTapAPI.getDefaultInstance(this)?.apply {

        //         // ctNotificationInboxListener = this@MainActivity

        //         //Initialize the inbox and wait for callbacks on overridden methods
        //         // initializeInbox()
        //     }


       // cleverTapDefaultInstance = CleverTapAPI.getDefaultInstance(applicationContext)
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            // CleverTapAPI.getDefaultInstance(this)?.pushNotificationClickedEvent(intent!!.extras)
            CleverTapAPI.getDefaultInstance(this)?.pushNotificationClickedEvent(intent.extras)
        }
    }
}
