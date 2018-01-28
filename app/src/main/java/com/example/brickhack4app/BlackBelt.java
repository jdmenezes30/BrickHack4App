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
public class BlackBelt extends ListFragment{
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
        String[] techniques = {"Hiza guruma","Ashi guruma", "Yoko guruma", "Uki waza", "Harai tsuri komi ashi", "Yoko otoshi"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, techniques);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(getActivity().getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                 String sText = ((TextView) view).getText().toString();
                 Intent intent = new Intent(getActivity().getBaseContext(), Technique.class);
                 switch (sText) {
                     case "Hiza guruma":
                         intent.putExtra("vURL", "MbrtbT4ivoY");
                         intent.putExtra("text1", "Hiza guruma");
                         intent.putExtra("text2", "Knee wheel");
                         startActivity(intent);
                         break;
                     case "Ashi guruma":
                         intent.putExtra("vURL", "pnTq5wFPEFM");
                         intent.putExtra("text1", "Ashi guruma");
                         intent.putExtra("text2", "Leg wheel");
                         startActivity(intent);
                         break;
                     case "Yoko guruma":
                         intent.putExtra("vURL", "3cTnl6rB82k");
                         intent.putExtra("text1", "Yoko guruma");
                         intent.putExtra("text2", "Side wheel");
                         startActivity(intent);
                         break;
                     case "Uki waza":
                         intent.putExtra("vURL", "R7rXDB6S-LI");
                         intent.putExtra("text1", "Uki waza");
                         intent.putExtra("text2", "Floating throw");
                         startActivity(intent);
                         break;
                     case "Harai tsuri komi ashi":
                         intent.putExtra("vURL", "uz6V5aVHJxQ");
                         intent.putExtra("text1", "Harai tsuri komi ashi");
                         intent.putExtra("text2", "Lift-pull foot sweep");
                         startActivity(intent);
                         break;
                     case "Yoko otoshi":
                         intent.putExtra("vURL", "H4VADt6VfeI");
                         intent.putExtra("text1", "Yoko otoshi");
                         intent.putExtra("text2", "Side drop");
                         startActivity(intent);
                         break;
                 }
             }
         }
        );
        super.onActivityCreated(savedInstanceState);
    }
}