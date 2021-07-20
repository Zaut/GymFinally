package com.example.diploma2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


    }

    public void OnClick(View v) {
        EditText yourText = findViewById(R.id.your);
        EditText targetText = findViewById(R.id.target);

        int your = Integer.parseInt(yourText.getText().toString());
        int target = Integer.parseInt(targetText.getText().toString());


        Intent intent = new Intent(this, Roseltat.class);
        intent.putExtra("your", your);
        intent.putExtra("target", target);
        startActivity(intent);
    }
}