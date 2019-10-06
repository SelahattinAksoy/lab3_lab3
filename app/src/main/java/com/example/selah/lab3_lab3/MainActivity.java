package com.example.selah.lab3_lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnArrayAdabpor;
    Button btnCus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArrayAdabpor=findViewById(R.id.ArrayAdapter);
        btnArrayAdabpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,ArrayAdapterActivity.class);
                startActivity(i);
            }
        });


        btnCus=findViewById(R.id.customAdapter);

        btnCus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,CustomAdapterActivity.class);
                startActivity(i);
            }
        });
    }
}
