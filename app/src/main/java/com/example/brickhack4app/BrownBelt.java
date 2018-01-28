package com.example.brickhack4app;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by JMenezes on 1/27/2018.
 */
public class BrownBelt extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belt);
        String[] techniques = {"Harai makikomi","Kata guruma", "Uki otoshi", "Yoko tomoe nage", "Okuri ashi harai", "Yoko gake", "Sasae tsuri komi ashi"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, techniques);
        getListView().setAdapter(adapter);
    }
}

