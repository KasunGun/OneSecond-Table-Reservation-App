package com.example.oncesecond;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeLanding extends AppCompatActivity {

//    ActivityHomeLandingBinding binding;

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    MenuFragment menuFragment = new MenuFragment();
    CartFragment cartFragment = new CartFragment();
    MyOrdersFragment myOrdersFragment = new MyOrdersFragment();


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
                    case R.id.menuBottomNav:
                        getSupportFragmentManager().beginTransaction().replace(R.id.homeLandingNavigation, menuFragment).commit();
                        return true;
                    case R.id.cartBottomNav:
                        getSupportFragmentManager().beginTransaction().replace(R.id.homeLandingNavigation, cartFragment).commit();
                        return true;
                    case R.id.myOrdersBottomNav:
                        getSupportFragmentManager().beginTransaction().replace(R.id.homeLandingNavigation, myOrdersFragment).commit();
                        return true;
                }
                return false;
            }
        });

    }
}