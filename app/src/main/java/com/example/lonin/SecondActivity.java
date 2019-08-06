package com.example.lonin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.lonin.R;

public class SecondActivity extends AppCompatActivity {

    ImageButton btnOrderFoods, btnViewOrders;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnOrderFoods  = findViewById(R.id.imgBtnAddRes);
        btnViewOrders = findViewById(R.id.imgbtnViewRes);
    }

    @Override
    protected void onResume() {
        super.onResume();

        btnOrderFoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SecondActivity.this,OrderFoods.class);
                startActivity(intent1);
            }

            // View Order intent

        });
    }
}
