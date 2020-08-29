package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue,etSecondValue;
    TextView ansShow;
    Button add,sub,multiply,divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        ansShow = findViewById(R.id.ansShow);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue,secondValue,ans;
                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue+secondValue;
                ansShow.setText(ans);



            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue,secondValue,ans;
                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue - secondValue;
                ansShow.setText(ans);



            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue,secondValue,ans;
                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue * secondValue;
                ansShow.setText(ans);//setText(ans);



            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue,secondValue,ans;
                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue / secondValue;
                ansShow.setText(ans);



            }
        });


    }
}