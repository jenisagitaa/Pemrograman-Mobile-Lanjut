package com.dn.fg.mybroadcastreceiverjenisagitaputrim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callinbuilt(View view) {
    }

    public void callcustom(View view) {
        Intent i1 = new Intent();
        i1.setAction("com.mylalit.own.MyReceiver.call");
        i1.addCategory("android.intent.category.DEFAULT");
        sendBroadcast(i1);
    }
}