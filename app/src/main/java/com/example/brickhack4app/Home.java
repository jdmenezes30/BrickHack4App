package com.example.brickhack4app;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] Subjects = {"White Belt", "Yellow Belt", "Orange Belt", "Green Belt", "Blue Belt", "Brown Belt", "Black Belt"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, Subjects);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                String sText = ((TextView) view).getText().toString();
                Intent intent = null;
                if(sText.equals("White Belt"))
                    intent = new Intent(getBaseContext(), WhiteBelt.class);
                if(sText.equals("Yellow Belt"))
                    intent = new Intent(getBaseContext(), YellowBelt.class);
                if(sText.equals("Orange Belt"))
                    intent = new Intent(getBaseContext(), OrangeBelt.class);
                if(sText.equals("Green Belt"))
                    intent = new Intent(getBaseContext(), GreenBelt.class);
                if(sText.equals("Blue Belt"))
                    intent = new Intent(getBaseContext(), BlueBelt.class);
                if(sText.equals("Brown Belt"))
                    intent = new Intent(getBaseContext(), BrownBelt.class);
                if(sText.equals("Black Belt"))
                    intent = new Intent(getBaseContext(), BlackBelt.class);
                if(intent != null){
                    startActivity(intent);
                }
            }
        });

    }

}
