package com.example.brickhack4app;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by liam9 on 1/28/2018.
 */

public class Home extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        TextView textElement = (TextView) getActivity().findViewById(R.id.home_text);
        textElement.setText("Welcome to the Judo App!");

        TextView textElement2 = (TextView) getActivity().findViewById(R.id.home_text2);
        textElement2.setText("This app conveniently gathers the names, descriptions and videos of techniques needed to be promoted to different Judo ranks as well as other useful exercises!");

        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(Color.parseColor("#808080"));
        super.onActivityCreated(savedInstanceState);
    }
}
