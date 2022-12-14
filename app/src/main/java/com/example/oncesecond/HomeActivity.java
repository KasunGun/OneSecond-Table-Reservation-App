package com.example.oncesecond;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    ImageButton HotelViewButton;
    ImageButton QRScannerButton;
    ImageButton FinderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        HotelViewButton = findViewById(R.id.hotelsButton);
        QRScannerButton = findViewById(R.id.menuButton);
        FinderButton = findViewById(R.id.finderButton);

        HotelViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, HotelView.class));
            }
        });

        QRScannerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, QRScanner.class));
            }
        });

        FinderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, PickPlaceLanding.class));
            }
        });
    }
}