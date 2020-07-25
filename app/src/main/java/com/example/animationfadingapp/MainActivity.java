package com.example.animationfadingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static int state = 0;

    public void fade(View view){
        ImageView bart = (ImageView)findViewById(R.id.imageBart);
        ImageView bart2 = (ImageView)findViewById(R.id.imageBart2);

        if(state%2 ==0){

            bart.animate().alpha(0).setDuration(2000);
            bart2.animate().alpha(1).setDuration(2000);
        }else{

            bart.animate().alpha(1).setDuration(2000);
            bart2.animate().alpha(0).setDuration(2000);

        }

    state++;


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
