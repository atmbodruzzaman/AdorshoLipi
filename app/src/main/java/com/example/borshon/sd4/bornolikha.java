package com.example.borshon.sd4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class bornolikha extends AppCompatActivity implements View.OnClickListener{

    VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bornolikha);

        Button S1 = findViewById(R.id.S1);
        Button S2 = findViewById(R.id.S2);
        Button S3 = findViewById(R.id.S3);
        Button S4 = findViewById(R.id.S4);
        Button S5 = findViewById(R.id.S5);
        Button S6 = findViewById(R.id.S6);
        Button S7 = findViewById(R.id.S7);
        Button S8 = findViewById(R.id.S8);
        Button S9 = findViewById(R.id.S9);
        Button S10 = findViewById(R.id.S10);
        Button S11 = findViewById(R.id.S11);

        Button B1 = findViewById(R.id.B1);
        Button B2 = findViewById(R.id.B2);
        Button B3 = findViewById(R.id.B3);
        Button B4 = findViewById(R.id.B4);
        Button B5 = findViewById(R.id.B5);
        Button B6 = findViewById(R.id.B6);
        Button B7 = findViewById(R.id.B7);
        Button B8 = findViewById(R.id.B8);
        Button B9 = findViewById(R.id.B9);
        Button B10 = findViewById(R.id.B10);
        Button B11 = findViewById(R.id.B11);
        Button B12 = findViewById(R.id.B12);
        Button B13 = findViewById(R.id.B13);
        Button B14 = findViewById(R.id.B14);
        Button B15 = findViewById(R.id.B15);
        Button B16 = findViewById(R.id.B16);
        Button B17 = findViewById(R.id.B17);
        Button B18 = findViewById(R.id.B18);
        Button B19 = findViewById(R.id.B19);
        Button B20 = findViewById(R.id.B20);
        Button B21= findViewById(R.id.B21);
        Button B22= findViewById(R.id.B22);
        Button B23= findViewById(R.id.B23);
        Button B24= findViewById(R.id.B24);
        Button B25= findViewById(R.id.B25);
        Button B26= findViewById(R.id.B26);
        Button B27= findViewById(R.id.B27);
        Button B28= findViewById(R.id.B28);
        Button B29= findViewById(R.id.B29);
        Button B30= findViewById(R.id.B30);
        Button B31= findViewById(R.id.B31);
        Button B32= findViewById(R.id.B32);
        Button B33= findViewById(R.id.B33);
        Button B34= findViewById(R.id.B34);
        Button B35= findViewById(R.id.B35);
        Button B36= findViewById(R.id.B36);
        Button B37= findViewById(R.id.B37);
        Button B38= findViewById(R.id.B38);
        Button B39= findViewById(R.id.B39);
        Button B40= findViewById(R.id.B40);

        Button Sunno = findViewById(R.id.Sunno);
        Button Ak = findViewById(R.id.Ak);
        Button Dui = findViewById(R.id.Dui);
        Button Tin = findViewById(R.id.Tin);
        Button Chaar = findViewById(R.id.Chaar);
        Button Pach = findViewById(R.id.Pach);
        Button Choy = findViewById(R.id.Choy);
        Button Shat = findViewById(R.id.Shat);
        Button Aat = findViewById(R.id.Aat);
        Button Noy = findViewById(R.id.Noy);
        Button Dosh = findViewById(R.id.Dosh);


        S1.setOnClickListener(this);
        S2.setOnClickListener(this);
        S3.setOnClickListener(this);
        S4.setOnClickListener(this);
        S5.setOnClickListener(this);
        S6.setOnClickListener(this);
        S7.setOnClickListener(this);
        S8.setOnClickListener(this);
        S9.setOnClickListener(this);
        S10.setOnClickListener(this);
        S11.setOnClickListener(this);

        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        B5.setOnClickListener(this);
        B6.setOnClickListener(this);
        B7.setOnClickListener(this);
        B8.setOnClickListener(this);
        B9.setOnClickListener(this);
        B10.setOnClickListener(this);
        B11.setOnClickListener(this);
        B12.setOnClickListener(this);
        B13.setOnClickListener(this);
        B14.setOnClickListener(this);
        B15.setOnClickListener(this);
        B16.setOnClickListener(this);
        B17.setOnClickListener(this);
        B18.setOnClickListener(this);
        B19.setOnClickListener(this);
        B20.setOnClickListener(this);
        B21.setOnClickListener(this);
        B22.setOnClickListener(this);
        B23.setOnClickListener(this);
        B24.setOnClickListener(this);
        B25.setOnClickListener(this);
        B26.setOnClickListener(this);
        B27.setOnClickListener(this);
        B28.setOnClickListener(this);
        B29.setOnClickListener(this);
        B30.setOnClickListener(this);
        B31.setOnClickListener(this);
        B32.setOnClickListener(this);
        B33.setOnClickListener(this);
        B34.setOnClickListener(this);
        B35.setOnClickListener(this);
        B36.setOnClickListener(this);
        B37.setOnClickListener(this);
        B38.setOnClickListener(this);
        B39.setOnClickListener(this);
        B40.setOnClickListener(this);

        Sunno.setOnClickListener(this);
        Ak.setOnClickListener(this);
        Dui.setOnClickListener(this);
        Tin.setOnClickListener(this);
        Chaar.setOnClickListener(this);
        Pach.setOnClickListener(this);
        Choy.setOnClickListener(this);
        Shat.setOnClickListener(this);
        Aat.setOnClickListener(this);
        Noy.setOnClickListener(this);
        Dosh.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        vv = findViewById(R.id.videoView);
        String path;

       switch (view.getId()){
            case R.id.S1:
                path = "android.resource://" + getPackageName()+ "/" + R.raw.s100;
                vv.setVideoPath(path);
                vv.start();
                break;
            case R.id.S2:
                path = "android.resource://" + getPackageName()+ "/" + R.raw.s200;
                vv.setVideoPath(path);
                vv.start();
                break;
            case R.id.S3:
                path = "android.resource://" + getPackageName()+ "/" + R.raw.s300;
                vv.setVideoPath(path);
                vv.start();
                break;
            case R.id.S4:
                path = "android.resource://" + getPackageName()+ "/" + R.raw.s400;
                vv.setVideoPath(path);
                vv.start();
                break;
            case R.id.S5:
                path = "android.resource://" + getPackageName()+ "/" + R.raw.s500;
                vv.setVideoPath(path);
                vv.start();
                break;
           case R.id.S6:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.s600;
               vv.setVideoPath(path);
               vv.start();
               break;
            case R.id.S7:
                path = "android.resource://" + getPackageName()+ "/" + R.raw.s700;
                vv.setVideoPath(path);
                vv.start();
                break;
           case R.id.S8:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.s800;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.S9:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.s900;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.S10:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.s1000;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.S11:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.s1100;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B1:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b100;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B2:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b200;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B3:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b300;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B4:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b400;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B5:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b500;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B6:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b600;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B7:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b700;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B8:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b800;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B9:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b900;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B10:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b1000;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B11:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b1100;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B12:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b1200;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B13:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b1300;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B14:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b1400;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B15:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b1500;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B16:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b1600;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B17:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b1700;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B18:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b1800;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B19:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b1900;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B20:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b2000;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B21:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b2100;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B22:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b2200;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B23:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b2300;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B24:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b2400;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B25:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b2500;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B26:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b2600;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B27:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b2700;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B28:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b2800;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B29:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b2900;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B30:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b3000;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B31:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b3100;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B32:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b3200;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B33:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b3300;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B34:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b3400;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B35:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b3500;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B36:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b3600;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B37:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b3700;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B38:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b3800;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B39:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b3900;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.B40:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.b4000;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.Sunno:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.zero00;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.Ak:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.ek00;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.Dui:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.dui00;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.Tin:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.tin00;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.Chaar:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.chaar00;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.Pach:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.pach00;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.Choy:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.choy00;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.Shat:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.shat00;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.Aat:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.aat00;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.Noy:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.noy00;
               vv.setVideoPath(path);
               vv.start();
               break;
           case R.id.Dosh:
               path = "android.resource://" + getPackageName()+ "/" + R.raw.dosh00;
               vv.setVideoPath(path);
               vv.start();
               break;
        }

    }
}
