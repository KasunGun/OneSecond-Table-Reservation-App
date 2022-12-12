package com.example.oncesecond;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeLanding extends AppCompatActivity {

//    ActivityHomeLandingBinding binding;

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    HotelsFragment hotelsFragment = new HotelsFragment();
    FinderFragment finderFragment = new FinderFragment();
    MenuFragment menuFragment = new MenuFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bottomNavigationView = findViewById(R.id.homeLandingNavigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.homeLandingNavigation, homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.homeBottomNav:
                        getSupportFragmentManager().beginTransaction().replace(R.id.homeLandingNavigation, homeFragment).commit();
                        return true;
                    case R.id.finderBottomNav:
                        getSupportFragmentManager().beginTransaction().replace(R.id.homeLandingNavigation, finderFragment).commit();
                        return true;
                    case R.id.menuBottomNav:
                        getSupportFragmentManager().beginTransaction().replace(R.id.homeLandingNavigation, menuFragment).commit();
                        return true;
                    case R.id.hotelsBottomNav:
                        getSupportFragmentManager().beginTransaction().replace(R.id.homeLandingNavigation, hotelsFragment).commit();
                        return true;
                }
                return false;
            }
        });

    }
}