package com.example.diplomski;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainScreen extends AppCompatActivity implements View.OnClickListener {

    ImageButton logout, message;
    Button button, button2, button3, button4, button5, button6, button7, button8;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        button = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);



        logout = findViewById(R.id.logout_button);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent(MainScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });







    }


    @Override
    public void onClick(View view) {
        Intent i = new Intent(MainScreen.this, Inventory.class);
        switch (view.getId()){
            case R.id.button1:
                startActivity(i);
                break;
            case R.id.button2:
                startActivity(i);
                break;
            case R.id.button3:
                startActivity(i);
                break;
            case R.id.button4:
                startActivity(i);
                break;
            case R.id.button5:
                startActivity(i);
                break;
            case R.id.button6:
                startActivity(i);
                break;
            case R.id.button7:
                startActivity(i);
                break;
            case R.id.button8:
                startActivity(i);
                break;
        }

    }
}