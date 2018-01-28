package com.example.brickhack4app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by JMenezes on 1/27/2018.
 */

public class osotogake extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.techniquedescription);
        TextView textElement = (TextView) findViewById(R.id.techniqueName);
        textElement.setText("O soto gake");
    }
}
