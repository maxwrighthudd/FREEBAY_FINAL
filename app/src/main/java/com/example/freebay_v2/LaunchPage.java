package com.example.freebay_v2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

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
                signIn.setVisibility(View.GONE);
                regBtn.setVisibility(View.GONE);
                FragmentManager fm = getSupportFragmentManager();
                RegistrationFragment registrationFragment = new RegistrationFragment();
                fm.beginTransaction().replace(R.id.homepage, registrationFragment).commit();
            }
        });

        signIn = (TextView) findViewById(R.id.signInTV);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn.setVisibility(View.GONE);
                regBtn.setVisibility(View.GONE);
                FragmentManager fm = getSupportFragmentManager();
                LoginFragment loginFragment = new LoginFragment();
                fm.beginTransaction().replace(R.id.homepage, loginFragment).commit();
            }
        });

    }

}
