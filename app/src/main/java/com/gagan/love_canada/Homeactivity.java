package com.gagan.love_canada;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "  initImageBitmaps:preparing bitmaps.");
        mImageUrls.add("https://media1.picsearch.com/is?kFbHfprJq4unGL6SXd6v5bL7JK_HozKD9cIoYo14VF4&height=161");
        mNames.add("Nigara Fall");

        mImageUrls.add("https://media4.picsearch.com/is?E9YZaJ4lwxO1RTHLeHbs7tNzuPYjQyTW3EeEpk6Z9A4&height=255");
        mNames.add("CN tower");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");

        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2017/08/Lake-Louise.jpg");
        mNames.add("lake louise");

        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2017/08/Whistler.jpg");
        mNames.add("whistler ski resort");

        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2017/08/Banff-National-Park2.jpg");
        mNames.add("banff national park");

        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2017/08/Stanley-Park-e1567324833962.jpg");
        mNames.add("stanley park");

        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2017/08/Butchart-Gardens.jpg");
        mNames.add("butchart gardens") ;
        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2019/11/Cape-Bretron.jpg");
        mNames.add("cape briton");
        //mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Forillon-National-Park.jpg");
       // mNames.add(" forllion national park");
        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Peggy%E2%80%99s-Cove.jpg");
        mNames.add("peggy cove");
        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Waterton-Lakes-National-Park.jpg");
        mNames.add("waterton lakes");
        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Capilano-Suspension-Bridge.jpg");
        mNames.add("capilano bridge");
        //mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Jasper-National-Park.jpg");
        //mNames.add("jasper national park");
        //mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2019/07/Prince_Edward_Island_3.jpg");
       // mNames.add("prince edward island");
        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2019/08/Parc-National-Du-Mont-Tremblant1.jpg");
        mNames.add(" mont tremblant");
        //mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Montmorency-Falls.jpg");
       // mNames.add("Montmorency-Falls");
        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Columbia-Icefield-Skywalk.jpg");
        mNames.add("icefield sktfield");
        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Mount-Logan.jpeg");
        mNames.add("mount logan");

        initRecyclerview();
    }
    private void initRecyclerview(){
        Log.d(TAG,"initRecyclerview:init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerviewadapter adapter = new recyclerviewadapter(this,mNames,mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}