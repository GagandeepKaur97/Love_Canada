package com.gagan.love_canada;

import android.content.Context;
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
    private static final String TAG = "recyclerviewadapter";
    private ArrayList<String> mImagesNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private Context mContext;

    public recyclerviewadapter(ArrayList<String> mImagesNames, ArrayList<String> mImages, Context mContext) {
        this.mImagesNames = mImagesNames;
        this.mImages = mImages;
        this.mContext = mContext;
    }


    @Override
    public recyclerviewadapter.viewholder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.listattractions,parent,false);
        viewholder holder = new viewholder(view) ;
        return holder;

    }

    @Override
    public void onBindViewHolder( viewholder holder, final int position) {
        Log.d(TAG,"onBindViewHolder:called.");
        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);
        holder.imagename.setText(mImagesNames.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onClick:clicked on:"+ mImagesNames.get(position));
                Toast.makeText(mContext,mImagesNames.get(position),Toast.LENGTH_SHORT).show();

            }


        });

    }

    @Override
    public int getItemCount() {
        return mImagesNames.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        CircleImageView image;
        TextView imagename;
        ConstraintLayout parentLayout;

        public viewholder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imagename = itemView.findViewById(R.id.image_name);
            parentLayout = itemView.findViewById(R.id.parent);
        }
    }
}