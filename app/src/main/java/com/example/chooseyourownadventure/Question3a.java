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
        question3a = (TextView)findViewById(R.id.question3a_id);
        question3a.setText("Question3a");

        option1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent intent = new Intent(Question3a.this, Instructions.class);
                startActivity(intent);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent intent = new Intent(Question3a.this, Instructions.class);
                startActivity(intent);
            }
        });
    }
}
