package com.example.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question2a extends AppCompatActivity {
    TextView question2a;
    Button option1, option2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2a);

        option1 = (Button) findViewById(R.id.button7);
        option2 = (Button) findViewById(R.id.button8);
        question2a = (TextView)findViewById(R.id.question2a_id);
        question2a.setText("Question2a");

        option1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent intent = new Intent(Question2a.this, Question3a.class);
                startActivity(intent);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent intent = new Intent(Question2a.this, Question3b.class);
                startActivity(intent);
            }
        });
    }
}
