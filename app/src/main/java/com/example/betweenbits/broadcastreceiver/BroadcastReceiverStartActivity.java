package com.example.betweenbits.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadcastReceiverStartActivity extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Script","BroadcastReceiverStartActivity");

        Intent intentStart = new Intent(context, StartActivity.class);
        intentStart.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intentStart);
    }
}
