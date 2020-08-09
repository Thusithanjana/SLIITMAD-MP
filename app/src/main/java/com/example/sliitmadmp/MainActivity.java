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


    }

    public void btnLocal(View view){
       //Implement the code here
    }


    public void btnStream(View view){
        //Implement the code here


    }


    public void play(View view){
        //Implement the code here

    }
    public void pause(View view){
        //Implement the code here


    }
    public void stop(View view){
        //Implement the code here

    }




}