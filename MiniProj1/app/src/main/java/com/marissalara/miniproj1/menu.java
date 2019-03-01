package com.marissalara.miniproj1;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.net.Uri;

public class menu extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button btn = (Button) findViewById(R.id.cups);
        Button inf = (Button) findViewById(R.id.info_cups);
        Button one = (Button) findViewById(R.id.blackjack);
        Button two = (Button) findViewById(R.id.solitare);
        Button tut = (Button) findViewById(R.id.tutorial);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, gamer.class));
            }
        });

        inf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info_popup info_popup = new info_popup();
                info_popup.show(getSupportFragmentManager(), "info_popup");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sorry_popup sorry_popup = new sorry_popup();
                sorry_popup.show(getSupportFragmentManager(), "sorry_popup");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sorry_popup sorry_popup = new sorry_popup();
                sorry_popup.show(getSupportFragmentManager(), "sorry_popup");
            }
        });


        tut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Three-card_Monte"));
                startActivity(intent);
            }
        });

    }

}
