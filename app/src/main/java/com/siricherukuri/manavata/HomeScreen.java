package com.siricherukuri.manavata;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class HomeScreen extends MainActivity {

    private Button idLC;
    private Button idAM;
    private Button idY;
    private Button idHC;
    private Button idPF;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        drawerLayout = findViewById(R.id.homescreendrawerlayout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.rohanstoolbar);


        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        idLC = findViewById(R.id.idLC);
        idLC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLifeCoachButton();
            }
        });
        idPF = findViewById(R.id.idPF);
        idPF.setText("Welcome " + getIntent().getStringExtra("userDisplayName"));

        idAM = findViewById(R.id.idAM);
        idAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutManavata();
            }
        });

        idY = findViewById(R.id.idY);
        idY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openYoga();
            }
        });

        idHC = findViewById(R.id.idHC);
        idHC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHealthyCooking();
            }
        });

    }
    public void openLifeCoachButton() {
        Intent intentLC = new Intent(this, lifecoachbutton.class);
        startActivity(intentLC);
    }

    public void openAboutManavata() {
        Intent intentAM = new Intent(this, AboutManavataActivity.class);
        startActivity(intentAM);
    }
    public void openYoga() {
        Intent intentY = new Intent(this, YogaActivity.class);
        startActivity(intentY);
    }
    public void openHealthyCooking() {
        Intent intentHC = new Intent(this, HealthyCookingActivity.class);
        startActivity(intentHC);
    }

}