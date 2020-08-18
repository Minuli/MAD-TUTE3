package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;

    String number1;
    String number2;

    int n1,n2;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        ans=findViewById(R.id.ans);
        Intent intent=getIntent();

        number1=intent.getStringExtra("num1");
        number2=intent.getStringExtra("num2");

        num1.setText(number1);
        num2.setText(number2);

        n1=Integer.parseInt(number1);
        n2=Integer.parseInt(number2);

    }

    public void add(View view){
        ans.setText(number1+" + "+number2+"="+(n1+n2));
    }

    public void sub(View view){
        ans.setText(number1+" - "+number2+"="+(n1-n2));
    }

    public void mul(View view){
        ans.setText(number1+" * "+number2+"="+(n1*n2));
    }

    public void div(View view){
        ans.setText(number1+" / "+number2+"="+(n1/n2));
    }
}