package com.example.diploma2;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;


public class muscle_groups extends AppCompatActivity {
    ListView Muscle;
    Adapter ADAhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_groups);

        Muscle = (ListView) findViewById(R.id.Muscle);
        List<MuscleGroups> MyData = null;
        GetData mydata = new GetData();
        MyData = mydata.getGroups();
        ADAhere = new Adapter(muscle_groups.this, R.layout.listtemplate, MyData);
        Muscle.setAdapter(ADAhere);
    }
}