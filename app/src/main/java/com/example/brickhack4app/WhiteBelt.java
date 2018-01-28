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
public class WhiteBelt extends ListFragment{
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
        String[] techniques = {"O soto gake", "O soto gari", "Koshi guruma", "O goshi", "Ippon seoi nage", "Drop seoi nage"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, techniques);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(getActivity().getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                 String sText = ((TextView) view).getText().toString();
                 Intent intent = new Intent(getActivity().getBaseContext(), Technique.class);
                 switch (sText) {
                     case "O soto gake":
                         intent.putExtra("vURL", "OM11NEW1f3g");
                         intent.putExtra("text1", "O soto gake");
                         intent.putExtra("text2", "Large outer hook");
                         startActivity(intent);
                         break;
                     case "O soto gari":
                         intent.putExtra("vURL", "Cik-jXhmsoE");
                         intent.putExtra("text1", "O soto gari");
                         intent.putExtra("text2", "Large outer reap");
                         startActivity(intent);
                         break;
                     case "Koshi guruma":
                         intent.putExtra("vURL", "pJsQrgMhgk4");
                         intent.putExtra("text1", "Koshi guruma");
                         intent.putExtra("text2", "Hip wheel");
                         startActivity(intent);
                         break;
                     case "O goshi":
                         intent.putExtra("vURL", "PFbILGwd5L4");
                         intent.putExtra("text1", "O goshi");
                         intent.putExtra("text2", "Large hip throw");
                         startActivity(intent);
                         break;
                     case "Ippon seoi nage":
                         intent.putExtra("vURL", "2ebrqaFSVW4");
                         intent.putExtra("text1", "Ippon seoi nage");
                         intent.putExtra("text2", "One armed shoulder throw");
                         startActivity(intent);
                         break;
                     case "Drop seoi nage":
                         intent.putExtra("vURL", "vRKnFN3mres");
                         intent.putExtra("text1", "Drop seoi nage");
                         intent.putExtra("text2", "Kneeling shoulder drop");
                         startActivity(intent);
                         break;
                 }
             }
         }
        );
        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(Color.parseColor("#bbbbbb"));
        super.onActivityCreated(savedInstanceState);
    }
}