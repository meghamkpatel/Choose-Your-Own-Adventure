package com.example.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question3c extends AppCompatActivity {
    TextView question3c;
    Button option1, option2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3c);

        option1 = (Button) findViewById(R.id.button15);
        option2 = (Button) findViewById(R.id.button16);
        question3c = (TextView) findViewById(R.id.question3c_id);
        question3c.setText("Question3c");

        option1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(Question3c.this, Instructions.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(Question3c.this, Instructions.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}
