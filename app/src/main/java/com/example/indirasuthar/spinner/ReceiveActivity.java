package com.example.indirasuthar.spinner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by indirasuthar on 08/03/18.
 */

public class ReceiveActivity extends AppCompatActivity {

    public TextView displaymesg;
    public static final String EXTRA_MESSAGE = "mess";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        Intent getintent = getIntent();
        displaymesg = (TextView) findViewById(R.id.displaymesg);
        String messageText = getintent.getStringExtra(EXTRA_MESSAGE);
        displaymesg.setText(messageText);

    }


}
