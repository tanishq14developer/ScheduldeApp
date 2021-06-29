package com.example.task.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.recyclerview.widget.RecyclerView;

import com.example.task.R;
import com.github.islamkhsh.CardSliderAdapter;
import com.github.islamkhsh.CardSliderViewPager;

import java.util.ArrayList;

public class AdapterClass extends CardSliderAdapter<AdapterClass.ViewHolder> {
    int a[];
    public AdapterClass(int[] a){
        this.a =a;
    }


    @Override
    public int getItemCount() {
        return a.length;
    }

    @Override
    public void bindVH(ViewHolder viewHolder, int i) {
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_home,parent,false);
        return new ViewHolder(view);
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
