package com.sanket.padaayi.ui.tests.tests;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.sanket.padaayi.MainActivity;
import com.sanket.padaayi.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2 extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12;
    Button b1;
    Integer score;
    List<String> checker;
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
    private List<Integer> cards_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        e1 = findViewById(R.id.an1);
        e2 = findViewById(R.id.an2);
        e3 = findViewById(R.id.an3);
        e4 = findViewById(R.id.an4);
        e5 = findViewById(R.id.an5);
        e6 = findViewById(R.id.an6);
        e7 = findViewById(R.id.an7);
        e8 = findViewById(R.id.an8);
        e9 = findViewById(R.id.an9);
        e10 = findViewById(R.id.an10);
        e11 = findViewById(R.id.an11);
        e12 = findViewById(R.id.an12);

        c1 = findViewById(R.id.cad1);
        c2 = findViewById(R.id.cad2);
        c3 = findViewById(R.id.cad3);
        c4 = findViewById(R.id.cad4);
        c5 = findViewById(R.id.cad5);
        c6 = findViewById(R.id.cad6);
        c7 = findViewById(R.id.cad7);
        c8 = findViewById(R.id.cad8);
        c9 = findViewById(R.id.cad9);
        c10 = findViewById(R.id.cad10);
        c11 = findViewById(R.id.cad11);
        c12 = findViewById(R.id.cad12);

        b1 = findViewById(R.id.sub1);
        checker = new ArrayList<>();
        cards_list = new ArrayList<>();
        allcards_invi();
        ques_display();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=0;
                checker = new ArrayList<>();
                setallcard();

                String ans1 = e1.getText().toString();
                String ans2 = e2.getText().toString();
                String ans3 = e3.getText().toString();
                String ans4 = e4.getText().toString();
                String ans5 = e5.getText().toString();
                String ans6 = e6.getText().toString();
                String ans7 = e7.getText().toString();
                String ans8 = e8.getText().toString();
                String ans9 = e9.getText().toString();
                String ans10 = e10.getText().toString();
                String ans11 = e11.getText().toString();
                String ans12 = e12.getText().toString();

                if (ans1.equals(getString(R.string.ansa1)))
                {
                    score+=2;
                }
                else
                {
                    checker.add(ans1);
                }

                if (ans2.equals(getString(R.string.ansa2)))
                {
                    score+=2;
                }
                else
                {
                    checker.add(ans2);
                }

                if (ans3.equals(getString(R.string.ansa3)))
                {
                    score+=2;
                }
                else
                {
                    checker.add(ans3);
                }

                if (ans4.equals(getString(R.string.ansa4)))
                {
                    score+=2;
                }
                else
                {
                    checker.add(ans4);
                }

                if (ans5.equals(getString(R.string.ansa5)))
                {
                    score+=2;
                }
                else
                {
                    checker.add(ans5);
                }
                if (ans6.equals(getString(R.string.ansa6)))
                {
                    score+=2;
                }
                else
                {
                    checker.add(ans6);
                }
                if (ans7.equals(getString(R.string.ansa7)))
                {
                    score+=2;
                }
                else
                {
                    checker.add(ans7);
                }
                if (ans8.equals(getString(R.string.ansa8)))
                {
                    score+=2;
                }
                else
                {
                    checker.add(ans8);
                }
                if (ans9.equals(getString(R.string.ansa9)))
                {
                    score+=2;
                }
                else
                {
                    checker.add(ans9);
                }
                if (ans10.equals(getString(R.string.ansa10)))
                {
                    score+=2;
                }
                else
                {
                    checker.add(ans10);
                }
                if (ans11.equals(getString(R.string.ansa11)))
                {
                    score+=2;
                }
                else
                {
                    checker.add(ans11);
                }
                if (ans12.equals(getString(R.string.ansa12)))
                {
                    score+=2;
                }
                else
                {
                    checker.add(ans12);
                }

                final AlertDialog.Builder alb1 = new AlertDialog.Builder(Test2.this);
                alb1.setTitle(R.string.result);
                if (score.equals(0)) {
                    alb1.setMessage(getString(R.string.your_marks) + "\n" + score + " / 6"+"\n"+"\"ध्याय उंच असले कि झेप देखील उंच घ्यावा लागते.\"");
                }
                if (score.equals(2)) {
                    alb1.setMessage(getString(R.string.your_marks) + "\n" + score + " / 6"+"\n"+"\"कोणतेही कार्य हे अडथळ्याशिवाय पार पडत नाही. शेवटपर्यंत जे प्रयत्न करीत राहतात त्यानांच यश प्राप्त होते.\"");
                }
                if (score.equals(4)) {
                    alb1.setMessage(getString(R.string.your_marks) + "\n" + score + " / 6"+"\n"+"\"विजेते वेगळ्या गोष्टी करत नाही ते प्रत्येक गोष्ट वेगळेपणाने करतात\"");
                }
                if (score.equals(6)) {
                    alb1.setMessage(getString(R.string.your_marks) + "\n" + score + " / 6"+"\n"+"\"समुद्रात किती लाटा आहेत\n" +
                            "हे महत्वाचा नसून…\n" +
                            "त्या किणा-याला किती स्पर्श\n" +
                            "करतात ते महत्वाचं असत.\"");
                }

                String positive_text;
                SharedPreferences sharedPreferences1 = getSharedPreferences("Test_Related", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor1 = sharedPreferences1.edit();

                editor1.commit();
                if (score<6){
                    positive_text = "चुका दुरुस्त करा";
                    if (checker.size() < 1) {}
                    else {
                        for (int i = 0; i < checker.size(); i++) {
                            if (checker.get(i).equals(ans1)) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(e1,getColor(R.color.error));
                                else
                                    setcolor(e1,R.color.error);
                            }
                            if (checker.get(i).equals(ans2)) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(e2,getColor(R.color.error));
                                else
                                    setcolor(e2,R.color.error);
                            }
                            if (checker.get(i).equals(ans3)) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(e3,getColor(R.color.error));
                                else
                                    setcolor(e3,R.color.error);
                            }
                            if (checker.get(i).equals(ans4)) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(e4,getColor(R.color.error));
                                else
                                    setcolor(e4,R.color.error);
                            }
                            if (checker.get(i).equals(ans5)) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(e5,getColor(R.color.error));
                                else
                                    setcolor(e5,R.color.error);
                            }
                            if (checker.get(i).equals(ans6)) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(e6,getColor(R.color.error));
                                else
                                    setcolor(e6,R.color.error);
                            }
                            if (checker.get(i).equals(ans7)) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(e7,getColor(R.color.error));
                                else
                                    setcolor(e7,R.color.error);
                            }
                            if (checker.get(i).equals(ans8)) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(e8,getColor(R.color.error));
                                else
                                    setcolor(e8,R.color.error);
                            }
                            if (checker.get(i).equals(ans9)) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(e9,getColor(R.color.error));
                                else
                                    setcolor(e9,R.color.error);
                            }
                            if (checker.get(i).equals(ans10)) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(e10,getColor(R.color.error));
                                else
                                    setcolor(e10,R.color.error);
                            }
                            if (checker.get(i).equals(ans11)) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(e11,getColor(R.color.error));
                                else
                                    setcolor(e11,R.color.error);
                            }
                            if (checker.get(i).equals(ans12)) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(e12,getColor(R.color.error));
                                else
                                    setcolor(e12,R.color.error);
                            }
                        }
                    }
                }
                else{
                    positive_text = "पुढे जा";
                    editor1.putString("level2","pass");
                    editor1.commit();
                }


                alb1.setCancelable(false);
                alb1.setPositiveButton(positive_text, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (score<6){
                            dialog.dismiss();
                        }
                        else{
                            startActivity(new Intent(Test2.this, MainActivity.class));
                        }
                    }
                });
                alb1.show();
            }
        });

    }

    private void setallcard() {
        setcolor(e1, Color.WHITE);
        setcolor(e2, Color.WHITE);
        setcolor(e3, Color.WHITE);
        setcolor(e4, Color.WHITE);
        setcolor(e5, Color.WHITE);
        setcolor(e6, Color.WHITE);
        setcolor(e7, Color.WHITE);
        setcolor(e8, Color.WHITE);
        setcolor(e9, Color.WHITE);
        setcolor(e10, Color.WHITE);
        setcolor(e11, Color.WHITE);
        setcolor(e12, Color.WHITE);
    }

    private void setcolor(EditText text, int color) {
        text.setBackgroundColor(color);
    }

    private void ques_display() {
        allcards_invi();
        cards_list = new ArrayList<>();
        cards_list.add(31);
        for (int i=0;i<3;i++) {
            randomizer();
        }
    }

    private void randomizer() {
        Random r = new Random();
        Integer choice = r.nextInt(13-1)+1;

        String flag = "0";

        for (int j = 0; j < cards_list.size(); j++) {
            if (cards_list.get(j).equals(choice))
            {
                flag ="1";
                randomizer();
            }
        }
        if (flag.equals("0")) {
            cards_list.add(choice);

            switch (choice){
                case 1:vis(c1);
                    setMargins(c1,(20*cards_list.size())-1);
                    break;

                case 2:vis(c2);
                    setMargins(c2,(20*cards_list.size())-1);
                    break;


                case 3:vis(c3);
                    setMargins(c3,(20*cards_list.size())-1);
                    break;

                case 4:vis(c4);
                    setMargins(c4,(20*cards_list.size())-1);
                    break;

                case 5:vis(c5);
                    setMargins(c5,(20*cards_list.size())-1);
                    break;

                case 6:vis(c6);
                    setMargins(c6,(20*cards_list.size())-1);
                    break;

                case 7:vis(c7);
                    setMargins(c7,(20*cards_list.size())-1);
                    break;


                case 8:vis(c8);
                    setMargins(c8,(20*cards_list.size())-1);
                    break;

                case 9:vis(c9);
                    setMargins(c9,(20*cards_list.size())-1);
                    break;

                case 10:vis(c10);
                    setMargins(c10,(20*cards_list.size())-1);
                    break;

                case 11:vis(c11);
                    setMargins(c11,(20*cards_list.size())-1);
                    break;

                case 12:vis(c12);
                    setMargins(c12,(20*cards_list.size())-1);
                    break;
            }
        }
    }

    private void allcards_invi() {
        invis(c1);
        invis(c2);
        invis(c3);
        invis(c4);
        invis(c5);
        invis(c6);
        invis(c7);
        invis(c8);
        invis(c9);
        invis(c10);
        invis(c11);
        invis(c12);
    }

    private void invis(CardView card) {
        card.setVisibility(View.GONE);
    }

    private void vis(CardView card) {
        card.setVisibility(View.VISIBLE);
    }

    private void setMargins (View view,int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0,top,0,0);
            view.requestLayout();
        }
    }
}
