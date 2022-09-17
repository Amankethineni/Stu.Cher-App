package com.developer.aman_kethineni.stucher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdf_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf1);


        PDFView pdf_1=findViewById(R.id.pdf_1);

        pdf_1.fromAsset("pdf_2").load();
    }

}