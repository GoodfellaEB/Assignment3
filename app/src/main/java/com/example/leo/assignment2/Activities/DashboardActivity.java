package com.example.leo.assignment2.Activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.leo.assignment2.CustomAdapter;
import com.example.leo.assignment2.DataModel;
import com.example.leo.assignment2.R;
import com.example.leo.assignment2.fragments.BookingFragment;
import com.example.leo.assignment2.fragments.DashboardFragment;
import com.example.leo.assignment2.fragments.NewsFragment;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity
        implements DashboardFragment.OnFragmentInteractionListener, BookingFragment.OnFragmentInteractionListener, NewsFragment.OnFragmentInteractionListener {

    ArrayList<DataModel> dataModels;
    ListView listView;
    private static CustomAdapter adapter;
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        toolbar = getSupportActionBar();
        toolbar.setTitle("Dashboard");
        loadFragment(new DashboardFragment());

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationView);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
/*
        listView = (ListView) findViewById(R.id.booking_list);

        dataModels = new ArrayList<>();

        dataModels.add(new DataModel("Karate course", "Jean Claude Van Damme", "November 9 2018, 16h30"));
        dataModels.add(new DataModel("Boxing course", "Muhammad Ali", "November 15 2018, 12h40"));

        adapter = new CustomAdapter(dataModels, getApplicationContext());

        listView.setAdapter(adapter);
*/

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_dashboard:
                    toolbar.setTitle("Dashboard");
                    fragment = new DashboardFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_booking:
                    toolbar.setTitle("Booking");
                    fragment = new BookingFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_news:
                    toolbar.setTitle("News");
                    fragment = new NewsFragment();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
