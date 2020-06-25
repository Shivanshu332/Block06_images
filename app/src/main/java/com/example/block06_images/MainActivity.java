package com.example.block06_images;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageBig = (ImageView) findViewById(R.id.imageBig);
        imageBig.setImageResource(R.drawable.compass);
        SeekBar tuner=(SeekBar) findViewById(R.id.seekBar_tuner);
        tuner.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int lastprogress=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lastprogress=progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                imageBig.setColorFilter(Color.argb(255,0,lastprogress,255-lastprogress));
            }
        });
    }
}