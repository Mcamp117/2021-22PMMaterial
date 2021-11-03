package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    private Button third;
    private TextView activity1LBL;
    private TextView activity2LBL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        third=findViewById(R.id.thirdBTN);
        activity1LBL=findViewById(R.id.activity1View);
        activity2LBL=findViewById(R.id.activity2View);

        String valueOfIntent=getIntent().getStringExtra("user input");
        String valueOfI=getIntent().getStringExtra("first input");
        Log.d("SecondThird",valueOfI);
        activity1LBL.setText(valueOfI);
        activity2LBL.setText(valueOfIntent);

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

}
