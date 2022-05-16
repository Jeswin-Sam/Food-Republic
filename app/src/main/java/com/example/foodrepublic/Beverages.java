package com.example.foodrepublic;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Beverages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);

        int pepsi = 12;
        TextView price = findViewById(R.id.pepsi_price);
        price.setText("₹ "+ pepsi);
    }
}