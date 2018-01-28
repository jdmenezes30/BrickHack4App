package com.example.brickhack4app;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by JMenezes on 1/27/2018.
 */
public class GreenBelt extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belt);
        String[] techniques = {"Ushiro goshi","Sumi gaeshi", "Sode tsurikomi goshi", "O soto otoshi", "Ko soto gari", "Tomoe nage"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, techniques);
        getListView().setAdapter(adapter);
    }
}
