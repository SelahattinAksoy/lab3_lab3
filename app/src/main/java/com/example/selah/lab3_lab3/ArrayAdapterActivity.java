package com.example.selah.lab3_lab3;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArrayAdapterActivity extends ListActivity {

    static final String[] Hayvanlar=new String[]{"Ant","Bear","Bird","Cat","Dog","Donkey",
            "Elephant","Pig","Rat",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // setContentView(R.layout.activity_array_adapter);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_array_adapter,Hayvanlar));

        ListView listView=getListView();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                ((TextView) view).getText(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
