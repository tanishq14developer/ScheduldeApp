package com.example.task.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task.R;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;



public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {

    int a[];

    public AdapterClass(int[] a) {
        this.a = a;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_home,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  AdapterClass.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout layout;
        public MyViewHolder(@NonNull  View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.phase1);
        }
    }
}
