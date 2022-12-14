package com.example.oncesecond;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HotelView extends AppCompatActivity {

    ImageButton HomeSegment;
    ImageButton QRScannerButton;
    ImageButton FinderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_view);

        HomeSegment = findViewById(R.id.homeButton);
        QRScannerButton = findViewById(R.id.menuButton);
        FinderButton = findViewById(R.id.finderButton);

        HomeSegment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HotelView.this, HomeActivity.class));
            }
        });

        QRScannerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HotelView.this, QRScanner.class));
            }
        });

        FinderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HotelView.this, PickPlaceLanding.class));
            }
        });
    }
}