package com.example.seekerpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import java.lang.invoke.ConstantCallSite;

public class MainActivity extends AppCompatActivity {

        private TextView message;
        private SeekBar seeker;
        private TextView value;
        private ConstraintLayout screen;
        private SeekBar rSeeker;
        private SeekBar gSeeker;
        private SeekBar bSeeker;
        public int rValue;
        public int gValue;
        public int bValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link the java to the widget
        message=findViewById(R.id.messageTXT);
        seeker=findViewById(R.id.seekBar);
        rSeeker=findViewById(R.id.rSeeker);
        gSeeker=findViewById(R.id.gSeeker);
        bSeeker=findViewById(R.id.bSeeker);
        value=findViewById(R.id.progressTXT);
        screen=findViewById(R.id.constraintLayout);

        value.setText(seeker.getProgress()+"/"+seeker.getMax());

        //getting the progress of the seeker
        seeker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int pval=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
               //whenever you are sliding it
                message.setTextSize(progress);
                pval=progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //whenever you click on it
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //when you release the seekBar
                value.setText(pval + "/" + seeker.getMax());
            }
        });
        rSeeker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                rValue=i;
                screen.setBackgroundColor(Color.rgb(rValue,gValue,bValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        gSeeker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                gValue=i;
                screen.setBackgroundColor(Color.rgb(rValue,gValue,bValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        bSeeker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                bValue=i;
                screen.setBackgroundColor(Color.rgb(rValue,gValue,bValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}