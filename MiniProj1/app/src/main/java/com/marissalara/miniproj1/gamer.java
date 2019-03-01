package com.marissalara.miniproj1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gamer extends AppCompatActivity {
    ImageView left,middle,right;
    Button game;
    List<Integer> cards;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamer);

        left = (ImageView)findViewById(R.id.left);
        middle = (ImageView)findViewById(R.id.middle);
        right = (ImageView) findViewById(R.id.right);
        game = (Button) findViewById(R.id.new_game);

        cards = new ArrayList<>();
        cards.add(107);
        cards.add(207);
        cards.add(407);

        Collections.shuffle(cards);

        Button btn = (Button) findViewById(R.id.home);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.shuffle);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(gamer.this, menu.class));
            }
        });

        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //shuffle the cards
                mp.start();
                Collections.shuffle(cards);

                left.setImageResource(R.drawable.back_small);
                middle.setImageResource(R.drawable.back_small);
                right.setImageResource(R.drawable.back_small);

                Animation anim_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left);
                Animation anim_middle = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.middle);
                Animation anim_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right);

                left.startAnimation(anim_left);
                middle.startAnimation(anim_middle);
                right.startAnimation(anim_right);
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Assign Left
                if (cards.get(0) == 107){
                    left.setImageResource(R.drawable.part1);
                    Toast.makeText(gamer.this, "Guessed Right!", Toast.LENGTH_SHORT).show();
                    count++;
                    TextView text = (TextView)findViewById(R.id.score);
                    text.setText("Score: "+count);// view in the text
                }
                else if(cards.get(0) == 207){
                    left.setImageResource(R.drawable.part2);
                }
                else if (cards.get(0) == 407){
                    left.setImageResource(R.drawable.part3);
                }
                if (cards.get(1) == 107){
                    middle.setImageResource(R.drawable.part1);
                }
                else if(cards.get(1) == 207){
                    middle.setImageResource(R.drawable.part2);
                }
                else if (cards.get(1) == 407){
                    middle.setImageResource(R.drawable.part3);
                }
                if (cards.get(2) == 107){
                    right.setImageResource(R.drawable.part1);
                }
                else if(cards.get(2) == 207){
                    right.setImageResource(R.drawable.part2);
                }
                else if (cards.get(2) == 407){
                    right.setImageResource(R.drawable.part3);
                }

            }
        });


        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Assign Middle
                if (cards.get(1) == 107){
                    middle.setImageResource(R.drawable.part1);
                    Toast.makeText(gamer.this, "Guessed Right!", Toast.LENGTH_SHORT).show();
                    count++;
                    TextView text = (TextView)findViewById(R.id.score);
                    text.setText("Score: "+count);// view in the text
                }
                else if(cards.get(1) == 207){
                    middle.setImageResource(R.drawable.part2);
                }
                else if (cards.get(1) == 407){
                    middle.setImageResource(R.drawable.part3);
                }
                if (cards.get(0) == 107){
                    left.setImageResource(R.drawable.part1);
                }
                else if(cards.get(0) == 207){
                    left.setImageResource(R.drawable.part2);
                }
                else if (cards.get(0) == 407){
                    left.setImageResource(R.drawable.part3);
                }
                if (cards.get(2) == 107){
                    right.setImageResource(R.drawable.part1);
                }
                else if(cards.get(2) == 207){
                    right.setImageResource(R.drawable.part2);
                }
                else if (cards.get(2) == 407){
                    right.setImageResource(R.drawable.part3);
                }

            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Assign Right
                if (cards.get(2) == 107){
                    right.setImageResource(R.drawable.part1);
                    Toast.makeText(gamer.this, "Guessed Right!", Toast.LENGTH_SHORT).show();
                    count++;
                    TextView text = (TextView)findViewById(R.id.score);
                    text.setText("Score: "+count);// view in the text
                }
                else if(cards.get(2) == 207){
                    right.setImageResource(R.drawable.part2);
                }
                else if (cards.get(2) == 407){
                    right.setImageResource(R.drawable.part3);
                }
                if (cards.get(0) == 107) {
                    left.setImageResource(R.drawable.part1);
                }
                else if(cards.get(0) == 207){
                    left.setImageResource(R.drawable.part2);
                }
                else if (cards.get(0) == 407){
                    left.setImageResource(R.drawable.part3);
                }
                if (cards.get(1) == 107){
                    middle.setImageResource(R.drawable.part1);
                }
                else if(cards.get(1) == 207){
                    middle.setImageResource(R.drawable.part2);
                }
                else if (cards.get(1) == 407){
                    middle.setImageResource(R.drawable.part3);
                }

            }

        });

    }

}
