package com.example.solarhub.Main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.example.solarhub.Login.Login;
import com.example.solarhub.R;

public class MainScreenActivity extends AppCompatActivity {

    private Switch plug1Switch, plug2Switch, plug3Switch;
    private Button addPlugButton;

    private Button  energyinfo;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        plug1Switch = findViewById(R.id.plug1Switch);
        plug2Switch = findViewById(R.id.plug2Switch);
        plug3Switch = findViewById(R.id.plug3Switch);
        addPlugButton = findViewById(R.id.addPlugButton);
        progressBar = findViewById(R.id.progressBar);
        energyinfo = findViewById(R.id.energyinfo);



        plug1Switch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Intent intent = new Intent(MainScreenActivity.this, Plug1Activity.class);
                startActivity(intent);
            }
        });

        plug2Switch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Intent intent = new Intent(MainScreenActivity.this, Plug2Activity.class);
                startActivity(intent);
            }
        });

        plug3Switch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Intent intent = new Intent(MainScreenActivity.this, Plug3Activity.class);
                startActivity(intent);
            }
        });


        addPlugButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, AddplugInActivity.class);
                startActivity(intent);
                finish();
            }
        });

        energyinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, EnergyInfoActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }
}
