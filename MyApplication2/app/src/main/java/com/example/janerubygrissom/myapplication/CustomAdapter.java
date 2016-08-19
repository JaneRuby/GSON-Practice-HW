package com.example.janerubygrissom.myapplication;

import com.squareup.picasso.Picasso;

/**
 * Created by janerubygrissom on 8/15/16.
 */
public class CustomAdapter {
    //TODO image view (with corresponding xml with image view)

    //picasso, items.get(something), load into imageview

    Picasso.with(this)
            .load(dataResultsArrayList)
            .into(imageView);
}
