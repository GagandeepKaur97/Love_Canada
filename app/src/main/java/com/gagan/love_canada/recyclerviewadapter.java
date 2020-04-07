package com.gagan.love_canada;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class recyclerviewadapter extends RecyclerView.Adapter<recyclerviewadapter.viewholder> {


    ArrayList<canadadetails> canadaAttractionArrayList;
    private ArrayList<String> mImages = new ArrayList<>();
    private Context mContext;

    public recyclerviewadapter( Context mContext , ArrayList<String> mImages, ArrayList<canadadetails> canadaAttractionArrayList) {

        this.mImages = mImages;
        this.mContext = mContext;
        this.canadaAttractionArrayList = canadaAttractionArrayList;
    }


    @Override
    public recyclerviewadapter.viewholder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.listattractions,parent,false);
        viewholder holder = new viewholder(view) ;
        return holder;

    }

    @Override
    public void onBindViewHolder(final recyclerviewadapter.viewholder holder, final int position) {
        canadadetails c1 = this.canadaAttractionArrayList.get(position);
        holder.imagename.setText(c1.getplacename());

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                canadadetails c = canadaAttractionArrayList.get(position);
                Toast.makeText(holder.itemView.getContext(), "C : " + c.getplacename(), Toast.LENGTH_SHORT).show();
                Log.d("CLICK", "hello");

                Intent intent = new Intent(holder.itemView.getContext(),placedetails.class);
                  intent.putExtra("object",c);
                holder.itemView.getContext().startActivity(intent);

            }


        });

    }

    @Override
    public int getItemCount() {
        return canadaAttractionArrayList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        CircleImageView image;
        TextView imagename;


        public viewholder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imagename = itemView.findViewById(R.id.image_name);

        }
    }
}