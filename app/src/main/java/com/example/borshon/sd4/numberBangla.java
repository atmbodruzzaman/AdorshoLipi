package com.example.borshon.sd4;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class numberBangla extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_bangla);

        Button zero = findViewById(R.id.zero);
        Button one = findViewById(R.id.ak);
        Button two = findViewById(R.id.dui);
        Button three = findViewById(R.id.tin);
        Button four = findViewById(R.id.chaar);
        Button five = findViewById(R.id.pach);
        Button six = findViewById(R.id.choy);
        Button seven = findViewById(R.id.shat);
        Button eight = findViewById(R.id.aat);
        Button nine = findViewById(R.id.noy);
        Button ten = findViewById(R.id.dosh);

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
                mp=MediaPlayer.create(this,R.raw.shunno);
                mp.start();
                break;

            case R.id.ak:
                mp = MediaPlayer.create(this,R.raw.ek);
                mp.start();
                break;
            case R.id.dui:
                mp = MediaPlayer.create(this,R.raw.dui);
                mp.start();
                break;
            case R.id.tin:
                mp = MediaPlayer.create(this,R.raw.tin);
                mp.start();
                break;
            case R.id.chaar:
                mp = MediaPlayer.create(this,R.raw.chaar);
                mp.start();
                break;
            case R.id.pach:
                mp = MediaPlayer.create(this,R.raw.pach);
                mp.start();
                break;
            case R.id.choy:
                mp = MediaPlayer.create(this,R.raw.choy);
                mp.start();
                break;
            case R.id.shat:
                mp = MediaPlayer.create(this,R.raw.shat);
                mp.start();
                break;
            case R.id.aat:
                mp = MediaPlayer.create(this,R.raw.aat);
                mp.start();
                break;
            case R.id.noy:
                mp = MediaPlayer.create(this,R.raw.noy);
                mp.start();
                break;
            case R.id.dosh:
                mp = MediaPlayer.create(this,R.raw.dosh);
                mp.start();
                break;
        }

    }
}
