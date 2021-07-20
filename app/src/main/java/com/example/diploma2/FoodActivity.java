package com.example.diploma2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class FoodActivity extends AppCompatActivity {
    ListView Food;
    FoodAdapter ADAhere;
    List<Food> MyData = null;
    EditText ET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Food = (ListView) findViewById(R.id.list_food);
        ET = (EditText) findViewById(R.id.serch_food);
        GetData mydata = new GetData();
        MyData = mydata.getFood();
        ADAhere = new FoodAdapter(FoodActivity.this, R.layout.food_activity, MyData);
        Food.setAdapter(ADAhere);
        Button Serch = (Button) findViewById(R.id.serch);
        Serch.setOnClickListener(v -> {
            MyData.clear();
            MyData.addAll(mydata.getFood(ET.getText().toString()));

        });
    }

}