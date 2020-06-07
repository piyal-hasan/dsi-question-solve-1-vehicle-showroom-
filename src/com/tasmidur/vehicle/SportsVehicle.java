package com.tasmidur.vehicle;

import com.tasmidur.engine.OilEngine;

public class SportsVehicle extends Vehicle {

    private final String vehicleTypeName="Sports";

    private final String turbo="Turbo";


    public SportsVehicle() {
        super.setEngine(new OilEngine());
    }

    @Override
    public void showVehicleDetails() {
        System.out.println("Vehicle Type Name: " + vehicleTypeName);
        System.out.println("Model Number: " + super.getVehicleModelNumber());
        System.out.println("Features of the Vehicle:");
        System.out.println("1. Engine Power: " + super.getVehicleModelNumber());
        System.out.println("2. Tire Size: " + super.getVehicleTireSize());
        System.out.println("3. Engine Type: " + super.getEngine().getEngineName());
        System.out.println("4. It's " + turbo + "\n\n");
    }
}
