package com.example.pc.smartbookapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //tạo liên kết nhấn imagebutton chuyển sang layout beforetest
        ImageButton Imgbtn_book = (ImageButton)findViewById(R.id.imgbtn_book);
        Imgbtn_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BeforeTestIntent = new Intent(MainActivity.this, ListBook.class);
                startActivity(BeforeTestIntent);
            }
        });
        //tạo liên kết nhấn imagebutton chuyển sang layout beforetest
        ImageButton Imgbtn_test = (ImageButton)findViewById(R.id.imgbtn_test);
        Imgbtn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BeforeTestIntent = new Intent(MainActivity.this, BeforeTest.class);
                startActivity(BeforeTestIntent);
            }
        });
        //tạo liên kết nhấn imagebutton chuyển sang layout feedback
        ImageButton Imgbtn_feedback = (ImageButton)findViewById(R.id.imgbtn_feedback);
        Imgbtn_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BeforeTestIntent = new Intent(MainActivity.this, FeedBack.class);
                startActivity(BeforeTestIntent);
            }
        });
        //tạo liên kết nhấn imagebutton chuyển sang layout write
        Button Btn_Nhatki = (Button)findViewById(R.id.btn_Nhatki);
        Btn_Nhatki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BeforeTestIntent = new Intent(MainActivity.this, Write.class);
                startActivity(BeforeTestIntent);
            }
        });
    }
}
