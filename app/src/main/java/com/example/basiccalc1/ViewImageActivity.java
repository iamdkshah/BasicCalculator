package com.example.basiccalc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ViewImageActivity extends AppCompatActivity implements View.OnClickListener {


    RadioButton radioBtn1, radioBtn2, radioBtn3;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        radioBtn1 = findViewById(R.id.btnBird);
        radioBtn2 = findViewById(R.id.btnTiger);
        radioBtn3 = findViewById(R.id.btnSnake);
        imageView = findViewById(R.id.imageBird);

        radioBtn1.setOnClickListener(this);
        radioBtn2.setOnClickListener(this);
        radioBtn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnBird:
                imageView.setImageResource(R.drawable.bird);
                break;

            case R.id.btnTiger:
                imageView.setImageResource(R.drawable.tiger);
                break;

            case R.id.btnSnake:
                imageView.setImageResource(R.drawable.snake);
                break;
        }
    }
}
