package com.example.task.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;

import com.example.task.R;
import com.example.task.fragment.fragment_calender;
import com.example.task.fragment.fragment_home;
import com.example.task.fragment.fragment_notification;
import com.example.task.fragment.fragment_search;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottom_Nav extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    View notificationIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);
        bottomNavigationView = findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        showNotificationIndicator();
        loadfragments(new fragment_home());

        if (savedInstanceState ==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new fragment_home()).commit();
        }
        }

    public boolean loadfragments(Fragment fragment) {
        if (fragment !=null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
        }
        return true;
    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener =new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull  MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()){
                case R.id.home:
                    fragment = new fragment_home();
                    break;
                case R.id.calender:
                    fragment = new fragment_calender();
                    break;
                case R.id.notification:
                    fragment = new fragment_notification();
                    if(notificationIndicator!=null){
                        if(notificationIndicator.getVisibility()==View.VISIBLE){
                            notificationIndicator.setVisibility(View.GONE);
                        }
                    }
                    break;
                case R.id.search:
                    fragment = new fragment_search();
                    break;


            }
           return loadfragments(fragment);
        }
    };
    public void onBackPressed() {
        if (bottomNavigationView.getSelectedItemId() == R.id.home) {
            super.onBackPressed();
            finish();
        } else {
            bottomNavigationView.setSelectedItemId(R.id.home);
        }
    }
    private void showNotificationIndicator() {

        BottomNavigationItemView itemView = bottomNavigationView.findViewById(R.id.notification);
        notificationIndicator = LayoutInflater.from(this).inflate(R.layout.layout_indicator, bottomNavigationView, false);
        notificationIndicator.setVisibility(View.VISIBLE);

        itemView.addView(notificationIndicator);
    }
}