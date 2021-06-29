package com.example.task.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.task.Adapter.AdapterClass;
import com.example.task.R;
import com.github.islamkhsh.CardSliderViewPager;




public class fragment_home extends Fragment {

    int list[];
    AdapterClass adapterClass;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        list = new int[3];
        list[0] = R.id.rlone;
        list[1] = R.id.rlone;
        list[2] = R.id.rlone;
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        CardSliderViewPager cardSliderViewPager = (CardSliderViewPager) view.findViewById(R.id.view_pager);
        adapterClass = new AdapterClass(list);
        cardSliderViewPager.setAdapter(adapterClass);


        return view;
    }


}
