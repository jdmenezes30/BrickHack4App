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
public class GreenBelt extends ListFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
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
        String[] techniques = {"Ushiro goshi","Sumi gaeshi", "Sode tsurikomi goshi", "O soto otoshi", "Ko soto gari", "Tomoe nage"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, techniques);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(getActivity().getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                 String sText = ((TextView) view).getText().toString();
                 Intent intent = new Intent(getActivity().getBaseContext(), Technique.class);
                 switch (sText) {
                     case "Ushiro goshi":
                         intent.putExtra("vURL", "b_2mR7mGG10");
                         intent.putExtra("text1", "Ushiro goshi");
                         intent.putExtra("text2", "Major or large outer reap");
                         startActivity(intent);
                         break;
                     case "Sumi gaeshi":
                         intent.putExtra("vURL", "kod5QHdmE7E");
                         intent.putExtra("text1", "Sumi gaeshi");
                         intent.putExtra("text2", "Major or large outer reap");
                         startActivity(intent);
                         break;
                     case "Sode tsurikomi goshi":
                         intent.putExtra("vURL", "v1fsnjDwLDo");
                         intent.putExtra("text1", "Sode tsurikomi goshi");
                         intent.putExtra("text2", "Hip wheel throw");
                         startActivity(intent);
                         break;
                     case "O soto otoshi":
                         intent.putExtra("vURL", "tpPXqnF6hJs");
                         intent.putExtra("text1", "O soto otoshi");
                         intent.putExtra("text2", "Major or large hip throw");
                         startActivity(intent);
                         break;
                     case "Ko soto gari":
                         intent.putExtra("vURL", "AdffYA9D3co");
                         intent.putExtra("text1", "Ko soto gari");
                         intent.putExtra("text2", "One arm shoulder throw");
                         startActivity(intent);
                         break;
                     case "Tomoe nage":
                         intent.putExtra("vURL", "3jMnXGcoqjU");
                         intent.putExtra("text1", "Tomoe nage");
                         intent.putExtra("text2", "Kneeling shoulder drop");
                         startActivity(intent);
                         break;
                 }
             }
         }
        );
        super.onActivityCreated(savedInstanceState);
    }
}
