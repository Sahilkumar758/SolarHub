package com.example.solarhub.Main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.solarhub.R;

public class EnergyInfoActivity extends AppCompatActivity {

    private TextView totalEnergyUsage, energyUsage;
    private Button dayButton, weekButton, monthButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_info);

        totalEnergyUsage = findViewById(R.id.total_energy_usage);
        energyUsage = findViewById(R.id.energy_usage);

        dayButton = findViewById(R.id.day_button);
        weekButton = findViewById(R.id.week_button);
        monthButton = findViewById(R.id.month_button);

        dayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalEnergyUsage.setText("Total Energy Usage: 1.20 kWh");
                energyUsage.setText("120\nkWh / Day");
            }
        });

        weekButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalEnergyUsage.setText("Total Energy Usage: 5.20 kWh");
                energyUsage.setText("520\nkWh / Week");
            }
        });

        monthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalEnergyUsage.setText("Total Energy Usage: 20.80 kWh");
                energyUsage.setText("820\nkWh / Month");
            }
        });
    }
}