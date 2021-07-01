package com.example.task.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.example.task.Adapter.AdapterClass;
import com.example.task.Adapter.Items;
import com.example.task.R;

import com.github.islamkhsh.CardSliderViewPager;

import java.util.ArrayList;

public class fragment_home extends Fragment {

    int list[];
    AdapterClass adapterClass = null;
    private ArrayList<Items> items;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = (View) inflater.inflate(R.layout.fragment_home, container, false);
        CardSliderViewPager cardSliderViewPager = view.findViewById(R.id.view_pager);
        localcards();
        cardSliderViewPager.setAdapter(adapterClass);
        cardSliderViewPager.setClipToPadding(false);
        cardSliderViewPager.setClipChildren(false);
        cardSliderViewPager.setOffscreenPageLimit(3);



        return view;
    }

    private void localcards() {
        items = new ArrayList<>();
        items.add(new Items("Project X","BeckEnd","Development"));
        items.add(new Items("Project Y","UI","Designer"));
        items.add(new Items("Project Z","FrontEnd","Development"));

    }


}
