package com.example.borshon.sd4;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sorborno extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorborno);

        Button s1 = findViewById(R.id.s1);
        Button s2 = findViewById(R.id.s2);
        Button s3 = findViewById(R.id.s3);
        Button s4 = findViewById(R.id.s4);
        Button s5 = findViewById(R.id.s5);
        Button s6 = findViewById(R.id.s6);
        Button s7 = findViewById(R.id.s7);
        Button s8 = findViewById(R.id.s8);
        Button s9 = findViewById(R.id.s9);
        Button s10 = findViewById(R.id.s10);
        Button s11 = findViewById(R.id.s11);

        s1.setOnClickListener(this);
        s2.setOnClickListener(this);
        s3.setOnClickListener(this);
        s4.setOnClickListener(this);
        s5.setOnClickListener(this);
        s6.setOnClickListener(this);
        s7.setOnClickListener(this);
        s8.setOnClickListener(this);
        s9.setOnClickListener(this);
        s10.setOnClickListener(this);
        s11.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        final MediaPlayer mp;
        switch (view.getId()){
            case R.id.s1:
                mp=MediaPlayer.create(this,R.raw.s1);
                mp.start();
                break;

            case R.id.s2:
                mp = MediaPlayer.create(this,R.raw.s2);
                mp.start();
                break;
            case R.id.s3:
                mp = MediaPlayer.create(this,R.raw.s3);
                mp.start();
                break;
            case R.id.s4:
                mp = MediaPlayer.create(this,R.raw.s4);
                mp.start();
                break;
            case R.id.s5:
                mp = MediaPlayer.create(this,R.raw.s5);
                mp.start();
                break;
            case R.id.s6:
                mp = MediaPlayer.create(this,R.raw.s6);
                mp.start();
                break;
            case R.id.s7:
                mp = MediaPlayer.create(this,R.raw.s7);
                mp.start();
                break;
            case R.id.s8:
                mp = MediaPlayer.create(this,R.raw.s8);
                mp.start();
                break;
            case R.id.s9:
                mp = MediaPlayer.create(this,R.raw.s9);
                mp.start();
                break;
            case R.id.s10:
                mp = MediaPlayer.create(this,R.raw.s10);
                mp.start();
                break;
            case R.id.s11:
                mp = MediaPlayer.create(this,R.raw.s11);
                mp.start();
                break;

        }

    }
}
