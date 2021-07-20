package com.example.diploma2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button btnCalculator, btnExercise, btnFood, btnUsefulInfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculator = (Button) findViewById(R.id.btnCalculator);
        btnExercise =(Button) findViewById(R.id.btnExercise);
        btnFood =(Button) findViewById(R.id.btnFood);
        btnUsefulInfo =(Button) findViewById(R.id.btnUsefulInfo);

        btnCalculator.setOnClickListener(this);
        btnExercise.setOnClickListener(this);
        btnFood.setOnClickListener(this);
        btnUsefulInfo.setOnClickListener(this);

    }

        @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCalculator:
            Intent intent0 = new Intent(MainActivity.this, Calculator.class);
            startActivity(intent0);
            break;
            case R.id.btnExercise:
                Intent intent1 = new Intent(MainActivity.this, muscle_groups.class);
                startActivity(intent1);
                break;
           case R.id.btnFood:
                Intent intent2 = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(intent2);
                break;
            case R.id.btnUsefulInfo:
                Intent intent3 = new Intent(MainActivity.this, Info.class);
                startActivity(intent3);
                break;

            default:
                break;
        }
    }
}

