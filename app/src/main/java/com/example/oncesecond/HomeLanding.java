package com.example.oncesecond;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.oncesecond.databinding.ActivityHomeLandingBinding;

public class HomeLanding extends AppCompatActivity {

    ActivityHomeLandingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeLandingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new HomeFragment());

        binding.bottomNavigation.setOnItemSelectedListener(item -> {
           switch (item.getItemId()){
               case R.id.homeBottomNav:
                   replaceFragment(new HomeFragment());
                   break;
               case R.id.finderBottomNav:
                   replaceFragment(new FinderFragment());
                   break;
               case R.id.menuBottomNav:
                   replaceFragment(new MenuFragment());
                   break;
               case R.id.hotelsBottomNav:
                   replaceFragment(new HotelsFragment());
                   break;
           }

           return true;
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_navigation, fragment);
        fragmentTransaction.commit();
    }
}