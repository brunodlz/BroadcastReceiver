package com.example.betweenbits.broadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("BroadcasReceiver_API");
        intentFilter.addCategory(Intent.CATEGORY_DEFAULT);

        registerReceiver(new BroadcastReceiverApi(), intentFilter);
    }

    public void callBroadcastReceiver(View view) {
        Button button = (Button) view;
        Intent intent = new Intent(button.getText().toString());
        sendBroadcast(intent);
    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(new BroadcastReceiverApi());
    }
}
