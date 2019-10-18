package com.example.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question1 extends AppCompatActivity {

    TextView question1;
    Button option1, option2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        option1 = (Button) findViewById(R.id.button5);
        option2 = (Button) findViewById(R.id.button6);
        question1 = (TextView)findViewById(R.id.question1_id);
        question1.setText("Question1");

        option1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(Question1.this, Question2a.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}
