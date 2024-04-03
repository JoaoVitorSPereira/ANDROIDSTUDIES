package com.example.thebroadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AirplaneModeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // This method is called when the Broadcast Receiver
        // receives a broadcast

        if (intent.getAction() != null &&
                intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {
            boolean isAirplaneModeOn = intent.getBooleanExtra("state", false);

            String msg = isAirplaneModeOn ? "AIRPLANE MODE IS ON" : "AIRPLANE MODE IS OFF";
        }
    }
}
