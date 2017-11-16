package com.learning.jegern.changeactivity;

import android.content.Context;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jegern on 08.11.2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    Context mContext;
    int mLayoutResourceId;
    Place mData[] = null;


    public PlaceAdapter(Context context, int resource, Place[] objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mLayoutResourceId = resource;
        this.mData = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        Placeholder holder = null;
        System.out.println("First " +row);

        if(row == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            row = inflater.inflate(mLayoutResourceId, parent, false);

            holder = new Placeholder();

            holder.imageView = (ImageView)row.findViewById(R.id.imageView);
            holder.nameView = (TextView)row.findViewById(R.id.nameTextView);
            holder.zipView = (TextView)row.findViewById(R.id.zipcodeTextView);

            row.setTag(holder);
            System.out.println("Second " + row);
        }else{
            //Otherwise use the existing one
            holder = (Placeholder) row.getTag();
            System.out.println("Else " + row);
        }


        //Getting the data
        Place place = mData[position];

        //Setting view to reflect the data we need to display
        holder.nameView.setText(place.mNameOfPlace);
        holder.zipView.setText(String.valueOf(place.mZipCode));
        //Getting image
        int resID = mContext.getResources().getIdentifier(place.nNameOfImage, "drawable", mContext.getPackageName());
        holder.imageView.setImageResource(resID);


        //Returning the row
        return row;

    }

    @Override
    public Place getItem(int position) {
        return super.getItem(position);
    }

    private static class Placeholder    {
        ImageView imageView;
        TextView nameView;
        TextView zipView;
    }
}
