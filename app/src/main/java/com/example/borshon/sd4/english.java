package com.example.borshon.sd4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class english extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
    }

    public void alphabetEnglish(View view) {
        Intent intent = new Intent(this,alphabetEnglish.class);
        this.startActivity(intent);
    }

    public void numberEnglish(View view) {
        Intent intent = new Intent(this,numberEnglish.class);
        this.startActivity(intent);
    }

    public void poems(View view) {
        Intent intent = new Intent(this,poems.class);
        this.startActivity(intent);
    }

    public void writeLetters(View view) {
        Intent intent = new Intent(this,writeLetters.class);
        this.startActivity(intent);
    }
}
