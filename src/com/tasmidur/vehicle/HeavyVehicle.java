package com.tasmidur.vehicle;

import com.tasmidur.engine.DieselEngine;

public class HeavyVehicle extends Vehicle {

    private final String vehicleTypeName="Heavy";

    private final int weight=20000;

    public HeavyVehicle() {
        super.setEngine(new DieselEngine());
    }

    @Override
    public void showVehicleDetails() {
        System.out.println("Vehicle Type Name: " + vehicleTypeName);
        System.out.println("Model Number: " + super.getVehicleModelNumber());
        System.out.println("Features of the Vehicle:");
        System.out.println("1. Engine Power: " + super.getVehicleModelNumber());
        System.out.println("2. Tire Size: " + super.getVehicleTireSize());
        System.out.println("3. Engine Type: " + super.getEngine().getEngineName());
        System.out.println("4. It's weight: " + weight + "\n\n");
    }
}
