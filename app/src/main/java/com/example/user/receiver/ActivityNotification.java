package com.example.user.receiver;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityNotification extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String name = getIntent().getExtras().getString("KEY_NAME");
        TextView tv = new TextView(ActivityNotification.this);
        tv.setText("Hello " + name);
        setContentView(tv);
    }
}

