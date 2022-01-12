package com.sanket.padaayi.ui.tests;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.sanket.padaayi.R;
import com.sanket.padaayi.ui.tests.tests.Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestsFragment extends Fragment {

    private TestsViewModel testsViewModel;
    private EditText a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25;
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25;
    private List<String> checker;
    private Button submit;
    private Integer score;
    private List<Integer> cards_list;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        testsViewModel =
                ViewModelProviders.of(this).get(TestsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tests, container, false);

        checker = new ArrayList<>();
        cards_list = new ArrayList<>();
        a1 = root.findViewById(R.id.a1);
        a2 = root.findViewById(R.id.a2);
        a3 = root.findViewById(R.id.a3);
        a4 = root.findViewById(R.id.a4);
        a5 = root.findViewById(R.id.a5);
        a6 = root.findViewById(R.id.a6);
        a7 = root.findViewById(R.id.a7);
        a8 = root.findViewById(R.id.a8);
        a9 = root.findViewById(R.id.a9);
        a10 = root.findViewById(R.id.a10);
        a11 = root.findViewById(R.id.a11);
        a12 = root.findViewById(R.id.a12);
        a13 = root.findViewById(R.id.a13);
        a14 = root.findViewById(R.id.a14);
        a15 = root.findViewById(R.id.a15);
        a16 = root.findViewById(R.id.a16);
        a17 = root.findViewById(R.id.a17);
        a18 = root.findViewById(R.id.a18);
        a19 = root.findViewById(R.id.a19);
        a20 = root.findViewById(R.id.a20);
        a21 = root.findViewById(R.id.a21);
        a22 = root.findViewById(R.id.a22);
        a23 = root.findViewById(R.id.a23);
        a24 = root.findViewById(R.id.a24);
        a25 = root.findViewById(R.id.a25);

        c1 = root.findViewById(R.id.ca1);
        c2 = root.findViewById(R.id.ca2);
        c3 = root.findViewById(R.id.ca3);
        c4 = root.findViewById(R.id.ca4);
        c5 = root.findViewById(R.id.ca5);
        c6 = root.findViewById(R.id.ca6);
        c7 = root.findViewById(R.id.ca7);
        c8 = root.findViewById(R.id.ca8);
        c9 = root.findViewById(R.id.ca9);
        c10 = root.findViewById(R.id.ca10);
        c11 = root.findViewById(R.id.ca11);
        c12 = root.findViewById(R.id.ca12);
        c13 = root.findViewById(R.id.ca13);
        c14 = root.findViewById(R.id.ca14);
        c15 = root.findViewById(R.id.ca15);
        c16 = root.findViewById(R.id.ca16);
        c17 = root.findViewById(R.id.ca17);
        c18 = root.findViewById(R.id.ca18);
        c19 = root.findViewById(R.id.ca19);
        c20 = root.findViewById(R.id.ca20);
        c21 = root.findViewById(R.id.ca21);
        c22 = root.findViewById(R.id.ca22);
        c23 = root.findViewById(R.id.ca23);
        c24 = root.findViewById(R.id.ca24);
        c25 = root.findViewById(R.id.ca25);

        submit = root.findViewById(R.id.sub_button1);
        allcards_invi();
        ques_display();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                checker = new ArrayList<>();

                setallcard();

                String ans1 = a1.getText().toString();
                String ans2 = a2.getText().toString();
                String ans3 = a3.getText().toString();
                String ans4 = a4.getText().toString();
                String ans5 = a5.getText().toString();
                String ans6 = a6.getText().toString();
                String ans7 = a7.getText().toString();
                String ans8 = a8.getText().toString();
                String ans9 = a9.getText().toString();
                String ans10 = a10.getText().toString();
                String ans11 = a11.getText().toString();
                String ans12 = a12.getText().toString();
                String ans13 = a13.getText().toString();
                String ans14 = a14.getText().toString();
                String ans15 = a15.getText().toString();
                String ans16 = a16.getText().toString();
                String ans17 = a17.getText().toString();
                String ans18 = a18.getText().toString();
                String ans19 = a19.getText().toString();
                String ans20 = a20.getText().toString();
                String ans21 = a21.getText().toString();
                String ans22 = a22.getText().toString();
                String ans23 = a23.getText().toString();
                String ans24 = a24.getText().toString();
                String ans25 = a25.getText().toString();

                if (ans1.equals(getString(R.string.ans1)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans1);
                }

                if (ans2.equals(getString(R.string.ans2)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans2);
                }

                if (ans3.equals(getString(R.string.ans3)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans3);
                }

                if (ans4.equals(getString(R.string.ans4)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans4);
                }

                if (ans5.equals(getString(R.string.ans5)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans5);
                }

                if (ans6.equals(getString(R.string.ans6)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans6);
                }


                if (ans7.equals(getString(R.string.ans7)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans7);
                }

                if (ans8.equals(getString(R.string.ans8)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans8);
                }

                if (ans9.equals(getString(R.string.ans9)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans9);
                }


                if (ans10.equals(getString(R.string.ans10)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans10);
                }

                if (ans11.equals(getString(R.string.ans11)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans11);
                }

                if (ans12.equals(getString(R.string.ans12)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans12);
                }

                if (ans13.equals(getString(R.string.ans13)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans13);
                }

                if (ans14.equals(getString(R.string.ans14)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans14);
                }

                if (ans15.equals(getString(R.string.ans15)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans15);
                }

                if (ans16.equals(getString(R.string.ans16)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans16);
                }


                if (ans17.equals(getString(R.string.ans17)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans17);
                }

                if (ans18.equals(getString(R.string.ans18)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans18);
                }

                if (ans19.equals(getString(R.string.ans19)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans19);
                }


                if (ans20.equals(getString(R.string.ans20)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans20);
                }
                if (ans21.equals(getString(R.string.ans21)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans21);
                }


                if (ans22.equals(getString(R.string.ans22)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans22);
                }

                if (ans23.equals(getString(R.string.ans23)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans23);
                }

                if (ans24.equals(getString(R.string.ans24)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans24);
                }


                if (ans25.equals(getString(R.string.ans25)))
                {
                    score+=1;
                }
                else
                {
                    checker.add(ans25);
                }

                final AlertDialog.Builder alb1 = new AlertDialog.Builder(getActivity());
                alb1.setTitle(R.string.result);
                if (score.equals(0)) {
                    alb1.setMessage(getString(R.string.your_marks)+"\n"+score+" / 5"+"\n"+"\"कठीण काळात सतत स्वतःला सांगा,\n" +
                            "शर्यत अजून संपलेली नाही,\n" +
                            "कारण मी अजून जिंकलेलो नाही.\"");
                }
                if (score.equals(1)) {
                    alb1.setMessage(getString(R.string.your_marks)+"\n"+score+" / 5"+"\n"+"\"ज्याच्याजवळ उमेद आहे तो कधीही हरू शकत नाही.\"");
                }
                if (score.equals(2)) {
                    alb1.setMessage(getString(R.string.your_marks)+"\n"+score+" / 5"+"\n"+"\"समजवण्यापेक्षा समजून घेण्यामध्ये खरी परीक्षा असते, कारण समजवण्यासाठी अनुभवाचा कस लागतो, तर समजून घेण्यासाठी मनाचा मोठेपणा लागतो.\"");
                }
                if (score.equals(3)) {
                    alb1.setMessage(getString(R.string.your_marks)+"\n"+score+" / 5"+"\n"+"\"आज मी निदान एक पाऊल पुढे टाकीन, निदान एक काम पूर्ण करीन, निदान एक अडथळा ओलांडिन, निदान प्रयत्न तरी करीनच करीन.\"");
                }
                if (score.equals(4)) {
                    alb1.setMessage(getString(R.string.your_marks)+"\n"+score+" / 5"+"\n"+"\"नेहमी तुमचे सर्वोत्तम प्रयत्न करा आणि हे करून देखील ते तुमची कदर करत नसतील तर तो त्यांचा दोष आहे तुमचा नाही.\"");
                }
                if (score.equals(5)) {
                    alb1.setMessage(getString(R.string.your_marks)+"\n"+score+" / 5"+"\n"+"\"स्वतः चा विकास करा, लक्षात ठेवा, गती आणि वाढ हीच जिवंतपणाचे लक्षण आहेत.\"");
                }
                String positive_text;
                SharedPreferences sharedPreferences1 = getActivity().getSharedPreferences("Test_Related", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor1 = sharedPreferences1.edit();

                if (score<5){
                    positive_text = "चुका दुरुस्त करा";

                    if (checker.size() < 1) {}
                    else{
                        for (int i=0;i<checker.size();i++){
                            if (checker.get(i).equals(ans1))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a1,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a1,R.color.error);
                            }
                            if (checker.get(i).equals(ans2))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a2,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a2,R.color.error);
                            }
                            if (checker.get(i).equals(ans3))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a3,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a3,R.color.error);
                            }
                            if (checker.get(i).equals(ans4))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a4,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a4,R.color.error);
                            }
                            if (checker.get(i).equals(ans5))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a5,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a5,R.color.error);
                            }
                            if (checker.get(i).equals(ans6))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a6,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a6,R.color.error);
                            }
                            if (checker.get(i).equals(ans7))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a7,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a7,R.color.error);
                            }
                            if (checker.get(i).equals(ans8))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a8,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a8,R.color.error);
                            }
                            if (checker.get(i).equals(ans9))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a9,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a9,R.color.error);
                            }
                            if (checker.get(i).equals(ans10))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a10,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a10,R.color.error);
                            }
                            if (checker.get(i).equals(ans11))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a11,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a11,R.color.error);
                            }
                            if (checker.get(i).equals(ans12))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a12,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a12,R.color.error);
                            }
                            if (checker.get(i).equals(ans13))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a13,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a13,R.color.error);
                            }
                            if (checker.get(i).equals(ans14))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a14,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a14,R.color.error);
                            }
                            if (checker.get(i).equals(ans15))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a15,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a15,R.color.error);
                            }
                            if (checker.get(i).equals(ans16))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a16,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a16,R.color.error);
                            }
                            if (checker.get(i).equals(ans17))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a17,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a17,R.color.error);
                            }
                            if (checker.get(i).equals(ans18))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a18,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a18,R.color.error);
                            }
                            if (checker.get(i).equals(ans19))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a19,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a19,R.color.error);
                            }
                            if (checker.get(i).equals(ans20))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a20,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a20,R.color.error);
                            }
                            if (checker.get(i).equals(ans21))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a21,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a21,R.color.error);
                            }
                            if (checker.get(i).equals(ans22))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a22,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a22,R.color.error);
                            }
                            if (checker.get(i).equals(ans23))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a23,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a23,R.color.error);
                            }
                            if (checker.get(i).equals(ans24))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a24,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a24,R.color.error);
                            }
                            if (checker.get(i).equals(ans25))
                            {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                    setcolor(a25,getActivity().getColor(R.color.error));
                                else
                                    setcolor(a25,R.color.error);
                            }

                        }
                    }
                }
                else{
                    positive_text = "पुढे जा";
                    editor1.putString("level1","pass");
                    editor1.commit();
                }


                alb1.setCancelable(false);
                alb1.setPositiveButton(positive_text, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (score<5){
                            dialog.dismiss();
                        }
                        else{
                            startActivity(new Intent(getActivity(), Test2.class));
                        }
                    }
                });
                alb1.show();
            }
        });

        return root;
    }

    private void ques_display() {
        allcards_invi();
        cards_list = new ArrayList<>();
        cards_list.add(31);
        for (int i=0;i<5;i++) {
            randomizer();
        }
    }

    private void randomizer() {
        Random r = new Random();
        Integer choice = r.nextInt(26-1)+1;

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


                case 13:vis(c13);
                    setMargins(c13,(20*cards_list.size())-1);
                    break;

                case 14:vis(c14);
                    setMargins(c14,(20*cards_list.size())-1);
                    break;

                case 15:vis(c15);
                    setMargins(c15,(20*cards_list.size())-1);
                    break;

                case 16:vis(c16);
                    setMargins(c16,(20*cards_list.size())-1);
                    break;

                case 17:vis(c17);
                    setMargins(c17,(20*cards_list.size())-1);
                    break;

                case 18:vis(c18);
                    setMargins(c18,(20*cards_list.size())-1);
                    break;

                case 19:vis(c19);
                    setMargins(c19,(20*cards_list.size())-1);
                    break;

                case 20:vis(c20);
                    setMargins(c20,(20*cards_list.size())-1);
                    break;

                case 21:vis(c21);
                    setMargins(c21,(20*cards_list.size())-1);
                    break;

                case 22:vis(c22);
                    setMargins(c22,(20*cards_list.size())-1);
                    break;


                case 23:vis(c23);
                    setMargins(c23,(20*cards_list.size())-1);
                    break;

                case 24:vis(c24);
                    setMargins(c24,(20*cards_list.size())-1);
                    break;

                case 25:vis(c25);
                    setMargins(c25,(20*cards_list.size())-1);
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
        invis(c13);
        invis(c14);
        invis(c15);
        invis(c16);
        invis(c17);
        invis(c18);
        invis(c19);
        invis(c20);
        invis(c21);
        invis(c22);
        invis(c23);
        invis(c24);
        invis(c25);
    }

    private void invis(CardView card) {
        card.setVisibility(View.GONE);
    }

    private void vis(CardView card) {
        card.setVisibility(View.VISIBLE);
    }

    private void setallcard() {
        setcolor(a1, Color.WHITE);
        setcolor(a2, Color.WHITE);
        setcolor(a3, Color.WHITE);
        setcolor(a4, Color.WHITE);
        setcolor(a5, Color.WHITE);
        setcolor(a6, Color.WHITE);
        setcolor(a7, Color.WHITE);
        setcolor(a8, Color.WHITE);
        setcolor(a9, Color.WHITE);
        setcolor(a10, Color.WHITE);
        setcolor(a11, Color.WHITE);
        setcolor(a12, Color.WHITE);
        setcolor(a13, Color.WHITE);
        setcolor(a14, Color.WHITE);
        setcolor(a15, Color.WHITE);
        setcolor(a16, Color.WHITE);
        setcolor(a17, Color.WHITE);
        setcolor(a18, Color.WHITE);
        setcolor(a19, Color.WHITE);
        setcolor(a20, Color.WHITE);
        setcolor(a21, Color.WHITE);
        setcolor(a22, Color.WHITE);
        setcolor(a23, Color.WHITE);
        setcolor(a24, Color.WHITE);
        setcolor(a25, Color.WHITE);
    }

    private void setcolor(EditText text, int color) {
        text.setBackgroundColor(color);
    }

    private void setMargins (View view,int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0,top,0,0);
            view.requestLayout();
        }
    }

}