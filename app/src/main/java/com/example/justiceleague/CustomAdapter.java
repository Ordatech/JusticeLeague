package com.example.justiceleague;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private ArrayList<DataModel> dataSet;

    public CustomAdapter( ArrayList<DataModel> dataSet) {

        this.dataSet = dataSet;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView textViewName, textViewDes;
        ImageView imageView;
        DataModel currentItem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.mCardView);
            textViewName = (TextView) itemView.findViewById(R.id.mHeroName);
            textViewDes = (TextView) itemView.findViewById(R.id.mHeroPrivateName);
            imageView = (ImageView) itemView.findViewById(R.id.mImageView);
        }
    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,
                parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        myViewHolder.currentItem = dataSet.get(viewType);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {

        TextView textViewName = holder.textViewName;
        TextView textViewPrivate = holder.textViewDes;
        ImageView imageView = holder.imageView;
        CardView cardView = holder.cardView;
        final int pos = position;
        textViewName.setText(dataSet.get(position).getHeroName());
        textViewPrivate.setText(dataSet.get(position).getHeroPrivateName());
        imageView.setImageResource(dataSet.get(position).getImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                intent.putExtra("heroPName", dataSet.get(pos).getHeroPrivateName());
                intent.putExtra("heroNName", dataSet.get(pos).getHeroName());
                intent.putExtra("heroDes", dataSet.get(pos).getDescription());
                intent.putExtra("imageView", dataSet.get(pos).getImage());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
