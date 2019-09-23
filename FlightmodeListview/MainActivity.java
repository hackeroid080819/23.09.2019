package com.example.itaykan.internet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayAdapter adapter;
    public ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");

        getBaseContext().registerReceiver(new ConnectivityReceiver(this), intentFilter);


        lv = findViewById(R.id.messages);
        adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, new ArrayList<String>() );
        lv.setAdapter(adapter);
        for (int i = 0; i < 20 ;i++)
        {
            adapter.add("==== " + String.valueOf(i));
        }


    }
}
