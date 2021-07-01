package com.example.task.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.example.task.R;
import com.example.task.fragment.fragment_home;
import com.github.islamkhsh.CardSliderAdapter;
import com.github.islamkhsh.CardSliderViewPager;

import java.util.ArrayList;

public class AdapterClass extends CardSliderAdapter<AdapterClass.ViewHolder> {
    private Context context;
    private ArrayList<Items> items;
    TextView projectname;
    TextView beck;
    TextView web;
   

    public AdapterClass(Context context,ArrayList<Items> items){
        this.context = context;
        this.items = items;
    }

    
    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void bindVH(ViewHolder viewHolder, int i) {
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item,parent,false);
         projectname= view.findViewById(R.id.projectname);
         beck = view.findViewById(R.id.beck);
         web = view.findViewById(R.id.web);
         
         Items model = items.get(viewType);
         String title = model.getTitle();
         String title1 = model.getTitle1();
         String skills = model.getSkills();
         
         projectname.setText(title);
         beck.setText(title1);
         web.setText(skills);
         parent.addView(view,viewType);
        
        return new ViewHolder(view);
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
