package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateFoodActivity extends AppCompatActivity {

    private Button btnConfirmUpdate;
    private EditText txtName,txtSpecial,txtPrice;
    String name, special;
    String price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_food);

        btnConfirmUpdate = findViewById(R.id.ConfirmUpdate);
        txtName = findViewById(R.id.txtUpdName);
        txtSpecial = findViewById(R.id.txtUpSpecial);
        txtPrice = findViewById(R.id.txtUpdPrice);

        Intent intent = getIntent();

        name = intent.getStringExtra("FoodName");
        special = intent.getStringExtra("FoodSpeciality");
        price = intent.getStringExtra("FoodPrice");

        txtName.setText(name);
        txtSpecial.setText(special);
        txtPrice.setText(price);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnConfirmUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = txtName.getText().toString();
                special = txtSpecial.getText().toString();
                price =  txtPrice.getText().toString();

                Intent intent = new Intent(UpdateFoodActivity.this,ViewFoodActivity.class);
                intent.putExtra("FoodName",name);
                intent.putExtra("FoodSpeciality",special);
                intent.putExtra("FoodPrice",price);
                startActivity(intent);
            }
        });
    }
}
