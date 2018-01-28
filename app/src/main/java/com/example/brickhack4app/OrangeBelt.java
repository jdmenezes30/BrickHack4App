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
public class OrangeBelt extends ListFragment{
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
        String[] techniques = {"Ko soto gake","Tsubame gaeshi", "Uki goshi", "Morote seio nage", "Tai otoshi", "Harai goshi"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, techniques);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(getActivity().getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                 String sText = ((TextView) view).getText().toString();
                 Intent intent = new Intent(getActivity().getBaseContext(), Technique.class);
                 switch (sText) {
                     case "Ko soto gake":
                         intent.putExtra("vURL", "OM11NEW1f3g");
                         intent.putExtra("text1", "Ko soto gake");
                         intent.putExtra("text2", "Major or large outer reap");
                         startActivity(intent);
                         break;
                     case "Tsubame gaeshi":
                         intent.putExtra("vURL", "Cik-jXhmsoE");
                         intent.putExtra("text1", "Tsubame gaeshi");
                         intent.putExtra("text2", "Major or large outer reap");
                         startActivity(intent);
                         break;
                     case "Uki goshi":
                         intent.putExtra("vURL", "pJsQrgMhgk4");
                         intent.putExtra("text1", "Uki goshi");
                         intent.putExtra("text2", "Hip wheel throw");
                         startActivity(intent);
                         break;
                     case "Morote seio nage":
                         intent.putExtra("vURL", "PFbILGwd5L4");
                         intent.putExtra("text1", "Morote seio nage");
                         intent.putExtra("text2", "Major or large hip throw");
                         startActivity(intent);
                         break;
                     case "Tai otoshi":
                         intent.putExtra("vURL", "2ebrqaFSVW4");
                         intent.putExtra("text1", "Tai otoshi");
                         intent.putExtra("text2", "One arm shoulder throw");
                         startActivity(intent);
                         break;
                     case "Harai goshi":
                         intent.putExtra("vURL", "vRKnFN3mres");
                         intent.putExtra("text1", "Harai goshi");
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