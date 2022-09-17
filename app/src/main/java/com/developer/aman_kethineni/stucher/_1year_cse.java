package com.developer.aman_kethineni.stucher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class _1year_cse extends AppCompatActivity {

    ImageView backBtn,home_btn;
    Button secA,secB,secC,secD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1year_cse);


        backBtn = findViewById(R.id.back_arrow);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _1year_cse.super.onBackPressed();
            }
        });

        home_btn = findViewById(R.id.home_button);

        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(_1year_cse.this, Categories.class);
                startActivity(intent);
            }
        });


        secA = findViewById(R.id.secA);
        secA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(_1year_cse.this, pdf_1.class);
                startActivity(intent);

            }
        });



    }
}