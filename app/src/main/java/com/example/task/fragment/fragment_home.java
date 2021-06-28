package com.example.task.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.example.task.Adapter.AdapterClass;
import com.example.task.R;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;


public class fragment_home extends Fragment {
    AdapterClass adapterClass;
    WormDotsIndicator dotsIndicator;
    ViewPager2 pager2;
    int list[];
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view =inflater.inflate(R.layout.fragment_home, container, false);
       pager2  = view.findViewById(R.id.view_pager);
       dotsIndicator = view.findViewById(R.id.dot1);
       list = new int[3];
       list[0] = R.id.rlone;
       list[1] = R.id.rltwo;
       list[2] = R.id.rlthree;
       adapterClass = new AdapterClass(list);
       pager2.setAdapter(adapterClass);
       pager2.setClipToPadding(false);
       pager2.setClipChildren(false);
       pager2.setOffscreenPageLimit(3);
        CompositePageTransformer transformer = new CompositePageTransformer();
        transformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull  View page, float position) {
                float a = 1-Math.abs(position);
                page.setScaleY(0.85f + a*0.15f);
            }
        });
        pager2.setPageTransformer(transformer);
       return view;
    }



}
