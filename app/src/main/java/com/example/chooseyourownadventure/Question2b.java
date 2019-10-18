package com.example.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question2b extends AppCompatActivity {

    TextView question2b;
    Button option1, option2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2b);

        option1 = (Button)findViewById(R.id.button7);
        option2 = (Button)findViewById(R.id.button8);
        question2b = (TextView)findViewById(R.id.question2b_id);
        question2b.setText("Question2b");
    }
    option2.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v)
        {
            Intent intent = new Intent(Question2b.this, Question3c.class);
            startActivity(intent);
        }
    });
    option1.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v)
        {
            Intent intent = new Intent(Question2b.this, Question3c.class);
            startActivity(intent);
        }
    });
}
