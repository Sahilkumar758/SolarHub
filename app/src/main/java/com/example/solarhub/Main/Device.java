package com.example.solarhub.Main;

public class Device {
    private String name;
    private int plugNumber;
    private int priority;
    private int energyNeeded;

    public Device(String name, int plugNumber, int priority, int energyNeeded) {
        this.name = name;
        this.plugNumber = plugNumber;
        this.priority = priority;
        this.energyNeeded = energyNeeded;
    }

    public String getName() {
        return name;
    }

    public int getPlugNumber() {
        return plugNumber;
    }

    public int getPriority() {
        return priority;
    }

    public int getEnergyNeeded() {
        return energyNeeded;
    }
}