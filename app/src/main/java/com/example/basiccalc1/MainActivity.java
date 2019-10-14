package com.example.basiccalc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText firstN,secondN;
    TextView viewResult;
    Button addB,subB,mulB,divB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //calling by id

            firstN = findViewById(R.id.firstNum);
            secondN = findViewById(R.id.secondNum);
            viewResult = findViewById(R.id.viewResult);
            addB = findViewById(R.id.btnAdd);
            subB = findViewById(R.id.btnSub);
            mulB = findViewById(R.id.btnMul);
            divB = findViewById(R.id.btnDiv);

        //event listener
            addB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int a = Integer.parseInt(firstN.getText().toString());
                    int b = Integer.parseInt(secondN.getText().toString());
                    int c = a+b;

                    viewResult.setText("Result is: "+String.valueOf(c));

                }
            });

            subB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int a = Integer.parseInt(firstN.getText().toString());
                    int b = Integer.parseInt(secondN.getText().toString());
                    int c = a-b;
                    viewResult.setText("Result is: "+String.valueOf(c));
                }
            });

        mulB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(firstN.getText().toString());
                int b = Integer.parseInt(secondN.getText().toString());
                int c = a*b;
                viewResult.setText("Result is: "+String.valueOf(c));
            }
        });

        divB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(firstN.getText().toString());
                int b = Integer.parseInt(secondN.getText().toString());
                int c = a/b;
                viewResult.setText("Result is: "+String.valueOf(c));
            }
        });

    }
}
