package com.example.diary_dorandoran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;

public class NoteInDays extends AppCompatActivity {
    SeekBar seekBar;
    EditText noteDiary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_in_days);
        seekBar = findViewById(R.id.seekBar);
        noteDiary = findViewById(R.id.noteDiary);

        noteDiary.setEnabled(false);
        seekBar.setEnabled(false);
    }
}