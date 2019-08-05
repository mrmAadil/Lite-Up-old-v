package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RestaurantTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_table);

        Intent intent = getIntent();
        String name = intent.getStringExtra(AddRestaurant.EXTRA_NAME);
        String email = intent.getStringExtra(AddRestaurant.EXTRA_EMAIL);
        String Address = intent.getStringExtra(AddRestaurant.EXTRA_ADDRESS);
        int PhoneNumber = intent.getIntExtra(AddRestaurant.EXTRA_Phone_NUMBER, 0);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);

        textView1.setText(name);
        textView2.setText(email);
        textView3.setText(Address);
        textView4.setText("" + PhoneNumber);
    }
}

