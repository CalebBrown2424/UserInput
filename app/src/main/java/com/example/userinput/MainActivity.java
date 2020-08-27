package com.example.userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureNextButton();
        editText = (EditText) findViewById(R.id.editTextTextPersonName);

    }

        private void configureNextButton()
        {
        ImageButton button = (ImageButton) findViewById(R.id.imageButton1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
        }

}