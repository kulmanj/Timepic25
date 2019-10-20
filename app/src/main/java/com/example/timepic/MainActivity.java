package com.example.timepic;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
TimePicker p;
Button b1;
EditText t1;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        p=(TimePicker)findViewById (R.id.timepick);
        b1=(Button)findViewById (R.id.one);
        t1=(EditText)findViewById (R.id.ed1);
        t1.setText (data ());
        b1.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
t1.setText (data ());
            }
        });
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public String data()
    {
        String str=String.valueOf (p.getHour ());
        String str1=String.valueOf (p.getMinute ());
        String str2=str+":"+str1;
        return str2;
    }
}
