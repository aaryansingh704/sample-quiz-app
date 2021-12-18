package com.example.practicech4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button yes;
    Button no;int correctAnswers=0;
    String CorrectAnswer="";
    public static final String EXTRA_COUNT="com.example.practicech4.extra.NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correctAnswers=1;
                CorrectAnswer=String.valueOf(correctAnswers);
            }
        });
    }

    public void openActivity1(View view)
    {
        Intent intent=new Intent(this,MainActivity2.class);

        intent.putExtra(EXTRA_COUNT,CorrectAnswer);
        startActivity(intent);

    }


}
