package com.example.thesportsapp;


/* This class is an adapter class: responsible for adapting a list of
    objects in a format RecyclerView can Display */

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportsViewHolder> {
    private List<Sport> sportList;

    public ItemClickListener clickListener;
    public CustomAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflating the layout for each item in the recyclerview

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item_layout, parent, false);

        return new SportsViewHolder(itemView);
    }

    public void setClickListener(ItemClickListener myListener) {
        this.clickListener = myListener;
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        // called for each item in the list and is responsible for
        // binding the data from the Sport object to the views
        // within the 'SportViewHolder'

        Sport sport = sportList.get(position);
        holder.textView.setText(sport.sportName);
        holder.imageView.setImageResource(sport.sportImg);
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public class SportsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // Holds the references to the views within the item layout
        TextView textView;
        ImageView imageView;

        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageViewCard);

            itemView.setOnClickListener(this);
        }

        @Override
        public  void onClick(View view) {
            if (clickListener != null) {
                clickListener.onClick(view, getAdapterPosition());
            }
        }
    }
}
