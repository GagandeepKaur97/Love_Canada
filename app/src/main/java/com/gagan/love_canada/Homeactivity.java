package com.gagan.love_canada;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class Homeactivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<canadadetails> Places;
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        initImageBitmaps();
        populatedcountries();
       initRecyclerview();

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homeactivity.this,placedetails.class);
                startActivity(intent);
            }
        });
    }

    private void initImageBitmaps() {

        mImageUrls.add("https://media1.picsearch.com/is?kFbHfprJq4unGL6SXd6v5bL7JK_HozKD9cIoYo14VF4&height=161");


        mImageUrls.add("https://media4.picsearch.com/is?E9YZaJ4lwxO1RTHLeHbs7tNzuPYjQyTW3EeEpk6Z9A4&height=255");


        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");


        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2017/08/Lake-Louise.jpg");


        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2017/08/Whistler.jpg");


        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2017/08/Banff-National-Park2.jpg");


        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2017/08/Stanley-Park-e1567324833962.jpg");


        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2017/08/Butchart-Gardens.jpg");

        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2019/11/Cape-Bretron.jpg");

        //mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Forillon-National-Park.jpg");
       // mNames.add(" forllion national park");
        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Peggy%E2%80%99s-Cove.jpg");

        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Waterton-Lakes-National-Park.jpg");
        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Capilano-Suspension-Bridge.jpg");

        //mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Jasper-National-Park.jpg");
        //mNames.add("jasper national park");
        //mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2019/07/Prince_Edward_Island_3.jpg");
       // mNames.add("prince edward island");
        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2019/08/Parc-National-Du-Mont-Tremblant1.jpg");

        //mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Montmorency-Falls.jpg");
       // mNames.add("Montmorency-Falls");
        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Columbia-Icefield-Skywalk.jpg");

        mImageUrls.add("https://img.traveltriangle.com/blog/wp-content/tr:w-700,h-400/uploads/2020/01/Mount-Logan.jpeg");



    }
    private void initRecyclerview(){

     RecyclerView recyclerView = findViewById(R.id.recyclerview);
     recyclerviewadapter adapter = new recyclerviewadapter(this,mImageUrls,Places);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void populatedcountries()
    {
        Places = new ArrayList<>();

        Places.add(new canadadetails(1,"Nigara Fall","6650 Niagara Parkway. (River Rd) Niagara Falls L2G 0L0","toronto","ontario",getString(R.string.Niagra)));

        Places.add(new canadadetails(2,"Cn tower","cn","toronto","ontario",getString(R.string.Cntower)));

        Places.add(new canadadetails(3,"trobheim","","toronto","ontario",getString(R.string.trondheim)));

        Places.add(new canadadetails(4,"Lake-Louise","near lake","alberta","alberta",getString(R.string.lakelouise)));

        Places.add(new canadadetails(5,"Whistler","near","t","british",getString(R.string.whistler)));

        Places.add(new canadadetails(6,"Banff-National","dvsvsvs","toronto","ontario",getString(R.string.banffnational)));

        Places.add(new canadadetails(7,"Stanley-Park","dvsvsvs","toronto","ontario",getString(R.string.stanleypark)));

        Places.add(new canadadetails(8,"Butchart","dvsvsvs","toronto","ontario",getString(R.string.butchart)));

        Places.add(new canadadetails(9,"Cape-Bretron","dvsvsvs","toronto","ontario",getString(R.string.CapeBretron)));

        Places.add(new canadadetails(10,"Peggy","dvsvsvs","toronto","ontario",getString(R.string.peggy)));

        Places.add(new canadadetails(11,"Waterton","dvsvsvs","toronto","ontario",getString(R.string.waterton)));

        Places.add(new canadadetails(12,"Capilano","dvsvsvs","toronto","ontario",getString(R.string.Capilano)));

        Places.add(new canadadetails(13,"Tremblant","dvsvsvs","toronto","ontario",getString(R.string.tremblant)));

        Places.add(new canadadetails(14,"Icefield-Skywalk","dvsvsvs","toronto","ontario",getString(R.string.IcefieldSkywalk)));

        Places.add(new canadadetails(15,"Mount-Logan","dvsvsvs","toronto","ontario",getString(R.string.MountLogan)));

    }

}