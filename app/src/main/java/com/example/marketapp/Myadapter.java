package com.example.marketapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//extending means creating a new class that inherits the behaviours of the current class
// Creates a blue print of how the recycler view should create and populate its items
public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {

    private List<Item> itemList;

    public Myadapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    // creates new viewholders, returns an instance of current view holder class
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // creates new viewholders, returns an instance of current view holder class

        // layout inflater creates a view hierarchy from an xml layout resource, call from and pass static context
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_layout,parent, false);

        return new MyViewHolder(itemView);
        // access and manipulate views when binding data

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // binds data from the dataset to the views within the view holder
        Item item = itemList.get(position);


        // holder.views
        holder.title.setText(item.getItemName());
        holder.description.setText(item.getItemDesc());
        holder.imageView.setImageResource(item.getItemImg());


    }

    @Override
    public int getItemCount() {
        //returns total number of items

        return itemList.size();
    }

    public static class MyViewHolder extends
            RecyclerView.ViewHolder {
        //it holds the references to the views within the item layout
        // improves perfomances by avoiding redundant findviewbyid



        ImageView imageView;
        TextView title;
        TextView description;
        //constructor
        public MyViewHolder(@NonNull View itemView) {
            super(itemView); // calls super and passes itemView as


            // Find and assign findviewbyid method ro find and assign imageviews to the textviews ti the itemview
            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.title_txt);
            description = itemView.findViewById(R.id.description_text);


        }
    }


}
