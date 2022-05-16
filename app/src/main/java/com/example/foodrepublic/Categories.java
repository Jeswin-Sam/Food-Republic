package com.example.foodrepublic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        View beverages_card = findViewById(R.id.beverages_card);
        View snacks_card = findViewById(R.id.snacks_card);
        View chocolates_card = findViewById(R.id.chocolates_card);
        View biscuits_card = findViewById(R.id.biscuits_card);
        View tiffin_card = findViewById(R.id.tiffin_card);
        View lunch_card = findViewById(R.id.lunch_card);


        beverages_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_1 = new Intent(Categories.this, Beverages.class);
                startActivity(intent_1);
            }
        });










    }
}