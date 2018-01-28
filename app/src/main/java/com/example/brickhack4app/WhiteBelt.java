package com.example.brickhack4app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
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
        String[] techniques = {"O soto gake","O soto gari", "Koshi guruma", "O goshi", "Ippon seoi nage", "Drop seoi nage"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, techniques);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(getActivity().getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                String sText = ((TextView) view).getText().toString();
                Intent intent = null;
                if(sText.equals("O soto gake"))
                    intent = new Intent(getActivity().getBaseContext(), osotogake.class);

                /*
                if(sText.equals("O soto gari"))
                    intent = new Intent(getBaseContext(), osotogari.class);
                if(sText.equals("Koshi guruma"))
                    intent = new Intent(getBaseContext(), koshiguruma.class);
                if(sText.equals("O goshi"))
                    intent = new Intent(getBaseContext(), ogoshi.class);
                if(sText.equals("Ippon seoi nage"))
                    intent = new Intent(getBaseContext(), ipponseoinage.class);
                if(sText.equals("Drop seoi nage"))
                    intent = new Intent(getBaseContext(), dropseoinage.class);
                    */
                if(intent != null){
                    startActivity(intent);
                }

            }
        });
        super.onActivityCreated(savedInstanceState);
    }
}