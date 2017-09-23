package com.example.pc.smartbookapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);
        //tạo liên kết nhấn button Other test để chuyển từ layout Score sang layout before_test
        Button Btn_otherTest = (Button)findViewById(R.id.btn_OtherTest);
        Btn_otherTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BeforeTestIntent =new Intent(Score.this, BeforeTest.class);
                startActivity(BeforeTestIntent);
            }
        });
    }
}
