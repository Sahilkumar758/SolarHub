package com.example.solarhub.Main;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import com.example.solarhub.R;

public class AddplugInActivity extends AppCompatActivity {

    private List<Device> deviceList;
    private DeviceAdapter deviceAdapter;
    private RecyclerView rvDevices;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addplug_in);

        deviceList = new ArrayList<>();
        deviceAdapter = new DeviceAdapter(deviceList, this);

        rvDevices = findViewById(R.id.rv_devices);
        rvDevices.setLayoutManager(new LinearLayoutManager(this));
        rvDevices.setAdapter(deviceAdapter);

        findViewById(R.id.add_device).setOnClickListener(v -> showCreateDeviceDialog());
    }

    private void showCreateDeviceDialog() {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_create_device);

        EditText etDeviceName = dialog.findViewById(R.id.device_name);
        EditText etPlugNumber = dialog.findViewById(R.id.plug_number);
        EditText etPriority = dialog.findViewById(R.id.priority);
        EditText etEnergyNeeded = dialog.findViewById(R.id.energy_needed);
        Button btnCreateDevice = dialog.findViewById(R.id.create_device);

        btnCreateDevice.setOnClickListener(v -> {

            String name = etDeviceName.getText().toString().trim();
            String plugNumberText = etPlugNumber.getText().toString().trim();
            String priorityText = etPriority.getText().toString().trim();
            String energyNeededText = etEnergyNeeded.getText().toString().trim();


            if (name.isEmpty() || plugNumberText.isEmpty() || priorityText.isEmpty() || energyNeededText.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                return;
            }

            try {

                int plugNumber = Integer.parseInt(plugNumberText);
                int priority = Integer.parseInt(priorityText);
                int energyNeeded = Integer.parseInt(energyNeededText);


                deviceList.add(new Device(name, plugNumber, priority, energyNeeded));
                deviceAdapter.notifyDataSetChanged();
                dialog.dismiss();
            } catch (NumberFormatException e) {

                Toast.makeText(this, "Invalid input. Please enter valid numbers", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }
}
