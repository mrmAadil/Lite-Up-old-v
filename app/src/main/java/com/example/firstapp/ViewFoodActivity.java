package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ViewFoodActivity extends AppCompatActivity {

    TextView FName, FSpecial,FPrice;
    String name, special, price;
    Button btnUpdate, btnDelete;
    double DPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_food);

        FName = findViewById(R.id.FoodName);
        FSpecial = findViewById(R.id.FoodSpeciality);
        FPrice = findViewById(R.id.FoodPrice);
        btnUpdate = findViewById(R.id.UpdateButton);
        btnDelete = findViewById(R.id.DeleteButton);

        Intent intent = getIntent();


        name = intent.getStringExtra("FoodName");
        special = intent.getStringExtra("FoodSpeciality");
        price = intent.getStringExtra("FoodPrice");

        DPrice = Double.parseDouble(price);

        FName.setText(name);
        FSpecial.setText(special);
        FPrice.setText(price);

        Toast.makeText(ViewFoodActivity.this,"Food Added Sucesfsully",Toast.LENGTH_SHORT).show();
    }

    protected void onResume() {
        super.onResume();

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ViewFoodActivity.this,UpdateFoodActivity.class);

                name = FName.getText().toString();
                special = FSpecial.getText().toString();
                price = FPrice.getText().toString();

                intent2.putExtra("FoodName",name);
                intent2.putExtra("FoodSpeciality",special);
                intent2.putExtra("FoodPrice",price);
                startActivity(intent2);
            }
        });
    }
}


