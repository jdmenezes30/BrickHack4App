package com.example.brickhack4app;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by JMenezes on 1/27/2018.
 */
public class BlueBelt extends ListFragment{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.belt);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.belt, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        String[] techniques = {"Uchi mata","Soto makikomi", "Hane goshi", "Yama arashi", "Tsuri komi goshi", "Uchi makikomi", "O soto guruma"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, techniques);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(getActivity().getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                 String sText = ((TextView) view).getText().toString();
                 Intent intent = new Intent(getActivity().getBaseContext(), Technique.class);
                 switch (sText) {
                     case "Uchi mata":
                         intent.putExtra("vURL", "7qeKv_dpLlw");
                         intent.putExtra("text1", "Uchi mata");
                         intent.putExtra("text2", "Inner-thigh reaping throw");
                         startActivity(intent);
                         break;
                     case "Soto makikomi":
                         intent.putExtra("vURL", "qXTdAEpwubw");
                         intent.putExtra("text1", "Soto makikomi");
                         intent.putExtra("text2", "Outer wraparound throw");
                         startActivity(intent);
                         break;
                     case "Hane goshi":
                         intent.putExtra("vURL", "sUvXz4BGD0k");
                         intent.putExtra("text1", "Hane goshi");
                         intent.putExtra("text2", "Hip spring");
                         startActivity(intent);
                         break;
                     case "Yama arashi":
                         intent.putExtra("vURL", "fM2Kjq4Ec2c");
                         intent.putExtra("text1", "Yama arashi");
                         intent.putExtra("text2", "Mountain storm");
                         startActivity(intent);
                         break;
                     case "Tsuri komi goshi":
                         intent.putExtra("vURL", "1eir0M1N40Q");
                         intent.putExtra("text1", "Tsuri komi goshi");
                         intent.putExtra("text2", "Lift-pull hip throw");
                         startActivity(intent);
                         break;
                     case "Uchi makikomi":
                         intent.putExtra("vURL", "y1DBRwZrXtg");
                         intent.putExtra("text1", "Uchi makikomi");
                         intent.putExtra("text2", "Inner wraparoung throw");
                         startActivity(intent);
                         break;
                     case "O soto guruma":
                         intent.putExtra("vURL", "2zAr2dcRKhY");
                         intent.putExtra("text1", "O soto guruma");
                         intent.putExtra("text2", "Large outer wheel");
                         startActivity(intent);
                         break;
                 }
             }
         }
        );
        super.onActivityCreated(savedInstanceState);
    }
}
