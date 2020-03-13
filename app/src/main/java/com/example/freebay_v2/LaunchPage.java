package com.example.freebay_v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LaunchPage extends AppCompatActivity {
    Button regBtn;
    TextView signIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch_page);


        regBtn = (Button) findViewById(R.id.registrationBtn);
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LaunchPage.this, RegistrationPage.class);
                startActivity(intent);
            }
        });

        signIn = (TextView) findViewById(R.id.signInTV);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LaunchPage.this, LoginPage.class);
                startActivity(intent);
            }
        });

    }

}
