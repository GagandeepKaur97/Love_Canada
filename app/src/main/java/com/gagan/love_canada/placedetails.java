package com.gagan.love_canada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class placedetails extends AppCompatActivity {

    private TextView showDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placedetails);
        showDetails = findViewById(R.id.txtCanada);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

       canadadetails  place = (canadadetails) extras.getSerializable("object");

        showDetails.setText(place.getplaceid()+")"+place.getplacename()+"\nAddress: "+place.getAddress()+"\nCity: "+place.getCity()+"\nProvince: "+place.getProvince()+"\nDescripition:\n"+place.getDescription());
    }
}



