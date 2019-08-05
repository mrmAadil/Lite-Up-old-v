package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ViewRestaurant extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_restaurant);

        btn1 = findViewById(R.id.btnAddFood1);
        btn2 = findViewById(R.id.btnAddFood2);
        btn3 = findViewById(R.id.btnAddFood3);
        btn4 = findViewById(R.id.btnAddFood4);
        btn5 = findViewById(R.id.btnAddFood5);
    }

    @Override
    protected void onResume() {
        super.onResume();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewRestaurant.this,AddFoodsActivity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewRestaurant.this,AddFoodsActivity.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewRestaurant.this,AddFoodsActivity.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewRestaurant.this,AddFoodsActivity.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewRestaurant.this,AddFoodsActivity.class);
                startActivity(intent);
            }
        });
    }
}
