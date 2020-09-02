package com.example.borshon.sd4;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bangonborno extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangonborno);

        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button b10 = findViewById(R.id.b10);
        Button b11 = findViewById(R.id.b11);
        Button b12 = findViewById(R.id.b12);
        Button b13 = findViewById(R.id.b13);
        Button b14 = findViewById(R.id.b14);
        Button b15 = findViewById(R.id.b15);
        Button b16 = findViewById(R.id.b16);
        Button b17 = findViewById(R.id.b17);
        Button b18 = findViewById(R.id.b18);
        Button b19 = findViewById(R.id.b19);
        Button b20 = findViewById(R.id.b20);
        Button b21= findViewById(R.id.b21);
        Button b22= findViewById(R.id.b22);
        Button b23= findViewById(R.id.b23);
        Button b24= findViewById(R.id.b24);
        Button b25= findViewById(R.id.b25);
        Button b26= findViewById(R.id.b26);
        Button b27= findViewById(R.id.b27);
        Button b28= findViewById(R.id.b28);
        Button b29= findViewById(R.id.b29);
        Button b30= findViewById(R.id.b30);
        Button b31= findViewById(R.id.b31);
        Button b32= findViewById(R.id.b32);
        Button b33= findViewById(R.id.b33);
        Button b34= findViewById(R.id.b34);
        Button b35= findViewById(R.id.b35);
        Button b36= findViewById(R.id.b36);
        Button b37= findViewById(R.id.b37);
        Button b38= findViewById(R.id.b38);
        Button b39= findViewById(R.id.b39);
        Button b40= findViewById(R.id.b40);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);
        b26.setOnClickListener(this);
        b27.setOnClickListener(this);
        b28.setOnClickListener(this);
        b29.setOnClickListener(this);
        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);
        b35.setOnClickListener(this);
        b36.setOnClickListener(this);
        b37.setOnClickListener(this);
        b38.setOnClickListener(this);
        b39.setOnClickListener(this);
        b40.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        final MediaPlayer mp;
        switch (view.getId()){
            case R.id.b1:
                mp=MediaPlayer.create(this,R.raw.b1);
                mp.start();
                break;

            case R.id.b2:
                mp = MediaPlayer.create(this,R.raw.b2);
                mp.start();
                break;
            case R.id.b3:
                mp = MediaPlayer.create(this,R.raw.b3);
                mp.start();
                break;
            case R.id.b4:
                mp = MediaPlayer.create(this,R.raw.b4);
                mp.start();
                break;
            case R.id.b5:
                mp = MediaPlayer.create(this,R.raw.b5);
                mp.start();
                break;
            case R.id.b6:
                mp = MediaPlayer.create(this,R.raw.b6);
                mp.start();
                break;
            case R.id.b7:
                mp = MediaPlayer.create(this,R.raw.b7);
                mp.start();
                break;
            case R.id.b8:
                mp = MediaPlayer.create(this,R.raw.b8);
                mp.start();
                break;
            case R.id.b9:
                mp = MediaPlayer.create(this,R.raw.b9);
                mp.start();
                break;
            case R.id.b10:
                mp = MediaPlayer.create(this,R.raw.b10);
                mp.start();
                break;
            case R.id.b11:
                mp = MediaPlayer.create(this,R.raw.b11);
                mp.start();
                break;
            case R.id.b12:
                mp = MediaPlayer.create(this,R.raw.b12);
                mp.start();
                break;
            case R.id.b13:
                mp = MediaPlayer.create(this,R.raw.b13);
                mp.start();
                break;
            case R.id.b14:
                mp = MediaPlayer.create(this,R.raw.b14);
                mp.start();
                break;
            case R.id.b15:
                mp = MediaPlayer.create(this,R.raw.b15);
                mp.start();
                break;
            case R.id.b16:
                mp = MediaPlayer.create(this,R.raw.b16);
                mp.start();
                break;
            case R.id.b17:
                mp = MediaPlayer.create(this,R.raw.b17);
                mp.start();
                break;
            case R.id.b18:
                mp = MediaPlayer.create(this,R.raw.b18);
                mp.start();
                break;
            case R.id.b19:
                mp = MediaPlayer.create(this,R.raw.b19);
                mp.start();
                break;
            case R.id.b20:
                mp = MediaPlayer.create(this,R.raw.b20);
                mp.start();
                break;
            case R.id.b21:
                mp = MediaPlayer.create(this,R.raw.b21);
                mp.start();
                break;
            case R.id.b22:
                mp = MediaPlayer.create(this,R.raw.b22);
                mp.start();
                break;
            case R.id.b23:
                mp = MediaPlayer.create(this,R.raw.b23);
                mp.start();
                break;
            case R.id.b24:
                mp = MediaPlayer.create(this,R.raw.b24);
                mp.start();
                break;
            case R.id.b25:
                mp = MediaPlayer.create(this,R.raw.b25);
                mp.start();
                break;
            case R.id.b26:
                mp = MediaPlayer.create(this,R.raw.b26);
                mp.start();
                break;
            case R.id.b27:
                mp = MediaPlayer.create(this,R.raw.b27);
                mp.start();
                break;
            case R.id.b28:
                mp = MediaPlayer.create(this,R.raw.b28);
                mp.start();
                break;
            case R.id.b29:
                mp = MediaPlayer.create(this,R.raw.b29);
                mp.start();
                break;
            case R.id.b30:
                mp = MediaPlayer.create(this,R.raw.b30);
                mp.start();
                break;
            case R.id.b31:
                mp = MediaPlayer.create(this,R.raw.b31);
                mp.start();
                break;
            case R.id.b32:
                mp = MediaPlayer.create(this,R.raw.b32);
                mp.start();
                break;
            case R.id.b33:
                mp = MediaPlayer.create(this,R.raw.b33);
                mp.start();
                break;
            case R.id.b34:
                mp = MediaPlayer.create(this,R.raw.b34);
                mp.start();
                break;
            case R.id.b35:
                mp = MediaPlayer.create(this,R.raw.b35);
                mp.start();
                break;
            case R.id.b36:
                mp = MediaPlayer.create(this,R.raw.b36);
                mp.start();
                break;
            case R.id.b37:
                mp = MediaPlayer.create(this,R.raw.b37);
                mp.start();
                break;
            case R.id.b38:
                mp = MediaPlayer.create(this,R.raw.b38);
                mp.start();
                break;
            case R.id.b39:
                mp = MediaPlayer.create(this,R.raw.b39);
                mp.start();
                break;
            case R.id.b40:
                mp = MediaPlayer.create(this,R.raw.b40);
                mp.start();
                break;

        }

    }
}
