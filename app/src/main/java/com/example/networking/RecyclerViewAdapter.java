package com.example.networking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class RecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    private LayoutInflater layoutInflater;
    public ArrayList<RecyclerViewItem> items;

    public RecyclerViewAdapter(Context context, ArrayList<RecyclerViewItem> items) {
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.items = items;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titleView.setText(items.get(position).getTitle());
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    public interface OnClickListener {
        void onClick(RecyclerViewItem item);
    }
}
