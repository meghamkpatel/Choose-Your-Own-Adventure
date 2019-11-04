package com.example.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class intro extends AppCompatActivity {

    Button next;
    TextView storyline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        next = (Button) findViewById(R.id.questions);
        storyline = (TextView)findViewById(R.id.story);

        storyline.setText("You're a third year in Binghamton University majoring computer science and it's Halloweekend but you feel sick so you decide to spend a night in. You live in a house downtown with your friends from HackBU. It's been said there has been spirits spotted every Halloween but the rent is cheap and the landlord promised to never come in the house. You go up to your room and decide to catch up on some Netflix.");
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(intro.this, MainGameLoop.class);
                startActivity(intent);
            }
        });

    }
}
