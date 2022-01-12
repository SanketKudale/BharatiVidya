package com.sanket.padaayi.ui.letters.LettersLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.sanket.padaayi.R;

public class BarakhadiLayout extends AppCompatActivity {

    ImageView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
    CardView ca1,ca2,ca3,ca4,ca5,ca6,ca7,ca8,ca9,ca10,ca11,ca12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barakhadi_layout);

        c1 = findViewById(R.id.bk1);
        c2 = findViewById(R.id.bk2);
        c3 = findViewById(R.id.bk3);
        c4 = findViewById(R.id.bk4);
        c5 = findViewById(R.id.bk5);
        c6 = findViewById(R.id.bk6);
        c7 = findViewById(R.id.bk7);
        c8 = findViewById(R.id.bk8);
        c9 = findViewById(R.id.bk9);
        c10 = findViewById(R.id.bk10);
        c11 = findViewById(R.id.bk11);
        c12 = findViewById(R.id.bk12);
        ca1 = findViewById(R.id.card1);
        ca2 = findViewById(R.id.card2);
        ca3 = findViewById(R.id.card3);
        ca4 = findViewById(R.id.card4);
        ca5 = findViewById(R.id.card5);
        ca6 = findViewById(R.id.card6);
        ca7 = findViewById(R.id.card7);
        ca8 = findViewById(R.id.card8);
        ca9 = findViewById(R.id.card9);
        ca10 = findViewById(R.id.card10);
        ca11 = findViewById(R.id.card11);
        ca12 = findViewById(R.id.card12);

        card_background();

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setcard(ca1);
                final MediaPlayer mp1 = MediaPlayer.create(BarakhadiLayout.this,R.raw.bk1);
                mp1.start();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setcard(ca2);
                final MediaPlayer mp1 = MediaPlayer.create(BarakhadiLayout.this,R.raw.bk2);
                mp1.start();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setcard(ca3);
                final MediaPlayer mp1 = MediaPlayer.create(BarakhadiLayout.this,R.raw.bk3);
                mp1.start();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setcard(ca4);
                final MediaPlayer mp1 = MediaPlayer.create(BarakhadiLayout.this,R.raw.bk4);
                mp1.start();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setcard(ca5);
                final MediaPlayer mp1 = MediaPlayer.create(BarakhadiLayout.this,R.raw.bk5);
                mp1.start();
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setcard(ca6);
                final MediaPlayer mp1 = MediaPlayer.create(BarakhadiLayout.this,R.raw.bk6);
                mp1.start();
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setcard(ca7);
                final MediaPlayer mp1 = MediaPlayer.create(BarakhadiLayout.this,R.raw.bk7);
                mp1.start();
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setcard(ca8);
                final MediaPlayer mp1 = MediaPlayer.create(BarakhadiLayout.this,R.raw.bk8);
                mp1.start();
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setcard(ca9);
                final MediaPlayer mp1 = MediaPlayer.create(BarakhadiLayout.this,R.raw.bk9);
                mp1.start();
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setcard(ca10);
                final MediaPlayer mp1 = MediaPlayer.create(BarakhadiLayout.this,R.raw.bk10);
                mp1.start();
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setcard(ca11);
                final MediaPlayer mp1 = MediaPlayer.create(BarakhadiLayout.this,R.raw.bk11);
                mp1.start();
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setcard(ca12);
                final MediaPlayer mp1 = MediaPlayer.create(BarakhadiLayout.this,R.raw.bk12);
                mp1.start();
            }
        });

    }

    private void setcard(CardView item) {
        card_background();
        item.setCardBackgroundColor(Color.BLUE);
    }


    private void card_background() {
        ca1.setCardBackgroundColor(Color.WHITE);
        ca2.setCardBackgroundColor(Color.WHITE);
        ca3.setCardBackgroundColor(Color.WHITE);
        ca4.setCardBackgroundColor(Color.WHITE);
        ca5.setCardBackgroundColor(Color.WHITE);
        ca6.setCardBackgroundColor(Color.WHITE);
        ca7.setCardBackgroundColor(Color.WHITE);
        ca8.setCardBackgroundColor(Color.WHITE);
        ca9.setCardBackgroundColor(Color.WHITE);
        ca10.setCardBackgroundColor(Color.WHITE);
        ca11.setCardBackgroundColor(Color.WHITE);
        ca12.setCardBackgroundColor(Color.WHITE);
    }
}
