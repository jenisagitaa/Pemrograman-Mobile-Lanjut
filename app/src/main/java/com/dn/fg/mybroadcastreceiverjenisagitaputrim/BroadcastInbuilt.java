package com.dn.fg.mybroadcastreceiverjenisagitaputrim;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastInbuilt extends BroadcastReceiver {
    BroadcastInbuilt(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Battery is Low, Please Charge", Toast.LENGTH_SHORT).show();
    }
}