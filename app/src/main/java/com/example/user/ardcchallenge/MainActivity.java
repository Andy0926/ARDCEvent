package com.example.user.ardcchallenge;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.Manifest.permission.CAMERA;

public class MainActivity extends AppCompatActivity {

    Button sponsors,qr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sponsors =(Button)findViewById(R.id.sponsors_btn);
        qr=(Button)findViewById(R.id.scan_btn);

        sponsors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sponsorStart = new Intent(MainActivity.this,SponsorPage.class);
                startActivity(sponsorStart);
            }
        });

        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent qrStart = new Intent(MainActivity.this,QR.class);
                startActivity(qrStart);
            }
        });

    }


}
