package com.example.mantro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    int process=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressBar);

        Toast toast= Toast.makeText(MainActivity.this, "j", Toast.LENGTH_SHORT);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                Intent intent=new Intent(MainActivity.this,mantro_list.class);
                startActivity(intent);
            }
        });
        thread.start();

    }
    public void doWork(){
        for (process=50; process<=100; process+=50){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            progressBar.setProgress(process);
        }
    }
}