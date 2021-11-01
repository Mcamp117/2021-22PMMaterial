package com.example.pizzaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton smallRB;
    private RadioButton mediumRB;
    private RadioButton largeRB;
    private RadioGroup sizeRG;

    private TextView output;

    private CheckBox ancCB;
    private CheckBox bacCB;
    private CheckBox jalCB;

    private Button outputBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        sizeRG=findViewById(R.id.sizeRG);
        smallRB=findViewById(R.id.smallRB);
        mediumRB=findViewById(R.id.mediumRB);
        largeRB=findViewById(R.id.largeRB);

        output=findViewById(R.id.output);

        ancCB=findViewById(R.id.ancCB);
        bacCB=findViewById(R.id.bacCB);
        jalCB=findViewById(R.id.jalCB);

        outputBTN=findViewById(R.id.outputBTN);
        output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //quick example on checkboxes
            }
        });
    }
}