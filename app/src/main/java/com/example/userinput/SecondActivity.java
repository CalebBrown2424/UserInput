package com.example.userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity   {
    Button info;
    TextView textElement;

    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        configureNextButton();
        info = (Button) findViewById(R.id.info) ;
        changeText();

//String value2;


    }

    public void changeText()
    {
        TextView textElement1 = (TextView) findViewById(R.id.textView4);
        TextView textElement2 = (TextView) findViewById(R.id.textView5);
        TextView textElement3 = (TextView) findViewById(R.id.win);
        TextView textElement4 = (TextView) findViewById(R.id.textView9);
        TextView textElement5 = (TextView) findViewById(R.id.textView10);
        bundle = getIntent().getExtras();

        assert bundle != null;
        String value2 = bundle.getString("data");
        int strength = 0;
        //int l = value2.length();


        for (int i = 0; i < value2.length(); i++)
        {
            value2.toLowerCase();

            switch (value2.substring(i, i + 1)) {
                case "e":
                    strength += 1;
                    break;
                case "t":
                    strength += 2;
                    break;
                case "a":
                    strength += 3;
                    break;
                case "o":
                    strength += 4;
                    break;
                case "i":
                    strength += 5;
                    break;
                case "n":
                    strength += 6;
                    break;
                case "s":
                    strength += 7;
                    break;
                case "r":
                    strength += 8;
                    break;
                case "h":
                    strength += 9;
                    break;
                case "l":
                    strength += 10;
                    break;
                case "d":
                    strength += 11;
                    break;
                case "c":
                    strength += 12;
                    break;
                case "u":
                    strength += 13;
                    break;
                case "m":
                    strength += 14;
                    break;
                case "f":
                    strength += 15;
                    break;
                case "p":
                    strength += 16;
                    break;
                case "g":
                    strength += 17;
                    break;
                case "w":
                    strength += 18;
                    break;
                case "y":
                    strength += 19;
                    break;
                case "b":
                    strength += 20;
                    break;
                case "v":
                    strength += 21;
                    break;
                case "k":
                    strength += 22;
                    break;
                case "x":
                    strength += 23;
                    break;
                case "j":
                    strength += 24;
                    break;
                case "q":
                    strength += 25;
                    break;
                case "z":
                    strength += 26;
                    break;
            }
        }








        if(value2.length() == 4)
        {
            strength *= 1.3;
        }
        if(value2.length() == 3)
        {
            strength *= 1.6;
        }
        if(value2.length() == 2)
        {
            strength *= 2;
        }
        if(value2.length() == 8)
        {
            strength /= 1.1;
        }
        if(value2.length() == 9)
        {
            strength /= 1.3;
        }
        if(value2.length() > 9)
        {
            strength /= 1.5;
        }
            textElement1.setText("Hello " + value2 + "!");
            textElement4.setText("Name Length: " + value2.length());
            textElement2.setText("Name Strength: " + strength);
            if(strength > 50) {
                textElement3.setText("You keep your name!");
                textElement5.setText("Your name is strong enough to destroy the notorious Name Hunter. Your parents chose your name well!");
            }
            else
            {
                textElement3.setText("You lost your name.");
                textElement5.setText("The terrifying Name Hunter looms over you and devours your name in its entirety. You are forced to live out your days in a miserable, nameless life.");
            }
       


        }
    //private void infoClick()
    //{
      //  info.setOnClickListener(new View.OnClickListener() {
        //    public void onClick(View v) {
          //      Snackbar.make(view, "asjdfkasdf")
            //}
        //});

    //}
    private void configureNextButton()
    {
        ImageButton back = (ImageButton) findViewById(R.id.imageButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}



