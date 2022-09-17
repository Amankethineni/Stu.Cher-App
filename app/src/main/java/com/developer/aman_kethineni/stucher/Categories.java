package com.developer.aman_kethineni.stucher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;



public class Categories extends AppCompatActivity {
    ImageView backBtn,syllabus_transition,cse_transition,home_btn;
    Button expand_btn1,expand_btn2,expand_btn3,expand_btn4,expand_btn5,expand_btn6;
    Button expand_btn21,expand_btn22,expand_btn23,expand_btn24,expand_btn25,expand_btn26;
    Button expand_btn31,expand_btn32,expand_btn33,expand_btn34,expand_btn35,expand_btn36;
    Button expand_btn41,expand_btn42,expand_btn43,expand_btn44,expand_btn45,expand_btn46;
    Button expand_btn51,expand_btn52,expand_btn53,expand_btn54,expand_btn55,expand_btn56;
    RelativeLayout pic_layout,pic_layout2,pic_layout3,pic_layout4,pic_layout5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_categories);



        expand_btn1=findViewById(R.id.expand_btn1);
        expand_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cse_intent = new Intent(Categories.this, cse_menu.class);

                startActivity(cse_intent);
            }
        });


        backBtn = findViewById(R.id.back_arrow);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Categories.super.onBackPressed();
            }
        });

        home_btn = findViewById(R.id.home_button);

        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Categories.this, Categories.class);
                startActivity(intent);
            }
        });



    }

    public void expand(View view) {

        expand_btn1 = findViewById(R.id.expand_btn1);
        pic_layout = findViewById(R.id.pic_layout);

        int v1 = (expand_btn1.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout, new AutoTransition());
        expand_btn1.setVisibility(v1);



        expand_btn2 = findViewById(R.id.expand_btn2);
        pic_layout = findViewById(R.id.pic_layout);

        int v2 = (expand_btn2.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout, new AutoTransition());
        expand_btn2.setVisibility(v2);



        expand_btn3 = findViewById(R.id.expand_btn3);
        pic_layout = findViewById(R.id.pic_layout);


        int v3 = (expand_btn3.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout, new AutoTransition());
        expand_btn3.setVisibility(v3);


        expand_btn4 = findViewById(R.id.expand_btn4);
        pic_layout = findViewById(R.id.pic_layout);


        int v4 = (expand_btn4.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout, new AutoTransition());
        expand_btn4.setVisibility(v4);


        expand_btn5 = findViewById(R.id.expand_btn5);
        pic_layout = findViewById(R.id.pic_layout);


        int v5 = (expand_btn5.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout, new AutoTransition());
        expand_btn5.setVisibility(v5);


        expand_btn6 = findViewById(R.id.expand_btn6);
        pic_layout = findViewById(R.id.pic_layout);


        int v6 = (expand_btn6.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout, new AutoTransition());
        expand_btn6.setVisibility(v6);




    }
    public void expand2(View view) {

        expand_btn21 = findViewById(R.id.expand_btn21);
        pic_layout2 = findViewById(R.id.pic_layout2);

        int v1 = (expand_btn21.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout2, new AutoTransition());
        expand_btn21.setVisibility(v1);



        expand_btn22 = findViewById(R.id.expand_btn22);
        pic_layout2 = findViewById(R.id.pic_layout2);

        int v2 = (expand_btn22.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout2, new AutoTransition());
        expand_btn22.setVisibility(v2);



        expand_btn23 = findViewById(R.id.expand_btn23);
        pic_layout2 = findViewById(R.id.pic_layout2);


        int v3 = (expand_btn23.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout2, new AutoTransition());
        expand_btn23.setVisibility(v3);


        expand_btn24 = findViewById(R.id.expand_btn24);
        pic_layout2 = findViewById(R.id.pic_layout2);


        int v4 = (expand_btn24.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout2, new AutoTransition());
        expand_btn24.setVisibility(v4);


        expand_btn25 = findViewById(R.id.expand_btn25);
        pic_layout2 = findViewById(R.id.pic_layout2);


        int v5 = (expand_btn25.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout2, new AutoTransition());
        expand_btn25.setVisibility(v5);


        expand_btn26 = findViewById(R.id.expand_btn26);
        pic_layout2 = findViewById(R.id.pic_layout2);


        int v6 = (expand_btn26.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout2, new AutoTransition());
        expand_btn26.setVisibility(v6);




    }
    public void expand3(View view) {

        expand_btn31 = findViewById(R.id.expand_btn31);
        pic_layout3 = findViewById(R.id.pic_layout3);

        int v1 = (expand_btn31.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout3, new AutoTransition());
        expand_btn31.setVisibility(v1);



        expand_btn32 = findViewById(R.id.expand_btn32);
        pic_layout3 = findViewById(R.id.pic_layout3);

        int v2 = (expand_btn32.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout3, new AutoTransition());
        expand_btn32.setVisibility(v2);



        expand_btn33 = findViewById(R.id.expand_btn33);
        pic_layout3 = findViewById(R.id.pic_layout3);


        int v3 = (expand_btn33.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout3, new AutoTransition());
        expand_btn33.setVisibility(v3);


        expand_btn34 = findViewById(R.id.expand_btn34);
        pic_layout3 = findViewById(R.id.pic_layout3);


        int v4 = (expand_btn34.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout3, new AutoTransition());
        expand_btn34.setVisibility(v4);


        expand_btn35 = findViewById(R.id.expand_btn35);
        pic_layout3 = findViewById(R.id.pic_layout3);


        int v5 = (expand_btn35.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout3, new AutoTransition());
        expand_btn35.setVisibility(v5);


        expand_btn36 = findViewById(R.id.expand_btn36);
        pic_layout3 = findViewById(R.id.pic_layout3);


        int v6 = (expand_btn36.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout3, new AutoTransition());
        expand_btn36.setVisibility(v6);




    }
    public void expand4(View view) {

        expand_btn41 = findViewById(R.id.expand_btn41);
        pic_layout4 = findViewById(R.id.pic_layout4);

        int v1 = (expand_btn41.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout4, new AutoTransition());
        expand_btn41.setVisibility(v1);



        expand_btn42 = findViewById(R.id.expand_btn42);
        pic_layout4 = findViewById(R.id.pic_layout4);

        int v2 = (expand_btn42.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout4, new AutoTransition());
        expand_btn42.setVisibility(v2);



        expand_btn43 = findViewById(R.id.expand_btn43);
        pic_layout4 = findViewById(R.id.pic_layout4);


        int v3 = (expand_btn43.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout4, new AutoTransition());
        expand_btn43.setVisibility(v3);


        expand_btn44 = findViewById(R.id.expand_btn44);
        pic_layout4 = findViewById(R.id.pic_layout4);


        int v4 = (expand_btn44.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout4, new AutoTransition());
        expand_btn44.setVisibility(v4);


        expand_btn45 = findViewById(R.id.expand_btn25);
        pic_layout4 = findViewById(R.id.pic_layout4);


        int v5 = (expand_btn45.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout4, new AutoTransition());
        expand_btn45.setVisibility(v5);


        expand_btn46 = findViewById(R.id.expand_btn46);
        pic_layout4 = findViewById(R.id.pic_layout4);


        int v6 = (expand_btn46.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout4, new AutoTransition());
        expand_btn46.setVisibility(v6);




    }
    public void expand5(View view) {

        expand_btn51 = findViewById(R.id.expand_btn51);
        pic_layout5 = findViewById(R.id.pic_layout5);

        int v1 = (expand_btn51.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout5, new AutoTransition());
        expand_btn51.setVisibility(v1);



        expand_btn52 = findViewById(R.id.expand_btn52);
        pic_layout5 = findViewById(R.id.pic_layout5);

        int v2 = (expand_btn52.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout5, new AutoTransition());
        expand_btn52.setVisibility(v2);



        expand_btn53 = findViewById(R.id.expand_btn53);
        pic_layout5 = findViewById(R.id.pic_layout5);


        int v3 = (expand_btn53.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout5, new AutoTransition());
        expand_btn53.setVisibility(v3);


        expand_btn54 = findViewById(R.id.expand_btn54);
        pic_layout5 = findViewById(R.id.pic_layout5);


        int v4 = (expand_btn54.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout5, new AutoTransition());
        expand_btn54.setVisibility(v4);


        expand_btn55 = findViewById(R.id.expand_btn55);
        pic_layout5 = findViewById(R.id.pic_layout5);


        int v5 = (expand_btn55.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout5, new AutoTransition());
        expand_btn55.setVisibility(v5);


        expand_btn56 = findViewById(R.id.expand_btn56);
        pic_layout5 = findViewById(R.id.pic_layout5);


        int v6 = (expand_btn56.getVisibility() == View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(pic_layout5, new AutoTransition());
        expand_btn56.setVisibility(v6);




    }


}