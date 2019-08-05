package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddFoodsActivity extends AppCompatActivity {

    private Button btnSubmit;
    private EditText txtName,txtSpecial,txtPrice;
    String name, special;
    String price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_foods);
        btnSubmit = findViewById(R.id.button);
        txtName = findViewById(R.id.editText);
        txtSpecial = findViewById(R.id.editText2);
        txtPrice = findViewById(R.id.editText3);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              name = txtName.getText().toString();
              special = txtSpecial.getText().toString();
              price =  txtPrice.getText().toString();

              Intent intent = new Intent(AddFoodsActivity.this,ViewFoodActivity.class);
              intent.putExtra("FoodName",name);
              intent.putExtra("FoodSpeciality",special);
              intent.putExtra("FoodPrice",price);

              startActivity(intent);
            }
        });
    }
}
