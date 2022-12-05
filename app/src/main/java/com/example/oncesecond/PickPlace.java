package com.example.oncesecond;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;

public class PickPlace extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_place);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.pick_map);
        mapFragment.getMapAsync(this);
//        AIzaSyBAu6XWebuZ5X2STwG-WqDZTuhhNqQipIY
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

    }
}