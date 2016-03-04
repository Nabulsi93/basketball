package com.example.android.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter1 = 0;
    int counter2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txt1 = (TextView) findViewById(R.id.txt1);
        final TextView txt2 = (TextView) findViewById(R.id.txt2);


        Button btna1 = (Button) findViewById(R.id.btna1);
        btna1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter1 = counter1 + 3;
                txt1.setText(counter1 + " ");


            }


        });


        Button btna2 = (Button) findViewById(R.id.btna2);
        btna2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter1 = counter1 + 2;
                txt1.setText(counter1 + " ");


            }


        });


        Button btna3 = (Button) findViewById(R.id.btna3);
        btna3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter1 = counter1 + 1;
                txt1.setText(counter1 + " ");


            }


        });


        Button btnb1 = (Button) findViewById(R.id.btnb1);
        btnb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter1 = counter1 + 3;
                txt2.setText(counter1 + " ");


            }


        });

        Button btnb = (Button) findViewById(R.id.btnb1);
        btnb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter2 = counter2 + 3;
                txt2.setText(counter2 + " ");


            }


        });


        Button btnb2 = (Button) findViewById(R.id.btnb2);
        btnb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter2 = counter2 + 2;
                txt2.setText(counter2 + " ");


            }


        });


        Button btnb3 = (Button) findViewById(R.id.btnb3);
        btnb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter2 = counter2 + 1;
                txt2.setText(counter2 + " ");


            }


        });



        Button btnc = (Button) findViewById(R.id.btnc);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                counter2 = counter2 * 0;
                txt2.setText(counter2 + " ");

                counter1 = counter1 * 0;
                txt1.setText(counter1 + " ");


            }


        });


    }
}

