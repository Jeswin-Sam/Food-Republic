package com.example.foodrepublic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        Button sign_in_button = (Button) findViewById(R.id.sign_in_button);
        sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String entered_username = username.getText().toString();
                String entered_password = password.getText().toString();

                String actual_username = "Jeswin Sam";
                String actual_password = "abcd";

                if ((entered_username.equals(actual_username)) && (entered_password.equals(actual_password))) {
                    Intent intent = new Intent(LoginActivity.this, Categories.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(),"Incorrect Password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}