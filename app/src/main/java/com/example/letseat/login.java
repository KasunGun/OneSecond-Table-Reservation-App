package com.example.letseat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText userName = findViewById(R.id.userName);
        final EditText password = findViewById(R.id.password);
        final Button loginButton = findViewById(R.id.loginButton);
        final TextView registerNowButton = findViewById(R.id.registerNowButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String userNameText = userName.getText().toString();
                final String passwordText = password.getText().toString();

                if (userNameText.isEmpty() || passwordText.isEmpty()){
                    Toast.makeText(Login.this, "Please enter User Name or Password", Toast.LENGTH_SHORT).show();
                }
                else{

                }

            }
        });
    }
}