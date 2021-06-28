package com.example.task.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.task.Adapter.AdapterClass;
import com.example.task.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;



public class fragment_home extends Fragment {
    SliderView sliderView;
    private AdapterClass aClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view =inflater.inflate(R.layout.fragment_home, container, false);
       sliderView = view.findViewById(R.id.imageslider);
       aClass = new AdapterClass(fragment_home.this);
       sliderView.setSliderAdapter(aClass);
       sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
       sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
       sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
       sliderView.setIndicatorSelectedColor(Color.BLUE);
       sliderView.setIndicatorUnselectedColor(Color.GRAY);
       sliderView.setScrollTimeInSec(3);
       sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
           @Override
           public void onIndicatorClicked(int position) {

           }
       });
       return view;
    }



}
