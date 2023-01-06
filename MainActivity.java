package com.example.sjcet.exam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list1=(ListView)findViewById(R.id.list1);
        String[] places={"Melbourne","Vienna","Vancouver","Toronto","Celgary","Adelaid","Perth","Auckland","Helsinki","Hamsburg","Munich","New York"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,places);
        list1.setAdapter(adapter);

    }
}