package com.example.simpletodo;
import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

public class ItemsAdapter extends RecyclerView.Adapter {

    List<String> items;

    public ItemsAdapter(List<String> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View todoView = LayoutInflater.from(parent.getContext()).inflate(android.R)
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //container to provide easy access to views that represent each row of the list
     public class ViewHolder extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {
         List<String> items;
         public ItemsAdapter(List<String> items) {
             this.items = items;
         }
         @NonNull
         @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
             // Use layout inflater to inflate a view
           View todoView =  LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent,false);

             return new ViewHolder(todoView);
         }

         @Override
        public void onBindViewHolder(@NonNull ViewHolder holder,int position ){
             //Grab the item at the position
             String item = items.get(position);
             // Bind the item into the specified view holder
             holder.bind(item);
         }
         @Override
        public int getItemCount(){
             return items.size();
         }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public ViewHolder(View todoView) {
            }

            public void bind(String item) {
            }
        }
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvItems;

         public ViewHolder(@NonNull View itemView) {
             super(itemView);
             tvItems = itemView.findViewById(android.R.id.text1);
         }

        public void bind(String item) {
             tvItems.setText(item);
        }
    }
}
