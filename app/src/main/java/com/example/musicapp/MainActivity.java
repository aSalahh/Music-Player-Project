package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_Classic = findViewById(R.id.tv_classic);
        TextView tv_Romantic = findViewById(R.id.tv_Romantic);
        TextView tv_Jazz = findViewById(R.id.tv_jaazhip);

        tv_Classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Classicintent = new Intent(MainActivity.this, AdeleActivity.class);
                startActivity(Classicintent);
            }
        });
        tv_Romantic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Romanticintent = new Intent(MainActivity.this, RomanticActivity.class);
                startActivity(Romanticintent);
            }
        });
        tv_Jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Jazzintent = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(Jazzintent);
            }
        });


    }
}
