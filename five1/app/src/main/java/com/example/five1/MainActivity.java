package com.example.five;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    GridView g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        g.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText (MainActivity.this,String.valueOf (position),Toast.LENGTH_LONG).show();
            }
        });
    }
}
