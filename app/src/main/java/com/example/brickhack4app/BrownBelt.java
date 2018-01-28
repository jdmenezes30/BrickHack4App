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
public class BrownBelt extends ListFragment{
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
        String[] techniques = {"Harai makikomi","Kata guruma", "Uki otoshi", "Yoko tomoe nage", "Okuri ashi harai", "Yoko gake", "Sasae tsuri komi ashi"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, techniques);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(getActivity().getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                 String sText = ((TextView) view).getText().toString();
                 Intent intent = new Intent(getActivity().getBaseContext(), Technique.class);
                 switch (sText) {
                     case "Harai makikomi":
                         intent.putExtra("vURL", "AR2F0mU0ODc");
                         intent.putExtra("text1", "Harai makikomi");
                         intent.putExtra("text2", "Hip sweep wraparound throw");
                         startActivity(intent);
                         break;
                     case "Kata guruma":
                         intent.putExtra("vURL", "hBSJoGYmEko");
                         intent.putExtra("text1", "Kata guruma");
                         intent.putExtra("text2", "Shoulder wheel");
                         startActivity(intent);
                         break;
                     case "Uki otoshi":
                         intent.putExtra("vURL", "kiLCfJk2mEA");
                         intent.putExtra("text1", "Uki otoshi");
                         intent.putExtra("text2", "Floating drop");
                         startActivity(intent);
                         break;
                     case "Yoko tomoe nage":
                         intent.putExtra("vURL", "XskRJ8mmbWQ");
                         intent.putExtra("text1", "Yoko tomoe nage");
                         intent.putExtra("text2", "Side circular throw");
                         startActivity(intent);
                         break;
                     case "Okuri ashi harai":
                         intent.putExtra("vURL", "m3LNa46XPgI");
                         intent.putExtra("text1", "Okuri ashi harai");
                         intent.putExtra("text2", "Foot sweep");
                         startActivity(intent);
                         break;
                     case "Yoko gake":
                         intent.putExtra("vURL", "snzm2LZsj0g");
                         intent.putExtra("text1", "Yoko gake");
                         intent.putExtra("text2", "Side body drop");
                         startActivity(intent);
                         break;
                     case "Sasae tsuri komi ashi":
                         intent.putExtra("vURL", "QaSuu4Q7Xms");
                         intent.putExtra("text1", "Sasae tsuri komi ashi");
                         intent.putExtra("text2", "Supporting foot lift-pull throw");
                         startActivity(intent);
                         break;
                 }
             }
         }
        );
        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(Color.parseColor("#a5682a"));
        super.onActivityCreated(savedInstanceState);
    }
}
