package com.example.navdrawertest.ui.dice4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.navdrawertest.R;

import java.util.Random;

public class Dice4Fragment extends Fragment {
    private ImageView dice;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable
            ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView=inflater.inflate(R.layout.fragment_dice,container,false);

        dice=rootView.findViewById(R.id.diceIMG);   //link the widget to the variable
        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });

        return rootView;
    }

    private void rollDice(){
        //generate a random #
        Random rng = new Random();
        int randomNumber = rng.nextInt(6);
        //if random number == 0{set image to dice 1}
        switch (randomNumber){
            case 0:
                dice.setImageResource(R.drawable.dice1);
                break;
            case 1:
                dice.setImageResource(R.drawable.dice2);
                break;
            case 2:
                dice.setImageResource(R.drawable.dice3);
                break;
            case 3:
                dice.setImageResource(R.drawable.dice4);
                break;
        }
        // depending on the #, we set our image to that sided dice
    }


}
