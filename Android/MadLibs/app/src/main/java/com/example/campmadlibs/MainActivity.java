package com.example.campmadlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText p1TXT;
    EditText a1TXT;
    EditText a2TXT;
    EditText p2TXT;
    EditText pn1TXT;
    EditText nTXT;
    EditText pn2TXT;
    EditText a3TXT;
    Button generator;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1TXT=findViewById(R.id.PersonName1);
        a1TXT=findViewById(R.id.Adjective1);
        a2TXT=findViewById(R.id.Adjective2);
        p2TXT=findViewById(R.id.PersonName2);
        pn1TXT=findViewById(R.id.PluralNoun1);
        nTXT=findViewById(R.id.Noun);
        pn2TXT=findViewById(R.id.PersonName2);
        a3TXT=findViewById(R.id.Adjective3);
        output=findViewById(R.id.outputView);
        generator=findViewById(R.id.generateButton);
        generator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generate();
            }
        });
    }
    private void generate() {
        String person1 = String.valueOf(p1TXT.getText());
        String adjective1 = String.valueOf(a1TXT.getText());
        String adjective2 = String.valueOf(a2TXT.getText());
        String person2 = String.valueOf(p2TXT.getText());
        String pluralNoun1 = String.valueOf(pn1TXT.getText());
        String noun1 = String.valueOf(nTXT.getText());
        String pluralNoun2 = String.valueOf(pn2TXT.getText());
        String adjective3 = String.valueOf(a3TXT.getText());
        output.setText(String.format("One Day while at the office "+person1+", a "+adjective1+" salesman, stumbled upon a package of "+adjective2+" beans. He then gave them to "+person2+" who then put them in "+pluralNoun1+", when they added water they turned into "+noun1+".He then put them into "+pluralNoun2+" which were very "+adjective3+" and took them home."));
    }
}