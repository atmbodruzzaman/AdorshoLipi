package com.example.borshon.sd4;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class numberEnglish extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_english);

        Button zero = findViewById(R.id.zero);
        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button ten = findViewById(R.id.ten);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        ten.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        final MediaPlayer mp;
        switch (view.getId()){
            case R.id.zero:
                mp=MediaPlayer.create(this,R.raw.zero);
                mp.start();
                break;

            case R.id.one:
                mp = MediaPlayer.create(this,R.raw.one);
                mp.start();
                break;
            case R.id.two:
                mp = MediaPlayer.create(this,R.raw.two);
                mp.start();
                break;
            case R.id.three:
                mp = MediaPlayer.create(this,R.raw.three);
                mp.start();
                break;
            case R.id.four:
                mp = MediaPlayer.create(this,R.raw.four);
                mp.start();
                break;
            case R.id.five:
                mp = MediaPlayer.create(this,R.raw.five);
                mp.start();
                break;
            case R.id.six:
                mp = MediaPlayer.create(this,R.raw.six);
                mp.start();
                break;
            case R.id.seven:
                mp = MediaPlayer.create(this,R.raw.seven);
                mp.start();
                break;
            case R.id.eight:
                mp = MediaPlayer.create(this,R.raw.eight);
                mp.start();
                break;
            case R.id.nine:
                mp = MediaPlayer.create(this,R.raw.nine);
                mp.start();
                break;
            case R.id.ten:
                mp = MediaPlayer.create(this,R.raw.ten);
                mp.start();
                break;
        }

    }
}
