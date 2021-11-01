package com.example.pizzamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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

    private double total;
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
        outputBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //quick example on checkboxes
                if (ancCB.isChecked()){
                    //Toast.makeText(which activity, message, length0.show()
                    Toast.makeText(MainActivity.this,"anchovies",Toast.LENGTH_SHORT).show();
                    total+=17.36;
                }
                if (bacCB.isChecked()){
                    total+=5.00;
                }
                if (jalCB.isChecked()){
                    total+=.02;
                }
                onRadioButtonClicked();
                output.setText(Double.toString(total));

            }
        });
        sizeRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                //get the selected radio button
                RadioButton rb= (RadioButton) sizeRG.findViewById(id);
            }
        });
    }

    public void onRadioButtonClicked(){
        Log.d("RadioButton test","triggered");
        //if no radio buttons selected, it will return -1
        int selectedId=sizeRG.getCheckedRadioButtonId();
        if (selectedId==-1){
            Toast.makeText(MainActivity.this,"Choose a size", Toast.LENGTH_SHORT).show();
        }
        else{
            RadioButton radioButton=(RadioButton) sizeRG.findViewById(selectedId);
            Toast.makeText(MainActivity.this, radioButton.getText(),Toast.LENGTH_SHORT).show();
            if (radioButton.getText().equals("Small")){
                Log.d("RadioButton test","Small");
                total+=5;
            }
            else if (radioButton.getText().equals("Medium")){
                Log.d("RadioButton test","Medium");
                total+=6;
            }
            else{
                Log.d("RadioButton test","Large");
                total+=7;
            }
        }
    }
}