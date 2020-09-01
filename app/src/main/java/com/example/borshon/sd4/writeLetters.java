package com.example.borshon.sd4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class writeLetters extends AppCompatActivity implements View.OnClickListener{

    VideoView vv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_letters);

        Button A = findViewById(R.id.A);
        Button B = findViewById(R.id.B);
        Button C = findViewById(R.id.C);
        Button D = findViewById(R.id.D);
        Button E = findViewById(R.id.E);
        Button F = findViewById(R.id.F);
        Button G = findViewById(R.id.G);
        Button H = findViewById(R.id.H);
        Button I = findViewById(R.id.I);
        Button J = findViewById(R.id.J);
        Button K = findViewById(R.id.K);
        Button L = findViewById(R.id.L);
        Button M = findViewById(R.id.M);
        Button N = findViewById(R.id.N);
        Button O = findViewById(R.id.O);
        Button P = findViewById(R.id.P);
        Button Q = findViewById(R.id.Q);
        Button S = findViewById(R.id.S);
        Button T = findViewById(R.id.T);
        Button R00 = findViewById(R.id.R00);
        Button U = findViewById(R.id.U);
        Button V = findViewById(R.id.V);
        Button W = findViewById(R.id.W);
        Button X = findViewById(R.id.X);
        Button Y = findViewById(R.id.Y);
        Button Z = findViewById(R.id.Z);

        Button Zero = findViewById(R.id.Zero);
        Button One = findViewById(R.id.One);
        Button Two = findViewById(R.id.Two);
        Button Three = findViewById(R.id.Three);
        Button Four = findViewById(R.id.Four);
        Button Five = findViewById(R.id.Five);
        Button Six = findViewById(R.id.Six);
        Button Seven = findViewById(R.id.Seven);
        Button Eight = findViewById(R.id.Eight);
        Button Nine = findViewById(R.id.Nine);
        Button Ten = findViewById(R.id.Ten);

        A.setOnClickListener(this);
        B.setOnClickListener(this);
        C.setOnClickListener(this);
        D.setOnClickListener(this);
        E.setOnClickListener(this);
        F.setOnClickListener(this);
        G.setOnClickListener(this);
        H.setOnClickListener(this);
        I.setOnClickListener(this);
        J.setOnClickListener(this);
        K.setOnClickListener(this);
        L.setOnClickListener(this);
        M.setOnClickListener(this);
        N.setOnClickListener(this);
        O.setOnClickListener(this);
        P.setOnClickListener(this);
        Q.setOnClickListener(this);
        R00.setOnClickListener(this);
        S.setOnClickListener(this);
        T.setOnClickListener(this);
        U.setOnClickListener(this);
        V.setOnClickListener(this);
        W.setOnClickListener(this);
        X.setOnClickListener(this);
        Y.setOnClickListener(this);
        Z.setOnClickListener(this);

        Zero.setOnClickListener(this);
        One.setOnClickListener(this);
        Two.setOnClickListener(this);
        Three.setOnClickListener(this);
        Four.setOnClickListener(this);
        Five.setOnClickListener(this);
        Six.setOnClickListener(this);
        Seven.setOnClickListener(this);
        Eight.setOnClickListener(this);
        Nine.setOnClickListener(this);
        Ten.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        vv1 = findViewById(R.id.videoViewEnglish);
        String pathEnglish;

        switch (view.getId()){
            case R.id.A:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.a00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.B:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.b00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.C:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.c00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.D:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.d00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.E:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.e00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.F:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.f00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.G:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.g00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.H:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.h00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.I:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.i00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.J:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.j00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.K:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.k00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.L:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.l00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.M:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.m00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.N:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.n00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.O:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.o00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.P:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.p00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Q:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.q00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.R00:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.r00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.S:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.s00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.T:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.t00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.U:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.u00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.V:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.v00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.W:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.w00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.X:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.x00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Y:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.y00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Z:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.z00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Zero:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.zero00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.One:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.one00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Two:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.two00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Three:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.three00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Four:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.four00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Five:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.five00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Six:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.six00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Seven:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.seven00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Eight:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.eight00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Nine:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.nine00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
            case R.id.Ten:
                pathEnglish = "android.resource://" + getPackageName()+ "/" + R.raw.ten00;
                vv1.setVideoPath(pathEnglish);
                vv1.start();
                break;
        }

    }
}
