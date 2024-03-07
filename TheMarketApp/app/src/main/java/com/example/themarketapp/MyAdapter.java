package com.example.themarketapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Item> itemList;

    public ItemClickListener clickListener;

    public MyAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // responsible for creating new view holders for your items
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    public void setClickListener(ItemClickListener myListener) {
        this.clickListener = myListener;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    // Binds the data from your dataset to the views within the view holder
        Item item = itemList.get(position);

        holder.title.setText(item.getItemName());
        holder.description.setText(item.getItemDescription());
        holder.imageView.setImageResource(item.getItemImage());

    }

    @Override
    public int getItemCount() {
        // Returns the total number of items in your dataset
        return itemList.size();
    }

    public class MyViewHolder extends
            RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView title, description;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.titleText);
            description = itemView.findViewById(R.id.descriptionText);

            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            if (clickListener != null) {
                clickListener.onClick(view, getAdapterPosition());
            }
        }
    }
}
