package com.sanket.padaayi.ui.letters.LettersLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.sanket.padaayi.R;

public class ConsonantsLayout extends AppCompatActivity {

    String key;
    ImageView c1,c2,c3,c4,c5,c6;
    CardView ca1,ca2,ca3,ca4,ca5,ca6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consonants_layout);

        c1 = findViewById(R.id.cc1);
        c2 = findViewById(R.id.cc2);
        c3 = findViewById(R.id.cc3);
        c4 = findViewById(R.id.cc4);
        c5 = findViewById(R.id.cc5);
        c6 = findViewById(R.id.cc6);

        ca1 = findViewById(R.id.c1);
        ca2 = findViewById(R.id.c2);
        ca3 = findViewById(R.id.c3);
        ca4 = findViewById(R.id.c4);
        ca5 = findViewById(R.id.c5);
        ca6 = findViewById(R.id.c6);

        card_background();

        key = getIntent().getExtras().getString("key");


        if (key.substring(0,1).equals("क")){
            visibleall();
            c1.setImageResource(R.mipmap.k1);
            c2.setImageResource(R.mipmap.k2);
            c3.setImageResource(R.mipmap.k3);
            c4.setImageResource(R.mipmap.k4);
            c5.setImageResource(R.mipmap.k5);

            c1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca1);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.k1);
                    mp1.start();
                }
            });
            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca2);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.k2);
                    mp1.start();
                }
            });
            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca3);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.k3);
                    mp1.start();
                }
            });
            c4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca4);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.k4);
                    mp1.start();
                }
            });
            c5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca5);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.k5);
                    mp1.start();
                }
            });

        }

        if (key.substring(0,1).equals("च")){
            visibleall();
            c1.setImageResource(R.mipmap.c1);
            c2.setImageResource(R.mipmap.c2);
            c3.setImageResource(R.mipmap.c3);
            c4.setImageResource(R.mipmap.c4);
            c5.setImageResource(R.mipmap.c5);

            c1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca1);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.c1);
                    mp1.start();
                }
            });
            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca2);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.c2);
                    mp1.start();
                }
            });
            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca3);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.c3);
                    mp1.start();
                }
            });
            c4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca4);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.c4);
                    mp1.start();
                }
            });
            c5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca5);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.c5);
                    mp1.start();
                }
            });

        }

        if (key.substring(0,1).equals("ट")){
            visibleall();
            c1.setImageResource(R.mipmap.th1);
            c2.setImageResource(R.mipmap.th2);
            c3.setImageResource(R.mipmap.th3);
            c4.setImageResource(R.mipmap.th4);
            c5.setImageResource(R.mipmap.th5);

            c1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca1);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.th1);
                    mp1.start();
                }
            });
            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca2);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.th2);
                    mp1.start();
                }
            });
            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca3);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.th3);
                    mp1.start();
                }
            });
            c4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca4);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.th4);
                    mp1.start();
                }
            });
            c5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca5);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.th5);
                    mp1.start();
                }
            });
        }

        if (key.substring(0,1).equals("त")){
            visibleall();
            c1.setImageResource(R.mipmap.t1);
            c2.setImageResource(R.mipmap.t2);
            c3.setImageResource(R.mipmap.t3);
            c4.setImageResource(R.mipmap.t4);
            c5.setImageResource(R.mipmap.t5);

            c1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca1);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.t1);
                    mp1.start();
                }
            });
            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca2);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.t2);
                    mp1.start();
                }
            });
            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca3);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.t3);
                    mp1.start();
                }
            });
            c4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca4);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.t4);
                    mp1.start();
                }
            });
            c5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca5);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.t5);
                    mp1.start();
                }
            });
        }

        if (key.substring(0,1).equals("प")){
            visibleall();
            c1.setImageResource(R.mipmap.p1);
            c2.setImageResource(R.mipmap.p2);
            c3.setImageResource(R.mipmap.p3);
            c4.setImageResource(R.mipmap.p4);
            c5.setImageResource(R.mipmap.p5);

            c1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca1);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.p1);
                    mp1.start();
                }
            });
            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca2);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.p2);
                    mp1.start();
                }
            });
            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca3);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.p3);
                    mp1.start();
                }
            });
            c4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca4);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.p4);
                    mp1.start();
                }
            });
            c5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca5);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.p5);
                    mp1.start();
                }
            });
        }

        if (key.substring(0,1).equals("य")){
            visibleall();
            c1.setImageResource(R.mipmap.y1);
            c2.setImageResource(R.mipmap.y2);
            c3.setImageResource(R.mipmap.y3);
            c4.setImageResource(R.mipmap.y4);
            c5.setImageResource(R.mipmap.y5);

            c1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca1);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.y1);
                    mp1.start();
                }
            });
            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca2);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.y2);
                    mp1.start();
                }
            });
            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca3);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.y3);
                    mp1.start();
                }
            });
            c4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca4);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.y4);
                    mp1.start();
                }
            });
            c5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca5);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.y5);
                    mp1.start();
                }
            });
        }

        if (key.substring(0,1).equals("श")){
            visibleall1();
            c1.setImageResource(R.mipmap.sh1);
            c2.setImageResource(R.mipmap.sh2);
            c3.setImageResource(R.mipmap.sh3);
            c6.setImageResource(R.mipmap.sh4);

            c1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca1);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.sh1);
                    mp1.start();
                }
            });
            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca2);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.sh2);
                    mp1.start();
                }
            });
            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca3);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.sh3);
                    mp1.start();
                }
            });
            c6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setcard(ca6);
                    final MediaPlayer mp1 = MediaPlayer.create(ConsonantsLayout.this,R.raw.sh4);
                    mp1.start();
                }
            });

        }

    }

    private void visibleall() {
        vis(ca1);
        vis(ca2);
        vis(ca3);
        vis(ca4);
        vis(ca5);
        invis(ca6);

        vis(c1);
        vis(c2);
        vis(c3);
        vis(c4);
        vis(c5);
        invis(c6);

    }

    private void visibleall1() {
        vis(ca1);
        vis(ca2);
        vis(ca3);
        invis(ca4);
        invis(ca5);
        vis(ca6);

        vis(c1);
        vis(c2);
        vis(c3);
        invis(c4);
        invis(c5);
        vis(c6);

    }

    private void invis(ImageView view) {
        view.setVisibility(View.INVISIBLE);
    }

    private void vis(ImageView view) {
        view.setVisibility(View.VISIBLE);
    }

    private void vis(CardView view) {
        view.setVisibility(View.VISIBLE);
    }

    private void invis(CardView view) {
        view.setVisibility(View.INVISIBLE);
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
    }


}
