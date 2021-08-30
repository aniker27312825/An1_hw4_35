package com.geektech.an1_hw4_35;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    private TextView songName,singer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        singer = findViewById(R.id.singer);
        songName = findViewById(R.id.songName);
        Song song = (Song) getIntent().getSerializableExtra("song");
        songName.setText(song.getName());
        singer.setText(song.getSinger());

    }
}