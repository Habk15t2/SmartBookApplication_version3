package com.example.pc.smartbookapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Test2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);

        Button Btn_submit = (Button)findViewById(R.id.btn_submit);
        Btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ScoreIntent = new Intent(Test2.this, Score.class);
                startActivity(ScoreIntent);
            }
        });
    }
}
