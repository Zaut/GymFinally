package com.example.diploma2;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.List;

public class Adapter extends ArrayAdapter <MuscleGroups> {

    private int resourceLayout;
    private Context mContext;

    public Adapter(Context context, int resource, List<MuscleGroups> items) {
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

        MuscleGroups p = getItem(position);

        if (p != null) {
            Button tt1 = (Button) v.findViewById(R.id.btn_get);

            if (tt1 != null) {
                tt1.setText(p.name);
                tt1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i =new Intent(getContext(), ExerciseActivity.class);
                        i.putExtra("muscle_id", p.id);
                        i.putExtra("muscle_name", p.name);
                        //норм переделать
                        getContext().startActivity(i);
                    }
                });
            }
        }
        return v;
    }


}
