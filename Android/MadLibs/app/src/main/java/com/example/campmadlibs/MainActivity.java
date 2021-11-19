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
        pn2TXT=findViewById(R.id.PluralNoun2);
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
        int min = 1;
        int max = 3;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        if(random_int==1){
            output.setText(String.format("One Day while at the office "+person1+", a "+adjective1+" salesman, stumbled upon a package of "+adjective2+" beans. He then gave them to "+person2+" who then put them in "+pluralNoun1+", when they added water they turned into "+noun1+". He then put them into "+pluralNoun2+" which were very "+adjective3+" and took them home."));
        }
        else if(random_int==2){
            output.setText(String.format("One Day "+person1+" who was a great "+adjective1+" person hit a "+adjective2+" tree. Next to the tree was "+person2+", who was eating a bag of "+pluralNoun1+". They asked, "+person1+" if he needed a "+noun1+". "+person1+" said 'No I already have"+adjective3+pluralNoun2+", but thank you'. And they left"));
        }
        else{
            output.setText(String.format("At one point in time, there was a person named, "+person1+", they were the first "+adjective1+" being ever created. The first thing they wanted to make was "+adjective2+" food. After that was created, they started to feel lonely, so they made "+person2+" who wanted "+person1+" to make "+pluralNoun1+", so they did. But then they made "+noun1+" which was poison. "+noun1+" ended up creating "+pluralNoun2+" which started "+adjective3+"the first beings. The End?"));
        }
    }
}