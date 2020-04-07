package com.gagan.love_canada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class Homeactivity extends AppCompatActivity {
    private static final String TAG = "Homeactivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        Log.d(TAG, "onCreate :Started.");
    }

    private void initImageBitmaps() {
        Log.d(TAG, "  initImageBitmaps:preparing bitmaps.");
        mImageUrls.add("https://media1.picsearch.com/is?kFbHfprJq4unGL6SXd6v5bL7JK_HozKD9cIoYo14VF4&height=161");
        mNames.add("Nigara Fall");

        mImageUrls.add("https://media4.picsearch.com/is?E9YZaJ4lwxO1RTHLeHbs7tNzuPYjQyTW3EeEpk6Z9A4&height=255");
        mNames.add("CN tower");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");
    }
}