package com.pijupiju.narcissisticcannibal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;

import java.util.Objects;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Objects.requireNonNull(intent.getAction()).equals("android.intent.action.LOCKED_BOOT_COMPLETED")) {
            final AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
            assert audioManager != null;
            audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
        }
    }

}