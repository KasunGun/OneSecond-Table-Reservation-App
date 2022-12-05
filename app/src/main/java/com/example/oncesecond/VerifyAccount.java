package com.example.oncesecond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VerifyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);

        final TextView verifyAccountButton = findViewById(R.id.verifyAccount);

        verifyAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyAccount.this, Permission.class);
                startActivity(intent);
            }
        });
    }
}