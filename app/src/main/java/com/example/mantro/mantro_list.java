package com.example.mantro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class mantro_list extends AppCompatActivity {
    ListView listView;
    String[] mantroTitle;
    String[] mantroDeteils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantro_list);

        //get listview id
        listView = findViewById(R.id.listView);

        //get mantro list
        mantroTitle=getResources().getStringArray(R.array.mantro_title);
        mantroDeteils=getResources().getStringArray(R.array.mantroDeteils);

        //create customadapter and set on listView
        CustomAdapter adapter = new CustomAdapter(this,mantroTitle);
        listView.setAdapter((ListAdapter) adapter);


        //listView Event
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView=view.findViewById(R.id.mantroTitle);
                openView(textView.getText().toString(),mantroDeteils[i]);
            }
        });
        
        

    }
    public void openView(String title,String deteils){
        Intent intent = new Intent(mantro_list.this,mantro_view.class);
        intent.putExtra("mantroTitle",title);
        intent.putExtra("mantroDeteils",deteils);
        startActivity(intent);
    }
}