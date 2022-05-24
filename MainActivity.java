package com.example.matefacil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnInicio;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInicio=findViewById(R.id.btnInicio);
        if(mp != null){
            mp.release();
        }
        mp = MediaPlayer.create(this,R.raw.melancholy);
        mp.seekTo(0);
        mp.start();

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencion=new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intencion);
            }
        });
    }
}
