package com.example.practicech4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity2 extends AppCompatActivity {
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    Button next;
    int correctAnswers2=0;
    String CorrectAnswer="";
    public static final String EXTRA_COUNT2="com.example.practicech4.MainActivity2.extra.NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String count2=intent.getStringExtra(MainActivity.EXTRA_COUNT);
        if(!count2.equals(""))
        correctAnswers2=Integer.parseInt(count2);

        radioButton1=findViewById(R.id.radioButton);

        radioButton3=findViewById(R.id.radiobutton2);
        radioButton4=findViewById(R.id.radioButton3);
        radioButton2=findViewById(R.id.radioButton1);
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!count2.equals(""))
                    correctAnswers2=Integer.parseInt(count2);
                correctAnswers2++;

            }
        });
    }
    public void openActivity2(View view)
    {
        Intent intent=new Intent(this,MainActivity3.class);
        CorrectAnswer=String.valueOf(correctAnswers2);
        intent.putExtra(EXTRA_COUNT2,CorrectAnswer);
        startActivity(intent);

    }
}
