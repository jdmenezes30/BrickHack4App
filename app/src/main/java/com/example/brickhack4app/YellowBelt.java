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
public class YellowBelt extends ListFragment{
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
        String[] techniques = {"O uchi gari","Ko uchi gari", "Ko uchi makikomi", "Seoi otoshi", "De ashi harai", "Tani otoshi"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, techniques);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(getActivity().getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                 String sText = ((TextView) view).getText().toString();
                 Intent intent = new Intent(getActivity().getBaseContext(), Technique.class);
                 switch (sText) {
                     case "O uchi gari":
                         intent.putExtra("vURL", "MuLDvLFQTHs");
                         intent.putExtra("text1", "O uchi gari");
                         intent.putExtra("text2", "Large inner reap");
                         startActivity(intent);
                         break;
                     case "Ko uchi gari":
                         intent.putExtra("vURL", "cwlmv52ccVQ");
                         intent.putExtra("text1", "Ko uchi gari");
                         intent.putExtra("text2", "Small inner reap");
                         startActivity(intent);
                         break;
                     case "Ko uchi makikomi":
                         intent.putExtra("vURL", "2Sj6i-ivpR4");
                         intent.putExtra("text1", "Ko uchi makikomi");
                         intent.putExtra("text2", "Small inner wraparound throw");
                         startActivity(intent);
                         break;
                     case "Seoi otoshi":
                         intent.putExtra("vURL", "cS_XrgE0hNE");
                         intent.putExtra("text1", "Seoi otoshi");
                         intent.putExtra("text2", "Shoulder drop");
                         startActivity(intent);
                         break;
                     case "De ashi harai":
                         intent.putExtra("vURL", "fcSMGRq0HMY");
                         intent.putExtra("text1", "De ashi harai");
                         intent.putExtra("text2", "Forward foot sweep");
                         startActivity(intent);
                         break;
                     case "Tani otoshi":
                         intent.putExtra("vURL", "G3PHJdyjz8o");
                         intent.putExtra("text1", "Tani otoshi");
                         intent.putExtra("text2", "Valley drop");
                         startActivity(intent);
                         break;
                 }
             }
         }
        );
        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(Color.parseColor("#ffcb0c"));
        super.onActivityCreated(savedInstanceState);
    }
}