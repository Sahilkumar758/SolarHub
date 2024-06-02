package com.example.solarhub.Intro;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.solarhub.Login.Login;
import com.example.solarhub.R;

public class IntroActivity extends AppCompatActivity {

private static int LOGININTRO = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intro);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroActivity.this, Login.class);
                startActivity(intent);
                finish();
            }
        },LOGININTRO);
    }
}