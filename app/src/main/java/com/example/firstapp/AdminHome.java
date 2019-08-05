package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AdminHome extends AppCompatActivity {

    ImageButton btnAddRes, btnViewRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        btnAddRes  = findViewById(R.id.imgBtnAddRes);
        btnViewRes = findViewById(R.id.imgBtnViewRes);
    }

    @Override
    protected void onResume() {
        super.onResume();

        btnViewRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(AdminHome.this,ViewRestaurant.class);
                startActivity(intent1);
            }
        });

        btnAddRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(AdminHome.this,AddRestaurant.class);
                startActivity(intent2);
            }
        });
    }
}
