package com.developer.aman_kethineni.stucher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class cse_menu extends AppCompatActivity {
    ImageView backBtn,home_btn;
    CircleMenu cir_cse_menu;
    ConstraintLayout constraint_cse;
    Button _1year_btn,_2year_btn,_3year_btn,_4year_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_menu);



        cir_cse_menu = findViewById(R.id.cir_menu_1year_cse);
        constraint_cse = findViewById(R.id.constraint_cse);

        cir_cse_menu.setMainMenu(Color.parseColor("#CDCDCD"),R.mipmap.roman_1,R.mipmap.roman_2)
                .addSubMenu(Color.parseColor("#258CFF"), R.mipmap.roman_1)
                .addSubMenu(Color.parseColor("#30A400"), R.mipmap.roman_2)
                .addSubMenu(Color.parseColor("#FF4B32"), R.mipmap.roman_3)
                .addSubMenu(Color.parseColor("#8A39FF"), R.mipmap.roman_4)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {

                        switch (index){

                            case 0:
                                Intent _1year_intent = new Intent(cse_menu.this,_1year_cse.class);
                                startActivity(_1year_intent);
                                break;



                        }





                    }
                });





        backBtn = findViewById(R.id.back_arrow);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cse_menu.super.onBackPressed();


            }
        });


        home_btn = findViewById(R.id.home_button);

        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse_menu.this, Categories.class);
                startActivity(intent);
            }
        });


        _1year_btn = findViewById(R.id._1year_btn);

        _1year_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent _1year_intent = new Intent(cse_menu.this,_1year_cse.class);
                startActivity(_1year_intent);
            }
        });

        _2year_btn = findViewById(R.id._2year_btn);

        _2year_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent _1year_intent = new Intent(cse_menu.this,_1year_cse.class);
                startActivity(_1year_intent);
            }
        });


        _3year_btn = findViewById(R.id._3year_btn);

        _3year_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent _1year_intent = new Intent(cse_menu.this,_1year_cse.class);
                startActivity(_1year_intent);
            }
        });

        _4year_btn = findViewById(R.id._4year_btn);

        _4year_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent _1year_intent = new Intent(cse_menu.this,_1year_cse.class);
                startActivity(_1year_intent);
            }
        });


    }
}