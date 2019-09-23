package com.example.itaykan.flightcenter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class FlightsDataAdapter extends ArrayAdapter<LandingData> {

        Context _context;
        int _layout;
        List<LandingData> _objects;

    public FlightsDataAdapter(Context context, int layout, List<LandingData> objects) {
        super(context, layout, objects);
        _context = context;
        _layout = layout;
        _objects = objects;
        }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("=============", "Get view for " + position);

        View result = convertView;

        if (result == null) {
            Log.d("=======", "Drawing " + position);
            result = LayoutInflater.from(_context).inflate(android.R.layout.simple_list_item_1,
                    parent, false);
        }
        TextView tv = result.findViewById(android.R.id.text1);
        tv.setText(_objects.get(position).toString());

        return result;

    }
}