package com.example.fact_app;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView factTextView;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        factTextView= findViewById(R.id.txt_fact);
        factTextView.append("\n");
        String[] myfact= facts.getfacts();
        for(String fact:myfact){
            factTextView.append(fact+"\n\n");
        }
    }
}