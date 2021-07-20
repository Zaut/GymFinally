package com.example.diploma2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Info extends AppCompatActivity {
    ExpandableListView expListView;
    ExpandableListAdapter expListAdapter;
    List<String> expListTitle;
    HashMap<String, List<String>> expListDetail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        expListView = (ExpandableListView) findViewById(R.id.expListView);
        expListDetail = ListData.loadData();

        expListTitle = new ArrayList<>(expListDetail.keySet());
        expListAdapter = new ListAdapterInfo(this, expListTitle, expListDetail);

        expListView.setAdapter(expListAdapter);

    }
}
