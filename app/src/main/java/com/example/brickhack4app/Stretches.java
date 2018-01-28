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
public class Stretches extends ListFragment{
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
        String[] techniques = {"Calf stretch", "Hamstring stretch", "Quadriceps stretch", "Hip flexor stretch", "Knee to chest stretch", "Shoulder Stretch"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, techniques);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(getActivity().getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                 String sText = ((TextView) view).getText().toString();
                 Intent intent = new Intent(getActivity().getBaseContext(), Technique.class);
                 switch (sText) {
                     case "Calf stretch":
                         intent.putExtra("vURL", "f1HzSAuB-Vw");
                         intent.putExtra("text1", "Calf stretch");
                         intent.putExtra("text2", "");
                         startActivity(intent);
                         break;
                     case "Hamstring stretch":
                         intent.putExtra("vURL", "FDwpEdxZ4H4");
                         intent.putExtra("text1", "Hamstring stretch");
                         intent.putExtra("text2", "");
                         startActivity(intent);
                         break;
                     case "Quadriceps stretch":
                         intent.putExtra("vURL", "CZBKSOtyssM");
                         intent.putExtra("text1", "Quadriceps stretch");
                         intent.putExtra("text2", "");
                         startActivity(intent);
                         break;
                     case "Hip flexor stretch":
                         intent.putExtra("vURL", "YQmpO9VT2X4");
                         intent.putExtra("text1", "Hip flexor stretch");
                         intent.putExtra("text2", "");
                         startActivity(intent);
                         break;
                     case "Knee to chest stretch":
                         intent.putExtra("vURL", "9hVZ4rc2_3Y");
                         intent.putExtra("text1", "Knee to chest stretch");
                         intent.putExtra("text2", "");
                         startActivity(intent);
                         break;
                     case "Shoulder Stretch":
                         intent.putExtra("vURL", "lI-F893zmss");
                         intent.putExtra("text1", "Shoulder Stretch");
                         intent.putExtra("text2", "");
                         startActivity(intent);
                         break;
                 }
             }
         }
        );
        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(Color.parseColor("#808080"));
        super.onActivityCreated(savedInstanceState);
    }
}