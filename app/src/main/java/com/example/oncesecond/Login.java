package com.example.oncesecond;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://console.firebase.google.com/project/lets-eat-9573e/database/lets-eat-9573e-default-rtdb/data/~2F");

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
                    databaseReference.child("Users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.hasChild(userNameText)){
                                final String getPassword = snapshot.child(userNameText).child("password").getValue(String.class);

                                if (getPassword.equals(passwordText)){
                                    Toast.makeText(Login.this, "Successfully logged in", Toast.LENGTH_SHORT).show();

                                    startActivity(new Intent(Login.this, PickPlace.class));
                                }
                                else {
                                    Toast.makeText(Login.this, "Error while logging in", Toast.LENGTH_SHORT).show();
                                }
                            }
                            else{
                                Toast.makeText(Login.this, "This user already exists", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
            }
        });
    }
}