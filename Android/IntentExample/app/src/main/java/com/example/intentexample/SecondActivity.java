package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private Button second;
    private TextView secondLBL;
    private EditText secondInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        second=findViewById(R.id.secondBTN);
        secondLBL=findViewById(R.id.secondLBL);
        secondInformation=findViewById(R.id.secondUI);

        String valueOfIntent=getIntent().getStringExtra("user input");
        secondLBL.setText(valueOfIntent);

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ui = String.valueOf(secondInformation.getText());
                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                i.putExtra("user input",ui);
                i.putExtra("first input", String.valueOf(secondLBL.getText()));
                startActivity(i);
            }
        });
    }
}