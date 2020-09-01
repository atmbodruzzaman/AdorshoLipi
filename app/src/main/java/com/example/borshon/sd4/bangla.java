package com.example.borshon.sd4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bangla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);
    }

    public void sorborno(View view) {
        Intent intent = new Intent(this,sorborno.class);
        this.startActivity(intent);
    }

    public void bangonborno(View view) {
        Intent intent = new Intent(this,bangonborno.class);
        this.startActivity(intent);
    }

    public void numberBangla(View view) {
        Intent intent = new Intent(this,numberBangla.class);
        this.startActivity(intent);
    }

    public void chora(View view) {
        Intent intent = new Intent(this,chora.class);
        this.startActivity(intent);
    }

    public void bornolikha(View view) {
        Intent intent = new Intent(this,bornolikha.class);
        this.startActivity(intent);
    }
}
