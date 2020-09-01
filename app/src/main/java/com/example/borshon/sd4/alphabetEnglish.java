package com.example.borshon.sd4;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alphabetEnglish extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_english);

        Button a = findViewById(R.id.a);
        Button b = findViewById(R.id.b);
        Button c = findViewById(R.id.c);
        Button d = findViewById(R.id.d);
        Button e = findViewById(R.id.e);
        Button f = findViewById(R.id.f);
        Button g = findViewById(R.id.g);
        Button h = findViewById(R.id.h);
        Button i = findViewById(R.id.i);
        Button j = findViewById(R.id.j);
        Button k = findViewById(R.id.k);
        Button l = findViewById(R.id.l);
        Button m = findViewById(R.id.m);
        Button n = findViewById(R.id.n);
        Button o = findViewById(R.id.o);
        Button p = findViewById(R.id.p);
        Button q = findViewById(R.id.q);
        Button r = findViewById(R.id.r);
        Button s = findViewById(R.id.s);
        Button t = findViewById(R.id.t);
        Button u = findViewById(R.id.u);
        Button v = findViewById(R.id.v);
        Button w = findViewById(R.id.w);
        Button x = findViewById(R.id.x);
        Button y = findViewById(R.id.y);
        Button z = findViewById(R.id.z);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        final MediaPlayer mp;
        switch (view.getId()){
            case R.id.a:
                mp=MediaPlayer.create(this,R.raw.a);
                mp.start();
                break;

            case R.id.b:
                mp = MediaPlayer.create(this,R.raw.b);
                mp.start();
                break;
            case R.id.c:
                mp = MediaPlayer.create(this,R.raw.c);
                mp.start();
                break;
            case R.id.d:
                mp = MediaPlayer.create(this,R.raw.d);
                mp.start();
                break;
            case R.id.e:
                mp = MediaPlayer.create(this,R.raw.e);
                mp.start();
                break;
            case R.id.f:
                mp = MediaPlayer.create(this,R.raw.f);
                mp.start();
                break;
            case R.id.g:
                mp = MediaPlayer.create(this,R.raw.g);
                mp.start();
                break;
            case R.id.h:
                mp = MediaPlayer.create(this,R.raw.h);
                mp.start();
                break;
            case R.id.i:
                mp = MediaPlayer.create(this,R.raw.i);
                mp.start();
                break;
            case R.id.j:
                mp = MediaPlayer.create(this,R.raw.j);
                mp.start();
                break;
            case R.id.k:
                mp = MediaPlayer.create(this,R.raw.k);
                mp.start();
                break;
            case R.id.l:
                mp = MediaPlayer.create(this,R.raw.l);
                mp.start();
                break;
            case R.id.m:
                mp = MediaPlayer.create(this,R.raw.m);
                mp.start();
                break;
            case R.id.n:
                mp = MediaPlayer.create(this,R.raw.n);
                mp.start();
                break;
            case R.id.o:
                mp = MediaPlayer.create(this,R.raw.o);
                mp.start();
                break;
            case R.id.p:
                mp = MediaPlayer.create(this,R.raw.p);
                mp.start();
                break;
            case R.id.q:
                mp = MediaPlayer.create(this,R.raw.q);
                mp.start();
                break;
            case R.id.r:
                mp = MediaPlayer.create(this,R.raw.r);
                mp.start();
                break;
            case R.id.s:
                mp = MediaPlayer.create(this,R.raw.s);
                mp.start();
                break;
            case R.id.t:
                mp = MediaPlayer.create(this,R.raw.t);
                mp.start();
                break;
            case R.id.u:
                mp = MediaPlayer.create(this,R.raw.u);
                mp.start();
                break;
            case R.id.v:
                mp = MediaPlayer.create(this,R.raw.v);
                mp.start();
                break;
            case R.id.w:
                mp = MediaPlayer.create(this,R.raw.w);
                mp.start();
                break;
            case R.id.x:
                mp = MediaPlayer.create(this,R.raw.x);
                mp.start();
                break;
            case R.id.y:
                mp = MediaPlayer.create(this,R.raw.y);
                mp.start();
                break;
            case R.id.z:
                mp = MediaPlayer.create(this,R.raw.z);
                mp.start();
                break;

        }

    }
}
