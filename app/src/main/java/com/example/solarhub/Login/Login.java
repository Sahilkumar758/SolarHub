package com.example.solarhub.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.solarhub.Main.MainScreenActivity;
import com.example.solarhub.R;

public class Login extends AppCompatActivity {

    Button BacktoRegister, ContinueSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        BacktoRegister = findViewById(R.id.backtoregister);
        ContinueSignIn = findViewById(R.id.continueSignin);


        BacktoRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });


        ContinueSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, MainScreenActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}