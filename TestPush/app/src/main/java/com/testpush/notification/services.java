package com.testpush.notification;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.testpush.MainActivity2;

/**
 * Created by abdul on 29/3/2016.
 */

public class services extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    private NotificationManager mNotificationManager;
    NotificationCompat.Builder builder;
    public services(String name) {
        super(name);
        Intent dialogIntent = new Intent(this, MainActivity2.class);
        dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(dialogIntent);
    }

    @Override
    protected void onHandleIntent(Intent workIntent) {

        // Gets data from the incoming Intent
        String dataString = workIntent.getDataString();

        // Do work here, based on the contents of dataString

    }
}