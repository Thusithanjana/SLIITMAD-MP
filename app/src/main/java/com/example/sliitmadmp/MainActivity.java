package com.example.sliitmadmp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private  static final int MY_PERMISSION_REQUEST=1;
    EditText etSong;
    Boolean local = false;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSong = findViewById(R.id.etSong);

    }

    public void btnLocal(View view){
        etSong.setText(R.string.local);
        local = true;
        if (mediaPlayer != null)
            mediaPlayer.release();

        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.song);


    }
    public void btnStream(View view){
        etSong.setText(R.string.stream);
        local = false;

        if (mediaPlayer != null)
            mediaPlayer.release();

        String url = "http://www.hochmuth.com/mp3/Haydn_Cello_Concerto_D-1.mp3"; // your URL here
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(url);
            mediaPlayer.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void play(View view){

        if (mediaPlayer == null){

            etSong.setText("No media found!");
        }else {
            mediaPlayer.start();
        }
    }
    public void pause(View view){
        if (mediaPlayer!=null)
            mediaPlayer.pause();

    }
    public void stop(View view){
        mediaPlayer.release();
        mediaPlayer = null;
    }




}