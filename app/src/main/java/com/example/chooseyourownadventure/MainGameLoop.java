package com.example.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainGameLoop extends AppCompatActivity {
    private List<String> options;
    private List<String> story;
    private int i = 0, k = 1;
    private Button option1, option2;
    private TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game_loop);
        option1 = (Button) findViewById(R.id.option1);
        option2 = (Button) findViewById(R.id.option2);
        question = (TextView)findViewById(R.id.question);

        options = new ArrayList<String>();
        options.add("Go down the stairs");
        options.add("Stay in your room, its probably just the heater");
        options.add("Open the fridge");
        options.add("Close the fridge");
        options.add("Pick up the phone");
        options.add("Nope! If they wanna talk to me they can text me");
        options.add("Awwww man, now the fridge is dirty. Gotta go wash it.");
        options.add("That's terrifying, what does that mean??");
        options.add("I'm a broke college student. I got no money for an actual heater.");
        options.add("That's strange, I should call the maintenance guy");
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);
        options.add(null);


        option1.setText(options.get(0));
        option2.setText(options.get(1));

        story = new ArrayList<String>();
        story.add("You hear a loud THUMP downstairs");
        story.add("The lights are all off... except the fridge is open?");
        story.add("The phone rings");
        story.add("You see an egg butchered knife");
        story.add("DING the oven timer goes off");
        story.add("It's the pizza guy! Nothing spooky tonight! The End");
        story.add("You fall asleep. The End");
        story.add("HOHOHO! Santa come early this year! You got put on the nice list for cleaning your dishes. The End.");
        story.add("SQUAWK. You turn around and there is a dead turkey lying on the dining table. You died. The End.");
        story.add("You turn around and see a white floating blob of a mess smiling at you. It's Casper the friendly ghost! The End.");
        story.add("You turn around and see it's your dead roommate's ghost right before you! You dead. The End.");
        story.add("You turn around and see it's just your roommate. You go to bed. The End.");

        question.setText(story.get(0));

        option1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                i = 2*i+2;
                k = 2*k;
                if(options.get(i) == null){
                    option1.setVisibility(View.INVISIBLE);
                }

                option1.setText(options.get(i));
                option2.setText(options.get(i+1));
                question.setText(story.get(i-1));
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                i = 2*i+4;
                if(options.get(i) == null){
                    option1.setVisibility(View.INVISIBLE);
                }
                option1.setText(options.get(i));
                option2.setText(options.get(i+1));
            }
        });
    }

}

