package com.example.diary_dorandoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Days extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days);
        ImageView todobtn = (ImageView) findViewById(R.id.todobtn);
        ImageView diarybtn = (ImageView) findViewById(R.id.diarybtn);
        todobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),todolist.class);
                startActivity(intent);
            }
        });
        diarybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Diary.class);
                startActivity(intent);
            }
        });
    }
}