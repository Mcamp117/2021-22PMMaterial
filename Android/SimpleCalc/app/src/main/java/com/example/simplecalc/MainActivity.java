package com.example.simplecalc; //unique id for your program

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1TXT;
    private EditText number2TXT;
    private Button addBTN;
    private Button divBTN;
    private Button multBTN;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //this line links the two files

        //linked the global variables to the widgets
        number1TXT= findViewById(R.id.number1);
        number2TXT= findViewById(R.id.number2);
        addBTN=findViewById(R.id.addBTN);
        divBTN=findViewById(R.id.divBTN);
        multBTN=findViewById(R.id.multBTN);
        output=findViewById(R.id.output);

        //set up our buttons with an algorithm
        divBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.valueOf(String.valueOf(number1TXT.getText()));
                int num2=Integer.valueOf(String.valueOf(number2TXT.getText()));
                int answer=num2/num1;
                output.setText(String.valueOf(answer));
            }
        });
        multBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.valueOf(String.valueOf(number1TXT.getText()));
                int num2=Integer.valueOf(String.valueOf(number2TXT.getText()));
                int answer=num1*num2;
                output.setText(String.valueOf(answer));
            }
        });
    }

    public void test(View v) {
        //getting the text
        String input= String.valueOf(number1TXT.getText());

    }

    //adding and subtracting are for hard coding the onclick

                    //An object of View is required
    public void adding(View v){
        int num1=Integer.valueOf(String.valueOf(number1TXT.getText()));
        int num2=Integer.valueOf(String.valueOf(number2TXT.getText()));
        int answer=num1+num2;
        output.setText(String.valueOf(answer));
    }

    public void subtracting(View v){
        int num1=Integer.valueOf(String.valueOf(number1TXT.getText()));
        int num2=Integer.valueOf(String.valueOf(number2TXT.getText()));
        int answer=num1-num2;
        output.setText(String.valueOf(answer));
    }

}