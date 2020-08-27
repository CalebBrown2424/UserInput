package com.example.userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity   {
    TextView textElement;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        configureNextButton();
        changeText();

//String value2;


    }

    public void changeText()
    {
        TextView textElement1 = (TextView) findViewById(R.id.textView4);
        bundle = getIntent().getExtras();

        if(bundle.getString("data") == null)
        {
            finish();
        }
        
            String value2 = bundle.getString("data");

        if(value2.contains(" "))
        {
            String value3 = value2.replaceAll(" ", "");
            textElement1.setText("Hello " + value3);
        }
        else {
            textElement1.setText("Hello " + value2);

        };
    }
    private void configureNextButton()
    {
        ImageButton back = (ImageButton) findViewById(R.id.imageButton3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}



