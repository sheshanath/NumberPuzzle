package com.example.sk.puzzlegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextClock;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main2Activity extends AppCompatActivity {

    Calendar c1 = Calendar.getInstance();
    static TextClock tc1, tc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tc1 = (TextClock) findViewById(R.id.txtClock1);
        tc2 = (TextClock) findViewById(R.id.txtClock2);
        
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        String EndTime = df.format(c1.getTime());
        tc2.setText(EndTime);
    }
}
