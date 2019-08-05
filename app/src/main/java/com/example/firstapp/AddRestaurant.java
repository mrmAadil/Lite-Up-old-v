package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddRestaurant extends AppCompatActivity {

        public static final String EXTRA_NAME = ".com.example.firstapp.EXTRA_NAME";
        public static final String EXTRA_EMAIL = ".com.example.firstapp.EXTRA_EMAIL";
        public static final String EXTRA_ADDRESS = ".com.example.firstapp.EXTRA_ADDRESS";
        public static final String EXTRA_Phone_NUMBER = ".com.example.firstapp.EXTRA_NUMBER";

        String name, email,Address;
        int PhoneNumber;

        EditText nameInput;
        EditText AddressInput;
        EditText emailInput;
        EditText PhoneNumberInput;

        Button submitButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_add_restaurant);

            nameInput = findViewById(R.id.nameInput);
            emailInput = findViewById(R.id.emailInput);
            AddressInput = findViewById(R.id.AddressInput);
            PhoneNumberInput = findViewById(R.id.PhoneNumberInput);

            submitButton = findViewById(R.id.submitButton);
            submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    name = nameInput.getText().toString();
                    email = emailInput.getText().toString();
                    Address = AddressInput.getText().toString();
                    PhoneNumber = Integer.valueOf(PhoneNumberInput.getText().toString());

                    showToast("Values added");
                    showToast(name);
                    showToast(email);
                    showToast(Address);
                    showToast(String.valueOf(PhoneNumber));

                    addresturentTable();
                }
            });

        }

        private void showToast(String text){
            Toast.makeText(AddRestaurant.this, text,Toast.LENGTH_SHORT).show();
        }

        public void addresturentTable(){


            Intent intent = new Intent(this,RestaurantTable.class);
            intent.putExtra(EXTRA_NAME,name);
            intent.putExtra(EXTRA_EMAIL,email);
            intent.putExtra(EXTRA_ADDRESS,Address);
            intent.putExtra(EXTRA_Phone_NUMBER,PhoneNumber);


            startActivity(intent);
        }
    }


