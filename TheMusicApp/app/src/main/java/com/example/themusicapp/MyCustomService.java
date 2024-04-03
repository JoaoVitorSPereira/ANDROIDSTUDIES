package com.example.themusicapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class MyCustomService extends Service {
    // Player Object to play music.
    private MediaPlayer player;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        // play the audio of default ringtone from device
        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);

        // play in loop
        player.setLooping(true);

        player.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        player.stop();;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
