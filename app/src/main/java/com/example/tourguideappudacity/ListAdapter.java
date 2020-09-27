package com.example.tourguideappudacity;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Location> {
    private int mColorResourceId;


    public ListAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Location location=getItem(position);
        View listItem=convertView;
        if(listItem==null){
            listItem= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        TextView name = (TextView) listItem.findViewById(R.id.name);
        name.setText(location.getName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView description = (TextView) listItem.findViewById(R.id.description);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        description.setText(location.getDescription());
        ImageView imageView = (ImageView) listItem.findViewById(R.id.image);
        if (location.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(location.getImgId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
             Glide.with(imageView)
                        .load(location.getImgId())
                        .override(1500,1000)
                        .fitCenter()
                        .into(imageView);

        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        return listItem;
    }
}