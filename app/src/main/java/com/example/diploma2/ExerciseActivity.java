package com.example.diploma2;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ExerciseActivity extends AppCompatActivity {
    ListView Muscle;
    ActivitiesAdapter ADAhere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_groups);

        TextView Tv = (TextView)findViewById(R.id.textView7);
        Tv.setText(getIntent().getStringExtra("muscle_name"));
        Muscle=(ListView)findViewById(R.id.Muscle);
        List<Activity> MyData = null;
        GetData mydata =new GetData();
        int muscle_id = getIntent().getIntExtra("muscle_id",'0');
        MyData = mydata.getActivities(muscle_id);
        ADAhere = new  ActivitiesAdapter(ExerciseActivity.this,R.layout.activity_list,MyData);

        Muscle.setAdapter(ADAhere);
    }

}
