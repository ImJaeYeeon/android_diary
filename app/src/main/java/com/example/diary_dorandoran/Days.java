package com.example.diary_dorandoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Days extends AppCompatActivity {
    ImageView note1,note2,note3,note4,note5,note6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days);
        ImageView todobtn = (ImageView) findViewById(R.id.todobtn);
        ImageView diarybtn = (ImageView) findViewById(R.id.diarybtn);

        note1 = findViewById(R.id.note1);
        note1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NoteInDays.class);
                startActivity(intent);
            }
        });

        note2 = findViewById(R.id.note2);
        note2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"저장된게 없습니다", Toast.LENGTH_SHORT).show();
            }
        });
        note3 = findViewById(R.id.note3);
        note3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"저장된게 없습니다", Toast.LENGTH_SHORT).show();
            }
        });
        note4 = findViewById(R.id.note4);
        note4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"저장된게 없습니다", Toast.LENGTH_SHORT).show();
            }
        });
        note5 = findViewById(R.id.note5);
        note5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"저장된게 없습니다", Toast.LENGTH_SHORT).show();
            }
        });
        note6 = findViewById(R.id.note6);
        note6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"저장된게 없습니다", Toast.LENGTH_SHORT).show();
            }
        });


        todobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Todolist.class);
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