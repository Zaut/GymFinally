package com.example.diploma2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class FoodAdapter extends ArrayAdapter<Food> {

    private int resourceLayout;
    private Context mContext;

    public FoodAdapter(Context context, int resource, List<Food> items) {
        super(context, resource, items);
        this.resourceLayout = resource;
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(mContext);
            v = vi.inflate(resourceLayout, null);
        }

        Food p = getItem(position);

        if (p != null) {
            TextView tt1 = (TextView) v.findViewById(R.id.food_name);

            if (tt1 != null) {
                tt1.setText(p.name);
            }
            TextView tt2 = (TextView) v.findViewById(R.id.kcal);

            if (tt2 != null) {
                tt2.setText(p.kcal.toString());
            }
        }
        return v;
    }
}


