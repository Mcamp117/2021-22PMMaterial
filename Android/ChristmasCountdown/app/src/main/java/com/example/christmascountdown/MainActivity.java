package com.example.christmascountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView txtTimerDay, txtTimerHour, txtTimerMinute, txtTimerSecond;
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTimerDay=findViewById(R.id.txtTimerDay);
        txtTimerHour=findViewById(R.id.txtTimerHour);
        txtTimerMinute=findViewById(R.id.txtTimerMinute);
        txtTimerSecond=findViewById(R.id.txtTimerSecond);

        countDownStart();
    }
    public void countDownStart(){
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this,1000); //pause for 1000 ms
                try{
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2021-12-25");
                    Date currentDate = new Date();

                    long diff = futureDate.getTime()-currentDate.getTime();
                    long days = diff/(24*60*60*1000);
                    diff-=days*(24*60*60*1000);
                    long hours = diff/(60*60*1000);
                    diff-=hours*(60*60*1000);
                    long minute = diff/(60*1000);
                    diff-=minute*(60*1000);
                    long second = diff/(1000);
                    diff-=second*(1000);


                    txtTimerDay.setText(""+String.format("%02d",days));
                    txtTimerHour.setText(""+String.format("%02d",hours));
                    txtTimerMinute.setText(""+String.format("%02d",minute));
                    txtTimerSecond.setText(""+String.format("%02d",second));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable,1000);
    }
}