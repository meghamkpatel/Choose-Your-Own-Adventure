package com.example.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainGameLoop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game_loop);
        TextView words = (TextView) findViewById(R.id.storyline);
        Button option1 = (Button) findViewById(R.id.button3);
        Button option2 = (Button) findViewById(R.id.button4);

        
    }
    private List<String> options = new ArrayList<String>();
    options.add("Go down the stairs");
    options.add("Stay in your room, its probably just the heater");
    options.add("Open the fridge");
    options.add("Close the fridge");
    options.add("Pick up the phone");
    options.add("Nope! If they wanna talk to me they can text me");
    options.add("Awwww man, now the fridge is dirty. Gotta go wash it.");
    options.add("That's terrifying, what does that mean??");
    options.add("I'm a broke college student. I got no money for an actual heater.");
    options.add("That's strange, I should call the maintainance guy");

    private List<String> story = new ArrayList<String>();
    story.add("You hear a loud THUMP downstairs");
    story.add("The lights are all off... except the fridge is open?");
    story.add("The phone rings);
    story.add("You see an egg butchered knife");
    story.add("DING the oven timer goes off");
    story.add("DING the oven timer goes off");
    story.add("It's the pizza guy! Nothing spooky tonight! The End");
    story.add("You fall asleep. The End");
    story.add("HOHOHO! Santa come early this year! You got put on the nice list for cleaning your dishes. The End.");
    story.add("SQUAWK. You turn around and there is a dead turkey lying on the dining table. You died. The End.");
    story.add("You turn around and see a white floating blob of a mess smiling at you. It's Casper the friendly ghost! The End.");
    story.add("You turn around and see it's your dead roommate's ghost right before you! You dead. The End.");
    story.add("You turn around and see it's just your roommate. You go to bed. The End.");

    public void clickedButton(View view){
        TextView words = (TextView) findViewById(R.id.words);

    }
}

