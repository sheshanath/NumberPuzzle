package com.example.sk.puzzlegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//import java.text.SimpleDateFormat;
import java.util.*;



public class MainActivity extends AppCompatActivity {

    /*Calendar c = Calendar.getInstance();
    SimpleDateFormat df = new SimpleDateFormat("HH:mm");
    String stTime = df.format(c.getTime());
    public Long StTime = Long.parseLong(stTime.toString());*/

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9, exit;
    String temp, sb1, sb2, sb3, sb4, sb5, sb6, sb7, sb8;
    Integer [] d = new Integer[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.but1);
        b2 = (Button) findViewById(R.id.but2);
        b3 = (Button) findViewById(R.id.but3);
        b4 = (Button) findViewById(R.id.but4);
        b5 = (Button) findViewById(R.id.but5);
        b6 = (Button) findViewById(R.id.but6);
        b7 = (Button) findViewById(R.id.but7);
        b8 = (Button) findViewById(R.id.but8);
        b9 = (Button) findViewById(R.id.but9);
        exit = (Button) findViewById(R.id.butExit);

        for (int i = 0; i < 8; i ++) d[i] = i + 1;
        Collections.shuffle(Arrays.asList(d));

        sb1 = d[0].toString();
        sb2 = d[1].toString();
        sb3 = d[2].toString();
        sb4 = d[3].toString();
        sb5 = d[4].toString();
        sb6 = d[5].toString();
        sb7 = d[6].toString();
        sb8 = d[7].toString();

        b1.setText(sb1);
        b2.setText(sb2);
        b3.setText(sb3);
        b4.setText(sb4);
        b5.setText(sb5);
        b6.setText(sb6);
        b7.setText(sb7);
        b8.setText(sb8);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = b1.getText().toString();
                if (b2.getText() == "" ){
                    b1.setText("");
                    b2.setText(temp);
                }

                else if (b4.getText() == ""){
                    b4.setText(temp);
                    b1.setText("");
                }

             checkGrid();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = b2.getText().toString();
                if (b1.getText() == "" ){
                    b1.setText(temp);
                    b2.setText("");
                }

                else if (b5.getText() == ""){
                    b5.setText(temp);
                    b2.setText("");
                }

                else if (b3.getText() == ""){
                    b3.setText(temp);
                    b2.setText("");
                }
                checkGrid();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = b3.getText().toString();
                if (b2.getText() == "" ){
                    b2.setText(temp);
                    b3.setText("");
                }

                else if (b6.getText() == ""){
                    b6.setText(temp);
                    b3.setText("");
                }
                checkGrid();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = b4.getText().toString();
                if (b1.getText() == "" ){
                    b1.setText(temp);
                    b4.setText("");
                }

                else if (b5.getText() == ""){
                    b5.setText(temp);
                    b4.setText("");
                }

                else if (b7.getText() == ""){
                    b7.setText(temp);
                    b4.setText("");
                }
                checkGrid();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = b5.getText().toString();
                if (b2.getText() == "" ){
                    b2.setText(temp);
                    b5.setText("");
                }

                else if (b4.getText() == ""){
                    b4.setText(temp);
                    b5.setText("");
                }

                else if (b6.getText() == ""){
                    b6.setText(temp);
                    b5.setText("");
                }
                else if (b8.getText() == ""){
                    b8.setText(temp);
                    b5.setText("");
                }
                checkGrid();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = b6.getText().toString();
                if (b3.getText() == "" ){
                    b3.setText(temp);
                    b6.setText("");
                }

                else if (b5.getText() == ""){
                    b5.setText(temp);
                    b6.setText("");
                }

                else if (b9.getText() == ""){
                    b9.setText(temp);
                    b6.setText("");
                }
                checkGrid();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = b7.getText().toString();
                if (b4.getText() == "" ){
                    b4.setText(temp);
                    b7.setText("");
                }

                else if (b8.getText() == ""){
                    b8.setText(temp);
                    b7.setText("");
                }
                checkGrid();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = b8.getText().toString();
                if (b7.getText() == "" ){
                    b7.setText(temp);
                    b8.setText("");
                }

                else if (b5.getText() == ""){
                    b5.setText(temp);
                    b8.setText("");
                }

                else if (b9.getText() == ""){
                    b9.setText(temp);
                    b8.setText("");
                }
                checkGrid();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = b9.getText().toString();
                if (b8.getText() == "" ){
                    b8.setText(temp);
                    b9.setText("");
                }

                else if (b6.getText() == ""){
                    b6.setText(temp);
                    b9.setText("");
                }
                checkGrid();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_MAIN);
                i.addCategory(Intent.CATEGORY_HOME);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                finish();
                System.exit(0);
            }
        });
    }

    public void checkGrid (){
        sb1 = b1.getText().toString();
        sb2 = b2.getText().toString();
        sb3 = b3.getText().toString();
        sb4 = b4.getText().toString();
        sb5 = b5.getText().toString();
        sb6 = b6.getText().toString();
        sb7 = b7.getText().toString();
        sb8 = b8.getText().toString();
        if (sb1.equals("1") && sb2.equals("2") && sb3.equals("3") && sb4.equals("4") && sb5.equals("5") && sb6.equals("6") && sb7.equals("7") && sb8.equals("8") )
            Toast.makeText(MainActivity.this, "Puzzle Complete", Toast.LENGTH_SHORT).show();
    }

}
