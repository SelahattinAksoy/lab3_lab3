package com.example.selah.lab3_lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    final List<Hayvan> animals=new ArrayList<Hayvan>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);



        final ListView listView=(ListView) findViewById(R.id.listview);
        HayvanAdapter adapter=new HayvanAdapter(this,animals);
        listView.setAdapter(adapter);
    }
}
