package com.example.diploma2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ActivitiesAdapter extends ArrayAdapter<Activity> {

    private int resourceLayout;
    private Context mContext;

    public ActivitiesAdapter(Context context, int resource, List<Activity> items) {
        super(context, resource, items);
        this.resourceLayout = resource;
        this.mContext = context;
    }
    //формируем логику и разметку
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(mContext);
            v = vi.inflate(resourceLayout, null);
        }

        Activity p = getItem(position);

        if (p != null) {
            TextView tt1 = (TextView) v.findViewById(R.id.activity_title);
            TextView tt2 = (TextView) v.findViewById(R.id.activity_text);
            ImageView iv1 = (ImageView) v.findViewById(R.id.activity_photo);
            if (tt1 != null) {
                tt1.setText(p.activity_title);
            }
            if (tt2 != null) {
                tt2.setText(p.text_id);
            }
            if (iv1 != null) {
                Bitmap img = BitmapFactory.decodeByteArray(p.photo,0,p.photo.length);
                iv1.setImageBitmap(img);
            }
        }
        return v;
    }
}




