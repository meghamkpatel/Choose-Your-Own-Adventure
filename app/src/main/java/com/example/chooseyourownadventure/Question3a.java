package com.example.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question3a extends AppCompatActivity {
    TextView question3a;
    Button option1, option2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3a);

        option1 = (Button) findViewById(R.id.button11);
        option2 = (Button) findViewById(R.id.button12);
        question3a = (TextView)findViewById(R.id.question1_id);
        question3a.setText("Question2a");

        option1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(Question3a.this, Instructions.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(Question3a.this, Instructions.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}
