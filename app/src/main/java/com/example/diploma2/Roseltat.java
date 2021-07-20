package com.example.diploma2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.diploma2.databinding.ActivityRoseltatBinding;

public class Roseltat extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roseltat);
        int min = 23;
        int max = 30;
        TextView textView = (TextView) findViewById(R.id.roseltat);
        textView.setTextSize(23);
        textView.setTextColor(getColor(R.color.white));
        textView.setBackgroundColor(getColor(R.color.colorPrimaryDark));
        textView.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();

        if(arguments!=null){
            int your = arguments.getInt("your");
            int target = arguments.getInt("target");
            textView.setText("Минимальное на этот вес: " + your * min +"ккал" + "\nМаксимальный на этот вес: " + your * max +"ккал" +
                    "\nНа желаемый вес мин: " + target * min +"ккал" + "\nНа желаемый вес максимум" + target * max +"ккал");
            Button bt = (Button)findViewById(R.id.goMain);
            bt.setOnClickListener(v->{
                Intent intent = new Intent(Roseltat.this, MainActivity.class);
                startActivity(intent);
            });
        }

    }
}