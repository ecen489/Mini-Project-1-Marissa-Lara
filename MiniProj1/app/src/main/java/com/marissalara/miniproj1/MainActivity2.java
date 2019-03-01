package com.marissalara.miniproj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {
    ListView simpleList;
    String  Item[] = {"Cups", "Blackjack", "Solitaire", "Texas Hold'Em", "Uno", "Mario Party"};
    String  SubItem[] = {"The shell game is portrayed as a gambling game, but in reality, when a wager for money is made, it is almost always a trick used to perpetrate fraud. (Except this one)",
            "Blackjack is one of the only games in the casino where your decisions matter. (More skill than luck)",
            "Wes Cherry adapted the popular card game for Microsoft during his internship with the company. The game was included in Windows 3.0, which made its debut in 1990.",
            "Over 300 million 7 card poker hand combinations exist.",
            "After having an argument with his son about Crazy 8's, Merle Robbins, a barbershop owner and card lover, invented UNO in 1971 in Reading, Ohio.",
            "Many friendships have been tested because of this game, or 11 if you count all the main series games."};
    int flags[] = {R.drawable.cups, R.drawable.blackjack, R.drawable.solitare, R.drawable.poker, R.drawable.uno, R.drawable.marioparty};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        simpleList = (ListView)findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item,SubItem, flags);
        simpleList.setAdapter(customAdapter);
    }
}
