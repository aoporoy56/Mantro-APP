package com.example.mantro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class mantro_view extends AppCompatActivity {
    TextView mantroTitle,mantroDeteils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantro_view);

        //get textview
        mantroTitle = findViewById(R.id.mantroTitle);
        mantroDeteils= findViewById(R.id.mantroDeteils);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)
        {
            mantroTitle.setText(bundle.getString("mantroTitle"));
            mantroDeteils.setText(bundle.getString("mantroDeteils"));
        }
    }
}