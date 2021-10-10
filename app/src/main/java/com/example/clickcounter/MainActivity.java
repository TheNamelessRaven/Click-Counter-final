package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView number;
    private Button up, down;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*init();


        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numb=numb++;
                number.setText(numb);
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numb=numb--;
                number.setText(String.valueOf(numb));
            }
        });
        number.setText(numb);/*
        if (numb % 2 == 0) {
            number.setTextColor(Color.GREEN);
        } else if (numb == 0) {
            number.setTextColor(Color.BLUE);
        } else {
            number.setTextColor(Color.RED);
        }*/
    }



    public void init(){
        number=findViewById(R.id.number);
        up=findViewById(R.id.up);
        down=findViewById(R.id.down);

    }
}